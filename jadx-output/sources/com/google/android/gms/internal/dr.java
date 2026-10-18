package com.google.android.gms.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class dr implements ea {
    dr() {
    }

    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        String str = map.get("tx");
        String str2 = map.get("ty");
        String str3 = map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            au k = imVar.k();
            if (k != null) {
                k.e.a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.b.e("Could not parse touch parameters from gmsg.");
        }
    }
}
