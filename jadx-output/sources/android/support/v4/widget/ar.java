package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.NestedScrollView;

/* loaded from: classes.dex */
final class ar implements Parcelable.Creator<NestedScrollView.SavedState> {
    ar() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NestedScrollView.SavedState[] newArray(int i) {
        return new NestedScrollView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ NestedScrollView.SavedState createFromParcel(Parcel parcel) {
        return new NestedScrollView.SavedState(parcel);
    }
}
