package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
final class ai implements ag {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6582a;

    ai(IBinder iBinder) {
        this.f6582a = iBinder;
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(Status status) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (status != null) {
                obtain.writeInt(1);
                status.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(DataHolder dataHolder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (dataHolder != null) {
                obtain.writeInt(1);
                dataHolder.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(AddLocalCapabilityResponse addLocalCapabilityResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (addLocalCapabilityResponse != null) {
                obtain.writeInt(1);
                addLocalCapabilityResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(26, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(ChannelReceiveFileResponse channelReceiveFileResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (channelReceiveFileResponse != null) {
                obtain.writeInt(1);
                channelReceiveFileResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(ChannelSendFileResponse channelSendFileResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (channelSendFileResponse != null) {
                obtain.writeInt(1);
                channelSendFileResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(20, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(CloseChannelResponse closeChannelResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (closeChannelResponse != null) {
                obtain.writeInt(1);
                closeChannelResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(DeleteDataItemsResponse deleteDataItemsResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (deleteDataItemsResponse != null) {
                obtain.writeInt(1);
                deleteDataItemsResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(EnqueueLargeAssetResponse enqueueLargeAssetResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (enqueueLargeAssetResponse != null) {
                obtain.writeInt(1);
                enqueueLargeAssetResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(31, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetAllCapabilitiesResponse getAllCapabilitiesResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getAllCapabilitiesResponse != null) {
                obtain.writeInt(1);
                getAllCapabilitiesResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(23, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetCapabilityResponse getCapabilityResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getCapabilityResponse != null) {
                obtain.writeInt(1);
                getCapabilityResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetChannelInputStreamResponse getChannelInputStreamResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getChannelInputStreamResponse != null) {
                obtain.writeInt(1);
                getChannelInputStreamResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(17, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getChannelOutputStreamResponse != null) {
                obtain.writeInt(1);
                getChannelOutputStreamResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getCloudSyncOptInOutDoneResponse != null) {
                obtain.writeInt(1);
                getCloudSyncOptInOutDoneResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getCloudSyncOptInStatusResponse != null) {
                obtain.writeInt(1);
                getCloudSyncOptInStatusResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(30, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetCloudSyncSettingResponse getCloudSyncSettingResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getCloudSyncSettingResponse != null) {
                obtain.writeInt(1);
                getCloudSyncSettingResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(29, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetConfigResponse getConfigResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getConfigResponse != null) {
                obtain.writeInt(1);
                getConfigResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetConfigsResponse getConfigsResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getConfigsResponse != null) {
                obtain.writeInt(1);
                getConfigsResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetConnectedNodesResponse getConnectedNodesResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getConnectedNodesResponse != null) {
                obtain.writeInt(1);
                getConnectedNodesResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetDataItemResponse getDataItemResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getDataItemResponse != null) {
                obtain.writeInt(1);
                getDataItemResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetFdForAssetResponse getFdForAssetResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getFdForAssetResponse != null) {
                obtain.writeInt(1);
                getFdForAssetResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetLargeAssetQueueStateResponse getLargeAssetQueueStateResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getLargeAssetQueueStateResponse != null) {
                obtain.writeInt(1);
                getLargeAssetQueueStateResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(33, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(GetLocalNodeResponse getLocalNodeResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getLocalNodeResponse != null) {
                obtain.writeInt(1);
                getLocalNodeResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(OpenChannelResponse openChannelResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (openChannelResponse != null) {
                obtain.writeInt(1);
                openChannelResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(PutDataResponse putDataResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (putDataResponse != null) {
                obtain.writeInt(1);
                putDataResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(RemoveLargeAssetQueueEntriesResponse removeLargeAssetQueueEntriesResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (removeLargeAssetQueueEntriesResponse != null) {
                obtain.writeInt(1);
                removeLargeAssetQueueEntriesResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(32, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (removeLocalCapabilityResponse != null) {
                obtain.writeInt(1);
                removeLocalCapabilityResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(SendMessageResponse sendMessageResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (sendMessageResponse != null) {
                obtain.writeInt(1);
                sendMessageResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void a(StorageInfoResponse storageInfoResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (storageInfoResponse != null) {
                obtain.writeInt(1);
                storageInfoResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6582a;
    }

    @Override // com.google.android.gms.wearable.internal.ag
    public final void b(CloseChannelResponse closeChannelResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (closeChannelResponse != null) {
                obtain.writeInt(1);
                closeChannelResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6582a.transact(16, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
