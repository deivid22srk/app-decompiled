package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public abstract class ak extends Binder implements aj {
    public ak() {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
    }

    public static aj a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof aj)) ? new al(iBinder) : (aj) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DataHolder dataHolder;
        ad adVar = null;
        aa acVar = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    com.google.android.gms.common.data.e eVar = DataHolder.CREATOR;
                    dataHolder = com.google.android.gms.common.data.e.a(parcel);
                } else {
                    dataHolder = null;
                }
                a(dataHolder);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                a(parcel.readInt() != 0 ? MessageEventParcelable.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                a(parcel.readInt() != 0 ? NodeParcelable.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                b(parcel.readInt() != 0 ? NodeParcelable.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                a(parcel.createTypedArrayList(NodeParcelable.CREATOR));
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                a(parcel.readInt() != 0 ? AncsNotificationParcelable.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                a(parcel.readInt() != 0 ? ChannelEventParcelable.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                a(parcel.readInt() != 0 ? CapabilityInfoParcelable.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                a(parcel.readInt() != 0 ? AmsEntityUpdateParcelable.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                a(parcel.readInt() != 0 ? LargeAssetQueueStateChangeParcelable.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
                    acVar = (queryLocalInterface == null || !(queryLocalInterface instanceof aa)) ? new ac(readStrongBinder) : (aa) queryLocalInterface;
                }
                a(acVar, parcel.readString(), parcel.readInt());
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                LargeAssetSyncRequestPayload createFromParcel = parcel.readInt() != 0 ? LargeAssetSyncRequestPayload.CREATOR.createFromParcel(parcel) : null;
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.wearable.internal.ILargeAssetSyncRequestResponder");
                    adVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof ad)) ? new af(readStrongBinder2) : (ad) queryLocalInterface2;
                }
                a(createFromParcel, adVar);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wearable.internal.IWearableListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
