package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class hf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f4958a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ he f4959b;

    hf(he heVar, Document document) {
        this.f4959b = heVar;
        this.f4958a = document;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FinskyApp.a().a(this.f4959b.f4956a).a(this.f4959b.f4957b, this.f4959b.c, "", "", this.f4958a, this.f4959b.d);
        this.f4959b.e.a(this.f4959b.c);
    }
}
