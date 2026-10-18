package com.google.android.finsky.dpkg;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.services.DailyHygiene;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2474b;
    public final /* synthetic */ long c;
    public final /* synthetic */ a d;

    c(a aVar, long j, long j2, long j3) {
        this.d = aVar;
        this.f2473a = j;
        this.f2474b = j2;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.c().a()) {
            long elapsedRealtime = this.f2474b - (SystemClock.elapsedRealtime() - this.f2473a);
            if (elapsedRealtime <= 0) {
                if (!com.google.android.finsky.cpkg.d.fn.b().booleanValue() || !jm.c(this.d.f2470a)) {
                    boolean a2 = DailyHygiene.a();
                    boolean z = FinskyApp.a().m.f4968b;
                    if (!a2 && !z) {
                        FinskyLog.a("Exiting process because of stale process stable experiments", new Object[0]);
                        System.exit(0);
                        return;
                    } else {
                        new Handler(Looper.getMainLooper()).postDelayed(new c(this.d, SystemClock.elapsedRealtime(), com.google.android.finsky.cpkg.d.fl.b().intValue(), r4), this.c);
                        return;
                    }
                }
                new Handler(Looper.getMainLooper()).postDelayed(new c(this.d, SystemClock.elapsedRealtime(), com.google.android.finsky.cpkg.d.fl.b().intValue(), r4), this.c);
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new c(this.d, SystemClock.elapsedRealtime(), elapsedRealtime, r4), this.c);
            return;
        }
        this.d.b();
    }
}
