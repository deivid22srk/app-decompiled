package com.google.android.finsky.api;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.ic;
import com.google.android.finsky.utils.jm;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String[] f1947a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f1948b = jm.g("finsky.sw_account_type");

    public static synchronized String[] a() {
        String[] strArr;
        synchronized (a.class) {
            if (f1947a == null) {
                if (ic.b(FinskyApp.a())) {
                    f1947a = new String[]{f1948b, "cn.google", "com.google"};
                } else {
                    String[] d = jm.d(com.google.android.finsky.c.d.dY.b());
                    int length = d.length;
                    String[] strArr2 = new String[length + 1];
                    f1947a = strArr2;
                    strArr2[0] = "com.google";
                    System.arraycopy(d, 0, f1947a, 1, length);
                }
            }
            strArr = f1947a;
        }
        return strArr;
    }

    public static Account[] a(Context context) {
        int i;
        int i2;
        Account account;
        boolean z;
        int i3 = 0;
        Account[] accounts = AccountManager.get(context).getAccounts();
        String[] a2 = a();
        boolean b2 = ic.b(FinskyApp.a());
        int length = accounts.length;
        for (0; i < accounts.length; i + 1) {
            int length2 = a2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    z = false;
                    break;
                }
                if (accounts[i].type.equals(a2[i4])) {
                    z = true;
                    break;
                }
                i4++;
            }
            if (z) {
                Account account2 = accounts[i];
                i = (!b2 || "cn.google".equals(account2.type) || f1948b.equals(account2.type)) ? true : account2.name.toLowerCase(Locale.ENGLISH).endsWith("@google.com") ? i + 1 : 0;
            }
            accounts[i] = null;
            length--;
        }
        if (length > 1) {
            for (int i5 = 0; i5 < accounts.length; i5++) {
                Account account3 = accounts[i5];
                if (account3 != null && account3.type.equals("com.google.work")) {
                    int i6 = length;
                    for (int i7 = 0; i7 < accounts.length; i7++) {
                        if (i5 != i7 && (account = accounts[i7]) != null && account3.name.equalsIgnoreCase(account.name)) {
                            accounts[i7] = null;
                            i6--;
                        }
                    }
                    length = i6;
                }
            }
        }
        if (length == accounts.length) {
            return accounts;
        }
        if (length == 0) {
            return new Account[0];
        }
        Account[] accountArr = new Account[length];
        int length3 = accounts.length;
        int i8 = 0;
        while (i8 < length3) {
            Account account4 = accounts[i8];
            if (account4 != null) {
                i2 = i3 + 1;
                accountArr[i3] = account4;
            } else {
                i2 = i3;
            }
            i8++;
            i3 = i2;
        }
        return accountArr;
    }

    public static void a(Account account, com.google.android.finsky.c.o<String> oVar) {
        if (account != null) {
            if (!ic.b(FinskyApp.a()) || "cn.google".equals(account.type) || f1948b.equals(account.type)) {
                oVar.a((com.google.android.finsky.c.o<String>) account.name);
            }
        }
    }

    public static Account b(Context context) {
        Account[] a2 = a(context);
        if (a2.length > 0) {
            return a2[0];
        }
        return null;
    }

    public static Account a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Account account : a(context)) {
            if (account.name.equalsIgnoreCase(str)) {
                return account;
            }
        }
        return null;
    }

    public static boolean b(String str, Context context) {
        return a(str, context) != null;
    }

    public static Account a(Context context, com.google.android.finsky.c.o<String> oVar) {
        Account a2 = a(oVar.a(), context);
        if (a2 == null) {
            Account b2 = b(context);
            a(b2, oVar);
            return b2;
        }
        return a2;
    }

    public static boolean c(Context context) {
        return AccountManager.get(context).getAccountsByType("com.google.work").length > 0;
    }
}
