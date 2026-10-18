package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
final class nb implements com.google.android.gms.bpkg.d {

    /* renamed from: a, reason: collision with root package name */
    private final Status f6180a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.bpkg.apkg.b f6181b;

    @Override // com.google.android.gms.common.api.w
    public final void a() {
        this.f6181b.a();
    }

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this.f6180a;
    }

    @Override // com.google.android.gms.bpkg.d
    public final com.google.android.gms.bpkg.apkg.b c() {
        return this.f6181b;
    }

    public nb(DataHolder dataHolder) {
        this.f6180a = new Status(dataHolder.e);
        this.f6181b = new com.google.android.gms.bpkg.apkg.b(dataHolder);
    }
}
