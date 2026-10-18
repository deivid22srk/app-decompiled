package com.google.android.finsky.layout.play;

/* loaded from: classes.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3512a;

    s(FinskyDrawerLayout finskyDrawerLayout) {
        this.f3512a = finskyDrawerLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.navigationmanager.b bVar;
        com.google.android.finsky.navigationmanager.b bVar2;
        this.f3512a.d(125);
        bVar = this.f3512a.o;
        bVar.w();
        bVar2 = this.f3512a.o;
        bVar2.l();
    }
}
