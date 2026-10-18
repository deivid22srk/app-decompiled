package com.google.android.play.dfe.api;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.android.play.utils.b.j;

/* loaded from: classes.dex */
public final class c extends com.android.volley.e {

    /* renamed from: b, reason: collision with root package name */
    private final e f6836b;
    private boolean c;

    public c(e eVar) {
        super(j.d.b().intValue(), j.e.b().intValue(), j.f.b().floatValue());
        this.f6836b = eVar;
    }

    public c(int i, int i2, float f, e eVar) {
        super(i, i2, f);
        this.f6836b = eVar;
    }

    @Override // com.android.volley.e, com.android.volley.v
    public final void a(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            if (this.c) {
                throw volleyError;
            }
            this.c = true;
            this.f6836b.a();
        }
        super.a(volleyError);
    }
}
