package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class ak extends aa<ak> {

    /* renamed from: a, reason: collision with root package name */
    public String[] f5870a = ai.f;

    /* renamed from: b, reason: collision with root package name */
    public String[] f5871b = ai.f;
    public int[] c = ai.f5868a;
    public long[] d = ai.f5869b;

    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (this.f5870a != null && this.f5870a.length > 0) {
            for (int i = 0; i < this.f5870a.length; i++) {
                String str = this.f5870a[i];
                if (str != null) {
                    zzaicVar.a(1, str);
                }
            }
        }
        if (this.f5871b != null && this.f5871b.length > 0) {
            for (int i2 = 0; i2 < this.f5871b.length; i2++) {
                String str2 = this.f5871b[i2];
                if (str2 != null) {
                    zzaicVar.a(2, str2);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (int i3 = 0; i3 < this.c.length; i3++) {
                zzaicVar.a(3, this.c[i3]);
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int i4 = 0; i4 < this.d.length; i4++) {
                zzaicVar.a(4, this.d[i4]);
            }
        }
        super.a(zzaicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        if (ae.a(this.f5870a, akVar.f5870a) && ae.a(this.f5871b, akVar.f5871b) && ae.a(this.c, akVar.c) && ae.a(this.d, akVar.d)) {
            return (this.o == null || this.o.c()) ? akVar.o == null || akVar.o.c() : this.o.equals(akVar.o);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.o == null || this.o.c()) ? 0 : this.o.hashCode()) + ((((((((((getClass().getName().hashCode() + 527) * 31) + ae.a(this.f5870a)) * 31) + ae.a(this.f5871b)) * 31) + ae.a(this.c)) * 31) + ae.a(this.d)) * 31);
    }

    public ak() {
        this.o = null;
        this.p = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.f5870a == null || this.f5870a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f5870a.length; i4++) {
                String str = this.f5870a[i4];
                if (str != null) {
                    i3++;
                    i2 += zzaic.a(str);
                }
            }
            i = a2 + i2 + (i3 * 1);
        }
        if (this.f5871b != null && this.f5871b.length > 0) {
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f5871b.length; i7++) {
                String str2 = this.f5871b[i7];
                if (str2 != null) {
                    i6++;
                    i5 += zzaic.a(str2);
                }
            }
            i = i + i5 + (i6 * 1);
        }
        if (this.c != null && this.c.length > 0) {
            int i8 = 0;
            for (int i9 = 0; i9 < this.c.length; i9++) {
                i8 += zzaic.a(this.c[i9]);
            }
            i = i + i8 + (this.c.length * 1);
        }
        if (this.d == null || this.d.length <= 0) {
            return i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.d.length; i11++) {
            i10 += zzaic.b(this.d[i11]);
        }
        return i + i10 + (this.d.length * 1);
    }

    @Override // com.google.android.gms.internal.af
    public final /* synthetic */ af a(z zVar) {
        while (true) {
            int a2 = zVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    int b2 = ai.b(zVar, 10);
                    int length = this.f5870a == null ? 0 : this.f5870a.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f5870a, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = zVar.c();
                        zVar.a();
                        length++;
                    }
                    strArr[length] = zVar.c();
                    this.f5870a = strArr;
                    break;
                case 18:
                    int b3 = ai.b(zVar, 18);
                    int length2 = this.f5871b == null ? 0 : this.f5871b.length;
                    String[] strArr2 = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f5871b, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = zVar.c();
                        zVar.a();
                        length2++;
                    }
                    strArr2[length2] = zVar.c();
                    this.f5871b = strArr2;
                    break;
                case 24:
                    int b4 = ai.b(zVar, 24);
                    int length3 = this.c == null ? 0 : this.c.length;
                    int[] iArr = new int[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.c, 0, iArr, 0, length3);
                    }
                    while (length3 < iArr.length - 1) {
                        iArr[length3] = zVar.e();
                        zVar.a();
                        length3++;
                    }
                    iArr[length3] = zVar.e();
                    this.c = iArr;
                    break;
                case 26:
                    int c = zVar.c(zVar.e());
                    int j = zVar.j();
                    int i = 0;
                    while (zVar.i() > 0) {
                        zVar.e();
                        i++;
                    }
                    zVar.e(j);
                    int length4 = this.c == null ? 0 : this.c.length;
                    int[] iArr2 = new int[i + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.c, 0, iArr2, 0, length4);
                    }
                    while (length4 < iArr2.length) {
                        iArr2[length4] = zVar.e();
                        length4++;
                    }
                    this.c = iArr2;
                    zVar.d(c);
                    break;
                case 32:
                    int b5 = ai.b(zVar, 32);
                    int length5 = this.d == null ? 0 : this.d.length;
                    long[] jArr = new long[b5 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.d, 0, jArr, 0, length5);
                    }
                    while (length5 < jArr.length - 1) {
                        jArr[length5] = zVar.f();
                        zVar.a();
                        length5++;
                    }
                    jArr[length5] = zVar.f();
                    this.d = jArr;
                    break;
                case 34:
                    int c2 = zVar.c(zVar.e());
                    int j2 = zVar.j();
                    int i2 = 0;
                    while (zVar.i() > 0) {
                        zVar.f();
                        i2++;
                    }
                    zVar.e(j2);
                    int length6 = this.d == null ? 0 : this.d.length;
                    long[] jArr2 = new long[i2 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.d, 0, jArr2, 0, length6);
                    }
                    while (length6 < jArr2.length) {
                        jArr2[length6] = zVar.f();
                        length6++;
                    }
                    this.d = jArr2;
                    zVar.d(c2);
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
