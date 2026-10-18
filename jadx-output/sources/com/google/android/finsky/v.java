package com.google.android.finsky;

import android.net.Uri;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class v implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.article.g f5062a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Uri f5063b;
    final /* synthetic */ s c;

    v(s sVar, com.google.android.play.article.g gVar, Uri uri) {
        this.c = sVar;
        this.f5062a = gVar;
        this.f5063b = uri;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f5062a.a();
    }
}
