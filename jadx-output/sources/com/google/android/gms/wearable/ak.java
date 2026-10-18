package com.google.android.gms.wearable;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.LargeAssetSyncRequestPayload;
import com.google.android.gms.wearable.internal.aw;

/* loaded from: classes.dex */
final class ak implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LargeAssetSyncRequestPayload f6476a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.wearable.internal.ad f6477b;
    final /* synthetic */ af c;

    ak(af afVar, LargeAssetSyncRequestPayload largeAssetSyncRequestPayload, com.google.android.gms.wearable.internal.ad adVar) {
        this.c = afVar;
        this.f6476a = largeAssetSyncRequestPayload;
        this.f6477b = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aw awVar = new aw(this.f6476a, this.f6477b);
        ar.a(awVar);
        try {
            try {
                com.google.android.gms.common.internal.av.a(awVar.f6586b, "Received onLargeAssetSyncRequest but didn't set a response.");
                if (awVar.c != null) {
                    awVar.f6585a.a(awVar.c, awVar.d);
                } else {
                    awVar.f6585a.a(awVar.e);
                }
            } finally {
                if (awVar.c != null) {
                    com.google.android.gms.common.c.b.a(awVar.c);
                }
            }
        } catch (RemoteException e) {
            Log.w("WearableLS", "Failed to respond to LargeAssetRequest", e);
        }
    }
}
