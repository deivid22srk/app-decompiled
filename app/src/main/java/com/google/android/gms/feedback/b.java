package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<ErrorReport> {
    static void a(ErrorReport errorReport, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, errorReport.f5796a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, errorReport.f5797b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, errorReport.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, errorReport.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, errorReport.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, errorReport.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, errorReport.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, errorReport.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, errorReport.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, errorReport.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, errorReport.k);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 12, errorReport.l);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 13, errorReport.m);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 14, errorReport.n);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 15, errorReport.o);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 17, errorReport.q);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 16, errorReport.p);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 19, errorReport.s);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 18, errorReport.r);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 21, errorReport.u);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20, errorReport.t);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 23, errorReport.w);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 22, errorReport.v);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 25, errorReport.y);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 24, errorReport.x);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 27, errorReport.A);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 26, errorReport.z);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 29, errorReport.C);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 28, errorReport.B);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 31, errorReport.E);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 30, errorReport.D);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 34, errorReport.H);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 35, errorReport.I);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 32, errorReport.F);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 33, errorReport.G);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 38, errorReport.L);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 39, errorReport.M);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 36, errorReport.J);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 37, errorReport.K);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 42, errorReport.P);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 43, errorReport.Q);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 40, errorReport.N);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 41, errorReport.O);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 46, errorReport.T, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 47, errorReport.U);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 44, errorReport.R);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 45, errorReport.S);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 51, errorReport.Y);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 50, errorReport.X);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 49, errorReport.W);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 48, errorReport.V, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 55, errorReport.ac);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 54, errorReport.ab);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 53, errorReport.aa, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 52, errorReport.Z, i);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 57, errorReport.ae);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 56, errorReport.ad);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ErrorReport[] newArray(int i) {
        return new ErrorReport[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ErrorReport createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i3 = 0;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        boolean z2 = false;
        String str19 = null;
        String str20 = null;
        int i10 = 0;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        boolean z3 = false;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        boolean z4 = false;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) zza.a(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = zza.i(parcel, readInt);
                    break;
                case 4:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 5:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 6:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 7:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 8:
                    str5 = zza.i(parcel, readInt);
                    break;
                case 9:
                    str6 = zza.i(parcel, readInt);
                    break;
                case 10:
                    str7 = zza.i(parcel, readInt);
                    break;
                case 11:
                    str8 = zza.i(parcel, readInt);
                    break;
                case 12:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 13:
                    str9 = zza.i(parcel, readInt);
                    break;
                case 14:
                    str10 = zza.i(parcel, readInt);
                    break;
                case 15:
                    str11 = zza.i(parcel, readInt);
                    break;
                case 16:
                    str12 = zza.i(parcel, readInt);
                    break;
                case 17:
                    str13 = zza.i(parcel, readInt);
                    break;
                case 18:
                    strArr = zza.m(parcel, readInt);
                    break;
                case 19:
                    strArr2 = zza.m(parcel, readInt);
                    break;
                case 20:
                    strArr3 = zza.m(parcel, readInt);
                    break;
                case 21:
                    str14 = zza.i(parcel, readInt);
                    break;
                case 22:
                    str15 = zza.i(parcel, readInt);
                    break;
                case 23:
                    bArr = zza.l(parcel, readInt);
                    break;
                case 24:
                    i4 = zza.e(parcel, readInt);
                    break;
                case 25:
                    i5 = zza.e(parcel, readInt);
                    break;
                case 26:
                    i6 = zza.e(parcel, readInt);
                    break;
                case 27:
                    i7 = zza.e(parcel, readInt);
                    break;
                case 28:
                    str16 = zza.i(parcel, readInt);
                    break;
                case 29:
                    str17 = zza.i(parcel, readInt);
                    break;
                case 30:
                    str18 = zza.i(parcel, readInt);
                    break;
                case 31:
                    bundle = zza.k(parcel, readInt);
                    break;
                case 32:
                    z = zza.c(parcel, readInt);
                    break;
                case 33:
                    i8 = zza.e(parcel, readInt);
                    break;
                case 34:
                    i9 = zza.e(parcel, readInt);
                    break;
                case 35:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 36:
                    str19 = zza.i(parcel, readInt);
                    break;
                case 37:
                    str20 = zza.i(parcel, readInt);
                    break;
                case 38:
                    i10 = zza.e(parcel, readInt);
                    break;
                case 39:
                    str21 = zza.i(parcel, readInt);
                    break;
                case 40:
                    str22 = zza.i(parcel, readInt);
                    break;
                case 41:
                    str23 = zza.i(parcel, readInt);
                    break;
                case 42:
                    str24 = zza.i(parcel, readInt);
                    break;
                case 43:
                    str25 = zza.i(parcel, readInt);
                    break;
                case 44:
                    str26 = zza.i(parcel, readInt);
                    break;
                case 45:
                    str27 = zza.i(parcel, readInt);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) zza.a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = zza.i(parcel, readInt);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) zza.b(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 49:
                    strArr4 = zza.m(parcel, readInt);
                    break;
                case 50:
                    z3 = zza.c(parcel, readInt);
                    break;
                case 51:
                    str29 = zza.i(parcel, readInt);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) zza.a(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) zza.a(parcel, readInt, LogOptions.CREATOR);
                    break;
                case 54:
                    str30 = zza.i(parcel, readInt);
                    break;
                case 55:
                    z4 = zza.c(parcel, readInt);
                    break;
                case 56:
                    bundle2 = zza.k(parcel, readInt);
                    break;
                case 57:
                    arrayList = zza.c(parcel, readInt, RectF.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new ErrorReport(i, applicationErrorReport, str, i2, str2, str3, str4, str5, str6, str7, str8, i3, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i4, i5, i6, i7, str16, str17, str18, bundle, z, i8, i9, z2, str19, str20, i10, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, arrayList);
    }
}
