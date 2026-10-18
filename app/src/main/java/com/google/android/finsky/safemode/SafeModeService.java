package com.google.android.finsky.safemode;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.am;
import com.google.android.finsky.utils.cb;

/* loaded from: classes.dex */
public class SafeModeService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (!a.b()) {
            stopSelf();
        } else {
            com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
            if (b2 != null) {
                cb.a(b2, am.a(), new b(this, b2.c()));
            } else {
                a.c();
                stopSelf();
            }
        }
        return 2;
    }

    static /* synthetic */ void a(SafeModeService safeModeService) {
        a.c();
        safeModeService.stopSelf();
    }
}
