package com.google.android.finsky.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class DownloadBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static w f2676a;

    public static void a(w wVar) {
        f2676a = wVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (com.google.android.finsky.safemode.a.b()) {
            FinskyLog.a("Safe Mode is active. Bail out.", new Object[0]);
        } else {
            a(intent);
        }
    }

    public final void a(Intent intent) {
        boolean z;
        boolean z2;
        FinskyLog.a("Intent received at DownloadBroadcastReceiver", new Object[0]);
        Uri a2 = f2676a.b().a(intent);
        String action = intent.getAction();
        if ("android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED".equals(action)) {
            z = false;
            z2 = true;
        } else if ("android.intent.action.DOWNLOAD_COMPLETE".equals(action)) {
            z = true;
            z2 = false;
        } else if ("android.intent.action.DOWNLOAD_COMPLETED".equals(action)) {
            z = true;
            z2 = false;
        } else {
            z = false;
            z2 = false;
        }
        if (f2676a.a(a2) == null) {
            FinskyLog.a("DownloadBroadcastReceiver could not find %s in queue.", a2);
            if (z2) {
                FinskyApp a3 = FinskyApp.a();
                if (FinskyApp.a().i() != null) {
                    Intent b2 = MainActivity.b(a3);
                    b2.setFlags(268435456);
                    a3.startActivity(b2);
                    return;
                }
                return;
            }
            return;
        }
        new c(this, a2, z2, z).execute(new Void[0]);
    }
}
