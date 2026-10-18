package com.android.volley;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public static String f1257a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1258b = Log.isLoggable("Volley", 2);

    public static void a(String str, Object... objArr) {
        if (f1258b) {
            Log.v(f1257a, e(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        Log.d(f1257a, e(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f1257a, e(str, objArr));
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(f1257a, e(str, objArr), th);
    }

    public static void d(String str, Object... objArr) {
        Log.wtf(f1257a, e(str, objArr));
    }

    private static String e(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (stackTrace[i].getClass().equals(w.class)) {
                i++;
            } else {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
