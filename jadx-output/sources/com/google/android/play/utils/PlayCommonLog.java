package com.google.android.play.utils;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public class PlayCommonLog {

    /* renamed from: a, reason: collision with root package name */
    private static String f7064a = "PlayCommon";

    /* renamed from: b, reason: collision with root package name */
    private static long f7065b = System.currentTimeMillis();

    public static void a(String str, Object... objArr) {
        com.google.android.flib.log.a.a(f7064a, str, objArr);
    }

    public static void b(String str, Object... objArr) {
        com.google.android.flib.log.a.c(f7064a, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        com.google.android.flib.log.a.d(f7064a, str, objArr);
    }

    public static void d(String str, Object... objArr) {
        com.google.android.flib.log.a.e(f7064a, str, objArr);
    }

    public static void e(String str, Object... objArr) {
        if (Log.isLoggable(f7064a, 2)) {
            Object[] objArr2 = {Long.valueOf(System.currentTimeMillis() - f7065b), String.format(Locale.US, str, objArr)};
        }
    }
}
