package com.google.android.finsky.bpkg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f2137a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f2138b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public y(String str, String[] strArr, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        this.f2137a = str;
        this.f2138b = strArr;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.c = i;
        this.h = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.c == yVar.c && this.h == yVar.h && this.f == yVar.f && this.g == yVar.g && this.d == yVar.d && this.e == yVar.e && Arrays.equals(this.f2138b, yVar.f2138b)) {
            if (this.f2137a != null) {
                if (this.f2137a.equals(yVar.f2137a)) {
                    return true;
                }
            } else if (yVar.f2137a == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.g ? 1 : 0) + (((this.f ? 1 : 0) + (((this.e ? 1 : 0) + (((this.d ? 1 : 0) + (((((this.f2138b != null ? Arrays.hashCode(this.f2138b) : 0) + ((this.f2137a != null ? this.f2137a.hashCode() : 0) * 31)) * 31) + this.c) * 31)) * 31)) * 31)) * 31)) * 31) + (this.h ? 1 : 0);
    }

    public final String toString() {
        return String.format("(packageName=%s,installedVersion=%d,isSystemApp=%s,certificateHashes=%s)", this.f2137a, Integer.valueOf(this.c), Boolean.valueOf(this.d), Arrays.deepToString(this.f2138b));
    }
}
