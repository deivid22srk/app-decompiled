package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class ac implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static final ad f5861a = new ad();

    /* renamed from: b, reason: collision with root package name */
    boolean f5862b;
    int[] c;
    ad[] d;
    int e;

    ac() {
        this(10);
    }

    private ac(int i) {
        this.f5862b = false;
        int b2 = b(i);
        this.c = new int[b2];
        this.d = new ad[b2];
        this.e = 0;
    }

    final ad a(int i) {
        if (this.f5862b) {
            a();
        }
        return this.d[i];
    }

    final void a() {
        int i = this.e;
        int[] iArr = this.c;
        ad[] adVarArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ad adVar = adVarArr[i3];
            if (adVar != f5861a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    adVarArr[i2] = adVar;
                    adVarArr[i3] = null;
                }
                i2++;
            }
        }
        this.f5862b = false;
        this.e = i2;
    }

    final int b() {
        if (this.f5862b) {
            a();
        }
        return this.e;
    }

    final int c(int i) {
        int i2 = 0;
        int i3 = this.e - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.c[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else {
                if (i5 <= i) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return i2 ^ (-1);
    }

    public final boolean c() {
        return b() == 0;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ac clone() {
        int b2 = b();
        ac acVar = new ac(b2);
        System.arraycopy(this.c, 0, acVar.c, 0, b2);
        for (int i = 0; i < b2; i++) {
            if (this.d[i] != null) {
                acVar.d[i] = this.d[i].clone();
            }
        }
        acVar.e = b2;
        return acVar;
    }

    public final int hashCode() {
        if (this.f5862b) {
            a();
        }
        int i = 17;
        for (int i2 = 0; i2 < this.e; i2++) {
            i = (((i * 31) + this.c[i2]) * 31) + this.d[i2].hashCode();
        }
        return i;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        if (b() != acVar.b()) {
            return false;
        }
        int[] iArr = this.c;
        int[] iArr2 = acVar.c;
        int i = this.e;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            }
            if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            }
            i2++;
        }
        if (z) {
            ad[] adVarArr = this.d;
            ad[] adVarArr2 = acVar.d;
            int i3 = this.e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                }
                if (!adVarArr[i4].equals(adVarArr2[i4])) {
                    z2 = false;
                    break;
                }
                i4++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    static int b(int i) {
        int i2 = i * 4;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }
}
