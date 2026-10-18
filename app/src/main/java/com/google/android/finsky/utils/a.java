package com.google.android.finsky.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.finsky.api.model.Document;
import com.google.android.gms.ads.adshield.UrlParseException;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static com.google.android.gms.ads.adshield.a f4719a;

    /* renamed from: b, reason: collision with root package name */
    private static float f4720b;

    public static void a(Context context, Document document, String str, int i, int i2) {
        if (document != null && document.aF()) {
            String aG = document.aG();
            if (TextUtils.isEmpty(aG)) {
                FinskyLog.d("Empty ad click URL for docid: %s", document.f1963a.f3890a);
                return;
            }
            if (f4720b == 0.0f) {
                f4720b = context.getResources().getDisplayMetrics().density;
            }
            a(context, new b(context, document, aG, str, Math.round(i / f4720b) + "x" + Math.round(i2 / f4720b)));
        }
    }

    public static void a(Context context, MotionEvent motionEvent) {
        if (motionEvent != null) {
            a(context, new c(motionEvent));
        }
    }

    static String a(Context context, String str, String str2, String str3) {
        if (a()) {
            try {
                Uri build = Uri.parse(str).buildUpon().appendQueryParameter("nb", str2).appendQueryParameter("dim", str3).build();
                com.google.android.gms.dynamic.a b2 = f4719a.f5256a.b(com.google.android.gms.dynamic.d.a(build), com.google.android.gms.dynamic.d.a(context));
                if (b2 == null) {
                    throw new UrlParseException();
                }
                return ((Uri) com.google.android.gms.dynamic.d.a(b2)).toString();
            } catch (RemoteException e) {
                FinskyLog.d("Error accessing AdShield: %s", e);
                return str;
            } catch (UrlParseException e2) {
                FinskyLog.d("Error parsing the ad click URL: %s", e2);
                return str;
            }
        }
        return str;
    }

    static synchronized void a(Context context) {
        synchronized (a.class) {
            jm.b();
            if (!a()) {
                String str = "";
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    FinskyLog.e("Can't find our own package", new Object[0]);
                }
                try {
                    f4719a = new com.google.android.gms.ads.adshield.a(String.format(Locale.US, "Android-Finsky/%s", str), context);
                } catch (Exception e2) {
                    FinskyLog.c("Failed to instantiate ad shield client", new Object[0]);
                }
            }
        }
    }

    static synchronized boolean a() {
        boolean z;
        synchronized (a.class) {
            z = f4719a != null;
        }
        return z;
    }

    public static void a(Context context, Runnable runnable) {
        if (a()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        new d(context, runnable).execute(new Void[0]);
    }

    public static String b(Context context) {
        try {
            List<ActivityManager.RecentTaskInfo> recentTasks = ((ActivityManager) context.getSystemService("activity")).getRecentTasks(2, 0);
            if (recentTasks.size() > 0) {
                String packageName = recentTasks.get(0).baseIntent.getComponent().getPackageName();
                if (context.getPackageName().equals(packageName) && recentTasks.size() > 1) {
                    return recentTasks.get(1).baseIntent.getComponent().getPackageName();
                }
                return packageName;
            }
        } catch (Exception e) {
            FinskyLog.a(e, "Exception while getting package.", new Object[0]);
        }
        return null;
    }
}
