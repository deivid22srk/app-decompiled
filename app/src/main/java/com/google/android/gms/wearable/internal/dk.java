package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class dk implements com.google.android.gms.wearable.i {

    /* renamed from: a, reason: collision with root package name */
    private final Status f6624a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6625b;

    public dk(Status status, int i) {
        this.f6624a = status;
        this.f6625b = i;
    }

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this.f6624a;
    }
}
