package com.deivid22srk.store.setup;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class RestoreConfig implements Parcelable {
    public static final Parcelable.Creator<RestoreConfig> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f1192a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1193b;
    public final Account[] c;

    protected RestoreConfig(Parcel parcel) {
        this.f1192a = parcel.readInt();
        this.f1193b = parcel.readLong();
        this.c = (Account[]) parcel.createTypedArray(Account.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1192a);
        parcel.writeLong(this.f1193b);
        parcel.writeTypedArray(this.c, i);
    }
}
