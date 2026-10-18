package com.google.android.finsky.utils;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.mz;

/* loaded from: classes.dex */
final class fh implements com.android.volley.t<mz> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.layout.play.az f4870a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f4871b;
    final /* synthetic */ com.google.android.play.layout.a c;

    fh(com.google.android.finsky.layout.play.az azVar, Document document, com.google.android.play.layout.a aVar) {
        this.f4870a = azVar;
        this.f4871b = document;
        this.c = aVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(mz mzVar) {
        this.f4870a.a(this.f4871b, this.c);
    }
}
