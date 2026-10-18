package com.google.android.finsky.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.finsky.utils.dj;

/* loaded from: classes.dex */
public final class ak extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f4452a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static NetworkInfo f4453b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b(context);
        dj.a(context);
    }

    public static NetworkInfo a(Context context) {
        NetworkInfo networkInfo;
        synchronized (f4452a) {
            if (f4453b == null) {
                b(context);
            }
            networkInfo = f4453b;
        }
        return networkInfo;
    }

    public static void a() {
        synchronized (f4452a) {
            f4453b = null;
        }
    }

    private static void b(Context context) {
        synchronized (f4452a) {
            f4453b = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        }
    }
}
