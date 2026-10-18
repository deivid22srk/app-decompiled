package com.google.android.finsky.activities;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class dj {

    /* renamed from: a, reason: collision with root package name */
    private static PendingIntent f1684a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f1685b = null;

    public static void a(Context context, String str) {
        if (!com.google.android.finsky.cpkg.d.i.b().booleanValue()) {
            FinskyLog.a("Skipping fetching recovery intent -- gaia recovery disabled", new Object[0]);
            return;
        }
        if (f1684a != null) {
            if (!TextUtils.equals(f1685b, str)) {
                f1685b = null;
                f1684a = null;
            } else {
                return;
            }
        }
        f1685b = str;
        if (str == null) {
            FinskyLog.a("Skipping fetching recovery intent -- no user set.", new Object[0]);
        } else {
            new dk().execute(context);
        }
    }

    public static void a(Resources resources, android.support.v4.app.aa aaVar, String str) {
        if (a()) {
            String string = resources.getString(R.string.gaia_recovery_dialog_text, resources.getString(R.string.continue_text));
            gn gnVar = new gn();
            gnVar.a(string).d(R.string.continue_text).a(false).a(307, null, 247, 248, null).a(null, 37, null);
            gnVar.b().a(aaVar, str);
        }
    }

    public static boolean a() {
        return d() != null;
    }

    public static void b() {
        PendingIntent d = d();
        try {
        } catch (PendingIntent.CanceledException e) {
            FinskyLog.a(e, "PendingIntent for GAIA auth was canceled", new Object[0]);
        } finally {
            f1684a = null;
        }
        if (d == null) {
            FinskyLog.e("Called Gaia recovery flow but PendingIntent didn't exist.", new Object[0]);
        } else {
            d.send();
        }
    }

    private static PendingIntent d() {
        if (TextUtils.equals(FinskyApp.a().j(), f1685b)) {
            return f1684a;
        }
        return null;
    }
}
