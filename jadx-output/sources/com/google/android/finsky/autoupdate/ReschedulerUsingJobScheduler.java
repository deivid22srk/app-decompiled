package com.google.android.finsky.autoupdate;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;

@TargetApi(21)
/* loaded from: classes.dex */
public final class ReschedulerUsingJobScheduler extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2029a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.finsky.f.a f2030b;
    private final com.google.android.finsky.d.d c;

    public ReschedulerUsingJobScheduler(Context context, com.google.android.finsky.f.a aVar, com.google.android.finsky.d.d dVar) {
        this.f2029a = context;
        this.f2030b = aVar;
        this.c = dVar;
    }

    @Override // com.google.android.finsky.autoupdate.h
    public final boolean a() {
        return false;
    }

    public class CheckPreconditionsAndAutoUpdateJobService extends JobService implements u {

        /* renamed from: a, reason: collision with root package name */
        private JobParameters f2031a;

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            this.f2031a = jobParameters;
            PersistableBundle extras = this.f2031a.getExtras();
            int i = extras != null ? extras.getInt("Finksy.AutoUpdateRescheduleReason", 0) : 0;
            boolean isOverrideDeadlineExpired = this.f2031a.isOverrideDeadlineExpired();
            if (isOverrideDeadlineExpired && (i & 1) != 0) {
                FinskyLog.a("Timed out waiting for job to be scheduled.", new Object[0]);
                jobFinished(this.f2031a, true);
                return false;
            }
            FinskyLog.a("JobScheduler invoked, loading libraries.", new Object[0]);
            h.a(new o(this, isOverrideDeadlineExpired, i));
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            this.f2031a = null;
            return false;
        }

        @Override // com.google.android.finsky.autoupdate.u
        public final void a(boolean z) {
            if (this.f2031a != null) {
                jobFinished(this.f2031a, false);
            }
            FinskyLog.a(z ? "auto-updates finished successfully." : "finished w/error. waiting for next daily hygiene.", new Object[0]);
        }
    }

    @Override // com.google.android.finsky.autoupdate.h
    public final void b() {
        ((JobScheduler) this.f2029a.getSystemService("jobscheduler")).cancel(821848294);
        JobInfo.Builder builder = new JobInfo.Builder(821848294, new ComponentName(this.f2029a, (Class<?>) CheckPreconditionsAndAutoUpdateJobService.class));
        int i = this.f2030b.b() ? 2 : 1;
        if ((i & 2) != 0) {
            long longValue = com.google.android.finsky.c.d.dt.b().longValue();
            builder.setMinimumLatency(longValue).setRequiredNetworkType(1).setBackoffCriteria(longValue, 1).setOverrideDeadline(com.google.android.finsky.c.d.du.b().longValue());
            a(true);
        } else {
            builder.setMinimumLatency(com.google.android.finsky.c.d.dw.b().longValue()).setRequiredNetworkType(bg.u.a().booleanValue() ? 2 : 1).setRequiresCharging(true).setOverrideDeadline(com.google.android.finsky.c.d.dv.b().longValue());
            if (this.c.a(12605750L)) {
                builder.setRequiresDeviceIdle(true);
            }
            a(false);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("Finksy.AutoUpdateRescheduleReason", i);
        builder.setExtras(persistableBundle);
        FinskyLog.a("Scheduling auto-update check using JobScheduler.", new Object[0]);
        ((JobScheduler) this.f2029a.getSystemService("jobscheduler")).schedule(builder.build());
    }
}
