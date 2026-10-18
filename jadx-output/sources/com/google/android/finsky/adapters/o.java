package com.google.android.finsky.adapters;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.adapters.CardRecyclerViewAdapter;

/* loaded from: classes.dex */
final class o implements Parcelable.Creator<CardRecyclerViewAdapter.ItemEntry> {
    o() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CardRecyclerViewAdapter.ItemEntry[] newArray(int i) {
        return new CardRecyclerViewAdapter.ItemEntry[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CardRecyclerViewAdapter.ItemEntry createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        CardRecyclerViewAdapter.ItemEntry itemEntry = new CardRecyclerViewAdapter.ItemEntry();
        itemEntry.f1879a = readInt;
        itemEntry.f1880b = readInt2;
        itemEntry.c = readInt3;
        itemEntry.d = readInt4;
        itemEntry.e = readInt5;
        return itemEntry;
    }
}
