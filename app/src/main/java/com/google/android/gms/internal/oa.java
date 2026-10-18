package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

@Deprecated
/* loaded from: classes.dex */
public final class oa implements nv {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.api.h<nw> f6197a;

    public oa(com.google.android.gms.common.api.h<nw> hVar) {
        this.f6197a = hVar;
    }

    @Override // com.google.android.gms.internal.nv
    public final com.google.android.gms.common.api.u<Status> a(com.google.android.gms.common.api.m mVar, Long l, Bundle bundle) {
        return mVar.a((com.google.android.gms.common.api.m) new ob(this, this.f6197a, mVar, l, bundle));
    }
}
