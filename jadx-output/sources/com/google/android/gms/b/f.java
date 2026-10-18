package com.google.android.gms.b;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.x;

/* loaded from: classes.dex */
abstract class f extends e<d> {
    private f(m mVar) {
        super(mVar);
    }

    /* synthetic */ f(m mVar, byte b2) {
        this(mVar);
    }

    @Override // com.google.android.gms.internal.kt
    public final /* synthetic */ x a(Status status) {
        return new g(this, status);
    }
}
