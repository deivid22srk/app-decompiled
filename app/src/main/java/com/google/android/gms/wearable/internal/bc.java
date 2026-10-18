package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class bc implements Parcelable.Creator<MessageEventParcelable> {
    static void a(MessageEventParcelable messageEventParcelable, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, messageEventParcelable.f6560a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, messageEventParcelable.f6561b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, messageEventParcelable.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, messageEventParcelable.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, messageEventParcelable.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MessageEventParcelable[] newArray(int i) {
        return new MessageEventParcelable[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MessageEventParcelable createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int a2 = zza.a(parcel);
        byte[] bArr = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i = zza.e(parcel, readInt);
                    break;
                case 3:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 4:
                    bArr = zza.l(parcel, readInt);
                    break;
                case 5:
                    str = zza.i(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new MessageEventParcelable(i2, i, str2, bArr, str);
    }
}
