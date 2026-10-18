package com.google.android.finsky.api.model;

import android.content.Context;
import com.android.volley.a.ae;
import com.google.android.finsky.protos.ContentFilters;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class g extends a<ContentFilters.ContentFilterSettingsResponse> {
    private final com.google.android.finsky.api.b c;

    public g(com.google.android.finsky.api.b bVar, Context context) {
        super(context, ContentFilters.ContentFilterSettingsResponse.class);
        this.c = bVar;
    }

    public final ContentFilters.ContentFilterSettingsResponse d() {
        jm.b();
        ae a2 = ae.a();
        a(a2, a2, true);
        try {
            ContentFilters.ContentFilterSettingsResponse contentFilterSettingsResponse = (ContentFilters.ContentFilterSettingsResponse) a2.get();
            a_((g) contentFilterSettingsResponse);
            return contentFilterSettingsResponse;
        } catch (InterruptedException e) {
            a(e);
            return null;
        } catch (ExecutionException e2) {
            a(e2);
            return null;
        }
    }

    public final ContentFilters.ContentFilterSettingsResponse e() {
        jm.b();
        ContentFilters.ContentFilterSettingsResponse b2 = b();
        b((g) b2);
        return b2;
    }

    public final boolean f() {
        return !c() || System.currentTimeMillis() > ((a) this).f1965a.lastModified() + com.google.android.finsky.api.d.Q.b().longValue();
    }

    public final void a(com.android.volley.t<ContentFilters.ContentFilterSettingsResponse> tVar, com.android.volley.s sVar, boolean z) {
        this.c.a(tVar, sVar, z);
    }

    private static void a(Exception exc) {
        Throwable cause = exc.getCause();
        FinskyLog.a("Unable to retrieve ContentFilterSettingsResponse: %s", cause == null ? null : cause.getClass().getSimpleName());
    }
}
