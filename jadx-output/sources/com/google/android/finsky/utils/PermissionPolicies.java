package com.google.android.finsky.utils;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.UserHandle;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class PermissionPolicies {

    public class PermissionPolicyService extends Service {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<String> f4714a = new ArrayList<>();

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        public static void a(Context context, String str, int i) {
            if (Build.VERSION.SDK_INT >= 23) {
                Intent intent = new Intent(context, (Class<?>) PermissionPolicyService.class);
                intent.putExtra("package_name", str);
                intent.putExtra("package_event", i);
                context.startService(intent);
            }
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i, int i2) {
            boolean z;
            boolean z2;
            String stringExtra = intent.getStringExtra("package_name");
            int intExtra = intent.getIntExtra("package_event", -1);
            if (intExtra == 1 && !TextUtils.isEmpty(stringExtra)) {
                this.f4714a.add(stringExtra);
            } else if (intExtra == 0) {
                boolean remove = this.f4714a.remove(stringExtra);
                try {
                    PackageInfo packageInfo = getPackageManager().getPackageInfo(stringExtra, 4096);
                    FinskyLog.a("post-install permissions check for %s", packageInfo.packageName);
                    String str = packageInfo.packageName;
                    String[] strArr = packageInfo.requestedPermissions;
                    int i3 = packageInfo.applicationInfo.targetSdkVersion;
                    if (Build.VERSION.SDK_INT >= 23 && !remove && ((FinskyApp.a().e().a(12605120L) || com.google.android.finsky.c.d.N.b().booleanValue()) && i3 >= 23 && FinskyApp.a().getPackageName().equals(FinskyApp.a().getPackageManager().getInstallerPackageName(str)) && strArr != null)) {
                        for (String str2 : strArr) {
                            if ("android.permission.SYSTEM_ALERT_WINDOW".equals(str2)) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    String str3 = packageInfo.packageName;
                    String[] strArr2 = packageInfo.requestedPermissions;
                    int i4 = packageInfo.applicationInfo.targetSdkVersion;
                    if (Build.VERSION.SDK_INT == 23 && remove && FinskyApp.a().e().a(12605124L) && i4 == 23 && FinskyApp.a().getPackageName().equals(FinskyApp.a().getPackageManager().getInstallerPackageName(str3)) && strArr2 != null) {
                        for (String str4 : strArr2) {
                            if ("android.permission.SYSTEM_ALERT_WINDOW".equals(str4)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z) {
                        PermissionPolicies.a(packageInfo);
                        PermissionPolicies.a(133, stringExtra, packageInfo.versionCode);
                    } else if (z2) {
                        PermissionPolicies.a(packageInfo);
                        PermissionPolicies.a(134, stringExtra, packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    FinskyLog.d("Can't find package %s", stringExtra);
                }
            }
            if (this.f4714a.isEmpty()) {
                stopSelf(i2);
                return 3;
            }
            return 3;
        }
    }

    static /* synthetic */ void a(PackageInfo packageInfo) {
        try {
            PackageManager.class.getMethod("grantRuntimePermission", String.class, String.class, UserHandle.class).invoke(FinskyApp.a().getPackageManager(), packageInfo.packageName, "android.permission.SYSTEM_ALERT_WINDOW", Process.myUserHandle());
            FinskyLog.a("Enforced system alert window policy", new Object[0]);
        } catch (IllegalAccessException e) {
            FinskyLog.c("Can't invoke grantRuntimePermission - %s", e);
        } catch (NoSuchMethodException e2) {
            FinskyLog.c("Can't find grantRuntimePermission - %s", e2);
        } catch (InvocationTargetException e3) {
            FinskyLog.c("Can't invoke grantRuntimePermission - %s", e3);
        }
    }

    static /* synthetic */ void a(int i, String str, int i2) {
        com.google.android.finsky.a.i h = FinskyApp.a().h();
        com.google.android.finsky.a.n nVar = new com.google.android.finsky.a.n();
        nVar.f1490a = i2;
        h.a(i, str, (String) null, 0, (String) null, nVar);
    }
}
