package com.google.android.vending.verifier.apkg;

import com.android.volley.VolleyError;
import com.android.volley.k;
import com.android.volley.r;
import com.android.volley.s;
import com.android.volley.t;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes.dex */
public final class g extends b<h, com.google.android.vending.verifier.bpkg.b> {
    public g(String str, t<h> tVar, s sVar, com.google.android.vending.verifier.bpkg.b bVar) {
        super(str, tVar, sVar, bVar);
        this.g = new com.android.volley.e(com.google.android.finsky.cpkg.d.cs.b().intValue(), com.google.android.finsky.cpkg.d.ct.b().intValue(), com.google.android.finsky.cpkg.d.cu.b().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final r<h> a(k kVar) {
        try {
            byte[] bArr = kVar.f1244b;
            return r.a(h.a((com.google.android.vending.verifier.bpkg.k) com.google.protobuf.nano.c.a(new com.google.android.vending.verifier.bpkg.k(), bArr, bArr.length)), null);
        } catch (InvalidProtocolBufferNanoException e) {
            return r.a(new VolleyError(e));
        }
    }
}
