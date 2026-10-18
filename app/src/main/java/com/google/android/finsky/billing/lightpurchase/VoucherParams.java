package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class VoucherParams implements Parcelable {
    public static final Parcelable.Creator<VoucherParams> CREATOR = new ai();

    /* renamed from: a, reason: collision with root package name */
    public final String f2283a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2284b;
    public final boolean c;

    /* synthetic */ VoucherParams(Parcel parcel, byte b2) {
        this(parcel);
    }

    public VoucherParams(String str, boolean z, boolean z2) {
        this.f2283a = str;
        this.f2284b = z;
        this.c = z2;
    }

    private VoucherParams(Parcel parcel) {
        this.f2283a = parcel.readString();
        this.f2284b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2283a);
        parcel.writeByte((byte) (this.f2284b ? 1 : 0));
        parcel.writeByte((byte) (this.c ? 1 : 0));
    }
}
