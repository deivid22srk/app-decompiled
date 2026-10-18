package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class dv implements ea {
    dv() {
    }

    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        Uri uri;
        au k;
        String str = map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.b.e("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            k = imVar.k();
        } catch (zzap e) {
            com.google.android.gms.ads.internal.util.client.b.e("Unable to append parameter to URL: " + str);
        }
        if (k != null && k.b(parse)) {
            uri = k.a(parse, imVar.getContext());
            new Cif(imVar.getContext(), imVar.l().f5352b, uri.toString()).b();
        }
        uri = parse;
        new Cif(imVar.getContext(), imVar.l().f5352b, uri.toString()).b();
    }
}
