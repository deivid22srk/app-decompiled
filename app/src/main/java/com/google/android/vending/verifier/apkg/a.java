package com.google.android.vending.verifier.apkg;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.android.volley.l;
import com.android.volley.s;
import com.google.android.finsky.FinskyApp;
import com.google.protobuf.nano.c;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a<T, U extends com.google.protobuf.nano.c> extends l<T> {
    public final U j;

    public a(String str, s sVar, U u) {
        super(1, str, sVar);
        this.j = u;
    }

    @Override // com.android.volley.l
    public final Map<String, String> f() {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", n());
        hashMap.put("Connection", "close");
        return hashMap;
    }

    @Override // com.android.volley.l
    public final String j() {
        return "application/x-protobuffer";
    }

    @Override // com.android.volley.l
    public final byte[] k() {
        return com.google.protobuf.nano.c.a(this.j);
    }

    public static String n() {
        FinskyApp a2 = FinskyApp.a();
        String c = c(Build.DEVICE);
        String c2 = c(Build.HARDWARE);
        String c3 = c(Build.PRODUCT);
        String c4 = c(Build.TYPE);
        String c5 = c(Build.ID);
        try {
            PackageInfo packageInfo = a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0);
            return String.format(Locale.US, "Android-Finsky/%s (versionCode=%d,sdk=%d,device=%s,hardware=%s,product=%s,build=%s:%s)", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode), Integer.valueOf(Build.VERSION.SDK_INT), c, c2, c3, c5, c4);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static String c(String str) {
        return Uri.encode(str).replace("(", "").replace(")", "");
    }
}
