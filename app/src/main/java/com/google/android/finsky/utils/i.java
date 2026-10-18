package com.google.android.finsky.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
final class i extends com.android.volley.apkg.af {
    private final Context j;

    public i(Context context, String str, com.android.volley.t<String> tVar, com.android.volley.s sVar) {
        super(str, tVar, sVar);
        this.j = context;
    }

    @Override // com.android.volley.l
    public final Map<String, String> f() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("User-Agent", String.format(Locale.US, "Mozilla/5.0 (Linux; Android %s; %s Build/%s) AppleWebKit/537.36 Finsky/%s%s", com.google.android.finsky.api.e.a(Build.VERSION.RELEASE), com.google.android.finsky.api.e.a(Build.MODEL), com.google.android.finsky.api.e.a(Build.ID), com.google.android.finsky.api.e.a(this.j.getPackageManager().getPackageInfo(this.j.getPackageName(), 0).versionName), this.j.getResources().getBoolean(R.bool.use_wide_layout) ? "" : " Mobile"));
        } catch (PackageManager.NameNotFoundException e) {
            FinskyLog.e("Can't find our own package", new Object[0]);
        }
        if ("https".equalsIgnoreCase(Uri.parse(b()).getScheme())) {
            if (FinskyApp.a().e().a(12604203L)) {
                com.android.volley.apkg.a aVar = new com.android.volley.apkg.a(this.j, FinskyApp.a().i(), com.google.android.finsky.auth.g.a(FinskyApp.a().e(), 12604383L), (byte) 0);
                com.google.android.finsky.auth.g.a(hashMap, aVar.a(), aVar.f1197b);
            }
        } else {
            FinskyApp.a().h().b(new com.google.android.finsky.apkg.b(1106).f1473a);
        }
        return hashMap;
    }
}
