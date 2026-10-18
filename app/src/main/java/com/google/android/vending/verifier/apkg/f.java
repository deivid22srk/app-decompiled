package com.google.android.vending.verifier.apkg;

import com.android.volley.VolleyError;
import com.android.volley.k;
import com.android.volley.r;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.vending.verifier.bpkg.n;
import com.google.android.vending.verifier.bpkg.o;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.UnsupportedEncodingException;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class f extends b<h[], n> {
    public f(String str, t<h[]> tVar, s sVar, n nVar) {
        super(str, tVar, sVar, nVar);
        this.g = new com.android.volley.e(com.google.android.finsky.cpkg.d.cp.b().intValue(), com.google.android.finsky.cpkg.d.cq.b().intValue(), com.google.android.finsky.cpkg.d.cr.b().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final r<h[]> a(k kVar) {
        try {
            byte[] bArr = kVar.f1244b;
            com.google.android.vending.verifier.bpkg.k[] kVarArr = ((o) com.google.protobuf.nano.c.a(new o(), bArr, bArr.length)).f7144a;
            h[] hVarArr = new h[((n) this.j).f7142a.length];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < kVarArr.length; i3++) {
                if (kVarArr[i3].g) {
                    try {
                        hVarArr[Integer.parseInt(new String(kVarArr[i3].f, Keyczar.DEFAULT_ENCODING), 16)] = h.a(kVarArr[i3]);
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    } catch (NumberFormatException e2) {
                        i2++;
                    }
                } else {
                    i++;
                }
            }
            if (i2 > 0) {
                FinskyLog.a("Got %d responses with an invalid request id", new Object[0]);
            }
            if (i > 0) {
                FinskyLog.a("Got %d responses with a blank request id", new Object[0]);
            }
            return r.a(hVarArr, null);
        } catch (InvalidProtocolBufferNanoException e3) {
            return r.a(new VolleyError(e3));
        }
    }
}
