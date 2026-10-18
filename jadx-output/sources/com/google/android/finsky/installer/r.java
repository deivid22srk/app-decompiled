package com.google.android.finsky.installer;

/* loaded from: classes.dex */
final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2869a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f2870b;

    r(q qVar, String str) {
        this.f2870b = qVar;
        this.f2869a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2870b.f2868a.f2854b = this.f2869a;
        this.f2870b.d(this.f2869a);
    }
}
