package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class an implements Parcelable.Creator<FragmentManagerState> {
    an() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FragmentManagerState[] newArray(int i) {
        return new FragmentManagerState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FragmentManagerState createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }
}
