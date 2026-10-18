package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class ml implements com.google.android.gms.common.api.q {

    /* renamed from: a, reason: collision with root package name */
    public final int f6165a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.m f6166b;
    public final com.google.android.gms.common.api.q c;
    final /* synthetic */ mk d;

    public ml(mk mkVar, int i, com.google.android.gms.common.api.m mVar, com.google.android.gms.common.api.q qVar) {
        this.d = mkVar;
        this.f6165a = i;
        this.f6166b = mVar;
        this.c = qVar;
        mVar.a(this);
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.d.g;
        handler.post(new mm(this.d, this.f6165a, connectionResult));
    }
}
