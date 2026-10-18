package com.google.android.finsky.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.kf;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes.dex */
public class ServerNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        kf kfVar;
        if (intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE") && "google.com".equals(intent.getStringExtra("from")) && intent.getCategories().contains("SERVER_NOTIFICATION")) {
            setResultCode(-1);
            Bundle extras = intent.getExtras();
            if (extras.containsKey("NOTIFICATION_PAYLOAD")) {
                byte[] decode = Base64.decode(extras.getString("NOTIFICATION_PAYLOAD"), 11);
                if (decode != null) {
                    try {
                        kfVar = (kf) com.google.protobuf.nano.c.a(new kf(), decode, decode.length);
                    } catch (InvalidProtocolBufferNanoException e) {
                        FinskyLog.d("Received download tickle with malformed notification proto data.", new Object[0]);
                        kfVar = null;
                    }
                    if (kfVar != null) {
                        FinskyLog.a("Handling notificationId=[%s]", kfVar.c);
                        FinskyApp.a().u.a(kfVar);
                        return;
                    }
                    return;
                }
                return;
            }
            FinskyLog.a("Ignoring server broadcast due to empty notification string.", new Object[0]);
            String stringExtra = intent.getStringExtra("server_notification_message");
            String stringExtra2 = intent.getStringExtra("server_dialog_message");
            if (stringExtra == null || stringExtra2 == null) {
                FinskyLog.a("Could not handle old style notification.", new Object[0]);
                return;
            }
            if (intent.hasExtra("server_notification_status")) {
                intent.getStringExtra("server_notification_status");
            } else {
                context.getString(R.string.notification_server_notification_status);
            }
            FinskyApp.a().n.e(intent.hasExtra("server_notification_title") ? intent.getStringExtra("server_notification_title") : context.getString(R.string.notification_server_notification_title), stringExtra);
            FinskyLog.a("Handled old style notification.", new Object[0]);
        }
    }
}
