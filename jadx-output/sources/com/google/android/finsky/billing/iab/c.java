package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import com.google.android.finsky.protos.fy;
import com.google.android.finsky.protos.ga;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class c implements com.android.volley.t<ga> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f2237a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String[] f2238b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ Semaphore d;
    final /* synthetic */ b e;

    c(b bVar, boolean z, String[] strArr, Bundle bundle, Semaphore semaphore) {
        this.e = bVar;
        this.f2237a = z;
        this.f2238b = strArr;
        this.c = bundle;
        this.d = semaphore;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(ga gaVar) {
        com.android.volley.a aVar;
        String b2;
        com.google.android.finsky.api.b bVar;
        com.android.volley.b bVar2 = null;
        ga gaVar2 = gaVar;
        if (this.f2237a) {
            bVar = this.e.g;
            aVar = bVar.a().d;
            String str = this.f2238b[0];
            if (str == null) {
                throw new IllegalStateException("BulkDetails cache key should not be null");
            }
            bVar2 = aVar.a(str);
            if (bVar2 == null) {
                FinskyLog.c("The BulkDetailsResponse should be in the cache", new Object[0]);
            }
        } else {
            aVar = null;
        }
        fy[] fyVarArr = gaVar2.f3856a;
        ArrayList<String> arrayList = new ArrayList<>(fyVarArr.length);
        for (fy fyVar : fyVarArr) {
            gx gxVar = fyVar.f3852a;
            if (gxVar != null) {
                b2 = b.b(gxVar);
                arrayList.add(b2);
                if (bVar2 != null) {
                    com.android.volley.b bVar3 = new com.android.volley.b();
                    bVar3.f1228a = com.google.protobuf.nano.c.a(gxVar);
                    bVar3.f1229b = bVar2.f1229b;
                    bVar3.c = bVar2.c;
                    bVar3.d = bVar2.d;
                    bVar3.e = bVar2.e;
                    bVar3.f = bVar2.f;
                    aVar.a("InstantPurchaseDocument-" + gxVar.f3890a, bVar3);
                }
            }
        }
        this.c.putStringArrayList("DETAILS_LIST", arrayList);
        this.c.putInt("RESPONSE_CODE", n.RESULT_OK.l);
        this.d.release();
    }
}
