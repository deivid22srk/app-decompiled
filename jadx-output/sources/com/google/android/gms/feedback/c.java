package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<FeedbackOptions> {
    static void a(FeedbackOptions feedbackOptions, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, feedbackOptions.f5798a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, feedbackOptions.f5799b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, feedbackOptions.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, feedbackOptions.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, feedbackOptions.e, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, feedbackOptions.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, feedbackOptions.g, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, feedbackOptions.h);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 10, feedbackOptions.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, feedbackOptions.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, feedbackOptions.k, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 13, feedbackOptions.l, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FeedbackOptions[] newArray(int i) {
        return new FeedbackOptions[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FeedbackOptions createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        boolean z = false;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
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
                    bundle = zza.k(parcel, readInt);
                    break;
                case 4:
                default:
                    zza.b(parcel, readInt);
                    break;
                case 5:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) zza.a(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) zza.a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 10:
                    arrayList = zza.c(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = zza.c(parcel, readInt);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) zza.a(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) zza.a(parcel, readInt, LogOptions.CREATOR);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new FeedbackOptions(i, str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions);
    }
}
