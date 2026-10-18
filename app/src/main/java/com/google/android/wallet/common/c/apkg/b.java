package com.google.android.wallet.common.c.apkg;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
public final class b extends com.android.volley.e {

    /* renamed from: b, reason: collision with root package name */
    public final a f7272b;
    public boolean c;

    public b(int i, a aVar) {
        super(i, 1, 1.0f);
        this.f7272b = aVar;
    }

    @Override // com.android.volley.e, com.android.volley.v
    public final void a(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            if (((AuthFailureError) volleyError).f1194a != null) {
                throw volleyError;
            }
            if (this.c) {
                throw volleyError;
            }
            this.c = true;
            this.f7272b.a();
            super.a(volleyError);
            return;
        }
        throw volleyError;
    }
}
