package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import java.util.List;

/* loaded from: classes.dex */
public final class nu implements ns {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6189a;

    public nu(IBinder iBinder) {
        this.f6189a = iBinder;
    }

    @Override // com.google.android.gms.internal.ns
    public final void a(Status status, List<PredictedNetworkQuality> list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
            if (status != null) {
                obtain.writeInt(1);
                status.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeTypedList(list);
            this.f6189a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6189a;
    }
}
