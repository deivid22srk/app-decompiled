package com.google.android.gms.people.internal;

import android.util.Log;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f6424a;

    public static void a(String str, String str2) {
        if (a(3)) {
            Log.d(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (a(5)) {
            Log.w(str, str2, th);
        }
    }

    public static boolean a(int i) {
        return f6424a || Log.isLoggable("PeopleService", i);
    }
}
