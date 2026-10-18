package com.google.android.libraries.bind.data;

/* loaded from: classes.dex */
public class r extends k {
    protected final q g;
    protected final k h;
    private final m i;
    private final int[] j;
    private int k;

    public r(k kVar, q qVar, int[] iArr, int i) {
        super(i);
        com.google.android.libraries.bind.d.a.a(kVar != null);
        this.g = qVar;
        this.h = kVar;
        this.j = iArr;
        this.i = new s(this);
    }

    @Override // com.google.android.libraries.bind.data.k
    protected final int[] g() {
        return this.j;
    }

    @Override // com.google.android.libraries.bind.data.k
    public final void j() {
        if (this.h.h() || this.h.e.b()) {
            super.j();
        } else {
            a(j.f6693a);
        }
    }

    @Override // com.google.android.libraries.bind.data.k
    public final boolean d() {
        return super.d() || this.h.d != this.k;
    }

    @Override // com.google.android.libraries.bind.data.k
    protected final void e() {
        this.h.a(this.i);
    }

    @Override // com.google.android.libraries.bind.data.k
    protected final void f() {
        this.h.b(this.i);
    }

    @Override // com.google.android.libraries.bind.data.k
    public String toString() {
        return super.toString() + "\n\nParent:" + this.h.toString();
    }

    @Override // com.google.android.libraries.bind.data.k
    protected ab k() {
        return new t(this, this.h.e.b() ? com.google.android.libraries.bind.a.o.c : com.google.android.libraries.bind.a.o.f6658a, this.g, this.h);
    }
}
