package com.google.android.finsky.api;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.jg;
import com.google.android.finsky.protos.qm;
import com.google.android.finsky.protos.qw;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ar;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.dd;
import com.google.android.finsky.utils.jm;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.av;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    final Context f1955a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.finsky.dpkg.d f1956b;
    public final com.android.volley.apkg.a c;
    public final com.android.volley.a d;
    public final m e;
    public final com.google.android.finsky.apkg.i f;
    final ar g;
    final String h;
    com.google.android.gms.ads.bpkg.a i;
    public f j;
    private final Map<String, String> k = new HashMap();
    private String l;
    private w m;

    public e(Context context, com.android.volley.apkg.a aVar, com.android.volley.a aVar2, com.google.android.finsky.dpkg.d dVar, m mVar, Locale locale, String str, String str2, String str3, int i, String str4, com.google.android.gms.ads.bpkg.a aVar3, com.google.android.finsky.apkg.i iVar, String str5, String str6, ar arVar, String str7) {
        if (com.google.android.finsky.api.d.p.b().longValue() == 0) {
            FinskyLog.c("Unexpected android-id = 0", new Object[0]);
        }
        this.f1955a = context;
        this.c = aVar;
        this.d = aVar2;
        this.e = mVar;
        this.f1956b = dVar;
        this.i = aVar3;
        this.h = str7;
        this.k.put("X-DFE-Device-Id", str5);
        this.k.put("Accept-Language", locale.getLanguage() + "-" + locale.getCountry());
        if (!TextUtils.isEmpty(str)) {
            this.k.put("X-DFE-MCCMNC", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.k.put("X-DFE-Client-Id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            this.k.put("X-DFE-Logging-Id", str3);
        }
        this.k.put("User-Agent", str6);
        a(i, str4);
        this.f = iVar;
        this.m = new v(this.f1955a);
        if (com.google.android.finsky.cpkg.d.eS.b().booleanValue() && (this.f1956b == null || !this.f1956b.a(12603109L))) {
            this.g = arVar;
        } else {
            this.g = null;
        }
        String uri = b.f1951a.toString();
        String a2 = com.google.android.volley.l.a(this.f1955a, uri);
        if (a2 == null) {
            throw new RuntimeException("BASE_URI blocked by UrlRules: " + uri);
        }
        jm.c(a2);
    }

    public final void a(int i, String str) {
        if (!FinskyApp.a().e().a(12602392L) || !bg.e.a().booleanValue()) {
            this.k.put("X-DFE-Filter-Level", String.valueOf(i));
        }
        if (FinskyApp.a().e().a(12602392L)) {
            this.k.put("X-DFE-Content-Filters", str);
        }
    }

    public static String a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return a(packageInfo.versionName, packageInfo.versionCode, Build.VERSION.SDK_INT, Build.DEVICE, Build.HARDWARE, Build.PRODUCT, Build.VERSION.RELEASE, Build.MODEL, Build.ID, context.getResources().getBoolean(R.bool.use_wide_layout));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Can't find our own package", e);
        }
    }

    public static String a(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        return String.format(Locale.US, "Android-Finsky/%s (api=%s,versionCode=%d,sdk=%d,device=%s,hardware=%s,product=%s,platformVersionRelease=%s,model=%s,buildId=%s,isWideScreen=%d)", str, "3", Integer.valueOf(i), Integer.valueOf(i2), a(str2), a(str3), a(str4), a(str5), a(str6), a(str7), Integer.valueOf(z ? 1 : 0));
    }

    public static String b(Context context) {
        try {
            return String.format(Locale.US, "Android-Finsky/%s", context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Can't find our own package", e);
        }
    }

    public static String a(String str) {
        return Uri.encode(str).replace("(", "").replace(")", "");
    }

    public final Account a() {
        if (this.c == null) {
            return null;
        }
        return this.c.f1196a;
    }

    public final String b() {
        Account a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.name;
    }

    public static qm c() {
        jg a2 = dd.a(FinskyApp.a().g().b());
        if (a2 == null) {
            return null;
        }
        qm qmVar = new qm();
        qmVar.f4299a = a2;
        return qmVar;
    }

    public final void d() {
        if (this.l != null) {
            if (this.c != null) {
                this.c.a(this.l);
            }
            this.l = null;
        }
    }

    public final synchronized void a(String str, String str2) {
        this.k.put(str, str2);
    }

    public final synchronized Map<String, String> e() {
        HashMap hashMap;
        hashMap = new HashMap();
        hashMap.putAll(this.k);
        if (this.f1956b != null) {
            if (this.f1956b.b()) {
                hashMap.put("X-DFE-Supported-Targets", this.f1956b.d());
            }
            if (this.f1956b.c()) {
                hashMap.put("X-DFE-Other-Targets", this.f1956b.e());
            }
        }
        String a2 = bg.aF.b(b()).a();
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("X-DFE-Cookie", a2);
        }
        if (this.c != null) {
            this.l = this.c.a();
            com.google.android.finsky.auth.g.a(hashMap, this.l, this.c.f1197b);
        }
        return hashMap;
    }

    public final synchronized String b(String str) {
        return this.k.get(str);
    }

    public final String f() {
        if (d.P.b().booleanValue() && com.google.android.gms.common.c.a(this.f1955a) == 0) {
            try {
                Context context = this.f1955a;
                av.c("Calling this from your main thread can lead to deadlock.");
                return com.google.android.gms.apkg.a.a(context, com.google.android.gms.apkg.a.a(context));
            } catch (GooglePlayServicesNotAvailableException e) {
                FinskyLog.d("Unable to fetch token, GooglePlayServicesNotAvailableException: %s", e.getMessage());
                return null;
            } catch (GooglePlayServicesRepairableException e2) {
                FinskyLog.d("Unable to fetch token, GooglePlayServicesRepairableException: %s", e2.getMessage());
                return null;
            } catch (IOException e3) {
                FinskyLog.d("Unable to fetch token, IOException: %s", e3.getMessage());
            }
        }
        return null;
    }

    public static void a(qw qwVar, Map<String, String> map) {
        if (qwVar.f4316a != null) {
            for (int i = 0; i < qwVar.f4316a.length; i++) {
                map.put(qwVar.f4316a[i].f4317a, qwVar.f4316a[i].c);
            }
        }
    }

    public final NetworkInfo g() {
        return this.m.a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[DfeApiContext headers={");
        boolean z = true;
        for (String str : this.k.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str).append(": ").append(this.k.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }
}
