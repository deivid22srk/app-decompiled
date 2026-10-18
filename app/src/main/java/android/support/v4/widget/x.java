package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.DrawerLayout;

/* loaded from: classes.dex */
final class x implements Parcelable.Creator<DrawerLayout.SavedState> {
    x() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DrawerLayout.SavedState[] newArray(int i) {
        return new DrawerLayout.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DrawerLayout.SavedState createFromParcel(Parcel parcel) {
        return new DrawerLayout.SavedState(parcel);
    }
}
