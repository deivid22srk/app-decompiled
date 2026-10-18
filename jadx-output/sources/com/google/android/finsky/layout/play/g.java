package com.google.android.finsky.layout.play;

/* loaded from: classes.dex */
final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f3495a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3496b;

    g(FinskyDrawerLayout finskyDrawerLayout, String str) {
        this.f3496b = finskyDrawerLayout;
        this.f3495a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.navigationmanager.b bVar;
        bVar = this.f3496b.o;
        bVar.b(this.f3495a);
    }
}
