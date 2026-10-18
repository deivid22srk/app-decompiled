package com.google.android.finsky;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class f implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2773a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f2774b;

    f(b bVar, String str) {
        this.f2774b = bVar;
        this.f2773a = str;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error acking notification [%s]", this.f2773a);
    }
}
