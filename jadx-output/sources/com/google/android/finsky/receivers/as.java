package com.google.android.finsky.receivers;

import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cl;

/* loaded from: classes.dex */
final class as implements cl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4466a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f4467b;
    final /* synthetic */ TosAckedReceiver c;

    as(TosAckedReceiver tosAckedReceiver, String str, boolean z) {
        this.c = tosAckedReceiver;
        this.f4466a = str;
        this.f4467b = z;
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(pw pwVar) {
        DfeToc dfeToc = new DfeToc(pwVar);
        FinskyApp.a().a(dfeToc);
        TosAckedReceiver.a(this.c, this.f4466a, this.f4467b, dfeToc);
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error fetching TOC: %s", volleyError);
    }
}
