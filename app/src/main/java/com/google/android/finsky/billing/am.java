package com.google.android.finsky.billing;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.billing.lightpurchase.PurchaseParams;
import com.google.android.finsky.protos.ea;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.ku;
import com.google.android.finsky.protos.kv;
import com.google.android.finsky.protos.kw;
import com.google.android.finsky.protos.kx;
import com.google.android.finsky.protos.ky;
import com.google.android.finsky.protos.mt;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class am {
    public static Document a(PurchaseParams purchaseParams, com.android.volley.a aVar) {
        if (purchaseParams.c != null) {
            return purchaseParams.c;
        }
        com.android.volley.b a2 = aVar.a("InstantPurchaseDocument-" + purchaseParams.f2282b);
        if (a2 == null || a2.a()) {
            return null;
        }
        try {
            byte[] bArr = a2.f1228a;
            return new Document((gx) com.google.protobuf.nano.c.a(new gx(), bArr, bArr.length));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new RuntimeException(e);
        }
    }

    public static ku a(mt mtVar, ky kyVar) {
        long j = mtVar.f4148a;
        for (ku kuVar : kyVar.d) {
            if (kuVar.f4054a == j) {
                return kuVar;
            }
        }
        return null;
    }

    public static kw[] a(kv[] kvVarArr, ku kuVar) {
        boolean z;
        if (kuVar == null || kuVar.d == null || kuVar.d.length == 0) {
            return kw.b();
        }
        ArrayList arrayList = new ArrayList();
        if (kvVarArr != null) {
            int length = kvVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                kv kvVar = kvVarArr[i];
                if (kvVar.f4056a != kuVar.f4054a) {
                    i++;
                } else {
                    arrayList.addAll(com.google.android.finsky.utils.p.a(kvVar.c));
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (kw kwVar : kuVar.d) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    z = false;
                    break;
                }
                if (!kwVar.f4058a.equals(((kw) arrayList.get(i2)).f4058a)) {
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                arrayList2.add(kwVar);
            }
        }
        return (kw[]) arrayList2.toArray(new kw[arrayList2.size()]);
    }

    public static boolean a(kx kxVar, ea eaVar) {
        boolean z;
        String[] strArr = kxVar.d;
        String str = eaVar.f;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (str.equals(strArr[i])) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }
}
