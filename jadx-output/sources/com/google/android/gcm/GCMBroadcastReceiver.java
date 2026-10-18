package com.google.android.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
public class GCMBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f5249a = false;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Log.v("GCMBroadcastReceiver", "onReceive: " + intent.getAction());
        if (!f5249a) {
            f5249a = true;
            String name = getClass().getName();
            if (!name.equals(GCMBroadcastReceiver.class.getName())) {
                Log.v("GCMRegistrar", "Setting the name of retry receiver class to " + name);
                b.f5252a = name;
            }
        }
        String str = context.getPackageName() + ".GCMIntentService";
        Log.v("GCMBroadcastReceiver", "GCM IntentService class: " + str);
        a.a(context, intent, str);
        setResult(-1, null, null);
    }
}
