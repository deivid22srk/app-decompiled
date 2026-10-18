package com.google.android.finsky.services;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class d implements Parcelable.Creator<ConsumptionAppDoc> {
    d() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConsumptionAppDoc[] newArray(int i) {
        return new ConsumptionAppDoc[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConsumptionAppDoc createFromParcel(Parcel parcel) {
        ClassLoader classLoader = ConsumptionAppDoc.class.getClassLoader();
        long readLong = parcel.readLong();
        if (1 != readLong) {
            throw new IllegalArgumentException("Unable to unparcel v" + readLong);
        }
        return new ConsumptionAppDoc((Uri) parcel.readParcelable(classLoader), parcel.readString(), parcel.readLong(), parcel.readString(), (Intent) parcel.readParcelable(classLoader));
    }
}
