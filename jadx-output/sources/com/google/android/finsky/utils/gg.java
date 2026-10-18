package com.google.android.finsky.utils;

import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public final class gg implements com.google.android.play.image.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dw f4900a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f4901b;
    final /* synthetic */ String c;
    final /* synthetic */ gc d;

    public gg(gc gcVar, dw dwVar, Document document, String str) {
        this.d = gcVar;
        this.f4900a = dwVar;
        this.f4901b = document;
        this.c = str;
    }

    @Override // com.android.volley.t
    /* renamed from: a */
    public final void a_(com.google.android.play.image.j jVar) {
        this.f4900a.a(this.f4901b, this.c, jVar.f6944a);
    }
}
