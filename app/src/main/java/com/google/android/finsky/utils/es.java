package com.google.android.finsky.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.WindowManager;
import com.google.android.finsky.FinskyApp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class es extends am {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.finsky.protos.gk f4859a;

    @Override // com.google.android.finsky.utils.am
    public final String b() {
        return bg.o.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.utils.am
    public final void a(String str) {
        bg.o.a((com.google.android.finsky.cpkg.o<String>) str);
    }

    @Override // com.google.android.finsky.utils.am
    public final void c() {
        bg.o.c();
    }

    @Override // com.google.android.finsky.utils.am
    public final synchronized com.google.android.finsky.protos.gk d() {
        if (this.f4859a == null) {
            this.f4859a = new com.google.android.finsky.protos.gk();
            FinskyApp a2 = FinskyApp.a();
            ActivityManager activityManager = (ActivityManager) a2.getSystemService("activity");
            ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
            Pair<Integer, Integer> b2 = ik.b(a2);
            WindowManager windowManager = (WindowManager) a2.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f4859a.f3868a = b(deviceConfigurationInfo.reqTouchScreen);
            this.f4859a.f3869b = true;
            this.f4859a.c = a(deviceConfigurationInfo.reqKeyboardType);
            this.f4859a.d = true;
            this.f4859a.e = c(deviceConfigurationInfo.reqNavigation);
            this.f4859a.f = true;
            this.f4859a.s = deviceConfigurationInfo.reqGlEsVersion;
            this.f4859a.t = true;
            this.f4859a.o = ((Integer) b2.first).intValue();
            this.f4859a.p = true;
            this.f4859a.q = ((Integer) b2.second).intValue();
            this.f4859a.r = true;
            this.f4859a.m = displayMetrics.densityDpi;
            this.f4859a.n = true;
            this.f4859a.i = (deviceConfigurationInfo.reqInputFeatures & 1) > 0;
            this.f4859a.j = true;
            this.f4859a.k = (deviceConfigurationInfo.reqInputFeatures & 2) > 0;
            this.f4859a.l = true;
            Configuration configuration = a2.getResources().getConfiguration();
            this.f4859a.g = d(configuration.screenLayout);
            this.f4859a.h = true;
            if (Build.VERSION.SDK_INT >= 13) {
                com.google.android.finsky.protos.gk gkVar = this.f4859a;
                gkVar.B = configuration.smallestScreenWidthDp;
                gkVar.C = true;
            }
            this.f4859a.u = a2.getPackageManager().getSystemSharedLibraryNames();
            this.f4859a.x = FinskyApp.a().getAssets().getLocales();
            List<String> a3 = new cm().a();
            this.f4859a.y = (String[]) a3.toArray(new String[a3.size()]);
            if (Build.VERSION.SDK_INT >= 19) {
                this.f4859a.D = activityManager.isLowRamDevice();
                this.f4859a.E = true;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                this.f4859a.F = memoryInfo.totalMem;
                this.f4859a.G = true;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                this.f4859a.H = Runtime.getRuntime().availableProcessors();
                this.f4859a.I = true;
            }
            a(a2, this.f4859a);
        }
        return this.f4859a;
    }

    private static void a(Context context, com.google.android.finsky.protos.gk gkVar) {
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        if (systemAvailableFeatures != null) {
            ArrayList arrayList = new ArrayList();
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if (featureInfo.name != null) {
                    arrayList.add(featureInfo.name);
                }
            }
            gkVar.v = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            gkVar.w = Build.SUPPORTED_ABIS;
        } else if (Build.CPU_ABI2.equals("unknown")) {
            gkVar.w = new String[]{Build.CPU_ABI};
        } else {
            gkVar.w = new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        }
    }

    @Override // com.google.android.finsky.utils.am
    public final com.google.android.finsky.protos.fq e() {
        TelephonyManager telephonyManager = (TelephonyManager) FinskyApp.a().getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        if (telephonyManager.getSimState() == 1) {
            return new com.google.android.finsky.protos.fq();
        }
        if (telephonyManager.getSimState() != 5) {
            return null;
        }
        com.google.android.finsky.protos.fq fqVar = new com.google.android.finsky.protos.fq();
        com.google.android.finsky.protos.jo joVar = new com.google.android.finsky.protos.jo();
        fqVar.f3838a = joVar;
        try {
            String subscriberId = telephonyManager.getSubscriberId();
            if (!TextUtils.isEmpty(subscriberId)) {
                try {
                    joVar.f4001a = (Long.parseLong(subscriberId) / 100000) * 100000;
                    joVar.f4002b = true;
                } catch (NumberFormatException e) {
                    FinskyLog.c("Cannot convert subscriber id to long: %s", FinskyLog.a(subscriberId));
                }
            }
        } catch (SecurityException e2) {
        }
        try {
            String simOperatorName = telephonyManager.getSimOperatorName();
            if (!TextUtils.isEmpty(simOperatorName)) {
                joVar.d = true;
                joVar.c = simOperatorName;
            }
        } catch (SecurityException e3) {
        }
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                String groupIdLevel1 = telephonyManager.getGroupIdLevel1();
                if (!TextUtils.isEmpty(groupIdLevel1)) {
                    joVar.e = groupIdLevel1;
                    joVar.f = true;
                }
            }
        } catch (SecurityException e4) {
        }
        return fqVar;
    }
}
