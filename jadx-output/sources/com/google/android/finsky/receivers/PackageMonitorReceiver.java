package com.google.android.finsky.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.el;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class PackageMonitorReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final List<aq> f4430a = new ArrayList();

    public class RegisteredReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PackageMonitorReceiver packageMonitorReceiver = FinskyApp.a().i;
            String action = intent.getAction();
            com.google.android.finsky.b.x xVar = FinskyApp.a().v;
            boolean equals = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(action);
            boolean equals2 = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action);
            if (equals || equals2) {
                String[] stringArrayExtra = intent.getStringArrayExtra("android.intent.extra.changed_package_list");
                for (String str : stringArrayExtra) {
                    xVar.e(str);
                }
                packageMonitorReceiver.a(new al(packageMonitorReceiver, stringArrayExtra, equals));
                return;
            }
            Uri data = intent.getData();
            String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
            if (schemeSpecificPart != null) {
                xVar.e(schemeSpecificPart);
                if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    Bundle extras = intent.getExtras();
                    packageMonitorReceiver.a(new am(packageMonitorReceiver, schemeSpecificPart, extras != null && extras.getBoolean("android.intent.extra.REPLACING", false)));
                    return;
                }
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    packageMonitorReceiver.a(new an(packageMonitorReceiver, schemeSpecificPart));
                    ExpireLaunchUrlReceiver.b(context, schemeSpecificPart);
                } else if ("android.intent.action.PACKAGE_CHANGED".equals(action)) {
                    packageMonitorReceiver.a(new ao(packageMonitorReceiver, schemeSpecificPart));
                } else if ("android.intent.action.PACKAGE_FIRST_LAUNCH".equals(action)) {
                    packageMonitorReceiver.a(new ap(packageMonitorReceiver, schemeSpecificPart));
                } else {
                    FinskyLog.c("Unhandled intent type action type: %s", action);
                }
            }
        }
    }

    final void a(el<aq> elVar) {
        for (int size = this.f4430a.size() - 1; size >= 0; size--) {
            elVar.a(this.f4430a.get(size));
        }
    }

    public final void a(aq aqVar) {
        this.f4430a.add(aqVar);
    }

    public final void b(aq aqVar) {
        this.f4430a.remove(aqVar);
    }
}
