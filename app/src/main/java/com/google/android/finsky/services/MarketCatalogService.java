package com.google.android.finsky.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class MarketCatalogService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private final v f4551a = new ag(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4551a;
    }
}
