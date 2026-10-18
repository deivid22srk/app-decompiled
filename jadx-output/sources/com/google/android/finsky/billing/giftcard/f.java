package com.google.android.finsky.billing.giftcard;

import com.android.volley.VolleyError;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.i;
import com.google.android.finsky.a.n;
import com.google.android.finsky.g.ah;
import com.google.android.finsky.protos.lt;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jb;

/* loaded from: classes.dex */
final class f implements s, t<lt> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f2227a;

    private f(e eVar) {
        this.f2227a = eVar;
    }

    /* synthetic */ f(e eVar, byte b2) {
        this(eVar);
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(lt ltVar) {
        com.google.android.finsky.api.b bVar;
        com.google.android.finsky.api.b bVar2;
        lt ltVar2 = ltVar;
        this.f2227a.f2226b = ltVar2;
        int i = ltVar2.f4097a;
        e.a(this.f2227a, i, ltVar2.o);
        switch (i) {
            case 1:
                ah ahVar = FinskyApp.a().q;
                bVar = this.f2227a.e;
                ahVar.a(bVar.b(), "redeem-code-sidecar", new g(this), ltVar2.s);
                if (FinskyApp.a().e().a(12603718L)) {
                    bVar2 = this.f2227a.e;
                    jb.a(bVar2.c(), 5);
                    break;
                }
                break;
            case 2:
                this.f2227a.a(4, 0);
                break;
            case 3:
                this.f2227a.a(5, 0);
                break;
            case 4:
            default:
                FinskyLog.c("Received error/unknown result: %d", Integer.valueOf(ltVar2.f4097a));
                this.f2227a.c = ltVar2.h;
                this.f2227a.a(3, 0);
                break;
            case 5:
                this.f2227a.a(6, 0);
                break;
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        i iVar;
        this.f2227a.d = volleyError;
        iVar = this.f2227a.f;
        iVar.a(801, (String) null, (String) null, -1, volleyError.getClass().getSimpleName(), (n) null);
        this.f2227a.a(3, 1);
    }
}
