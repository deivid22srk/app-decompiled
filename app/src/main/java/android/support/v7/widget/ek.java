package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;

/* loaded from: classes.dex */
final class ek implements Parcelable.Creator<RecyclerView.SavedState> {
    ek() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RecyclerView.SavedState[] newArray(int i) {
        return new RecyclerView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RecyclerView.SavedState createFromParcel(Parcel parcel) {
        return new RecyclerView.SavedState(parcel);
    }
}
