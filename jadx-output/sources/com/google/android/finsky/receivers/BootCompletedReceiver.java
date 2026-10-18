package com.google.android.finsky.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public class BootCompletedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.google.android.finsky.b.l.a();
        if (com.google.android.finsky.api.a.b(context) != null) {
            FinskyApp.a().a(new b(this, context));
        }
    }
}
