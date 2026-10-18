package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public final class dm extends com.google.android.gms.common.data.i implements com.google.android.gms.wearable.j {
    private final int c;

    public dm(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
    }

    @Override // com.google.android.gms.wearable.j
    public final com.google.android.gms.wearable.l b() {
        return new g(this.f5624a, this.f5625b, this.c);
    }

    @Override // com.google.android.gms.wearable.j
    public final int c() {
        return b("event_type");
    }

    public final String toString() {
        return "DataEventRef{ type=" + (b("event_type") == 1 ? "changed" : b("event_type") == 2 ? "deleted" : "unknown") + ", dataitem=" + b() + " }";
    }

    @Override // com.google.android.gms.common.data.f
    public final /* synthetic */ com.google.android.gms.wearable.j a() {
        return new dl(this);
    }
}
