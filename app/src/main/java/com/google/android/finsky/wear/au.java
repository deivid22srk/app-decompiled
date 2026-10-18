package com.google.android.finsky.wear;

import com.android.volley.VolleyError;
import com.google.android.finsky.protos.on;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cf;

/* loaded from: classes.dex */
final class au implements cf {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f5098a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.api.b f5099b;
    final /* synthetic */ at c;

    au(at atVar, d dVar, com.google.android.finsky.api.b bVar) {
        this.c = atVar;
        this.f5098a = dVar;
        this.f5099b = bVar;
    }

    @Override // com.google.android.finsky.utils.cf
    public final void a(on onVar) {
        int i;
        FinskyLog.a("Wear selfupdate node %s - installed %d, server %d", this.c.f5096a, Integer.valueOf(this.f5098a.c), Integer.valueOf(onVar.c));
        if (com.google.android.finsky.cpkg.d.ef.b().booleanValue()) {
            i = onVar.c;
        } else {
            FinskyLog.a("Skipping self-update node %s - not enabled", this.c.f5096a);
            i = -1;
        }
        WearSupportService.a(this.c.f5097b, this.c.f5096a, i, this.f5099b.c());
    }

    @Override // com.google.android.finsky.utils.cf
    public final void a(VolleyError volleyError) {
        FinskyLog.a("Failed selfupdate check error %s for node %s", volleyError, this.c.f5096a);
        this.c.f5097b.d(this.c.f5096a);
        this.c.f5097b.a(this.c.f5096a);
    }
}
