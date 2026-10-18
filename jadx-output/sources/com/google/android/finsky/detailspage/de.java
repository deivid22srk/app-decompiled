package com.google.android.finsky.detailspage;

import android.widget.Toast;
import com.android.vending.R;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class de implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ db f2608a;

    de(db dbVar) {
        this.f2608a = dbVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        Toast.makeText(this.f2608a.c, R.string.review_feedback_posted_error, 0).show();
    }
}
