package com.google.android.finsky.activities;

import android.widget.Toast;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class an implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f1549a;

    an(ab abVar) {
        this.f1549a = abVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        Toast.makeText(this.f1549a, R.string.debug_play_country_override_update_failed, 1).show();
    }
}
