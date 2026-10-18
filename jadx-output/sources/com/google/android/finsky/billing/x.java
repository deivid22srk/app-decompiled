package com.google.android.finsky.billing;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class x implements com.android.volley.s {
    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error while checking for offers: %s", volleyError);
    }
}
