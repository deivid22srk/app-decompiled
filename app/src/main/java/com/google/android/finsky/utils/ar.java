package com.google.android.finsky.utils;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private static ar f4746a = null;

    /* renamed from: b, reason: collision with root package name */
    private final DevicePolicyManager f4747b;
    private final ContentResolver c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;

    public static synchronized ar a(Context context) {
        ar arVar;
        synchronized (ar.class) {
            if (f4746a == null) {
                f4746a = new ar(context);
            }
            arVar = f4746a;
        }
        return arVar;
    }

    private ar(Context context) {
        this.f4747b = (DevicePolicyManager) context.getSystemService("device_policy");
        this.c = context.getContentResolver();
    }

    public final boolean a(Account account) {
        if (!com.google.android.finsky.cpkg.d.eT.b().booleanValue()) {
            return false;
        }
        if (account != null && account.type.equals("com.google.work")) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        a();
        return this.e || this.f;
    }

    @TargetApi(21)
    private synchronized void a() {
        if (!this.d) {
            List<ComponentName> activeAdmins = this.f4747b == null ? null : this.f4747b.getActiveAdmins();
            if (activeAdmins != null) {
                Iterator<ComponentName> it = activeAdmins.iterator();
                while (it.hasNext()) {
                    String packageName = it.next().getPackageName();
                    this.e |= this.f4747b.isDeviceOwnerApp(packageName);
                    this.f = this.f4747b.isProfileOwnerApp(packageName) | this.f;
                }
            }
            this.d = this.f || Settings.Global.getInt(this.c, "device_provisioned", 0) != 0;
        }
    }

    public static boolean a(List<Account> list) {
        for (int i = 0; i < list.size(); i++) {
            Account account = list.get(i);
            if (account != null && account.name != null && "com.google.work".equals(account.type) && account.name.endsWith("@android-for-work.gserviceaccount.com")) {
                return true;
            }
        }
        return false;
    }
}
