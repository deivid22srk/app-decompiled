package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class RemoveListenerRequest implements SafeParcelable {
    public static final Parcelable.Creator<RemoveListenerRequest> CREATOR = new bl();

    /* renamed from: a, reason: collision with root package name */
    final int f6572a;

    /* renamed from: b, reason: collision with root package name */
    public final aj f6573b;

    RemoveListenerRequest(int i, IBinder iBinder) {
        this.f6572a = i;
        if (iBinder != null) {
            this.f6573b = ak.a(iBinder);
        } else {
            this.f6573b = null;
        }
    }

    public RemoveListenerRequest(aj ajVar) {
        this.f6572a = 1;
        this.f6573b = ajVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        bl.a(this, parcel);
    }
}
