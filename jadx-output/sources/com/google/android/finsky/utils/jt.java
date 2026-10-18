package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class jt implements com.android.volley.t<com.google.android.finsky.protos.jr> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.api.b f5042a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f5043b;
    final /* synthetic */ boolean c;

    jt(com.google.android.finsky.api.b bVar, String str, boolean z) {
        this.f5042a = bVar;
        this.f5043b = str;
        this.c = z;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.finsky.protos.jr jrVar) {
        long unused = js.f5040a = System.currentTimeMillis();
        FinskyApp.a().q.a(this.f5042a.b(), "modifed_wishlist", new ju(this), jrVar.f4005a);
    }
}
