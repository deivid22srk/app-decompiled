package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class dj implements com.google.android.gms.wearable.g {

    /* renamed from: a, reason: collision with root package name */
    private final Status f6622a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.wearable.l f6623b;

    public dj(Status status, com.google.android.gms.wearable.l lVar) {
        this.f6622a = status;
        this.f6623b = lVar;
    }

    @Override // com.google.android.gms.wearable.g
    public final com.google.android.gms.wearable.l a() {
        return this.f6623b;
    }

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this.f6622a;
    }
}
