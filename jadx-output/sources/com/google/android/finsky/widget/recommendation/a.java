package com.google.android.finsky.widget.recommendation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.ParcelUtils;

/* loaded from: classes.dex */
final class a implements Parcelable.Creator<Recommendation> {
    a() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Recommendation[] newArray(int i) {
        return new Recommendation[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Recommendation createFromParcel(Parcel parcel) {
        ClassLoader classLoader = Recommendation.class.getClassLoader();
        long readLong = parcel.readLong();
        if (2 != readLong) {
            throw new ParcelUtils.CacheVersionException(Recommendation.class, 2L, readLong);
        }
        return new Recommendation((Document) parcel.readParcelable(classLoader), parcel.readLong());
    }
}
