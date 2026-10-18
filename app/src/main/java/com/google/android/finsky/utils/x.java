package com.google.android.finsky.utils;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* loaded from: classes.dex */
final class x implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f5060a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f5061b;

    x(w wVar, y yVar) {
        this.f5061b = wVar;
        this.f5060a = yVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.f5060a.a(location);
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        this.f5060a.a(null);
    }
}
