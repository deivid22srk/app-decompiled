package com.google.android.finsky.widget.consumption;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.services.ConsumptionAppDoc;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class h implements Parcelable.Creator<ConsumptionAppDocList> {
    h() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConsumptionAppDocList[] newArray(int i) {
        return new ConsumptionAppDocList[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConsumptionAppDocList createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, ConsumptionAppDoc.CREATOR);
        return new ConsumptionAppDocList(readInt, arrayList);
    }
}
