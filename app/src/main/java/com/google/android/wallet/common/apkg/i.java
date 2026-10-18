package com.google.android.wallet.common.apkg;

import com.android.volley.apkg.x;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends x {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(int r7, java.lang.String r8, com.android.volley.t<org.json.JSONObject> r9, com.android.volley.s r10) {
        /*
            r6 = this;
            r3 = 0
            r1 = 0
            android.net.Uri r0 = com.google.android.wallet.common.apkg.h.a(r7, r3)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.appendPath(r8)
            java.lang.String r2 = r0.toString()
            r0 = r6
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.common.apkg.i.<init>(int, java.lang.String, com.android.volley.t, com.android.volley.s):void");
    }

    @Override // com.android.volley.l
    public final com.android.volley.n l() {
        return com.android.volley.n.HIGH;
    }

    @Override // com.android.volley.l
    public final Map<String, String> f() {
        return Collections.singletonMap("User-Agent", com.google.android.wallet.common.c.a.f7268a);
    }
}
