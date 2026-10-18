package com.google.android.finsky.utils.hats;

import com.android.volley.VolleyError;
import com.android.volley.s;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class j implements s {
    j() {
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Volley error received: %s", volleyError);
    }
}
