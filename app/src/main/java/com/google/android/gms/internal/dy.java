package com.google.android.gms.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class dy implements ea {
    dy() {
    }

    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        String str = map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.b.e("URL missing from httpTrack GMSG.");
        } else {
            new Cif(imVar.getContext(), imVar.l().f5352b, str).b();
        }
    }
}
