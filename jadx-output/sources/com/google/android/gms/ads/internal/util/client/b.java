package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.ads.internal.a.f;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public final class b {
    public static void a(String str) {
        if (a(3)) {
            Log.d("Ads", str);
        }
    }

    public static void a(String str, Throwable th) {
        if (a(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void b(String str) {
        if (a(6)) {
            Log.e("Ads", str);
        }
    }

    public static void b(String str, Throwable th) {
        if (a(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void c(String str) {
        if (a(4)) {
            Log.i("Ads", str);
        }
    }

    public static void c(String str, Throwable th) {
        if (a(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void d(String str) {
        if (a(2)) {
            Log.v("Ads", str);
        }
    }

    public static void e(String str) {
        if (a(5)) {
            Log.w("Ads", str);
        }
    }

    public static boolean a(int i) {
        if (i >= 5 || Log.isLoggable("Ads", i)) {
            if (i == 2) {
                if (((Boolean) d.j().a(f.ak)).booleanValue()) {
                }
            }
            return true;
        }
        return false;
    }
}
