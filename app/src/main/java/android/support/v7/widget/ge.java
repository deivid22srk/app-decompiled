package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;

/* loaded from: classes.dex */
final class ge implements Parcelable.Creator<Toolbar.SavedState> {
    ge() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Toolbar.SavedState[] newArray(int i) {
        return new Toolbar.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Toolbar.SavedState createFromParcel(Parcel parcel) {
        return new Toolbar.SavedState(parcel);
    }
}
