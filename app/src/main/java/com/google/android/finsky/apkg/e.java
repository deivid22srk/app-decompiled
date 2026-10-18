package com.google.android.finsky.apkg;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class e implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f1479b;

    e(c cVar, int i) {
        this.f1479b = cVar;
        this.f1478a = i;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Failed to send %d events because of [%s]", Integer.valueOf(this.f1478a), volleyError);
    }
}
