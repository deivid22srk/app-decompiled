package com.google.android.finsky.apkg;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final y f1473a = i.b();

    public b(int i) {
        this.f1473a.f1511a = i;
        this.f1473a.f1512b = true;
    }

    public final b a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f1473a.c = str;
            this.f1473a.d = true;
        }
        return this;
    }

    public final b b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f1473a.e = str;
            this.f1473a.f = true;
        }
        return this;
    }

    public final b a(int i) {
        if (i != 0) {
            this.f1473a.g = i;
            this.f1473a.h = true;
        }
        return this;
    }

    public final b c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f1473a.i = str;
            this.f1473a.j = true;
        }
        return this;
    }

    public final b a(Throwable th) {
        if (th != null) {
            c(th.getClass().getSimpleName());
        }
        return this;
    }

    public final b a(byte[] bArr) {
        if (bArr != null) {
            this.f1473a.k = bArr;
            this.f1473a.l = true;
        }
        return this;
    }

    public final b b(int i) {
        if (i != 0) {
            this.f1473a.m = i;
            this.f1473a.n = true;
        }
        return this;
    }

    public final b a(Integer num) {
        if (num != null) {
            this.f1473a.o = num.intValue();
            this.f1473a.p = true;
        }
        return this;
    }

    public final b b(Integer num) {
        if (num != null) {
            this.f1473a.q = num.intValue();
            this.f1473a.r = true;
        }
        return this;
    }

    public final b a(n nVar) {
        this.f1473a.t = nVar;
        return this;
    }

    public final b a(long j) {
        if (j >= 0) {
            this.f1473a.u = j;
            this.f1473a.v = true;
        }
        return this;
    }

    public final b b(long j) {
        if (j >= 0) {
            this.f1473a.w = j;
            this.f1473a.x = true;
        }
        return this;
    }

    public final b a(boolean z) {
        this.f1473a.z = z;
        this.f1473a.A = true;
        return this;
    }

    public final b c(int i) {
        if (i >= 0) {
            this.f1473a.D = i;
            this.f1473a.E = true;
        }
        return this;
    }

    public final b a(ao aoVar) {
        this.f1473a.H = aoVar;
        return this;
    }

    public final b d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f1473a.I = str;
            this.f1473a.J = true;
        }
        return this;
    }

    public final b a(o oVar) {
        this.f1473a.N = oVar;
        return this;
    }

    public final b e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f1473a.R = str;
            this.f1473a.S = true;
        }
        return this;
    }

    public final b d(int i) {
        if (this.f1473a.U == null) {
            this.f1473a.U = new q();
        }
        this.f1473a.U.f1496a = i;
        return this;
    }
}
