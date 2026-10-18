package com.google.android.finsky.jpkg;

import com.android.volley.VolleyError;
import com.android.volley.s;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class f implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f2892a;

    f(d dVar) {
        this.f2892a = dVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Unable to load JSON: %s", volleyError.getCause());
        this.f2892a.g = null;
        d.a(this.f2892a);
    }
}
