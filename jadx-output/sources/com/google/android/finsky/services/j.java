package com.google.android.finsky.services;

import android.app.AlarmManager;
import android.app.PendingIntent;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class j implements com.google.android.finsky.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ContentSyncService f4621a;

    j(ContentSyncService contentSyncService) {
        this.f4621a = contentSyncService;
    }

    @Override // com.google.android.finsky.b.k
    public final void a(boolean z) {
        boolean z2;
        ContentSyncService.c(this.f4621a);
        if (z) {
            FinskyLog.a("Installation state replication succeeded.", new Object[0]);
            com.google.android.finsky.utils.bg.x.c();
            z2 = this.f4621a.c;
            if (z2) {
                FinskyLog.a("Another replication has been requested, rescheduling.", new Object[0]);
                ((AlarmManager) FinskyApp.a().getSystemService("alarm")).set(0, (com.google.android.finsky.utils.bg.x.a().intValue() == 0 ? 15000L : 20000L) + System.currentTimeMillis(), PendingIntent.getService(FinskyApp.a(), 0, ContentSyncService.f4543a, 0));
            }
        } else {
            FinskyLog.a("Installation state replication failed.", new Object[0]);
            int intValue = com.google.android.finsky.utils.bg.x.a().intValue() + 1;
            if (intValue > 5) {
                FinskyLog.a("Giving up after %d failures.", Integer.valueOf(intValue));
                com.google.android.finsky.utils.bg.x.c();
            } else {
                FinskyLog.a("Scheduling replication attempt %d.", Integer.valueOf(intValue));
                com.google.android.finsky.utils.bg.x.a((com.google.android.finsky.c.o<Integer>) Integer.valueOf(intValue));
                ((AlarmManager) FinskyApp.a().getSystemService("alarm")).set(0, (com.google.android.finsky.utils.bg.x.a().intValue() == 0 ? 15000L : 20000L) + System.currentTimeMillis(), PendingIntent.getService(FinskyApp.a(), 0, ContentSyncService.f4543a, 0));
            }
        }
        this.f4621a.stopSelf();
    }
}
