package com.google.android.finsky.b;

import android.annotation.TargetApi;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.finsky.receivers.PackageMonitorReceiver;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cz;
import com.google.android.finsky.utils.hy;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class w implements x, com.google.android.finsky.receivers.aq {

    /* renamed from: a, reason: collision with root package name */
    private static final y f2135a = new y(null, null, false, false, false, false, -1, false);

    /* renamed from: b, reason: collision with root package name */
    private final PackageManager f2136b;
    private final Map<String, y> c = new HashMap();
    private final DevicePolicyManager d;

    private static String[] a(PackageInfo packageInfo) {
        int length = packageInfo.signatures.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = hy.a(packageInfo.signatures[i].toByteArray());
        }
        return strArr;
    }

    public w(PackageManager packageManager, PackageMonitorReceiver packageMonitorReceiver, DevicePolicyManager devicePolicyManager) {
        this.f2136b = packageManager;
        this.d = devicePolicyManager;
        if (packageMonitorReceiver != null) {
            packageMonitorReceiver.a(this);
        }
    }

    @Override // com.google.android.finsky.b.x
    public final synchronized y a(String str) {
        y yVar;
        yVar = this.c.get(str);
        if (yVar == null) {
            yVar = b(str, false);
        }
        if (yVar == f2135a) {
            yVar = null;
        }
        return yVar;
    }

    @Override // com.google.android.finsky.b.x
    public final Collection<y> a() {
        jm.b();
        List<PackageInfo> installedPackages = this.f2136b.getInstalledPackages(64);
        ArrayList a2 = cz.a(installedPackages.size());
        Iterator<PackageInfo> it = installedPackages.iterator();
        while (it.hasNext()) {
            y b2 = b(it.next());
            if (b2 != f2135a) {
                a2.add(b2);
            }
        }
        return a2;
    }

    @Override // com.google.android.finsky.b.x
    public final synchronized void e(String str) {
        this.c.remove(str);
    }

    @Override // com.google.android.finsky.b.x
    @TargetApi(21)
    public final boolean f(String str) {
        return ik.a() ? this.f2136b.getLeanbackLaunchIntentForPackage(str) != null : this.f2136b.getLaunchIntentForPackage(str) != null;
    }

    @Override // com.google.android.finsky.b.x
    public final String g(String str) {
        try {
            return this.f2136b.getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @Override // com.google.android.finsky.b.x
    public final int h(String str) {
        try {
            return this.f2136b.getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    private y b(PackageInfo packageInfo) {
        boolean z;
        boolean z2;
        try {
            int i = packageInfo.versionCode;
            boolean z3 = (packageInfo.applicationInfo.flags & 1) != 0;
            boolean z4 = (packageInfo.applicationInfo.flags & 128) != 0;
            int applicationEnabledSetting = this.f2136b.getApplicationEnabledSetting(packageInfo.packageName);
            if (applicationEnabledSetting == 0) {
                z2 = !packageInfo.applicationInfo.enabled;
                z = false;
            } else {
                z = applicationEnabledSetting == 3 || applicationEnabledSetting == 4;
                z2 = z || applicationEnabledSetting == 2;
            }
            return new y(packageInfo.packageName, a(packageInfo), z3, z4, z2, z, i, i(packageInfo.packageName));
        } catch (IllegalArgumentException e) {
            FinskyLog.c("Package %s not installed", packageInfo.packageName);
            return f2135a;
        }
    }

    private boolean i(String str) {
        List<ComponentName> activeAdmins = this.d.getActiveAdmins();
        if (activeAdmins == null) {
            return false;
        }
        Iterator<ComponentName> it = activeAdmins.iterator();
        while (it.hasNext()) {
            if (it.next().getPackageName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private y b(String str, boolean z) {
        if (z) {
            this.c.put(str, f2135a);
            return f2135a;
        }
        try {
            y b2 = b(this.f2136b.getPackageInfo(str, 64));
            this.c.put(str, b2);
            return b2;
        } catch (PackageManager.NameNotFoundException e) {
            this.c.put(str, f2135a);
            return f2135a;
        }
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void b(String str) {
        b(str, false);
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String str, boolean z) {
        b(str, !z);
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void c(String str) {
        b(str, false);
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String[] strArr) {
        for (String str : strArr) {
            b(str, false);
        }
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void d(String str) {
    }
}
