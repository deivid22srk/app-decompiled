package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

/* loaded from: classes.dex */
public final class nr implements np {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6188a;

    public nr(IBinder iBinder) {
        this.f6188a = iBinder;
    }

    @Override // com.google.android.gms.internal.np
    public final void a(Status status, PredictedNetworkQuality predictedNetworkQuality) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
            if (status != null) {
                obtain.writeInt(1);
                status.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (predictedNetworkQuality != null) {
                obtain.writeInt(1);
                predictedNetworkQuality.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6188a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6188a;
    }
}
