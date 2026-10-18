package com.google.android.finsky.services;

import android.app.AlarmManager;
import android.app.PendingIntent;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class g implements k {
    g() {
    }

    @Override // com.google.android.finsky.services.k
    public final void a() {
        ((AlarmManager) FinskyApp.a().getSystemService("alarm")).set(0, (com.google.android.finsky.utils.bg.x.a().intValue() == 0 ? 15000L : 20000L) + System.currentTimeMillis(), PendingIntent.getService(FinskyApp.a(), 0, ContentSyncService.f4543a, 0));
    }
}
