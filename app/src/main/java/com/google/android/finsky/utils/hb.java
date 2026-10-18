package com.google.android.finsky.utils;

import android.content.Context;
import com.android.volley.NetworkError;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class hb implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f4950a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4951b;
    final /* synthetic */ Context c;
    final /* synthetic */ hh d;

    hb(ac acVar, String str, Context context, hh hhVar) {
        this.f4950a = acVar;
        this.f4951b = str;
        this.c = context;
        this.d = hhVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        if (!(volleyError instanceof NetworkError)) {
            this.f4950a.a(this.f4951b);
            FinskyLog.d("Error posting review: %s", volleyError.toString());
            gx.a(this.c, aw.a(this.c, volleyError));
        }
        if (this.d != null) {
            this.d.a();
        }
    }
}
