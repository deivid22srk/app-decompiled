package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class t extends l<T>.m {
    final /* synthetic */ l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(l lVar) {
        super(lVar, 0, null);
        this.e = lVar;
    }

    protected final void a(ConnectionResult connectionResult) {
        com.google.android.gms.common.api.t tVar;
        tVar = this.e.k;
        tVar.a(connectionResult);
        l.k();
    }

    protected final boolean a() {
        com.google.android.gms.common.api.t tVar;
        tVar = this.e.k;
        tVar.a(ConnectionResult.f5556a);
        return true;
    }
}
