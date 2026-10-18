package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public static class GiftEmailParams implements Parcelable {
    public static final Parcelable.Creator<GiftEmailParams> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    public final String f2275a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2276b;
    public final String c;

    /* synthetic */ GiftEmailParams(Parcel parcel, byte b2) {
        this(parcel);
    }

    public /* synthetic */ GiftEmailParams(q qVar, byte b2) {
        this(qVar);
    }

    private GiftEmailParams(q qVar) {
        this.f2275a = qVar.f2392a;
        if (TextUtils.isEmpty(this.f2275a)) {
            throw new IllegalArgumentException("senderName cannot be empty");
        }
        this.f2276b = qVar.f2393b;
        if (TextUtils.isEmpty(this.f2276b)) {
            throw new IllegalArgumentException("recipientEmailAddress cannot be empty");
        }
        this.c = qVar.c;
    }

    private GiftEmailParams(Parcel parcel) {
        this.f2275a = parcel.readString();
        this.f2276b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2275a);
        parcel.writeString(this.f2276b);
        parcel.writeString(this.c);
    }
}
