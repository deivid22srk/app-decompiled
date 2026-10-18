package com.google.android.finsky.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.os.Build;
import android.os.PersistableBundle;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public class hi {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f4960a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f4961b = null;
    private static boolean c = false;

    public static void a() {
        c = true;
    }

    @TargetApi(21)
    public static Intent a(Activity activity) {
        if (c) {
            return null;
        }
        Intent createLocalApprovalIntent = ((RestrictionsManager) activity.getSystemService("restrictions")).createLocalApprovalIntent();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("android.request.mesg", activity.getString(R.string.restriction_pin_enter_admin_pin));
        createLocalApprovalIntent.putExtra("android.content.extra.REQUEST_BUNDLE", persistableBundle);
        return createLocalApprovalIntent;
    }

    public static synchronized void a(hj hjVar) {
        synchronized (hi.class) {
            if (f4961b == null) {
                if (FinskyApp.a().w.f5029a.b() || com.google.android.finsky.c.d.h.b().booleanValue()) {
                    f4961b = true;
                } else if (Build.VERSION.SDK_INT >= 18 && c()) {
                    b(hjVar);
                } else {
                    f4961b = false;
                }
            }
            hjVar.a(f4961b.booleanValue());
        }
    }

    @TargetApi(18)
    private static synchronized boolean c() {
        boolean booleanValue;
        synchronized (hi.class) {
            if (f4960a == null) {
                try {
                    f4960a = Boolean.valueOf(((DevicePolicyManager) FinskyApp.a().getSystemService("device_policy")).isDeviceOwnerApp(com.google.android.finsky.c.d.aW.b()));
                } catch (NoSuchMethodError e) {
                    FinskyLog.b(e, "No method named isDeviceOwnerApp exists.", new Object[0]);
                    f4960a = false;
                } catch (RuntimeException e2) {
                    FinskyLog.b(e2, "Unable to invoke isDeviceOwnerApp", new Object[0]);
                    f4960a = false;
                }
            }
            booleanValue = f4960a.booleanValue();
        }
        return booleanValue;
    }

    private static synchronized void b(hj hjVar) {
        synchronized (hi.class) {
            FinskyApp a2 = FinskyApp.a();
            hk hkVar = new hk(a2, hjVar, (byte) 0);
            Intent intent = new Intent("com.google.android.nfcprovision.IOwnedService.BIND");
            intent.setComponent(new ComponentName("com.google.android.nfcprovision", "com.google.android.nfcprovision.SchoolOwnedService"));
            if (!a2.bindService(intent, hkVar, 1)) {
                f4961b = false;
                hjVar.a(false);
            }
        }
    }
}
