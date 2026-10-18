package com.google.android.finsky.billing;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.sa;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f2269a = false;

    /* renamed from: b, reason: collision with root package name */
    private static Context f2270b;
    private static String c;

    public static void a() {
        if (!f2269a) {
            f2269a = true;
            f2270b = FinskyApp.a();
            c = com.google.android.finsky.billing.carrierbilling.a.a();
            return;
        }
        throw new IllegalStateException("BillingLocator already initialized.");
    }

    public static String b() {
        return c;
    }

    public static String c() {
        String str;
        jm.a();
        if (f2270b == null) {
            throw new IllegalStateException("BillingLocator has not been initialized.");
        }
        try {
            str = ((TelephonyManager) f2270b.getSystemService("phone")).getLine1Number();
        } catch (SecurityException e) {
            FinskyLog.c("Cannot read Line 1 Number: %s", e);
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String d() {
        TelephonyManager telephonyManager = (TelephonyManager) f2270b.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        try {
            return telephonyManager.getSubscriberId();
        } catch (SecurityException e) {
            FinskyLog.c("Cannot read subscriber Id: %s", e);
            return null;
        }
    }

    public static String e() {
        TelephonyManager telephonyManager = (TelephonyManager) f2270b.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        try {
            return telephonyManager.getDeviceId();
        } catch (SecurityException e) {
            FinskyLog.c("Cannot read device Id: %s", e);
            return null;
        }
    }

    public static List<sa> f() {
        jm.a();
        ArrayList arrayList = new ArrayList();
        String a2 = l.f2271a.a();
        if (a2 == null) {
            return null;
        }
        String[] split = a2.split("\\}\\{");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            String str = split[i];
            if (str.length() == 0) {
                FinskyLog.c("Got empty billing country string.", new Object[0]);
            } else {
                if (str.charAt(0) == '{') {
                    str = str.substring(1);
                }
                if (str.charAt(str.length() - 1) == '}') {
                    str = str.substring(0, str.length() - 1);
                }
                String[] split2 = str.split(",");
                if (split2.length < 2) {
                    FinskyLog.c("Invalid country string: %s. Expected at least 2 parts, got %d.", str, Integer.valueOf(split2.length));
                } else {
                    sa saVar = new sa();
                    saVar.f4367a = split2[0];
                    saVar.f4368b = true;
                    saVar.c = split2[1];
                    saVar.d = true;
                    if (split2.length >= 3) {
                        if (!split2[2].equals("1") && !split2[2].equals("0")) {
                            FinskyLog.c("Invalid reducedBillingAddress flag: " + split2[2], new Object[0]);
                        } else {
                            saVar.e = split2[2].equals("1");
                            saVar.f = true;
                        }
                    }
                    arrayList.add(saVar);
                }
            }
        }
        return arrayList;
    }

    public static void a(sa[] saVarArr) {
        jm.a();
        StringBuilder sb = new StringBuilder();
        for (sa saVar : saVarArr) {
            sb.append('{').append(saVar.f4367a).append(',');
            sb.append(saVar.c).append(',');
            sb.append(saVar.e ? '1' : '0').append('}');
        }
        l.f2271a.a((com.google.android.finsky.cpkg.o<String>) sb.toString());
        l.f2272b.a((com.google.android.finsky.cpkg.o<Long>) Long.valueOf(System.currentTimeMillis()));
    }
}
