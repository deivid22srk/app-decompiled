package com.google.android.wallet.common.pub;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class SecurePaymentsPayload implements Parcelable {
    public static final Parcelable.Creator<SecurePaymentsPayload> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7282a;

    /* renamed from: b, reason: collision with root package name */
    public final g[] f7283b;

    public SecurePaymentsPayload(byte[] bArr, g[] gVarArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("opaqueToken must not be null");
        }
        this.f7282a = bArr;
        this.f7283b = gVarArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f7282a);
        int length = this.f7283b.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 < length; i2++) {
            parcel.writeInt(this.f7283b[i2].f7291a);
            parcel.writeString(this.f7283b[i2].f7292b);
        }
    }
}
