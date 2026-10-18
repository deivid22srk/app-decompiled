package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public final class d extends com.google.android.gms.common.data.i implements com.google.android.gms.wearable.m {
    public d(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.wearable.m
    public final String b() {
        return c("asset_id");
    }

    @Override // com.google.android.gms.wearable.m
    public final String c() {
        return c("asset_key");
    }

    @Override // com.google.android.gms.common.data.f
    public final /* synthetic */ com.google.android.gms.wearable.m a() {
        return new b(this);
    }
}
