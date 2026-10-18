package com.google.android.finsky.download;

import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public final class n implements aj {

    /* renamed from: a, reason: collision with root package name */
    q f2723a;

    /* renamed from: b, reason: collision with root package name */
    b f2724b;
    private ConnectivityManager c;
    private WifiManager d;
    private final Handler e;
    private long f;
    private long g;

    public n() {
        this.c = null;
        this.d = null;
        this.c = (ConnectivityManager) FinskyApp.a().getSystemService("connectivity");
        this.d = (WifiManager) FinskyApp.a().getSystemService("wifi");
        HandlerThread handlerThread = new HandlerThread("NetworkQualityQueryThread");
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
        a();
    }

    @Override // com.google.android.finsky.download.aj
    public final void c(b bVar) {
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(b bVar) {
        a();
    }

    private void a() {
        this.f = -1L;
        this.g = -1L;
        this.f2723a = null;
        this.f2724b = null;
    }

    @Override // com.google.android.finsky.download.aj
    public final void d(b bVar) {
        a();
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(b bVar, int i) {
        a();
    }

    @Override // com.google.android.finsky.download.aj
    public final void b(b bVar) {
        if (this.f >= 0 && this.g >= 0) {
            long j = bVar.l().f2732b - this.f;
            long max = (1000 * j) / Math.max(1L, SystemClock.uptimeMillis() - this.g);
            q qVar = this.f2723a;
            a();
            if (max < 0 || j < 0) {
                FinskyLog.c("Throughput or bytes transferred were calculated incorrectly or not at all", new Object[0]);
            } else {
                this.e.post(new o(this, qVar, j, max));
            }
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(b bVar, r rVar) {
        double d = rVar.f2732b / rVar.c;
        if (this.f2724b != null && !this.f2724b.equals(bVar)) {
            a();
        }
        if (this.f2724b == null && d >= 0.2d && d < 0.9d) {
            this.f2724b = bVar;
            this.f = rVar.f2732b;
            this.g = SystemClock.uptimeMillis();
            this.e.post(new p(this, bVar));
        }
    }

    static /* synthetic */ q a(n nVar) {
        jm.b();
        q qVar = new q();
        qVar.f2729a = nVar.c.getActiveNetworkInfo();
        if (qVar.f2729a != null && 1 == qVar.f2729a.getType()) {
            qVar.f2730b = nVar.d.getConnectionInfo();
        }
        return qVar;
    }
}
