package com.google.android.finsky.utils;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class cn implements com.google.android.gms.common.api.p, com.google.android.gms.common.api.q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4805a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.api.m f4806b;

    public cn(Context context) {
        this.f4805a = context;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(int i) {
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Bundle bundle) {
        com.google.android.gms.b.a.a(this.f4806b).a(new co(this));
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(ConnectionResult connectionResult) {
        int i = connectionResult.c;
        if (i != 1 && i != 2 && i != 3) {
            FinskyLog.c("onConnectionFailed result: %s", connectionResult);
        }
    }
}
