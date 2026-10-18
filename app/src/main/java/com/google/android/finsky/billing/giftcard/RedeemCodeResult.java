package com.google.android.finsky.billing.giftcard;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.protos.jd;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
public class RedeemCodeResult implements Parcelable {
    public static final Parcelable.Creator<RedeemCodeResult> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final String f2205a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2206b;
    public final Bundle c;
    public final jd d;
    private final String e;

    public RedeemCodeResult(String str, boolean z, Bundle bundle, jd jdVar, String str2) {
        this.f2205a = str;
        this.f2206b = z;
        this.c = bundle;
        this.d = jdVar;
        this.e = str2;
    }

    public RedeemCodeResult(Parcel parcel) {
        this.f2205a = parcel.readString();
        this.f2206b = parcel.readByte() == 1;
        this.c = parcel.readBundle();
        this.d = (jd) ParcelableProto.a(parcel);
        this.e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2205a);
        parcel.writeByte((byte) (this.f2206b ? 1 : 0));
        parcel.writeBundle(this.c);
        parcel.writeParcelable(ParcelableProto.a(this.d), 0);
        parcel.writeString(this.e);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String a() {
        if (this.f2206b) {
            return this.e;
        }
        return null;
    }
}
