package com.google.android.flib.log;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5247a = a.class.getName();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f5248b = false;
    private static boolean c = false;

    private a() {
    }

    public static void a() {
        f5248b = true;
    }

    public static void b() {
        c = true;
    }

    public static void a(String str, String str2, Object... objArr) {
        Log.i(str, a(str2, objArr));
    }

    public static void b(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 3)) {
            Log.d(str, a(str2, objArr));
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        Log.w(str, a(str2, objArr));
    }

    public static void d(String str, String str2, Object... objArr) {
        Log.e(str, a(str2, objArr));
    }

    public static void a(String str, Throwable th, String str2, Object... objArr) {
        Log.e(str, a(str2, objArr), th);
    }

    @TargetApi(8)
    public static void e(String str, String str2, Object... objArr) {
        Log.wtf(str, a(str2, objArr), new WhatATerribleException());
    }

    @TargetApi(8)
    public static void b(String str, Throwable th, String str2, Object... objArr) {
        Log.wtf(str, a(str2, objArr), new WhatATerribleException(th));
    }

    public static String a(Object obj, boolean z) {
        String valueOf = String.valueOf(obj);
        return (obj == null || TextUtils.isEmpty(valueOf) || z) ? valueOf : "[" + a(valueOf.getBytes()) + "]";
    }

    @TargetApi(8)
    private static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    str = String.format(Locale.US, str, objArr);
                }
            } catch (IllegalFormatException e) {
                String arrays = Arrays.toString(objArr);
                b("Blog", e, "msg: \"%s\" args: %s", str, arrays);
                str = str + " " + arrays;
            }
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            if (className.equals(f5247a) || className.endsWith("Log")) {
                i++;
            } else {
                str2 = (!f5248b ? className.substring(className.lastIndexOf(46) + 1) : className) + "." + stackTraceElement.getMethodName();
                if (c) {
                    str2 = str2 + "(" + stackTraceElement.getLineNumber() + ")";
                }
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
