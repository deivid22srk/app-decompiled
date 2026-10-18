package com.android.volley;

/* loaded from: classes.dex */
final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1247a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f1248b;
    final /* synthetic */ l c;

    m(l lVar, String str, long j) {
        this.c = lVar;
        this.f1247a = str;
        this.f1248b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar;
        x xVar2;
        xVar = this.c.j;
        xVar.a(this.f1247a, this.f1248b);
        xVar2 = this.c.j;
        xVar2.a(toString());
    }
}
