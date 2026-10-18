package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public final class na extends my {

    /* renamed from: a, reason: collision with root package name */
    private final ks<com.google.android.gms.bpkg.d> f6179a;

    public na(ks<com.google.android.gms.bpkg.d> ksVar) {
        this.f6179a = (ks) com.google.android.gms.common.internal.av.a(ksVar, "Holder must not be null");
    }

    @Override // com.google.android.gms.internal.my, com.google.android.gms.internal.nc
    public final void a(DataHolder dataHolder) {
        this.f6179a.a(new nb(dataHolder));
    }
}
