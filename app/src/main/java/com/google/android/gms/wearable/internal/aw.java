package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class aw implements com.google.android.gms.wearable.s {

    /* renamed from: a, reason: collision with root package name */
    public final ad f6585a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6586b;
    public ParcelFileDescriptor c;
    public long d;
    public int e;
    private final LargeAssetSyncRequestPayload f;

    public aw(LargeAssetSyncRequestPayload largeAssetSyncRequestPayload, ad adVar) {
        this.f = (LargeAssetSyncRequestPayload) com.google.android.gms.common.internal.av.a(largeAssetSyncRequestPayload);
        this.f6585a = (ad) com.google.android.gms.common.internal.av.a(adVar);
        com.google.android.gms.common.internal.av.a(largeAssetSyncRequestPayload.f6559b);
        com.google.android.gms.common.internal.av.a(largeAssetSyncRequestPayload.c >= 0, "Got negative offset: %s", Long.valueOf(largeAssetSyncRequestPayload.c));
    }

    @Override // com.google.android.gms.wearable.s
    public final void a() {
        com.google.android.gms.common.internal.av.a(!this.f6586b, "createOutputFileDescriptor called when response already set");
        this.e = 0;
        this.f6586b = true;
    }
}
