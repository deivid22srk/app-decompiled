package com.google.android.finsky.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.NoConnectionError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class f implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f4864a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4865b;

    f(Document document, String str) {
        this.f4864a = document;
        this.f4865b = str;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        com.android.volley.k kVar = volleyError.f1195b;
        if (kVar != null && kVar.f1243a == 302 && kVar.c.containsKey("Location")) {
            String str = kVar.c.get("Location");
            com.google.android.finsky.apkg.b a2 = new com.google.android.finsky.apkg.b(1100).a(this.f4864a.f1963a.f3890a);
            if (TextUtils.isEmpty(str)) {
                FinskyLog.d("Empty Location header from 302 URL: %s", FinskyLog.a(this.f4865b));
            } else {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                a2.e(queryParameter);
                if (!TextUtils.isEmpty(queryParameter)) {
                    FinskyApp.a().c.a(str, 3);
                    ExternalReferrer.a(queryParameter, this.f4864a.c(), "adclick");
                } else {
                    FinskyLog.c("Missing referrer in location header field for URL[%s]", FinskyLog.a(this.f4865b));
                }
                FinskyApp.a().b((String) null).c(this.f4864a.f1963a.f3890a, queryParameter, new g(this), new h(this));
            }
            FinskyApp.a().h().a(a2.f1473a);
            return;
        }
        if ((volleyError instanceof NoConnectionError) || (volleyError instanceof TimeoutError)) {
            FinskyLog.c("No connection error or timeout error", new Object[0]);
        } else {
            FinskyLog.d("Unexpected error response for URL[%s], docid[%s]: %s", FinskyLog.a(this.f4865b), this.f4864a.f1963a.f3890a, volleyError.getMessage());
        }
    }
}
