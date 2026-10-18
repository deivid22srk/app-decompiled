package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<GoogleSignInAccount> {
    static void a(GoogleSignInAccount googleSignInAccount, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, googleSignInAccount.f5378b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, googleSignInAccount.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, googleSignInAccount.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, googleSignInAccount.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, googleSignInAccount.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, googleSignInAccount.g, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, googleSignInAccount.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, googleSignInAccount.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, googleSignInAccount.j);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 10, googleSignInAccount.k);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int a2 = zza.a(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str6 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str5 = zza.i(parcel, readInt);
                    break;
                case 4:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 5:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) zza.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 8:
                    j = zza.f(parcel, readInt);
                    break;
                case 9:
                    str = zza.i(parcel, readInt);
                    break;
                case 10:
                    arrayList = zza.c(parcel, readInt, Scope.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new GoogleSignInAccount(i, str6, str5, str4, str3, uri, str2, j, str, arrayList);
    }
}
