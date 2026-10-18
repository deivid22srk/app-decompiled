package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class o implements Parcelable.Creator<BackStackState> {
    o() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BackStackState[] newArray(int i) {
        return new BackStackState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BackStackState createFromParcel(Parcel parcel) {
        return new BackStackState(parcel);
    }
}
