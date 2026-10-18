package com.google.android.wallet.common.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f7296a = Pattern.compile("[^\\d]");

    /* renamed from: b, reason: collision with root package name */
    private static com.android.volley.apkg.n f7297b;
    private static Boolean c;

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return f7296a.matcher(str).replaceAll("");
    }

    public static boolean b(String str) {
        return str.startsWith("embedded:");
    }

    public static int c(String str) {
        return Integer.parseInt(str.substring(9));
    }

    public static boolean a(com.google.b.a.a.a.b.a.apkg.bpkg.apkg.m mVar, com.google.b.a.a.a.b.a.apkg.bpkg.apkg.m mVar2) {
        if (mVar == mVar2) {
            return true;
        }
        if (mVar == null || mVar2 == null) {
            return false;
        }
        return Arrays.equals(mVar.d, mVar2.d);
    }

    public static boolean a(com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i iVar, com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        if (iVar == null || iVar2 == null) {
            return false;
        }
        return Arrays.equals(iVar.f7576b, iVar2.f7576b);
    }

    public static boolean a(com.google.b.a.a.a.b.a.bpkg.p pVar, com.google.b.a.a.a.b.a.bpkg.p pVar2) {
        if (pVar == pVar2) {
            return true;
        }
        if (pVar == null || pVar2 == null) {
            return false;
        }
        return g.a(pVar.f7684a, pVar2.f7684a);
    }

    public static com.google.b.a.a.a.b.a.d a(Context context, byte[] bArr) {
        return b(context.getApplicationContext(), bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    @android.annotation.TargetApi(18)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.b.a.a.a.b.a.d b(android.content.Context r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.common.util.i.b(android.content.Context, byte[]):com.google.b.a.a.a.b.a.d");
    }

    @TargetApi(17)
    private static ba2.dD a(Context context, PackageInfo packageInfo, TelephonyManager telephonyManager) {
        Location lastKnownLocation;
        ba2.dD dVar = new ba2.dD();
        if (packageInfo != null) {
            ba2.f fVar = new ba2.f();
            if (!TextUtils.isEmpty(packageInfo.packageName)) {
                fVar.f882a = packageInfo.packageName;
            }
            fVar.f883b = Integer.toString(packageInfo.versionCode);
            fVar.d = packageInfo.firstInstallTime;
            fVar.c = packageInfo.lastUpdateTime;
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && !TextUtils.isEmpty(applicationInfo.sourceDir)) {
                fVar.e = applicationInfo.sourceDir;
            }
            dVar.f878a = (ba2.f[]) b.a(dVar.f878a, fVar);
        }
        if (l.a(context) && (lastKnownLocation = ((LocationManager) context.getSystemService("location")).getLastKnownLocation("network")) != null) {
            ba2.e eVar = new ba2.e();
            eVar.f881b = lastKnownLocation.getLatitude();
            eVar.c = lastKnownLocation.getLongitude();
            eVar.e = lastKnownLocation.getTime();
            eVar.f880a = lastKnownLocation.getAltitude();
            eVar.d = lastKnownLocation.getAccuracy();
            dVar.e = eVar;
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra2 > 0) {
                dVar.c = (intExtra * 100) / intExtra2;
            }
        }
        dVar.d = TimeZone.getDefault().getRawOffset();
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT < 17) {
            dVar.f = 1 == Settings.Secure.getInt(contentResolver, "adb_enabled", 0);
        } else {
            dVar.f = 1 == Settings.Global.getInt(contentResolver, "adb_enabled", 0);
        }
        if (Build.VERSION.SDK_INT < 17 || Build.VERSION.SDK_INT >= 21) {
            dVar.g = 1 == Settings.Secure.getInt(contentResolver, "install_non_market_apps", 0);
        } else {
            dVar.g = 1 == Settings.Global.getInt(contentResolver, "install_non_market_apps", 0);
        }
        Locale locale = context.getResources().getConfiguration().locale;
        dVar.h = locale.getISO3Language();
        dVar.j = locale.toString();
        ArrayList<InetAddress> a2 = f.a();
        dVar.i = new String[a2.size()];
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            dVar.i[i] = a2.get(i).getHostAddress();
        }
        if (telephonyManager != null) {
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                dVar.k = networkOperator;
            }
            String simOperator = telephonyManager.getSimOperator();
            if (!TextUtils.isEmpty(simOperator)) {
                dVar.l = simOperator;
            }
        }
        return dVar;
    }

    public static com.google.b.a.a.a.b.a.apkg.cpkg.b a(com.google.b.a.a.a.b.a.apkg.cpkg.e eVar, String str) {
        if (eVar == null) {
            return null;
        }
        int length = eVar.f7611b.length;
        for (int i = 0; i < length; i++) {
            if (g.a(str, eVar.f7611b[i].f7608a)) {
                return eVar.f7611b[i].f7609b;
            }
        }
        return eVar.f7610a;
    }

    private static String e(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            try {
                messageDigest.update(str.getBytes(Keyczar.DEFAULT_ENCODING));
                return Base64.encodeToString(messageDigest.digest(), 11);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static com.android.volley.apkg.n b(Context context) {
        return a(context, com.google.android.wallet.a.d.c.b().intValue());
    }

    private static synchronized com.android.volley.apkg.n a(Context context, int i) {
        com.android.volley.apkg.n nVar;
        synchronized (i.class) {
            if (f7297b == null) {
                f7297b = new com.android.volley.apkg.n(com.google.android.wallet.common.c.a.b(context), new c(context, i));
            }
            nVar = f7297b;
        }
        return nVar;
    }

    public static boolean d(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() != 1) {
            return str.length() == 2;
        }
        char charAt = str.charAt(0);
        return (charAt == '0' || charAt == '1') ? false : true;
    }

    public static Map<String, String> a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        int length = strArr.length;
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Header arrays must have matching names and values");
        }
        android.support.v4.h.a aVar = new android.support.v4.h.a(length / 2);
        for (int i = 0; i < length; i += 2) {
            if (TextUtils.isEmpty(strArr[i])) {
                throw new IllegalArgumentException("Header names must be non empty.");
            }
            aVar.put(strArr[i], strArr[i + 1]);
        }
        return aVar;
    }

    public static boolean a(String str, int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                int length = str.length() - 1;
                boolean z = false;
                int i2 = 0;
                while (length >= 0) {
                    int parseInt = Integer.parseInt(str.substring(length, length + 1));
                    if (z && (parseInt = parseInt * 2) > 9) {
                        parseInt -= 9;
                    }
                    i2 += parseInt;
                    length--;
                    z = !z;
                }
                if (i2 % 10 != 0) {
                    break;
                }
                break;
            default:
                Log.d("PaymentUtils", new StringBuilder(36).append("Unexpected checksum type=").append(i).toString());
                break;
        }
        return true;
    }

    public static boolean c(Context context) {
        if (c == null && context != null) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (Build.VERSION.SDK_INT >= 19) {
                c = Boolean.valueOf(activityManager.isLowRamDevice());
            } else {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                c = Boolean.valueOf(memoryInfo.lowMemory);
            }
        }
        return c == Boolean.TRUE;
    }

    public static String[] a(Context context, com.google.d.b.a.a.bpkg.b bVar) {
        if (bVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(bVar.f7739a.length);
        for (String str : bVar.f7739a) {
            if (!l.a(context, str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean a(Activity activity, String[] strArr) {
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (Build.VERSION.SDK_INT >= 23 ? activity.shouldShowRequestPermissionRationale(str) : false) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        boolean isEnabled;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (Build.VERSION.SDK_INT >= 14) {
            isEnabled = accessibilityManager.isTouchExplorationEnabled();
        } else {
            isEnabled = accessibilityManager.isEnabled();
        }
        return !isEnabled || Build.VERSION.SDK_INT >= com.google.android.wallet.a.a.f.b().intValue();
    }
}
