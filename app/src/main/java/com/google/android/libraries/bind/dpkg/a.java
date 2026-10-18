package com.google.android.libraries.bind.dpkg;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f6676a;

    /* renamed from: b, reason: collision with root package name */
    public static int f6677b = -1;

    public static String a(int i) {
        if (f6676a != null) {
            try {
                return f6676a.getResources().getResourceEntryName(i);
            } catch (Resources.NotFoundException e) {
            }
        }
        return Integer.toString(i);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean a() {
        ActivityManager activityManager;
        if (f6677b == -1 && (activityManager = (ActivityManager) f6676a.getSystemService("activity")) != null) {
            f6677b = activityManager.getMemoryClass();
        }
        return f6677b < 96;
    }
}
