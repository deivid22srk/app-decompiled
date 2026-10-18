package com.google.android.finsky.utils;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class fi implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f4872a;

    fi(Document document) {
        this.f4872a = document;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Volley error while dismissing %s: %s", this.f4872a.f1963a.f3890a, volleyError);
    }
}
