package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* loaded from: classes.dex */
public static class ErrorReport implements SafeParcelable {
    public static final Parcelable.Creator<ErrorReport> CREATOR = new b();
    public int A;
    public String B;
    public String C;
    public String D;
    public Bundle E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public String J;
    public String K;
    public int L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;

    @Deprecated
    public String R;
    public String S;
    public BitmapTeleporter T;
    public String U;
    public FileTeleporter[] V;
    public String[] W;
    public boolean X;
    public String Y;
    public ThemeSettings Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f5796a;
    public LogOptions aa;
    public String ab;
    public boolean ac;
    public Bundle ad;
    public List<RectF> ae;

    /* renamed from: b, reason: collision with root package name */
    public ApplicationErrorReport f5797b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String[] r;
    public String[] s;
    public String[] t;
    public String u;
    public String v;
    public byte[] w;
    public int x;
    public int y;
    public int z;

    public ErrorReport() {
        this.f5797b = new ApplicationErrorReport();
        this.f5796a = 9;
    }

    ErrorReport(int i, ApplicationErrorReport applicationErrorReport, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i4, int i5, int i6, int i7, String str16, String str17, String str18, Bundle bundle, boolean z, int i8, int i9, boolean z2, String str19, String str20, int i10, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, FileTeleporter[] fileTeleporterArr, String[] strArr4, boolean z3, String str29, ThemeSettings themeSettings, LogOptions logOptions, String str30, boolean z4, Bundle bundle2, List<RectF> list) {
        this.f5797b = new ApplicationErrorReport();
        this.f5796a = i;
        this.f5797b = applicationErrorReport;
        this.c = str;
        this.d = i2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = i3;
        this.m = str9;
        this.n = str10;
        this.o = str11;
        this.p = str12;
        this.q = str13;
        this.r = strArr;
        this.s = strArr2;
        this.t = strArr3;
        this.u = str14;
        this.v = str15;
        this.w = bArr;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = i7;
        this.B = str16;
        this.C = str17;
        this.D = str18;
        this.E = bundle;
        this.F = z;
        this.G = i8;
        this.H = i9;
        this.I = z2;
        this.J = str19;
        this.K = str20;
        this.L = i10;
        this.M = str21;
        this.N = str22;
        this.O = str23;
        this.P = str24;
        this.Q = str25;
        this.R = str26;
        this.S = str27;
        this.T = bitmapTeleporter;
        this.U = str28;
        this.V = fileTeleporterArr;
        this.W = strArr4;
        this.X = z3;
        this.Y = str29;
        this.Z = themeSettings;
        this.aa = logOptions;
        this.ab = str30;
        this.ac = z4;
        this.ad = bundle2;
        this.ae = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
