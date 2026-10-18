package com.google.android.finsky.utils;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class ii implements com.android.volley.s {
    ii() {
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error sending TOS acceptance: %s", volleyError);
    }
}
