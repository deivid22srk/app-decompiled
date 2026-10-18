package com.google.android.finsky.services;

import com.android.volley.VolleyError;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cl;

/* loaded from: classes.dex */
final class m implements cl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f4623a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.api.b f4624b;
    final /* synthetic */ DailyHygiene c;

    m(DailyHygiene dailyHygiene, boolean z, com.google.android.finsky.api.b bVar) {
        this.c = dailyHygiene;
        this.f4623a = z;
        this.f4624b = bVar;
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(pw pwVar) {
        this.c.e();
        if (this.f4623a) {
            this.f4624b.a(pwVar.l, com.google.android.finsky.api.model.e.a(pwVar.l), (com.android.volley.t<com.google.android.finsky.protos.ay>) null, (com.android.volley.s) null);
        }
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Unable to preload experiments: %s", volleyError);
        this.c.e();
    }
}
