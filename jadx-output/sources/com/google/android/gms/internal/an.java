package com.google.android.gms.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class an extends aa<an> {

    /* renamed from: a, reason: collision with root package name */
    public long f5876a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f5877b = 0;
    public long c = 0;
    public String d = "";
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public ao[] h = ao.b();
    public al i = null;
    public byte[] j = ai.h;
    public byte[] k = ai.h;
    public byte[] l = ai.h;
    public ak m = null;
    public String n = "";
    public long q = 180000;
    public am r = null;
    public byte[] s = ai.h;
    public int t = 0;
    public int[] u = ai.f5868a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        if (this.f5876a == anVar.f5876a && this.f5877b == anVar.f5877b && this.c == anVar.c) {
            if (this.d == null) {
                if (anVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(anVar.d)) {
                return false;
            }
            if (this.e == anVar.e && this.f == anVar.f && this.g == anVar.g && ae.a(this.h, anVar.h)) {
                if (this.i == null) {
                    if (anVar.i != null) {
                        return false;
                    }
                } else if (!this.i.equals(anVar.i)) {
                    return false;
                }
                if (Arrays.equals(this.j, anVar.j) && Arrays.equals(this.k, anVar.k) && Arrays.equals(this.l, anVar.l)) {
                    if (this.m == null) {
                        if (anVar.m != null) {
                            return false;
                        }
                    } else if (!this.m.equals(anVar.m)) {
                        return false;
                    }
                    if (this.n == null) {
                        if (anVar.n != null) {
                            return false;
                        }
                    } else if (!this.n.equals(anVar.n)) {
                        return false;
                    }
                    if (this.q != anVar.q) {
                        return false;
                    }
                    if (this.r == null) {
                        if (anVar.r != null) {
                            return false;
                        }
                    } else if (!this.r.equals(anVar.r)) {
                        return false;
                    }
                    if (Arrays.equals(this.s, anVar.s) && this.t == anVar.t && ae.a(this.u, anVar.u)) {
                        return (this.o == null || this.o.c()) ? anVar.o == null || anVar.o.c() : this.o.equals(anVar.o);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((this.r == null ? 0 : this.r.hashCode()) + (((((this.n == null ? 0 : this.n.hashCode()) + (((this.m == null ? 0 : this.m.hashCode()) + (((((((((this.i == null ? 0 : this.i.hashCode()) + (((((this.g ? 1231 : 1237) + (((((((this.d == null ? 0 : this.d.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f5876a ^ (this.f5876a >>> 32)))) * 31) + ((int) (this.f5877b ^ (this.f5877b >>> 32)))) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31)) * 31) + this.e) * 31) + this.f) * 31)) * 31) + ae.a(this.h)) * 31)) * 31) + Arrays.hashCode(this.j)) * 31) + Arrays.hashCode(this.k)) * 31) + Arrays.hashCode(this.l)) * 31)) * 31)) * 31) + ((int) (this.q ^ (this.q >>> 32)))) * 31)) * 31) + Arrays.hashCode(this.s)) * 31) + this.t) * 31) + ae.a(this.u)) * 31;
        if (this.o != null && !this.o.c()) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }

    public an() {
        this.o = null;
        this.p = -1;
    }

    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (this.f5876a != 0) {
            zzaicVar.a(1, this.f5876a);
        }
        if (!this.d.equals("")) {
            zzaicVar.a(2, this.d);
        }
        if (this.h != null && this.h.length > 0) {
            for (int i = 0; i < this.h.length; i++) {
                ao aoVar = this.h[i];
                if (aoVar != null) {
                    zzaicVar.a(3, aoVar);
                }
            }
        }
        if (!Arrays.equals(this.j, ai.h)) {
            zzaicVar.a(6, this.j);
        }
        if (this.m != null) {
            zzaicVar.a(7, this.m);
        }
        if (!Arrays.equals(this.k, ai.h)) {
            zzaicVar.a(8, this.k);
        }
        if (this.i != null) {
            zzaicVar.a(9, this.i);
        }
        if (this.g) {
            zzaicVar.a(10, this.g);
        }
        if (this.e != 0) {
            zzaicVar.a(11, this.e);
        }
        if (this.f != 0) {
            zzaicVar.a(12, this.f);
        }
        if (!Arrays.equals(this.l, ai.h)) {
            zzaicVar.a(13, this.l);
        }
        if (!this.n.equals("")) {
            zzaicVar.a(14, this.n);
        }
        if (this.q != 180000) {
            long j = this.q;
            zzaicVar.c(15, 0);
            zzaicVar.a(zzaic.c(j));
        }
        if (this.r != null) {
            zzaicVar.a(16, this.r);
        }
        if (this.f5877b != 0) {
            zzaicVar.a(17, this.f5877b);
        }
        if (!Arrays.equals(this.s, ai.h)) {
            zzaicVar.a(18, this.s);
        }
        if (this.t != 0) {
            zzaicVar.a(19, this.t);
        }
        if (this.u != null && this.u.length > 0) {
            for (int i2 = 0; i2 < this.u.length; i2++) {
                zzaicVar.a(20, this.u[i2]);
            }
        }
        if (this.c != 0) {
            zzaicVar.a(21, this.c);
        }
        super.a(zzaicVar);
    }

    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    protected final int a() {
        int a2 = super.a();
        if (this.f5876a != 0) {
            a2 += zzaic.b(1, this.f5876a);
        }
        if (!this.d.equals("")) {
            a2 += zzaic.b(2, this.d);
        }
        if (this.h != null && this.h.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.h.length; i2++) {
                ao aoVar = this.h[i2];
                if (aoVar != null) {
                    i += zzaic.b(3, aoVar);
                }
            }
            a2 = i;
        }
        if (!Arrays.equals(this.j, ai.h)) {
            a2 += zzaic.b(6, this.j);
        }
        if (this.m != null) {
            a2 += zzaic.b(7, this.m);
        }
        if (!Arrays.equals(this.k, ai.h)) {
            a2 += zzaic.b(8, this.k);
        }
        if (this.i != null) {
            a2 += zzaic.b(9, this.i);
        }
        if (this.g) {
            a2 += zzaic.b(10) + 1;
        }
        if (this.e != 0) {
            a2 += zzaic.b(11, this.e);
        }
        if (this.f != 0) {
            a2 += zzaic.b(12, this.f);
        }
        if (!Arrays.equals(this.l, ai.h)) {
            a2 += zzaic.b(13, this.l);
        }
        if (!this.n.equals("")) {
            a2 += zzaic.b(14, this.n);
        }
        if (this.q != 180000) {
            a2 += zzaic.b(zzaic.c(this.q)) + zzaic.b(15);
        }
        if (this.r != null) {
            a2 += zzaic.b(16, this.r);
        }
        if (this.f5877b != 0) {
            a2 += zzaic.b(17, this.f5877b);
        }
        if (!Arrays.equals(this.s, ai.h)) {
            a2 += zzaic.b(18, this.s);
        }
        if (this.t != 0) {
            a2 += zzaic.b(19, this.t);
        }
        if (this.u != null && this.u.length > 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.u.length; i4++) {
                i3 += zzaic.a(this.u[i4]);
            }
            a2 = a2 + i3 + (this.u.length * 2);
        }
        return this.c != 0 ? a2 + zzaic.b(21, this.c) : a2;
    }

    @Override // com.google.android.gms.internal.af
    public final /* synthetic */ af a(z zVar) {
        while (true) {
            int a2 = zVar.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.f5876a = zVar.f();
                    break;
                case 18:
                    this.d = zVar.c();
                    break;
                case 26:
                    int b2 = ai.b(zVar, 26);
                    int length = this.h == null ? 0 : this.h.length;
                    ao[] aoVarArr = new ao[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.h, 0, aoVarArr, 0, length);
                    }
                    while (length < aoVarArr.length - 1) {
                        aoVarArr[length] = new ao();
                        zVar.a(aoVarArr[length]);
                        zVar.a();
                        length++;
                    }
                    aoVarArr[length] = new ao();
                    zVar.a(aoVarArr[length]);
                    this.h = aoVarArr;
                    break;
                case 50:
                    this.j = zVar.d();
                    break;
                case 58:
                    if (this.m == null) {
                        this.m = new ak();
                    }
                    zVar.a(this.m);
                    break;
                case 66:
                    this.k = zVar.d();
                    break;
                case 74:
                    if (this.i == null) {
                        this.i = new al();
                    }
                    zVar.a(this.i);
                    break;
                case 80:
                    this.g = zVar.b();
                    break;
                case 88:
                    this.e = zVar.e();
                    break;
                case 96:
                    this.f = zVar.e();
                    break;
                case 106:
                    this.l = zVar.d();
                    break;
                case 114:
                    this.n = zVar.c();
                    break;
                case 120:
                    long f = zVar.f();
                    this.q = (-(f & 1)) ^ (f >>> 1);
                    break;
                case 130:
                    if (this.r == null) {
                        this.r = new am();
                    }
                    zVar.a(this.r);
                    break;
                case 136:
                    this.f5877b = zVar.f();
                    break;
                case 146:
                    this.s = zVar.d();
                    break;
                case 152:
                    int e = zVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.t = e;
                            break;
                    }
                case 160:
                    int b3 = ai.b(zVar, 160);
                    int length2 = this.u == null ? 0 : this.u.length;
                    int[] iArr = new int[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.u, 0, iArr, 0, length2);
                    }
                    while (length2 < iArr.length - 1) {
                        iArr[length2] = zVar.e();
                        zVar.a();
                        length2++;
                    }
                    iArr[length2] = zVar.e();
                    this.u = iArr;
                    break;
                case 162:
                    int c = zVar.c(zVar.e());
                    int j = zVar.j();
                    int i = 0;
                    while (zVar.i() > 0) {
                        zVar.e();
                        i++;
                    }
                    zVar.e(j);
                    int length3 = this.u == null ? 0 : this.u.length;
                    int[] iArr2 = new int[i + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.u, 0, iArr2, 0, length3);
                    }
                    while (length3 < iArr2.length) {
                        iArr2[length3] = zVar.e();
                        length3++;
                    }
                    this.u = iArr2;
                    zVar.d(c);
                    break;
                case 168:
                    this.c = zVar.f();
                    break;
                default:
                    if (!a(zVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
