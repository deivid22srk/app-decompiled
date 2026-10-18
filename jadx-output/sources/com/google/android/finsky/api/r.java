package com.google.android.finsky.api;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
public final class r extends com.android.volley.e {

    /* renamed from: b, reason: collision with root package name */
    private final e f2005b;
    private boolean c;

    public r(int i, e eVar) {
        super(i, d.j.b().intValue(), d.k.b().floatValue());
        this.f2005b = eVar;
    }

    public r(int i, int i2, float f, e eVar) {
        super(i, i2, f);
        this.f2005b = eVar;
    }

    @Override // com.android.volley.e, com.android.volley.v
    public final void a(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            if (this.c) {
                throw volleyError;
            }
            this.c = true;
            this.f2005b.d();
        }
        super.a(volleyError);
    }
}
