package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public abstract class ah extends Binder implements ag {
    public ah() {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    public static ag a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ag)) ? new ai(iBinder) : (ag) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DataHolder dataHolder = null;
        switch (i) {
            case 2:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetConfigResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? PutDataResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetDataItemResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    com.google.android.gms.common.data.e eVar = DataHolder.CREATOR;
                    dataHolder = com.google.android.gms.common.data.e.a(parcel);
                }
                a(dataHolder);
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? DeleteDataItemsResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? SendMessageResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetFdForAssetResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetLocalNodeResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetConnectedNodesResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? StorageInfoResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetConfigsResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? OpenChannelResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? CloseChannelResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                b(parcel.readInt() != 0 ? CloseChannelResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetChannelInputStreamResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetChannelOutputStreamResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? ChannelReceiveFileResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? ChannelSendFileResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetCapabilityResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetAllCapabilitiesResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? AddLocalCapabilityResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? RemoveLocalCapabilityResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetCloudSyncOptInOutDoneResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetCloudSyncSettingResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 30:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetCloudSyncOptInStatusResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 31:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? EnqueueLargeAssetResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 32:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? RemoveLargeAssetQueueEntriesResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 33:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                a(parcel.readInt() != 0 ? GetLargeAssetQueueStateResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
