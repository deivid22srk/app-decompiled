package com.google.android.finsky.widget.recommendation;

import com.android.volley.VolleyError;
import com.android.volley.s;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class f implements s {
    f() {
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error while fetching more recs: %s", volleyError);
    }
}
