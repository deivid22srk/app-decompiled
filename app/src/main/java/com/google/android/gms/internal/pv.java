package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class pv extends pj {

    /* renamed from: a, reason: collision with root package name */
    private final ks<com.google.android.gms.safetynet.e> f6236a;

    public pv(ks<com.google.android.gms.safetynet.e> ksVar) {
        this.f6236a = ksVar;
    }

    @Override // com.google.android.gms.internal.pj, com.google.android.gms.internal.pl
    public final void a(String str) {
        this.f6236a.a(new pw(Status.f5572a, str));
    }
}
