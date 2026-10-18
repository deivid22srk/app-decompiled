package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f5730a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static x f5731b;

    public static x a(Context context) {
        synchronized (f5730a) {
            if (f5731b == null) {
                f5731b = new y(context.getApplicationContext());
            }
        }
        return f5731b;
    }

    public abstract void a(ComponentName componentName, ServiceConnection serviceConnection);

    public abstract void a(String str, ServiceConnection serviceConnection);

    public abstract boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str);

    public abstract boolean a(String str, ServiceConnection serviceConnection, String str2);
}
