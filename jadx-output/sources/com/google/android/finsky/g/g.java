package com.google.android.finsky.g;

/* loaded from: classes.dex */
public abstract class g implements p {
    final s c;

    public abstract void a(String str, String str2);

    public g(s sVar) {
        this.c = sVar;
    }

    public void c(r rVar) {
        if (!b(rVar)) {
            this.c.a(rVar.m);
        }
    }

    @Override // com.google.android.finsky.g.p
    public void d(r rVar) {
        r a2 = a(rVar);
        if (a2 != null) {
            this.c.b(a2.m);
        }
    }

    public void a() {
        this.c.b();
    }
}
