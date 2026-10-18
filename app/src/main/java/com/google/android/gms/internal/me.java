package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;

/* loaded from: classes.dex */
abstract class me extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    protected Context f6159a;

    me() {
    }

    public static <T extends me> T a(Context context, T t) {
        com.google.android.gms.common.b.a();
        return (T) b(context, t);
    }

    public static <T extends me> T b(Context context, T t) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        context.registerReceiver(t, intentFilter);
        t.f6159a = context;
        if (com.google.android.gms.common.b.a(context, "com.google.android.gms")) {
            return t;
        }
        t.a();
        t.b();
        return null;
    }

    protected abstract void a();

    public final synchronized void b() {
        if (this.f6159a != null) {
            this.f6159a.unregisterReceiver(this);
        }
        this.f6159a = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            a();
            b();
        }
    }
}
