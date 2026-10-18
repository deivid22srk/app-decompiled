package com.google.android.finsky.utils;

import android.content.Context;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class hd implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f4954a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4955b;
    final /* synthetic */ Context c;
    final /* synthetic */ hh d;

    hd(ac acVar, String str, Context context, hh hhVar) {
        this.f4954a = acVar;
        this.f4955b = str;
        this.c = context;
        this.d = hhVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f4954a.a(this.f4955b);
        FinskyLog.d("Error posting review: %s", volleyError.toString());
        gx.a(this.c);
        if (this.d != null) {
            this.d.a();
        }
    }
}
