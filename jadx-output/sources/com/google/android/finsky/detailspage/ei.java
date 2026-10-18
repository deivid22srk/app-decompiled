package com.google.android.finsky.detailspage;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class ei implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eg f2643a;

    ei(eg egVar) {
        this.f2643a = egVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Could not retrieve subscription docs: %s", volleyError);
    }
}
