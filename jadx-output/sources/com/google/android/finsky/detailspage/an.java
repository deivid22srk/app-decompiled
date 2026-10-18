package com.google.android.finsky.detailspage;

import android.widget.Toast;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class an implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ al f2542a;

    an(al alVar) {
        this.f2542a = alVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        Toast.makeText(this.f2542a.c, com.google.android.finsky.utils.aw.a(this.f2542a.c, volleyError), 0).show();
    }
}
