package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class le extends com.google.android.gms.signin.internal.b {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<lc> f6128a;

    le(lc lcVar) {
        this.f6128a = new WeakReference<>(lcVar);
    }

    @Override // com.google.android.gms.signin.internal.b, com.google.android.gms.signin.internal.f
    public final void a(ConnectionResult connectionResult, AuthAccountResult authAccountResult) {
        lc lcVar = this.f6128a.get();
        if (lcVar == null) {
            return;
        }
        lcVar.f6125a.a(new lf(this, lcVar, lcVar, connectionResult));
    }
}
