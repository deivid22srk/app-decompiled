package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
static final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new ao();

    /* renamed from: a, reason: collision with root package name */
    final String f162a;

    /* renamed from: b, reason: collision with root package name */
    final int f163b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    Bundle j;
    Fragment k;

    public FragmentState(Fragment fragment) {
        this.f162a = fragment.getClass().getName();
        this.f163b = fragment.p;
        this.c = fragment.x;
        this.d = fragment.F;
        this.e = fragment.G;
        this.f = fragment.H;
        this.g = fragment.K;
        this.h = fragment.J;
        this.i = fragment.r;
    }

    public FragmentState(Parcel parcel) {
        this.f162a = parcel.readString();
        this.f163b = parcel.readInt();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readBundle();
        this.j = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f162a);
        parcel.writeInt(this.f163b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeBundle(this.i);
        parcel.writeBundle(this.j);
    }
}
