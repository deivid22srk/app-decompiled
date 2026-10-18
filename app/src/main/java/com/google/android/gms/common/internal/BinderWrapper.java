package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public static final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5685a;

    public BinderWrapper() {
        this.f5685a = null;
    }

    public BinderWrapper(IBinder iBinder) {
        this.f5685a = null;
        this.f5685a = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.f5685a = null;
        this.f5685a = parcel.readStrongBinder();
    }

    /* synthetic */ BinderWrapper(Parcel parcel, byte b2) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f5685a);
    }
}
