package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<RecoveryDecision> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RecoveryDecision createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static RecoveryDecision a(Parcel parcel) {
        PendingIntent pendingIntent = null;
        boolean z = false;
        int a2 = zza.a(parcel);
        boolean z2 = false;
        boolean z3 = false;
        PendingIntent pendingIntent2 = null;
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    pendingIntent2 = (PendingIntent) zza.a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 3:
                    z3 = zza.c(parcel, readInt);
                    break;
                case 4:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 5:
                    z = zza.c(parcel, readInt);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) zza.a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new RecoveryDecision(i, pendingIntent2, z3, z2, z, pendingIntent);
    }

    static void a(RecoveryDecision recoveryDecision, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, recoveryDecision.f5364a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, recoveryDecision.f5365b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, recoveryDecision.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, recoveryDecision.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, recoveryDecision.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, recoveryDecision.f, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RecoveryDecision[] newArray(int i) {
        return new RecoveryDecision[i];
    }
}
