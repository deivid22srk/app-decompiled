package com.google.android.finsky.widget;

import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class m implements com.google.android.play.image.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f5220a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f5221b = 2;
    final /* synthetic */ l c;

    m(l lVar, Document document) {
        this.c = lVar;
        this.f5220a = document;
    }

    @Override // com.android.volley.t
    /* renamed from: a */
    public final void a_(com.google.android.play.image.j jVar) {
        this.c.a(this.f5220a, jVar, this.f5221b);
    }
}
