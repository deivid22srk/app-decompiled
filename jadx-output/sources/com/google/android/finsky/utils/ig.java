package com.google.android.finsky.utils;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.TosActivity;
import com.google.android.finsky.api.model.DfeToc;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ig {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f4989a = Pattern.compile("version:(\\d+)");

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, String> f4990b = new HashMap();

    public static Intent a(Activity activity, String str, DfeToc dfeToc) {
        Intent intent;
        if (ik.a()) {
            Class<?> a2 = ij.a("com.google.android.finsky.activities.TvTosActivity");
            if (a2 != null) {
                intent = a(activity, str, dfeToc, a2);
            } else {
                intent = null;
            }
            if (intent != null) {
                return intent;
            }
        }
        return a(activity, str, dfeToc, TosActivity.class);
    }

    private static Intent a(Context context, String str, DfeToc dfeToc, Class<? extends Activity> cls) {
        Intent intent = new Intent(context, cls);
        Bundle bundle = new Bundle();
        bundle.putString("finsky.TosActivity.account", str);
        bundle.putParcelable("finsky.TosActivity.toc", dfeToc);
        intent.putExtras(bundle);
        return intent;
    }

    public static void a(String str, DfeToc dfeToc, Boolean bool) {
        FinskyLog.a("TOS accepted for %s", str);
        String str2 = dfeToc.f1961a.h;
        if (TextUtils.isEmpty(str2)) {
            FinskyLog.d("ackTos without any terms for %s", str);
        } else {
            FinskyApp.a().b((String) null).a(str2, bool, new ih(str, str2), new ii());
            f4990b.put(str, str2);
        }
    }

    public static int a() {
        int i;
        int i2 = -1;
        try {
            Account[] a2 = com.google.android.finsky.api.a.a(FinskyApp.a());
            int length = a2.length;
            int i3 = 0;
            while (i3 < length) {
                Matcher matcher = f4989a.matcher(new String(Base64.decode(bg.B.b(a2[i3].name).a(), 0)));
                if (matcher.find()) {
                    String group = matcher.group(1);
                    try {
                        i = Math.max(i2, Integer.parseInt(group));
                    } catch (NumberFormatException e) {
                        FinskyLog.d("Cannot convert TOS version %s to integer", group);
                    }
                    i3++;
                    i2 = i;
                }
                i = i2;
                i3++;
                i2 = i;
            }
        } catch (Throwable th) {
            FinskyLog.d("Max accepted TOS version failed with exception: %s", th);
        }
        return i2;
    }

    public static boolean a(String str, DfeToc dfeToc) {
        String str2 = dfeToc.f1961a.h;
        if (TextUtils.isEmpty(str2)) {
            FinskyLog.a("TOS is accepted (DFE)", new Object[0]);
            return false;
        }
        if (f4990b.containsKey(str) && f4990b.get(str).equals(str2)) {
            FinskyLog.a("TOS is accepted (process)", new Object[0]);
            return false;
        }
        String a2 = bg.B.b(str).a();
        if (TextUtils.isEmpty(a2) || !a2.equals(str2)) {
            FinskyLog.a("TOS is not accepted", new Object[0]);
            return true;
        }
        FinskyLog.a("TOS is accepted (pref)", new Object[0]);
        return false;
    }
}
