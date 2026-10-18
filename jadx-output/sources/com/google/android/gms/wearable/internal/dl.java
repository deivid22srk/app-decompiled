package com.google.android.gms.wearable.internal;

/* loaded from: classes.dex */
public final class dl implements com.google.android.gms.wearable.j {

    /* renamed from: a, reason: collision with root package name */
    private int f6626a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.wearable.l f6627b;

    public dl(com.google.android.gms.wearable.j jVar) {
        this.f6626a = jVar.c();
        this.f6627b = jVar.b().a();
    }

    @Override // com.google.android.gms.common.data.f
    public final /* synthetic */ com.google.android.gms.wearable.j a() {
        return this;
    }

    @Override // com.google.android.gms.wearable.j
    public final com.google.android.gms.wearable.l b() {
        return this.f6627b;
    }

    @Override // com.google.android.gms.wearable.j
    public final int c() {
        return this.f6626a;
    }

    public final String toString() {
        return "DataEventEntity{ type=" + (this.f6626a == 1 ? "changed" : this.f6626a == 2 ? "deleted" : "unknown") + ", dataitem=" + this.f6627b + " }";
    }
}
