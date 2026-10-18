package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzd;
import java.util.Map;

/* loaded from: classes.dex */
final class dw implements ea {
    dw() {
    }

    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        zzd f = imVar.f();
        if (f != null) {
            f.a();
            return;
        }
        zzd g = imVar.g();
        if (g != null) {
            g.a();
        } else {
            com.google.android.gms.ads.internal.util.client.b.e("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
