package com.google.android.finsky.widget;

import com.android.volley.NetworkError;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.utils.cl;

/* loaded from: classes.dex */
final class h implements cl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f5210a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f5211b;

    h(f fVar, int i) {
        this.f5211b = fVar;
        this.f5210a = i;
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(pw pwVar) {
        DfeToc dfeToc = new DfeToc(pwVar);
        FinskyApp.a().a(dfeToc);
        this.f5211b.a(dfeToc, this.f5210a);
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(VolleyError volleyError) {
        if (volleyError instanceof NetworkError) {
            f.b(this.f5211b);
        } else {
            this.f5211b.setResult(0);
            this.f5211b.finish();
        }
    }
}
