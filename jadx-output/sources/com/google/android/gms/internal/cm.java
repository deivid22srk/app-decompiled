package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;

@gw
/* loaded from: classes.dex */
public final class cm {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5929a;

    public cm(Context context) {
        com.google.android.gms.common.internal.av.a(context, "Context can not be null");
        this.f5929a = context;
    }

    public final boolean a(Intent intent) {
        com.google.android.gms.common.internal.av.a(intent, "Intent can not be null");
        return !this.f5929a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT >= 14 && a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean a() {
        return "mounted".equals(Environment.getExternalStorageState()) && this.f5929a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
