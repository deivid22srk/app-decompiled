package com.google.android.finsky.activities;

import android.widget.Toast;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class cg implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cc f1652a;

    cg(cc ccVar) {
        this.f1652a = ccVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f1652a.q = false;
        this.f1652a.e();
        Toast.makeText(this.f1652a.e, R.string.cancel_preorder_error, 0).show();
    }
}
