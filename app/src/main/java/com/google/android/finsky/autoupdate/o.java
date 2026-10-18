package com.google.android.finsky.autoupdate;

import android.app.job.JobParameters;
import com.google.android.finsky.autoupdate.ReschedulerUsingJobScheduler;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f2047a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2048b;
    final /* synthetic */ ReschedulerUsingJobScheduler.CheckPreconditionsAndAutoUpdateJobService c;

    o(ReschedulerUsingJobScheduler.CheckPreconditionsAndAutoUpdateJobService checkPreconditionsAndAutoUpdateJobService, boolean z, int i) {
        this.c = checkPreconditionsAndAutoUpdateJobService;
        this.f2047a = z;
        this.f2048b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JobParameters jobParameters;
        JobParameters jobParameters2;
        jobParameters = this.c.f2031a;
        if (jobParameters != null) {
            if (!this.f2047a && (this.f2048b & 2) != 0 && com.google.android.finsky.fpkg.a.a().b()) {
                ReschedulerUsingJobScheduler.CheckPreconditionsAndAutoUpdateJobService checkPreconditionsAndAutoUpdateJobService = this.c;
                jobParameters2 = this.c.f2031a;
                checkPreconditionsAndAutoUpdateJobService.jobFinished(jobParameters2, true);
                h.a(true);
                return;
            }
            h.a(this.c, (com.google.android.finsky.fpkg.a.a().b() || h.c()) ? false : true);
        }
    }
}
