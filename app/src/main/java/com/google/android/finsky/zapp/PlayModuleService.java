package com.google.android.finsky.zapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class PlayModuleService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private a f5243a;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f5243a = new a(this, (byte) 0);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f5243a;
    }
}
