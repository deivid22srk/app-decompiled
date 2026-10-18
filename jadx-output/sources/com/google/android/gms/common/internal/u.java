package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class u extends l<T>.m {
    final /* synthetic */ l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(l lVar, int i, Bundle bundle) {
        super(lVar, i, bundle);
        this.e = lVar;
    }

    protected final void a(ConnectionResult connectionResult) {
        com.google.android.gms.common.api.t tVar;
        tVar = this.e.k;
        tVar.b(connectionResult);
        l.k();
    }

    protected final boolean a() {
        com.google.android.gms.common.api.t tVar;
        tVar = this.e.k;
        tVar.b(ConnectionResult.f5556a);
        return true;
    }
}
