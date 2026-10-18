package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

/* loaded from: classes.dex */
final class al implements aj {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6583a;

    al(IBinder iBinder) {
        this.f6583a = iBinder;
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(DataHolder dataHolder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (dataHolder != null) {
                obtain.writeInt(1);
                dataHolder.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6583a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (amsEntityUpdateParcelable != null) {
                obtain.writeInt(1);
                amsEntityUpdateParcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6583a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(AncsNotificationParcelable ancsNotificationParcelable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (ancsNotificationParcelable != null) {
                obtain.writeInt(1);
                ancsNotificationParcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6583a.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(CapabilityInfoParcelable capabilityInfoParcelable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (capabilityInfoParcelable != null) {
                obtain.writeInt(1);
                capabilityInfoParcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6583a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(ChannelEventParcelable channelEventParcelable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (channelEventParcelable != null) {
                obtain.writeInt(1);
                channelEventParcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6583a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(LargeAssetQueueStateChangeParcelable largeAssetQueueStateChangeParcelable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (largeAssetQueueStateChangeParcelable != null) {
                obtain.writeInt(1);
                largeAssetQueueStateChangeParcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6583a.transact(10, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(LargeAssetSyncRequestPayload largeAssetSyncRequestPayload, ad adVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (largeAssetSyncRequestPayload != null) {
                obtain.writeInt(1);
                largeAssetSyncRequestPayload.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
            this.f6583a.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(MessageEventParcelable messageEventParcelable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (messageEventParcelable != null) {
                obtain.writeInt(1);
                messageEventParcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6583a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(NodeParcelable nodeParcelable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (nodeParcelable != null) {
                obtain.writeInt(1);
                nodeParcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6583a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(aa aaVar, String str, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            obtain.writeStrongBinder(aaVar != null ? aaVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            this.f6583a.transact(11, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(List<NodeParcelable> list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            obtain.writeTypedList(list);
            this.f6583a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6583a;
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void b(NodeParcelable nodeParcelable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (nodeParcelable != null) {
                obtain.writeInt(1);
                nodeParcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6583a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
