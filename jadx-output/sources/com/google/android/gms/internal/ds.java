package com.google.android.gms.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class ds implements ea {
    ds() {
    }

    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        if (((Boolean) com.google.android.gms.ads.internal.d.j().a(com.google.android.gms.ads.internal.a.f.at)).booleanValue()) {
            imVar.c(!Boolean.parseBoolean(map.get("disabled")));
        }
    }
}
