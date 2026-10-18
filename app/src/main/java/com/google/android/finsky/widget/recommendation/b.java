package com.google.android.finsky.widget.recommendation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.utils.ParcelUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class b implements Parcelable.Creator<RecommendationList> {
    b() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RecommendationList[] newArray(int i) {
        return new RecommendationList[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RecommendationList createFromParcel(Parcel parcel) {
        long readLong = parcel.readLong();
        if (1 != readLong) {
            throw new ParcelUtils.CacheVersionException(RecommendationList.class, 1L, readLong);
        }
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, Recommendation.CREATOR);
        RecommendationList recommendationList = new RecommendationList(readString, readInt);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            recommendationList.add((Recommendation) it.next());
        }
        return recommendationList;
    }
}
