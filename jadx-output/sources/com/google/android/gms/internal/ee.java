package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@gw
/* loaded from: classes.dex */
public final class ee implements ea {

    /* renamed from: a, reason: collision with root package name */
    private final eb f5952a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.b f5953b;
    private final fp c;

    public ee(eb ebVar, com.google.android.gms.ads.internal.b bVar, fp fpVar) {
        this.f5952a = ebVar;
        this.f5953b = bVar;
        this.c = fpVar;
    }

    private void a(boolean z) {
        if (this.c != null) {
            this.c.a(z);
        }
    }

    private static boolean a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int b(Map<String, String> map) {
        String str = map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return com.google.android.gms.ads.internal.d.e().b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return com.google.android.gms.ads.internal.d.e().a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return com.google.android.gms.ads.internal.d.e().c();
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        String str;
        String str2 = map.get("a");
        if (str2 == null) {
            com.google.android.gms.ads.internal.util.client.b.e("Action missing from an open GMSG.");
            return;
        }
        if (this.f5953b != null && !this.f5953b.a()) {
            map.get("u");
            com.google.android.gms.ads.internal.util.client.b.a("Action was blocked because no click was detected.");
            return;
        }
        in i = imVar.i();
        if ("expand".equalsIgnoreCase(str2)) {
            if (imVar.m()) {
                com.google.android.gms.ads.internal.util.client.b.e("Cannot expand WebView that is already expanded.");
                return;
            } else {
                a(false);
                i.a(a(map), b(map));
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            String str3 = map.get("u");
            a(false);
            if (str3 != null) {
                i.a(a(map), b(map), str3);
                return;
            } else {
                i.a(a(map), b(map), map.get("html"), map.get("baseurl"));
                return;
            }
        }
        if ("in_app_purchase".equalsIgnoreCase(str2)) {
            map.get("product_id");
            String str4 = map.get("report_urls");
            if (this.f5952a != null) {
                if (str4 == null || str4.isEmpty()) {
                    new ArrayList();
                    return;
                } else {
                    new ArrayList(Arrays.asList(str4.split(" ")));
                    return;
                }
            }
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase(map.get("play_store"))) {
            String str5 = map.get("u");
            if (TextUtils.isEmpty(str5)) {
                com.google.android.gms.ads.internal.util.client.b.e("Destination url cannot be empty.");
                return;
            } else {
                new ef(imVar, str5).b();
                return;
            }
        }
        if (!"app".equalsIgnoreCase(str2) || !"true".equalsIgnoreCase(map.get("system_browser"))) {
            a(true);
            String str6 = map.get("u");
            if (TextUtils.isEmpty(str6)) {
                str = str6;
            } else {
                com.google.android.gms.ads.internal.d.c();
                str = hk.a(imVar.getContext(), imVar.k(), str6);
            }
            i.a(new AdLauncherIntentInfoParcel(map.get("i"), str, map.get("m"), map.get("p"), map.get("c"), map.get("f"), map.get("e")));
            return;
        }
        Context context = imVar.getContext();
        if (TextUtils.isEmpty(map.get("u"))) {
            com.google.android.gms.ads.internal.util.client.b.e("Destination url cannot be empty.");
            return;
        }
        new eg();
        Intent a2 = eg.a(context, map);
        try {
            com.google.android.gms.ads.internal.d.c();
            hk.a(context, a2);
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.b.e(e.getMessage());
        }
    }
}
