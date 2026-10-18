package com.google.android.gms.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class dz implements ea {
    dz() {
    }

    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        com.google.android.gms.ads.internal.util.client.b.c("Received log message: " + map.get("string"));
    }
}
