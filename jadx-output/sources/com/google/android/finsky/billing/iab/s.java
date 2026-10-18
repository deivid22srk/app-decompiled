package com.google.android.finsky.billing.iab;

import android.content.Intent;
import com.google.android.finsky.protos.rt;
import com.google.android.finsky.utils.cr;

/* loaded from: classes.dex */
final class s implements com.android.volley.t<rt> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2263a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f2264b;
    final /* synthetic */ r c;

    s(r rVar, String str, long j) {
        this.c = rVar;
        this.f2263a = str;
        this.f2264b = j;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(rt rtVar) {
        rt rtVar2 = rtVar;
        if (rtVar2.f4357a != null) {
            p pVar = this.c.f2262a.f2233b;
            String str = this.f2263a;
            String str2 = rtVar2.f4357a.f4390a;
            String str3 = rtVar2.f4357a.c;
            Intent a2 = cr.a(pVar.f2259a.f2232a, str, new Intent("com.deivid22srk.store.billing.PURCHASE_STATE_CHANGED"));
            if (a2 != null) {
                a2.putExtra("inapp_signed_data", str2);
                a2.putExtra("inapp_signature", str3);
                pVar.f2259a.sendBroadcast(a2);
            }
        }
        if (rtVar2.f4358b == null) {
            return;
        }
        this.c.f2262a.f2233b.a(this.f2263a, this.f2264b, MarketBillingService.a(rtVar2.f4358b));
    }
}
