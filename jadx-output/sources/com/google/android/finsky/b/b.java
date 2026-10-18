package com.google.android.finsky.b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2104a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2105b;
    public final y c;
    public final t d;

    public b(String str, String str2, y yVar, t tVar) {
        this.f2104a = str;
        this.f2105b = str2;
        this.c = yVar;
        this.d = tVar;
    }

    public final String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = this.f2104a;
        objArr[1] = this.f2105b;
        objArr[2] = Integer.valueOf(this.c != null ? this.c.c : -1);
        objArr[3] = Integer.valueOf(this.d != null ? this.d.c : -1);
        return String.format("{package=%s nodeid=%s installed=%d desired=%d}", objArr);
    }
}
