package com.google.android.gms.wearable;

import android.os.Binder;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.LargeAssetQueueStateChangeParcelable;
import com.google.android.gms.wearable.internal.LargeAssetSyncRequestPayload;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/* loaded from: classes.dex */
final class af extends com.google.android.gms.wearable.internal.ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f6466a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f6467b;

    private af(ae aeVar) {
        this.f6466a = aeVar;
        this.f6467b = -1;
    }

    /* synthetic */ af(ae aeVar, byte b2) {
        this(aeVar);
    }

    private void a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid == this.f6467b) {
            return;
        }
        if (!com.google.android.gms.common.c.a(this.f6466a, callingUid)) {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
        this.f6467b = callingUid;
    }

    private boolean a(Runnable runnable, String str, Object obj) {
        if (this.f6466a instanceof ar) {
            return b(runnable, str, obj);
        }
        return false;
    }

    private boolean b(Runnable runnable, String str, Object obj) {
        Object obj2;
        boolean z;
        Handler handler;
        String str2;
        if (Log.isLoggable("WearableLS", 3)) {
            str2 = this.f6466a.f6464a;
            Log.d("WearableLS", String.format("%s: %s %s", str, str2, obj));
        }
        a();
        obj2 = this.f6466a.d;
        synchronized (obj2) {
            z = this.f6466a.e;
            if (z) {
                return false;
            }
            handler = this.f6466a.f6465b;
            handler.post(runnable);
            return true;
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(DataHolder dataHolder) {
        try {
            if (b(new ag(this, dataHolder), "onDataItemChanged", dataHolder)) {
            }
        } finally {
            dataHolder.c();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        a(new ah(this, amsEntityUpdateParcelable), "onEntityUpdate", amsEntityUpdateParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(AncsNotificationParcelable ancsNotificationParcelable) {
        a(new aq(this, ancsNotificationParcelable), "onNotificationReceived", ancsNotificationParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(CapabilityInfoParcelable capabilityInfoParcelable) {
        b(new ap(this, capabilityInfoParcelable), "onConnectedCapabilityChanged", capabilityInfoParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(ChannelEventParcelable channelEventParcelable) {
        b(new ai(this, channelEventParcelable), "onChannelEvent", channelEventParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(LargeAssetSyncRequestPayload largeAssetSyncRequestPayload, com.google.android.gms.wearable.internal.ad adVar) {
        a(new ak(this, largeAssetSyncRequestPayload, adVar), "onLargeAssetSyncRequest", largeAssetSyncRequestPayload);
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(MessageEventParcelable messageEventParcelable) {
        b(new al(this, messageEventParcelable), "onMessageReceived", messageEventParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(NodeParcelable nodeParcelable) {
        b(new am(this, nodeParcelable), "onPeerConnected", nodeParcelable);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00b0 -> B:23:0x0007). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(com.google.android.gms.wearable.internal.aa aaVar, String str, int i) {
        Object obj;
        boolean z;
        ParcelFileDescriptor parcelFileDescriptor = null;
        if (this.f6466a instanceof ar) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", String.format("openFileDescriptor: %s (mode=%s)", str, Integer.valueOf(i)));
            }
            a();
            obj = this.f6466a.d;
            synchronized (obj) {
                z = this.f6466a.e;
                if (!z) {
                    try {
                        File parentFile = new File(str).getParentFile();
                        if (parentFile.exists() || parentFile.mkdirs()) {
                            try {
                                parcelFileDescriptor = ParcelFileDescriptor.open(new File(str), 134217728 | i);
                                aaVar.a(parcelFileDescriptor);
                            } catch (FileNotFoundException e) {
                                Log.w("WearableLS", "Failed to open file: " + str, e);
                                aaVar.a(null);
                                com.google.android.gms.common.c.b.a(null);
                            }
                        } else {
                            Log.w("WearableLS", "Unable to create directory: " + parentFile.getAbsolutePath());
                            aaVar.a(null);
                        }
                    } catch (RemoteException e2) {
                        Log.w("WearableLS", "Failed to set file descriptor", e2);
                    } finally {
                        com.google.android.gms.common.c.b.a(parcelFileDescriptor);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(List<NodeParcelable> list) {
        b(new ao(this, list), "onConnectedNodes", list);
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void b(NodeParcelable nodeParcelable) {
        b(new an(this, nodeParcelable), "onPeerDisconnected", nodeParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(LargeAssetQueueStateChangeParcelable largeAssetQueueStateChangeParcelable) {
        try {
            if (a(new aj(this, largeAssetQueueStateChangeParcelable), "onLargeAssetStateChanged", largeAssetQueueStateChangeParcelable)) {
            }
        } finally {
            largeAssetQueueStateChangeParcelable.f6553b.a();
        }
    }
}
