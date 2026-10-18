package com.google.android.wallet.common.pub;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class f implements Parcelable.Creator<SecurePaymentsPayload> {
    f() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SecurePaymentsPayload[] newArray(int i) {
        return new SecurePaymentsPayload[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SecurePaymentsPayload createFromParcel(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        g[] gVarArr = new g[readInt];
        for (int i = 0; i < readInt; i++) {
            gVarArr[i] = new g(parcel.readInt(), parcel.readString());
        }
        return new SecurePaymentsPayload(createByteArray, gVarArr);
    }
}
