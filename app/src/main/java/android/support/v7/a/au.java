package android.support.v7.a;

import android.support.v4.view.by;
import android.view.View;

/* loaded from: classes.dex */
final class au implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f484a;

    au(ap apVar) {
        this.f484a = apVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f484a.s.showAtLocation(this.f484a.r, 55, 0, 0);
        this.f484a.m();
        by.c((View) this.f484a.r, 0.0f);
        this.f484a.u = by.t(this.f484a.r).a(1.0f);
        this.f484a.u.a(new av(this));
    }
}
