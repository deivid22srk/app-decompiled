package com.google.android.gms.wearable.internal;

import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

/* loaded from: classes.dex */
public interface aj extends IInterface {
    void a(DataHolder dataHolder);

    void a(AmsEntityUpdateParcelable amsEntityUpdateParcelable);

    void a(AncsNotificationParcelable ancsNotificationParcelable);

    void a(CapabilityInfoParcelable capabilityInfoParcelable);

    void a(ChannelEventParcelable channelEventParcelable);

    void a(LargeAssetQueueStateChangeParcelable largeAssetQueueStateChangeParcelable);

    void a(LargeAssetSyncRequestPayload largeAssetSyncRequestPayload, ad adVar);

    void a(MessageEventParcelable messageEventParcelable);

    void a(NodeParcelable nodeParcelable);

    void a(aa aaVar, String str, int i);

    void a(List<NodeParcelable> list);

    void b(NodeParcelable nodeParcelable);
}
