package com.google.android.finsky.activities.myapps;

import com.android.volley.VolleyError;
import com.google.android.finsky.activities.ch;
import com.google.android.finsky.utils.aw;

/* loaded from: classes.dex */
final class ai implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f1816a;

    ai(ac acVar) {
        this.f1816a = acVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        if (this.f1816a.L()) {
            this.f1816a.I();
            ch.a((android.support.v4.app.aa) this.f1816a.B, (String) null, aw.a(this.f1816a.f(), volleyError), false);
        }
    }
}
