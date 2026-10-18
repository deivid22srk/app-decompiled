package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator<GoogleHelp> {
    static void a(GoogleHelp googleHelp, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, googleHelp.f5808a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, googleHelp.f5809b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, googleHelp.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, googleHelp.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, googleHelp.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, googleHelp.i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 7, googleHelp.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, googleHelp.k);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, googleHelp.l, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 14, googleHelp.p);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 15, googleHelp.q, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 17, googleHelp.s);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 16, googleHelp.r);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 19, googleHelp.m);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 18, googleHelp.u);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 21, googleHelp.o);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 20, googleHelp.n);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 23, googleHelp.w, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 22, googleHelp.v);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 25, googleHelp.t, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 29, googleHelp.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 28, googleHelp.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 31, googleHelp.x, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 30, googleHelp.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 32, googleHelp.y);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 33, googleHelp.z, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleHelp[] newArray(int i) {
        return new GoogleHelp[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleHelp createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        ArrayList<String> arrayList = null;
        Bundle bundle2 = null;
        Bitmap bitmap = null;
        byte[] bArr = null;
        int i4 = 0;
        int i5 = 0;
        String str3 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        int i6 = 0;
        ThemeSettings themeSettings = null;
        ArrayList arrayList3 = null;
        boolean z3 = false;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        int i7 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str = zza.i(parcel, readInt);
                    break;
                case 3:
                    account = (Account) zza.a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = zza.k(parcel, readInt);
                    break;
                case 5:
                    z = zza.c(parcel, readInt);
                    break;
                case 6:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 7:
                    arrayList = zza.o(parcel, readInt);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                default:
                    zza.b(parcel, readInt);
                    break;
                case 10:
                    bundle2 = zza.k(parcel, readInt);
                    break;
                case 11:
                    bitmap = (Bitmap) zza.a(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 15:
                    uri = (Uri) zza.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = zza.c(parcel, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i6 = zza.e(parcel, readInt);
                    break;
                case 18:
                    arrayList3 = zza.c(parcel, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = zza.l(parcel, readInt);
                    break;
                case 20:
                    i4 = zza.e(parcel, readInt);
                    break;
                case 21:
                    i5 = zza.e(parcel, readInt);
                    break;
                case 22:
                    z3 = zza.c(parcel, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) zza.a(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) zza.a(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 29:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 30:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) zza.a(parcel, readInt, TogglingData.CREATOR);
                    break;
                case 32:
                    i7 = zza.e(parcel, readInt);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) zza.a(parcel, readInt, PendingIntent.CREATOR);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new GoogleHelp(i, str, account, bundle, str2, i2, i3, z, z2, arrayList, bundle2, bitmap, bArr, i4, i5, str3, uri, arrayList2, i6, themeSettings, arrayList3, z3, errorReport, togglingData, i7, pendingIntent);
    }
}
