package com.google.android.finsky.b;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class t {
    private static final String[] y = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final String f2130a;

    /* renamed from: b, reason: collision with root package name */
    public int f2131b;
    public int c;
    public int d;
    public com.google.android.finsky.protos.aa e;
    public long f;
    public int g;
    public String h;
    public String i;
    public long j;
    public String k;
    public String l;
    public int m;
    public String n;
    public long o;
    public String p;
    public long q;
    public int r;
    public int s;
    public String t;
    public String u;
    public String v;
    private String[] w;
    private String[] x;

    /* synthetic */ t(String str, byte b2) {
        this(str);
    }

    private t(String str) {
        this.f2131b = 1;
        this.c = -1;
        this.d = -1;
        this.f2130a = str;
    }

    public t(String str, int i, int i2, int i3, com.google.android.finsky.protos.aa aaVar, long j, int i4, String str2, long j2, String str3, String str4, String str5, String str6, int i5, long j3, String str7, String[] strArr, long j4, int i6, int i7, String str8, String[] strArr2, String str9, String str10) {
        this.f2131b = 1;
        this.c = -1;
        this.d = -1;
        this.f2130a = str;
        this.f2131b = i;
        this.c = i2;
        this.d = i3;
        this.e = aaVar;
        this.f = j;
        this.g = i4;
        this.h = str2;
        this.j = j2;
        this.k = str3;
        this.n = str4;
        this.i = str5;
        this.l = str6;
        this.m = i5;
        this.o = j3;
        this.p = str7;
        this.w = strArr;
        this.q = j4;
        this.r = i6;
        this.s = i7;
        this.t = str8;
        this.x = strArr2;
        this.u = str9;
        this.v = str10;
    }

    public final String toString() {
        Object[] objArr = new Object[10];
        objArr[0] = this.f2130a;
        objArr[1] = Integer.valueOf(this.f2131b);
        objArr[2] = Integer.valueOf(this.c);
        objArr[3] = Boolean.valueOf(this.e != null);
        objArr[4] = Integer.valueOf(this.g);
        objArr[5] = this.h;
        objArr[6] = Long.valueOf(this.j);
        objArr[7] = this.k;
        objArr[8] = this.n;
        objArr[9] = FinskyLog.a(this.i);
        return String.format("(packageName=%s,autoUpdate=%d,desiredVersion=%d,hasDeliveryData=%b,installerState=%d,downloadUri=%s,firstDownloadMs=%d,externalReferrer=%s,continueUrl=%s,account=%s)", objArr);
    }

    public final String[] a() {
        return this.w == null ? y : this.w;
    }

    public final String[] b() {
        return this.x == null ? y : this.x;
    }
}
