package com.google.android.finsky.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public class LocationUpdaterService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private int f4549a;

    /* renamed from: b, reason: collision with root package name */
    private int f4550b;

    static /* synthetic */ int a(LocationUpdaterService locationUpdaterService) {
        int i = locationUpdaterService.f4550b;
        locationUpdaterService.f4550b = i - 1;
        return i;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) LocationUpdaterService.class);
        intent.setData(Uri.parse("locationupdateservice://update"));
        context.startService(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.f4549a = i2;
        this.f4550b++;
        FinskyApp.a().g().a(new af(this));
        return 3;
    }
}
