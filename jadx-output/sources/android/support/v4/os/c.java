package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class c<T> implements Parcelable.Creator<T> {

    /* renamed from: a, reason: collision with root package name */
    final d<T> f308a;

    public c(d<T> dVar) {
        this.f308a = dVar;
    }

    @Override // android.os.Parcelable.Creator
    public final T createFromParcel(Parcel parcel) {
        return this.f308a.a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final T[] newArray(int i) {
        return this.f308a.a(i);
    }
}
