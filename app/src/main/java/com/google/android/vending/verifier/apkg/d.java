package com.google.android.vending.verifier.apkg;

import com.android.volley.VolleyError;
import com.android.volley.s;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class d implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7111a;

    d(String str) {
        this.f7111a = str;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Verification feedback for package=%s: error response %s", this.f7111a, volleyError);
    }
}
