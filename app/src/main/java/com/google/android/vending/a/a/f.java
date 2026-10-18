package com.google.android.vending.a.a;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
public final class f extends com.android.volley.e {
    private static final int d = com.google.android.finsky.cpkg.d.ad.b().intValue();

    /* renamed from: b, reason: collision with root package name */
    private final c f7106b;
    private boolean c;
    private boolean e;

    public f(c cVar, boolean z) {
        super(d, 1, 0.0f);
        this.f7106b = cVar;
        this.c = z;
    }

    @Override // com.android.volley.e, com.android.volley.v
    public final void a(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            if (this.e) {
                throw volleyError;
            }
            this.e = true;
            this.f7106b.b(this.c);
        }
        super.a(volleyError);
    }
}
