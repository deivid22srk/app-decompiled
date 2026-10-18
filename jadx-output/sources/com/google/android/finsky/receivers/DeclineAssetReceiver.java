package com.google.android.finsky.receivers;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class DeclineAssetReceiver extends com.google.android.finsky.download.ak {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intValue;
        if (intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE")) {
            setResultCode(-1);
            if (intent.getStringExtra("from").equals("google.com")) {
                String stringExtra = intent.getStringExtra("asset_package");
                String stringExtra2 = intent.getStringExtra("decline_reason");
                if (stringExtra2 != null) {
                    try {
                        intValue = Integer.valueOf(stringExtra2).intValue();
                    } catch (NumberFormatException e) {
                        FinskyLog.c("Non-numeric decline reason: %s", stringExtra2);
                    }
                    FinskyLog.a("Received PURCHASE_DECLINED tickle for %s reason=%d", stringExtra, Integer.valueOf(intValue));
                    FinskyApp.a().h().a(200, stringExtra, String.valueOf(intValue), 0, (String) null, (com.google.android.finsky.a.n) null);
                }
                intValue = -1;
                FinskyLog.a("Received PURCHASE_DECLINED tickle for %s reason=%d", stringExtra, Integer.valueOf(intValue));
                FinskyApp.a().h().a(200, stringExtra, String.valueOf(intValue), 0, (String) null, (com.google.android.finsky.a.n) null);
            }
        }
    }
}
