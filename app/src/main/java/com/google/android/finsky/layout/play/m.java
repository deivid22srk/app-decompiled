package com.google.android.finsky.layout.play;

/* loaded from: classes.dex */
final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3504a;

    m(FinskyDrawerLayout finskyDrawerLayout) {
        this.f3504a = finskyDrawerLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.navigationmanager.b bVar;
        this.f3504a.d(111);
        bVar = this.f3504a.o;
        bVar.p();
    }
}
