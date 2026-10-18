package com.google.android.finsky.layout.play;

/* loaded from: classes.dex */
final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3513a;

    t(FinskyDrawerLayout finskyDrawerLayout) {
        this.f3513a = finskyDrawerLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.navigationmanager.b bVar;
        com.google.android.finsky.navigationmanager.b bVar2;
        this.f3513a.d(108);
        bVar = this.f3513a.o;
        bVar.w();
        bVar2 = this.f3513a.o;
        bVar2.m();
    }
}
