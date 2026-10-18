package com.android.a.a;

/* loaded from: classes.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f1125a;

    /* renamed from: b, reason: collision with root package name */
    private e f1126b;

    public s(l lVar, e eVar) {
        this.f1125a = lVar;
        this.f1126b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.a(this.f1125a, this.f1126b);
    }
}
