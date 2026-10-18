package com.google.android.finsky.api;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
public final class x implements com.android.volley.v {

    /* renamed from: a, reason: collision with root package name */
    private final e f2009a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2010b;
    private boolean c;

    x(int i, e eVar) {
        this.f2010b = i;
        this.f2009a = eVar;
    }

    @Override // com.android.volley.v
    public final int a() {
        return this.c ? d.s.b().intValue() : this.f2010b;
    }

    @Override // com.android.volley.v
    public final int b() {
        return this.c ? 1 : 0;
    }

    @Override // com.android.volley.v
    public final void a(VolleyError volleyError) {
        if (this.c) {
            throw volleyError;
        }
        if (volleyError instanceof AuthFailureError) {
            this.f2009a.d();
        }
        this.c = true;
    }
}
