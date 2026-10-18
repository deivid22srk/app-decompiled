package com.google.android.finsky.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public class PlayAfwAppService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private ai f4552a;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f4552a = new ai(FinskyApp.a().p, FinskyApp.a().v, FinskyApp.a().s, FinskyApp.a().e(), new aj(), this);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4552a;
    }
}
