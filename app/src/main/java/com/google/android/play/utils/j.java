package com.google.android.play.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.view.ao;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f7084a = Pattern.compile(",");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f7085b = new String[0];
    private static Boolean c;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television");
    }

    public static boolean a() {
        String[] strArr;
        String str = Build.TAGS;
        if (str == null || str.length() == 0) {
            strArr = f7085b;
        } else if (str.indexOf(44) == -1) {
            strArr = new String[]{str};
        } else {
            strArr = f7084a.split(str);
        }
        List asList = Arrays.asList(strArr);
        return asList.contains("dev-keys") || asList.contains("test-keys");
    }

    @SuppressLint({"NewApi"})
    public static boolean b(Context context) {
        return Build.VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() == 0;
    }

    @TargetApi(17)
    public static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            context.getResources().getConfiguration().setLayoutDirection(Locale.US);
        }
    }

    public static int a(int i, int i2, boolean z, int i3) {
        return z ? i3 : (i - i3) - i2;
    }

    public static int b(int i, int i2, boolean z, int i3) {
        return a(i, i2, !z, i3);
    }

    public static int a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return ao.b(marginLayoutParams) + ao.a(marginLayoutParams);
    }

    public static synchronized boolean d(Context context) {
        boolean booleanValue;
        synchronized (j.class) {
            if (c == null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
                } else {
                    c = false;
                }
            }
            booleanValue = c.booleanValue();
        }
        return booleanValue;
    }
}
