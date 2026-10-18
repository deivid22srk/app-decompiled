package com.google.android.finsky.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cg;

/* loaded from: classes.dex */
public class TosAckedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            FinskyLog.c("Invalid Broadcast: requires extras.", new Object[0]);
            return;
        }
        Bundle extras = intent.getExtras();
        String string = extras.getString("TosAckedReceiver.account");
        boolean z = extras.getBoolean("TosAckedReceiver.optIn");
        if (string == null) {
            FinskyLog.c("Invalid Broadcast: no account.", new Object[0]);
            return;
        }
        com.google.android.finsky.api.b b2 = FinskyApp.a().b(string);
        if (b2 == null) {
            FinskyLog.d("Could not get DFE API, returning.", new Object[0]);
        } else {
            cg.a(b2, false, new as(this, string, z));
        }
    }

    static /* synthetic */ void a(TosAckedReceiver tosAckedReceiver, String str, boolean z, DfeToc dfeToc) {
        String str2;
        com.google.android.finsky.api.b b2 = FinskyApp.a().b(str);
        if (b2 == null) {
            FinskyLog.d("Could not get DFE API, returning.", new Object[0]);
            return;
        }
        if (dfeToc.f1961a.k) {
            str2 = dfeToc.f1961a.j;
        } else {
            str2 = dfeToc.f1961a.h;
        }
        if (TextUtils.isEmpty(str2)) {
            FinskyLog.a("TOS already accepted.", new Object[0]);
            com.google.android.vending.verifier.r.f();
        } else {
            b2.a(str2, Boolean.valueOf(z), new at(tosAckedReceiver, str, str2), new au(tosAckedReceiver));
        }
    }
}
