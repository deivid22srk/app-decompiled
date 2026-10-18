package com.google.android.finsky.layout.play;

/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3486a;

    d(FinskyDrawerLayout finskyDrawerLayout) {
        this.f3486a = finskyDrawerLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.navigationmanager.b bVar;
        this.f3486a.d(111);
        bVar = this.f3486a.o;
        bVar.p();
    }
}
