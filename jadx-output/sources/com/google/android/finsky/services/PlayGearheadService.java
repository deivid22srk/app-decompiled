package com.google.android.finsky.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public class PlayGearheadService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private ak f4553a;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f4553a = new ak(this, FinskyApp.a().p, FinskyApp.a().v, FinskyApp.a().s);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4553a;
    }
}
