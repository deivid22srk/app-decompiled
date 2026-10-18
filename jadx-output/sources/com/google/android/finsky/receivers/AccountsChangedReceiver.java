package com.google.android.finsky.receivers;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.services.ContentSyncService;
import com.google.android.finsky.services.DailyHygiene;
import com.google.android.finsky.services.RestoreService;
import com.google.android.finsky.services.VpaService;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.jb;
import com.google.android.finsky.utils.jn;

/* loaded from: classes.dex */
public class AccountsChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        bg.ar.a((com.google.android.finsky.c.o<Boolean>) true);
        FinskyApp.a().p.a((Runnable) null);
        Account[] a2 = com.google.android.finsky.api.a.a(context);
        String[] b2 = jn.b(a2);
        String a3 = jn.f.a();
        if (!TextUtils.isEmpty(a3) && b2.length > 0) {
            FinskyLog.a("Restoring apps for %d new accounts.", Integer.valueOf(b2.length));
            RestoreService.a(context, a3, b2[0]);
        }
        if (a2.length == 1 && b2.length == 1) {
            VpaService.c();
        }
        jn.a(a2);
        for (String str : b2) {
            jb.a(str);
        }
        DailyHygiene.a(context, DailyHygiene.f4545a);
        ContentSyncService.a().a();
        FinskyApp.a().a(new a(this, context));
    }
}
