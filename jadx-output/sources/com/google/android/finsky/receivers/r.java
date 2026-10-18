package com.google.android.finsky.receivers;

/* loaded from: classes.dex */
final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4493a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f4494b;

    r(q qVar, String str) {
        this.f4494b = qVar;
        this.f4493a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.b.a aVar;
        aVar = this.f4494b.f4492a.d;
        aVar.f2061b.e(this.f4493a);
        this.f4494b.f4492a.a(false);
    }
}
