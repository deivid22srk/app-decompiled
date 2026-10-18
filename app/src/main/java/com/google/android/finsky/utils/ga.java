package com.google.android.finsky.utils;

import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class ga implements com.google.android.play.layout.f {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.layout.a f4889a;

    /* renamed from: b, reason: collision with root package name */
    private final Document f4890b;
    private final com.google.android.finsky.api.b c;
    private final com.google.android.finsky.layout.play.az d;
    private final com.google.android.finsky.layout.play.cy e;

    public ga(com.google.android.play.layout.a aVar, Document document, com.google.android.finsky.api.b bVar, com.google.android.finsky.layout.play.az azVar, com.google.android.finsky.layout.play.cy cyVar) {
        this.f4889a = aVar;
        this.f4890b = document;
        this.c = bVar;
        this.d = azVar;
        this.e = cyVar;
    }

    @Override // com.google.android.play.layout.f
    public final void a(int i) {
        fe.a(this.f4889a, this.f4890b, this.c, this.d, this.e);
    }
}
