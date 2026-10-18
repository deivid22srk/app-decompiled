package com.google.android.gms.ads.bpkg;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f5266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f5267b;

    g(f fVar, Bundle bundle) {
        this.f5267b = fVar;
        this.f5266a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5267b.f5265a.a(new c(this.f5266a.getString("ad_id"), this.f5266a.getBoolean("lat_enabled")));
    }
}
