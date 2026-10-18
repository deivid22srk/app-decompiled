package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.protos.mo;
import com.google.android.finsky.protos.mq;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
public class CheckoutPurchaseError implements Parcelable {
    public static final Parcelable.Creator<CheckoutPurchaseError> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final int f2273a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2274b;
    public final String c;
    public final String d;
    public final String e;
    public final mo f;

    public CheckoutPurchaseError() {
        this(null);
    }

    public CheckoutPurchaseError(String str) {
        this(0, str);
    }

    public CheckoutPurchaseError(String str, String str2) {
        this(0, str, str2, null, null, null);
    }

    public CheckoutPurchaseError(int i, String str) {
        this(i, null, str, null, null, null);
    }

    public CheckoutPurchaseError(int i, mq mqVar, String str, mo moVar) {
        this(i, mqVar.f4142a, mqVar.c, mqVar.e, str, moVar);
    }

    public CheckoutPurchaseError(int i, String str, String str2, String str3, String str4, mo moVar) {
        this.f2273a = i;
        this.f2274b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = moVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2273a);
        parcel.writeString(this.f2274b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(ParcelableProto.a(this.f), i);
    }
}
