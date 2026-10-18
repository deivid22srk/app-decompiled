package com.google.android.finsky.billing.carrierbilling.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class f extends BroadcastReceiver {
    f() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.unregisterReceiver(this);
        if (getResultCode() != -1) {
            FinskyLog.c("Error while sending sms: %d", Integer.valueOf(getResultCode()));
            e.a(1);
        } else {
            e.a(0);
        }
    }
}
