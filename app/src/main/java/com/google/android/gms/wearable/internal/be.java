package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class be implements Parcelable.Creator<NodeParcelable> {
    static void a(NodeParcelable nodeParcelable, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, nodeParcelable.f6562a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, nodeParcelable.f6563b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, nodeParcelable.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, nodeParcelable.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, nodeParcelable.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ NodeParcelable[] newArray(int i) {
        return new NodeParcelable[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ NodeParcelable createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int a2 = zza.a(parcel);
        int i = 0;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 2:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str = zza.i(parcel, readInt);
                    break;
                case 4:
                    i = zza.e(parcel, readInt);
                    break;
                case 5:
                    z = zza.c(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new NodeParcelable(i2, str2, str, i, z);
    }
}
