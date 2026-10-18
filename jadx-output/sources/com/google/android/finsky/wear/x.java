package com.google.android.finsky.wear;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class x implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5158a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f5159b;

    x(v vVar, String str) {
        this.f5159b = vVar;
        this.f5158a = str;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Module delivery for node %s volley error %s", this.f5159b.f5155b, volleyError);
        v.a(this.f5159b, 1, this.f5158a, null);
    }
}
