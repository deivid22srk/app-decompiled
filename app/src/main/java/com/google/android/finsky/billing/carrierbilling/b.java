package com.google.android.finsky.billing.carrierbilling;

import com.google.android.finsky.billing.carrierbilling.model.SubscriberInfo;
import com.google.android.finsky.protos.v;

/* loaded from: classes.dex */
public final class b {
    public static SubscriberInfo a(v vVar) {
        if (vVar == null) {
            return null;
        }
        com.google.android.finsky.billing.carrierbilling.model.b bVar = new com.google.android.finsky.billing.carrierbilling.model.b();
        bVar.f2197a = vVar.f4415a;
        bVar.c = vVar.g;
        bVar.d = vVar.i;
        bVar.e = vVar.k;
        bVar.f = vVar.m;
        bVar.g = vVar.o;
        bVar.f2198b = vVar.y;
        return bVar.a();
    }
}
