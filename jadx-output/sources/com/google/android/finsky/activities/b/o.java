package com.google.android.finsky.activities.b;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aw;

/* loaded from: classes.dex */
final class o implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f1590a;

    o(l lVar) {
        this.f1590a = lVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        boolean z;
        Context context;
        FinskyLog.d("Could not retrieve my account content: %s", volleyError);
        z = this.f1590a.i;
        if (!z) {
            context = this.f1590a.ap;
            this.f1590a.e(aw.a(context, volleyError));
        }
    }
}
