package com.google.android.finsky.billing.bpkg;

import com.android.volley.ServerError;
import com.android.volley.apkg.af;
import com.android.volley.k;
import com.android.volley.r;
import com.google.android.finsky.cpkg.d;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends af {
    public final String j;
    public final String k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(java.lang.String r7, com.android.volley.t<java.lang.String> r8, com.android.volley.s r9) {
        /*
            r6 = this;
            r1 = 1
            com.google.android.play.utils.bpkg.a<java.lang.String> r0 = com.google.android.finsky.cpkg.d.C
            java.lang.Object r0 = r0.b()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "?s7e=cvv"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.finsky.utils.jm.c(r0)
            r6.<init>(r1, r0, r8, r9)
            com.android.volley.e r0 = new com.android.volley.e
            r1 = 10000(0x2710, float:1.4013E-41)
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            r6.g = r0
            java.util.Random r1 = new java.util.Random
            long r2 = java.lang.System.currentTimeMillis()
            com.google.android.play.utils.bpkg.a<java.lang.Long> r0 = com.google.android.finsky.api.d.p
            java.lang.Object r0 = r0.b()
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            long r2 = r2 ^ r4
            r1.<init>(r2)
            int r0 = r1.nextInt()
            r0 = r0 & (-2)
            int r0 = java.lang.Math.abs(r0)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r6.k = r0
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L61
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "CVC cannot be NULL."
            r0.<init>(r1)
            throw r0
        L61:
            r6.j = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.bpkg.b.<init>(java.lang.String, com.android.volley.t, com.android.volley.s):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.apkg.af, com.android.volley.l
    public final r<String> a(k kVar) {
        if (kVar.f1244b.length != 0) {
            return super.a(kVar);
        }
        if (d.T.b().booleanValue()) {
            FinskyLog.c("Empty escrow handle for cvc %s", this.j);
        }
        FinskyLog.e("Null response for Escrow string with id %s", this.k);
        return r.a(new ServerError(kVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final Map<String, String> i() {
        HashMap hashMap = new HashMap();
        hashMap.put("gid", this.k);
        hashMap.put("cvv", this.j);
        return hashMap;
    }
}
