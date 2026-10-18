package com.google.android.finsky.g;

/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f2834a = null;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f2835b;
    public final long c;
    public final long d;
    public final boolean e;

    public q(String str, String str2, int i, long j, String[] strArr, long j2, long j3, boolean z, boolean z2, String str3, int i2) {
        super(str, a.f2782a, 3, str2, 1, i, j, Long.MAX_VALUE, false, z2, str3, i2);
        this.f2835b = strArr;
        this.c = j2;
        this.d = j3;
        this.e = z;
    }

    public final String toString() {
        return String.format("{package=%s}", this.j);
    }

    public final boolean a(String[] strArr) {
        if (strArr == f2834a) {
            return true;
        }
        for (String str : strArr) {
            for (String str2 : this.f2835b) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.finsky.g.r
    public final boolean equals(Object obj) {
        boolean z;
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof q)) {
            return true;
        }
        q qVar = (q) obj;
        if (this.f2835b.length != qVar.f2835b.length) {
            return false;
        }
        int length = this.f2835b.length;
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if (this.f2835b[i].equals(qVar.f2835b[i2])) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
