package com.google.android.finsky.utils;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public final class FinskyLog {

    /* renamed from: a, reason: collision with root package name */
    private static String f4707a = "Finsky";

    /* renamed from: b, reason: collision with root package name */
    private static long f4708b = System.currentTimeMillis();

    static {
        com.google.android.flib.log.a.a();
        com.google.android.flib.log.a.b();
    }

    public static boolean a() {
        return Log.isLoggable(f4707a, 3);
    }

    public static void a(String str, Object... objArr) {
        com.google.android.flib.log.a.a(f4707a, str, objArr);
    }

    public static void b(String str, Object... objArr) {
        com.google.android.flib.log.a.b(f4707a, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        com.google.android.flib.log.a.c(f4707a, str, objArr);
    }

    public static void d(String str, Object... objArr) {
        com.google.android.flib.log.a.d(f4707a, str, objArr);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        com.google.android.flib.log.a.a(f4707a, th, str, objArr);
    }

    public static void e(String str, Object... objArr) {
        com.google.android.flib.log.a.e(f4707a, str, objArr);
    }

    public static void b(Throwable th, String str, Object... objArr) {
        com.google.android.flib.log.a.b(f4707a, th, str, objArr);
    }

    public static String a(String str) {
        return com.google.android.flib.log.a.a(str, com.google.android.finsky.c.d.f.b().booleanValue());
    }

    public static void b() {
        f4708b = System.currentTimeMillis();
    }

    public static void f(String str, Object... objArr) {
        if (Log.isLoggable(f4707a, 2)) {
            Object[] objArr2 = {Long.valueOf(System.currentTimeMillis() - f4708b), String.format(Locale.US, str, objArr)};
        }
    }
}
