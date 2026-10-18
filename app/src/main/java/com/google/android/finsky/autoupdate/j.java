package com.google.android.finsky.autoupdate;

import com.google.android.finsky.autoupdate.ReschedulerUsingAlarmManager;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ReschedulerUsingAlarmManager.CheckWifiAndAutoUpdate f2040a;

    j(ReschedulerUsingAlarmManager.CheckWifiAndAutoUpdate checkWifiAndAutoUpdate) {
        this.f2040a = checkWifiAndAutoUpdate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!com.google.android.finsky.fpkg.a.a().b()) {
            FinskyLog.a("Checking wifi: enabled, proceeding with auto-update.", new Object[0]);
            h.a((u) this.f2040a, true);
        } else {
            ReschedulerUsingAlarmManager.f();
            this.f2040a.stopSelf();
        }
    }
}
