package com.google.android.finsky.utils;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class jn {

    /* renamed from: b, reason: collision with root package name */
    public static com.google.android.finsky.c.o<String> f5035b;
    public static com.google.android.finsky.c.o<Boolean> c;
    public static com.google.android.finsky.c.o<String> d;
    public static com.google.android.finsky.c.o<Boolean> e;
    public static com.google.android.finsky.c.o<String> f;
    public static com.google.android.finsky.c.o<Boolean> g;
    public static com.google.android.finsky.c.o<Boolean> h;
    public static com.google.android.finsky.c.o<Boolean> i;

    @Deprecated
    public static com.google.android.finsky.c.o<Boolean> j;

    @Deprecated
    public static com.google.android.finsky.c.o<Boolean> k;
    public static com.google.android.finsky.c.o<Boolean> l;
    private static com.google.android.finsky.c.e n;
    private static final String[] m = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f5034a = {"last_checkin_hash_", "last_systems_apps_hash_", "last_market_alarm_timeout_", "last_market_alarm_start_time_", "account_exists_"};

    static {
        com.google.android.finsky.c.e eVar = new com.google.android.finsky.c.e("vending_preferences");
        n = eVar;
        f5035b = eVar.a("cached_gl_extensions", (String) null);
        c = n.a("gl_driver_crashed", (Boolean) false);
        d = n.a("last_build_fingerprint", (String) null);
        e = n.a("finsky_backed_up", (Boolean) false);
        f = n.a("finsky_restored_android_id", (String) null);
        g = n.a("ads_interest_based", (Boolean) true);
        h = n.a("notify_updates", (Boolean) true);
        i = n.a("notify_updates_completion", (Boolean) true);
        j = n.a("update_over_wifi_only", (Boolean) false);
        k = n.a("auto_update_default", (Boolean) false);
        l = n.a("auto_add_shortcuts", Boolean.valueOf(Build.VERSION.SDK_INT >= 11));
    }

    public static com.google.android.finsky.c.e a() {
        return n;
    }

    public static void b() {
        n.b();
    }

    private static com.google.android.finsky.c.o<Boolean> a(String str) {
        return n.a("account_exists_" + str, (Boolean) false);
    }

    public static void a(Account[] accountArr) {
        boolean z;
        boolean z2;
        SharedPreferences a2 = n.a();
        Map<String, ?> all = a2.getAll();
        SharedPreferences.Editor edit = a2.edit();
        boolean z3 = false;
        for (String str : all.keySet()) {
            if (str.startsWith("account_exists_")) {
                String substring = str.substring(15);
                int length = accountArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else {
                        if (accountArr[i2].name.equals(substring)) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z2) {
                    edit.remove(str);
                    z = true;
                    z3 = z;
                }
            }
            z = z3;
            z3 = z;
        }
        if (z3) {
            com.google.android.finsky.c.e.a(edit);
        }
        for (Account account : accountArr) {
            if (!a(account.name).b()) {
                a(account.name).a((com.google.android.finsky.c.o<Boolean>) true);
            }
        }
    }

    public static String[] b(Account[] accountArr) {
        ArrayList arrayList = null;
        for (Account account : accountArr) {
            if (!a(account.name).b()) {
                if (arrayList == null) {
                    arrayList = cz.a(1);
                }
                arrayList.add(account.name);
            }
        }
        return arrayList == null ? m : (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
