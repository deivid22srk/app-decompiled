package com.google.android.gms.internal;

import com.google.android.gms.internal.zzaic;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends aa<j> {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6078a = ai.h;

    /* renamed from: b, reason: collision with root package name */
    public String f6079b = "";
    public double c = 0.0d;
    public float d = 0.0f;
    public long e = 0;
    public int f = 0;
    public int g = 0;
    public boolean h = false;
    public h[] i = h.b();
    public i[] j = i.b();
    public String[] k = ai.f;
    public long[] l = ai.f5869b;
    public float[] m = ai.c;
    public long n = 0;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!Arrays.equals(this.f6078a, jVar.f6078a)) {
            return false;
        }
        if (this.f6079b == null) {
            if (jVar.f6079b != null) {
                return false;
            }
        } else if (!this.f6079b.equals(jVar.f6079b)) {
            return false;
        }
        if (Double.doubleToLongBits(this.c) == Double.doubleToLongBits(jVar.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(jVar.d) && this.e == jVar.e && this.f == jVar.f && this.g == jVar.g && this.h == jVar.h && ae.a(this.i, jVar.i) && ae.a(this.j, jVar.j) && ae.a(this.k, jVar.k) && ae.a(this.l, jVar.l) && ae.a(this.m, jVar.m) && this.n == jVar.n) {
            return (this.o == null || this.o.c()) ? jVar.o == null || jVar.o.c() : this.o.equals(jVar.o);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (this.f6079b == null ? 0 : this.f6079b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f6078a)) * 31);
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        int floatToIntBits = ((((((((((((((this.h ? 1231 : 1237) + (((((((((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + Float.floatToIntBits(this.d)) * 31) + ((int) (this.e ^ (this.e >>> 32)))) * 31) + this.f) * 31) + this.g) * 31)) * 31) + ae.a(this.i)) * 31) + ae.a(this.j)) * 31) + ae.a(this.k)) * 31) + ae.a(this.l)) * 31) + ae.a(this.m)) * 31) + ((int) (this.n ^ (this.n >>> 32)))) * 31;
        if (this.o != null && !this.o.c()) {
            i = this.o.hashCode();
        }
        return floatToIntBits + i;
    }

    public j() {
        this.o = null;
        this.p = -1;
    }

    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (!Arrays.equals(this.f6078a, ai.h)) {
            zzaicVar.a(1, this.f6078a);
        }
        if (!this.f6079b.equals("")) {
            zzaicVar.a(2, this.f6079b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            double d = this.c;
            zzaicVar.c(3, 1);
            long doubleToLongBits = Double.doubleToLongBits(d);
            if (zzaicVar.f6261a.remaining() < 8) {
                throw new zzaic.zza(zzaicVar.f6261a.position(), zzaicVar.f6261a.limit());
            }
            zzaicVar.f6261a.putLong(doubleToLongBits);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            zzaicVar.a(4, this.d);
        }
        if (this.e != 0) {
            zzaicVar.a(5, this.e);
        }
        if (this.f != 0) {
            zzaicVar.a(6, this.f);
        }
        if (this.g != 0) {
            int i = this.g;
            zzaicVar.c(7, 0);
            zzaicVar.c(zzaic.e(i));
        }
        if (this.h) {
            zzaicVar.a(8, this.h);
        }
        if (this.i != null && this.i.length > 0) {
            for (int i2 = 0; i2 < this.i.length; i2++) {
                h hVar = this.i[i2];
                if (hVar != null) {
                    zzaicVar.a(9, hVar);
                }
            }
        }
        if (this.j != null && this.j.length > 0) {
            for (int i3 = 0; i3 < this.j.length; i3++) {
                i iVar = this.j[i3];
                if (iVar != null) {
                    zzaicVar.a(10, iVar);
                }
            }
        }
        if (this.k != null && this.k.length > 0) {
            for (int i4 = 0; i4 < this.k.length; i4++) {
                String str = this.k[i4];
                if (str != null) {
                    zzaicVar.a(11, str);
                }
            }
        }
        if (this.l != null && this.l.length > 0) {
            for (int i5 = 0; i5 < this.l.length; i5++) {
                zzaicVar.a(12, this.l[i5]);
            }
        }
        if (this.n != 0) {
            zzaicVar.a(13, this.n);
        }
        if (this.m != null && this.m.length > 0) {
            for (int i6 = 0; i6 < this.m.length; i6++) {
                zzaicVar.a(14, this.m[i6]);
            }
        }
        super.a(zzaicVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final int a() {
        int a2 = super.a();
        if (!Arrays.equals(this.f6078a, ai.h)) {
            a2 += zzaic.b(1, this.f6078a);
        }
        if (!this.f6079b.equals("")) {
            a2 += zzaic.b(2, this.f6079b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            a2 += zzaic.b(3) + 8;
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            a2 += zzaic.b(4) + 4;
        }
        if (this.e != 0) {
            a2 += zzaic.b(5, this.e);
        }
        if (this.f != 0) {
            a2 += zzaic.b(6, this.f);
        }
        if (this.g != 0) {
            a2 += zzaic.d(zzaic.e(this.g)) + zzaic.b(7);
        }
        if (this.h) {
            a2 += zzaic.b(8) + 1;
        }
        if (this.i != null && this.i.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.i.length; i2++) {
                h hVar = this.i[i2];
                if (hVar != null) {
                    i += zzaic.b(9, hVar);
                }
            }
            a2 = i;
        }
        if (this.j != null && this.j.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.j.length; i4++) {
                i iVar = this.j[i4];
                if (iVar != null) {
                    i3 += zzaic.b(10, iVar);
                }
            }
            a2 = i3;
        }
        if (this.k != null && this.k.length > 0) {
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.k.length; i7++) {
                String str = this.k[i7];
                if (str != null) {
                    i6++;
                    i5 += zzaic.a(str);
                }
            }
            a2 = a2 + i5 + (i6 * 1);
        }
        if (this.l != null && this.l.length > 0) {
            int i8 = 0;
            for (int i9 = 0; i9 < this.l.length; i9++) {
                i8 += zzaic.b(this.l[i9]);
            }
            a2 = a2 + i8 + (this.l.length * 1);
        }
        if (this.n != 0) {
            a2 += zzaic.b(13, this.n);
        }
        return (this.m == null || this.m.length <= 0) ? a2 : a2 + (this.m.length * 4) + (this.m.length * 1);
    }

    @Override // com.google.android.gms.internal.af
    public final /* synthetic */ af a(z zVar) {
        while (true) {
            int a2 = zVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.f6078a = zVar.d();
                    break;
                case 18:
                    this.f6079b = zVar.c();
                    break;
                case 25:
                    this.c = Double.longBitsToDouble(zVar.h());
                    break;
                case 37:
                    this.d = Float.intBitsToFloat(zVar.g());
                    break;
                case 40:
                    this.e = zVar.f();
                    break;
                case 48:
                    this.f = zVar.e();
                    break;
                case 56:
                    int e = zVar.e();
                    this.g = (-(e & 1)) ^ (e >>> 1);
                    break;
                case 64:
                    this.h = zVar.b();
                    break;
                case 74:
                    int b2 = ai.b(zVar, 74);
                    int length = this.i == null ? 0 : this.i.length;
                    h[] hVarArr = new h[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.i, 0, hVarArr, 0, length);
                    }
                    while (length < hVarArr.length - 1) {
                        hVarArr[length] = new h();
                        zVar.a(hVarArr[length]);
                        zVar.a();
                        length++;
                    }
                    hVarArr[length] = new h();
                    zVar.a(hVarArr[length]);
                    this.i = hVarArr;
                    break;
                case 82:
                    int b3 = ai.b(zVar, 82);
                    int length2 = this.j == null ? 0 : this.j.length;
                    i[] iVarArr = new i[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.j, 0, iVarArr, 0, length2);
                    }
                    while (length2 < iVarArr.length - 1) {
                        iVarArr[length2] = new i();
                        zVar.a(iVarArr[length2]);
                        zVar.a();
                        length2++;
                    }
                    iVarArr[length2] = new i();
                    zVar.a(iVarArr[length2]);
                    this.j = iVarArr;
                    break;
                case 90:
                    int b4 = ai.b(zVar, 90);
                    int length3 = this.k == null ? 0 : this.k.length;
                    String[] strArr = new String[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.k, 0, strArr, 0, length3);
                    }
                    while (length3 < strArr.length - 1) {
                        strArr[length3] = zVar.c();
                        zVar.a();
                        length3++;
                    }
                    strArr[length3] = zVar.c();
                    this.k = strArr;
                    break;
                case 96:
                    int b5 = ai.b(zVar, 96);
                    int length4 = this.l == null ? 0 : this.l.length;
                    long[] jArr = new long[b5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.l, 0, jArr, 0, length4);
                    }
                    while (length4 < jArr.length - 1) {
                        jArr[length4] = zVar.f();
                        zVar.a();
                        length4++;
                    }
                    jArr[length4] = zVar.f();
                    this.l = jArr;
                    break;
                case 98:
                    int c = zVar.c(zVar.e());
                    int j = zVar.j();
                    int i = 0;
                    while (zVar.i() > 0) {
                        zVar.f();
                        i++;
                    }
                    zVar.e(j);
                    int length5 = this.l == null ? 0 : this.l.length;
                    long[] jArr2 = new long[i + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.l, 0, jArr2, 0, length5);
                    }
                    while (length5 < jArr2.length) {
                        jArr2[length5] = zVar.f();
                        length5++;
                    }
                    this.l = jArr2;
                    zVar.d(c);
                    break;
                case 104:
                    this.n = zVar.f();
                    break;
                case 114:
                    int e2 = zVar.e();
                    int c2 = zVar.c(e2);
                    int i2 = e2 / 4;
                    int length6 = this.m == null ? 0 : this.m.length;
                    float[] fArr = new float[i2 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.m, 0, fArr, 0, length6);
                    }
                    while (length6 < fArr.length) {
                        fArr[length6] = Float.intBitsToFloat(zVar.g());
                        length6++;
                    }
                    this.m = fArr;
                    zVar.d(c2);
                    break;
                case 117:
                    int b6 = ai.b(zVar, 117);
                    int length7 = this.m == null ? 0 : this.m.length;
                    float[] fArr2 = new float[b6 + length7];
                    if (length7 != 0) {
                        System.arraycopy(this.m, 0, fArr2, 0, length7);
                    }
                    while (length7 < fArr2.length - 1) {
                        fArr2[length7] = Float.intBitsToFloat(zVar.g());
                        zVar.a();
                        length7++;
                    }
                    fArr2[length7] = Float.intBitsToFloat(zVar.g());
                    this.m = fArr2;
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
