package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class e<T> implements Parcelable.ClassLoaderCreator<T> {

    /* renamed from: a, reason: collision with root package name */
    private final d<T> f309a;

    public e(d<T> dVar) {
        this.f309a = dVar;
    }

    @Override // android.os.Parcelable.Creator
    public final T createFromParcel(Parcel parcel) {
        return this.f309a.a(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f309a.a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final T[] newArray(int i) {
        return this.f309a.a(i);
    }
}
