package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new an();

    /* renamed from: a, reason: collision with root package name */
    FragmentState[] f160a;

    /* renamed from: b, reason: collision with root package name */
    int[] f161b;
    BackStackState[] c;

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.f160a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f161b = parcel.createIntArray();
        this.c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f160a, i);
        parcel.writeIntArray(this.f161b);
        parcel.writeTypedArray(this.c, i);
    }
}
