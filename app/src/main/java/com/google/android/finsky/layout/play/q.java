package com.google.android.finsky.layout.play;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f3509a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cy f3510b;
    final /* synthetic */ FinskyDrawerLayout c;

    q(FinskyDrawerLayout finskyDrawerLayout, boolean z, cy cyVar) {
        this.c = finskyDrawerLayout;
        this.f3509a = z;
        this.f3510b = cyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.navigationmanager.b bVar;
        if (!this.f3509a) {
            this.c.d(127);
        } else {
            com.google.android.finsky.cpkg.o<Integer> b2 = com.google.android.finsky.utils.bg.aW.b(com.google.android.finsky.utils.av.e());
            if (b2.a().intValue() == 0) {
                b2.a((com.google.android.finsky.cpkg.o<Integer>) 1);
            }
            FinskyApp.a().h().a(299, (byte[]) null, new ad(127, this.f3510b));
        }
        bVar = this.c.o;
        bVar.n();
    }
}
