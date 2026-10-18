package com.a.a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    boolean f1043a;

    /* renamed from: b, reason: collision with root package name */
    String[] f1044b;
    String[] c;
    boolean d;

    /* synthetic */ p(boolean z, byte b2) {
        this(z);
    }

    public p(boolean z) {
        this.f1043a = z;
    }

    public p(o oVar) {
        String[] strArr;
        String[] strArr2;
        this.f1043a = oVar.d;
        strArr = oVar.e;
        this.f1044b = strArr;
        strArr2 = oVar.f;
        this.c = strArr2;
        this.d = oVar.g;
    }

    public final p a(k... kVarArr) {
        if (!this.f1043a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[kVarArr.length];
        for (int i = 0; i < kVarArr.length; i++) {
            strArr[i] = kVarArr[i].aS;
        }
        this.f1044b = strArr;
        return this;
    }

    public final p a(aj... ajVarArr) {
        if (!this.f1043a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[ajVarArr.length];
        for (int i = 0; i < ajVarArr.length; i++) {
            strArr[i] = ajVarArr[i].e;
        }
        this.c = strArr;
        return this;
    }

    public final o a() {
        return new o(this, (byte) 0);
    }
}
