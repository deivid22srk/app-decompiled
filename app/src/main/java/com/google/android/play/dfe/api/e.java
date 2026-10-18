package com.google.android.play.dfe.api;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.bpkg.j;
import com.google.android.volley.l;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    final com.android.volley.apkg.a f6839a;

    /* renamed from: b, reason: collision with root package name */
    final com.android.volley.a f6840b;
    private final Context c;
    private final Map<String, String> d = new HashMap();
    private String e;

    public static e a(Context context, String str, com.android.volley.a aVar, Account account) {
        com.android.volley.apkg.a aVar2 = new com.android.volley.apkg.a(context, account, j.l.b());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return new e(context, aVar2, aVar, str, packageInfo.versionName, packageInfo.versionCode, Locale.getDefault(), ((TelephonyManager) context.getSystemService("phone")).getSimOperator(), j.n.b(), j.m.b());
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Can't find our own package", e);
        }
    }

    private e(Context context, com.android.volley.apkg.a aVar, com.android.volley.a aVar2, String str, String str2, int i, Locale locale, String str3, String str4, String str5) {
        URL url;
        this.c = context;
        this.f6839a = aVar;
        this.f6840b = aVar2;
        this.d.put("X-DFE-Device-Id", Long.toHexString(j.k.b().longValue()));
        this.d.put("Accept-Language", locale.getLanguage() + "-" + locale.getCountry());
        if (!TextUtils.isEmpty(str3)) {
            this.d.put("X-DFE-MCCMNC", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            this.d.put("X-DFE-Client-Id", str4);
        }
        if (!TextUtils.isEmpty(str4)) {
            this.d.put("X-DFE-Logging-Id", str5);
        }
        this.d.put("User-Agent", String.format(Locale.US, "Android-%s/%s (api=%d,versionCode=%d,sdk=%d,device=%s,hardware=%s,product=%s)", str, str2, 4, Integer.valueOf(i), Integer.valueOf(Build.VERSION.SDK_INT), a(Build.DEVICE), a(Build.HARDWARE), a(Build.PRODUCT)));
        String uri = d.f6837a.toString();
        String a2 = l.a(this.c, uri);
        if (a2 == null) {
            throw new RuntimeException("BASE_URI blocked by UrlRules: " + uri);
        }
        try {
            url = new URL(a2);
        } catch (MalformedURLException e) {
            PlayCommonLog.b("Cannot parse URL: " + a2, new Object[0]);
        }
        if (url.getProtocol().toLowerCase().equals("https") || url.getHost().toLowerCase().endsWith("corp.google.com") || url.getHost().startsWith("192.168.0")) {
            return;
        }
        if (url.getHost().startsWith("127.0.0")) {
            if (com.google.android.play.utils.j.a()) {
                return;
            }
        }
        throw new RuntimeException("Insecure URL: " + a2);
    }

    private static String a(String str) {
        return Uri.encode(str).replace("(", "").replace(")", "");
    }

    public final void a() {
        if (this.e != null) {
            this.f6839a.a(this.e);
            this.e = null;
        }
    }

    public final synchronized Map<String, String> b() {
        HashMap hashMap;
        this.e = this.f6839a.a();
        hashMap = new HashMap();
        hashMap.putAll(this.d);
        hashMap.put("Authorization", "GoogleLogin auth=" + this.e);
        return hashMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[PlayDfeApiContext headers={");
        boolean z = true;
        for (String str : this.d.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str).append(": ").append(this.d.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }
}
