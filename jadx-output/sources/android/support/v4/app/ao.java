package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class ao implements Parcelable.Creator<FragmentState> {
    ao() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FragmentState[] newArray(int i) {
        return new FragmentState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FragmentState createFromParcel(Parcel parcel) {
        return new FragmentState(parcel);
    }
}
