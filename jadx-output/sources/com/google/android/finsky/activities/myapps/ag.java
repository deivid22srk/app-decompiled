package com.google.android.finsky.activities.myapps;

import com.android.volley.VolleyError;
import com.google.android.finsky.activities.ch;
import com.google.android.finsky.utils.aw;

/* loaded from: classes.dex */
final class ag implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f1813a;

    ag(ac acVar) {
        this.f1813a = acVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        if (this.f1813a.L()) {
            this.f1813a.I();
            ch.a((android.support.v4.app.aa) this.f1813a.B, (String) null, aw.a(this.f1813a.f(), volleyError), false);
        }
    }
}
