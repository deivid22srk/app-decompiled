package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;

/* loaded from: classes.dex */
final class cs implements Parcelable.Creator<LinearLayoutManager.SavedState> {
    cs() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LinearLayoutManager.SavedState[] newArray(int i) {
        return new LinearLayoutManager.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LinearLayoutManager.SavedState createFromParcel(Parcel parcel) {
        return new LinearLayoutManager.SavedState(parcel);
    }
}
