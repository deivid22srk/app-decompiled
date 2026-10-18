package com.google.android.finsky.f;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.q;

/* loaded from: classes.dex */
final class d implements q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f2779a;

    d(a aVar) {
        this.f2779a = aVar;
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(ConnectionResult connectionResult) {
        FinskyLog.c("Could not connect to GMS for Auto connection state: %s", connectionResult);
        a.a(this.f2779a);
    }
}
