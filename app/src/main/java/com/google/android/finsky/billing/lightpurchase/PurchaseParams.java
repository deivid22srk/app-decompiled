package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.dp;
import com.google.android.finsky.protos.mk;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
public static class PurchaseParams implements Parcelable {
    public static final Parcelable.Creator<PurchaseParams> CREATOR = new ag();

    /* renamed from: a, reason: collision with root package name */
    public final dp f2281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2282b;
    public final Document c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final String k;
    public final mk l;

    /* synthetic */ PurchaseParams(Parcel parcel, byte b2) {
        this(parcel);
    }

    /* synthetic */ PurchaseParams(ah ahVar, byte b2) {
        this(ahVar);
    }

    private PurchaseParams(ah ahVar) {
        this.f2281a = ahVar.f2311a;
        if (this.f2281a == null) {
            throw new IllegalArgumentException("docid cannot be null");
        }
        this.f2282b = ahVar.f2312b;
        if (this.f2282b == null) {
            throw new IllegalArgumentException("docidStr cannot be null");
        }
        this.c = ahVar.c;
        this.d = ahVar.d;
        this.e = ahVar.e;
        this.f = ahVar.f;
        this.g = ahVar.g;
        this.h = ahVar.h;
        this.k = ahVar.i;
        this.l = ahVar.j;
        this.i = ahVar.k;
        this.j = ahVar.l;
    }

    private PurchaseParams(Parcel parcel) {
        this.f2281a = (dp) ParcelableProto.a(parcel);
        this.f2282b = parcel.readString();
        this.c = (Document) parcel.readParcelable(Document.class.getClassLoader());
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.k = parcel.readString();
        this.l = (mk) ParcelableProto.a(parcel);
        this.i = parcel.readString();
        this.j = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.a(this.f2281a), i);
        parcel.writeString(this.f2282b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.k);
        parcel.writeParcelable(ParcelableProto.a(this.l), i);
        parcel.writeString(this.i);
        parcel.writeInt(this.j);
    }

    public static ah a() {
        return new ah();
    }
}
