package com.google.android.finsky.activities;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class cx implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cv f1671a;

    cx(cv cvVar) {
        this.f1671a = cvVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c("flag content failed with error %s", volleyError);
        cv.a(volleyError);
    }
}
