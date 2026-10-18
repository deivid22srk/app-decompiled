package com.google.android.finsky.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.receivers.PackageMonitorReceiver;

/* loaded from: classes.dex */
public class ContentSyncService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private static final Intent f4543a = new Intent(FinskyApp.a(), (Class<?>) ContentSyncService.class);

    /* renamed from: b, reason: collision with root package name */
    private boolean f4544b;
    private boolean c;
    private final com.google.android.finsky.bpkg.c d = FinskyApp.a().t;
    private com.google.android.finsky.bpkg.k e = new j(this);

    static /* synthetic */ boolean c(ContentSyncService contentSyncService) {
        contentSyncService.f4544b = false;
        return false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f4544b) {
            this.c = true;
            return 2;
        }
        this.c = false;
        this.d.a(new f(this));
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static k a() {
        return new g();
    }

    public static void a(com.google.android.finsky.gpkg.ah ahVar, PackageMonitorReceiver packageMonitorReceiver) {
        ahVar.a(new h());
        packageMonitorReceiver.a(new i());
    }
}
