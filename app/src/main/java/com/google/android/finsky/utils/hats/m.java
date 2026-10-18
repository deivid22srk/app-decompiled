package com.google.android.finsky.utils.hats;

import com.android.volley.VolleyError;
import com.android.volley.s;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class m implements s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f4949a;

    public m(k kVar) {
        this.f4949a = kVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Volley error received: %s", volleyError);
        FinskyLog.d("Unable to retrieve a survey list: %s", volleyError);
    }
}
