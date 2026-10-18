package com.google.android.finsky.billing.iab;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.y;
import com.google.android.finsky.protos.bp;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class h implements com.android.volley.t<bp> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n[] f2247a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Semaphore f2248b;
    final /* synthetic */ String c;
    final /* synthetic */ b d;

    h(b bVar, n[] nVarArr, Semaphore semaphore, String str) {
        this.d = bVar;
        this.f2247a = nVarArr;
        this.f2248b = semaphore;
        this.c = str;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(bp bpVar) {
        com.google.android.finsky.api.b bVar;
        bp bpVar2 = bpVar;
        this.f2247a[0] = bpVar2.f3642a ? n.RESULT_PROMO_ELIGIBLE : n.RESULT_NOT_PROMO_ELIGIBLE;
        this.f2248b.release();
        com.google.android.finsky.a.b bVar2 = new com.google.android.finsky.a.b(620);
        boolean z = bpVar2.f3642a;
        boolean z2 = bpVar2.c;
        String str = this.c;
        if (bVar2.f1473a.V == null) {
            bVar2.f1473a.V = new com.google.android.finsky.a.r();
        }
        bVar2.f1473a.V.f1498a = z ? 1 : 2;
        bVar2.f1473a.V.f1499b = true;
        bVar2.f1473a.V.c = z2 ? 1 : 2;
        bVar2.f1473a.V.d = true;
        bVar2.f1473a.V.e = str;
        bVar2.f1473a.V.f = true;
        y yVar = bVar2.f1473a;
        FinskyApp a2 = FinskyApp.a();
        bVar = this.d.g;
        a2.c(bVar.b()).b(yVar);
    }
}
