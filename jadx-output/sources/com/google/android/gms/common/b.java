package com.google.android.gms.common;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5588a = c.f5600a;

    /* renamed from: b, reason: collision with root package name */
    private static final b f5589b = new b();

    b() {
    }

    public static int a(Context context) {
        int a2 = c.a(context);
        if (c.b(context, a2)) {
            return 18;
        }
        return a2;
    }

    public static Dialog a(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(activity.getResources().getString(com.google.android.gms.b.common_google_play_services_updating_text, c.f(activity)));
        builder.setTitle(com.google.android.gms.b.common_google_play_services_updating_title);
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        c.a(activity, onCancelListener, "GooglePlayServicesUpdatingDialog", create);
        return create;
    }

    public static Intent a(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                return com.google.android.gms.common.internal.ac.a("com.google.android.gms", b(context, str));
            case 3:
                return com.google.android.gms.common.internal.ac.a("com.google.android.gms");
            case 42:
                return com.google.android.gms.common.internal.ac.a();
            default:
                return null;
        }
    }

    public static b a() {
        return f5589b;
    }

    public static boolean a(int i) {
        return c.a(i);
    }

    public static boolean a(Context context, int i) {
        return c.b(context, i);
    }

    public static boolean a(Context context, String str) {
        return c.a(context, str);
    }

    private static String b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f5588a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return sb.toString();
    }

    public static void b(Context context) {
        c.b(context);
    }

    public static void c(Context context) {
        c.c(context);
    }

    public static int d(Context context) {
        return c.g(context);
    }
}
