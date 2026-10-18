package com.google.android.finsky.billing.iab;

import com.google.android.finsky.g.ah;
import com.google.android.finsky.protos.ep;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class e implements com.android.volley.t<ep> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n[] f2241a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Semaphore f2242b;
    final /* synthetic */ b c;

    e(b bVar, n[] nVarArr, Semaphore semaphore) {
        this.c = bVar;
        this.f2241a = nVarArr;
        this.f2242b = semaphore;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(ep epVar) {
        ah ahVar;
        com.google.android.finsky.api.b bVar;
        ep epVar2 = epVar;
        ahVar = this.c.f;
        bVar = this.c.g;
        ahVar.a(bVar.b(), "consumePurchase", new f(this, epVar2), epVar2.f3792a);
    }
}
