package com.google.android.finsky.utils;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class jd implements com.android.volley.s {
    jd() {
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c("GetUserSettings failed with error: %s", volleyError);
        jb.a(false);
    }
}
