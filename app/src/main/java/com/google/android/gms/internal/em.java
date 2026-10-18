package com.google.android.gms.internal;

import java.util.Map;

@gw
/* loaded from: classes.dex */
public final class em implements ea {
    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        com.google.android.gms.ads.internal.d.l();
        if (map.containsKey("abort")) {
            if (ek.a(imVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.b.e("Precache abort but no preload task running.");
            return;
        }
        String str = map.get("src");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.b.e("Precache video action is missing the src parameter.");
            return;
        }
        try {
            Integer.parseInt(map.get("player"));
        } catch (NumberFormatException e) {
        }
        if (map.containsKey("mimetype")) {
            map.get("mimetype");
        }
        if (ek.b(imVar) != null) {
            com.google.android.gms.ads.internal.util.client.b.e("Precache task already running.");
        } else {
            com.google.android.gms.common.internal.e.a(imVar.e());
            new ei(imVar, imVar.e().f5282a.a(), str).b();
        }
    }
}
