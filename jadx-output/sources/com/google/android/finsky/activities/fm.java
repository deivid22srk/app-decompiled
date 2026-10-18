package com.google.android.finsky.activities;

import android.widget.Toast;
import com.android.vending.R;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class fm implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fk f1748a;

    fm(fk fkVar) {
        this.f1748a = fkVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        Toast.makeText(this.f1748a.ap, R.string.review_feedback_posted_error, 0).show();
    }
}
