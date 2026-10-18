package com.google.android.finsky.autoupdate;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class s implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f2054a;

    s(q qVar) {
        this.f2054a = qVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Update check failed: %s", volleyError);
        p.a(this.f2054a.c, false);
    }
}
