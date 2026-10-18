package com.google.android.finsky.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
final class o implements Parcelable.Creator<Document> {
    o() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Document[] newArray(int i) {
        return new Document[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Document createFromParcel(Parcel parcel) {
        return new Document((gx) ParcelableProto.a(parcel));
    }
}
