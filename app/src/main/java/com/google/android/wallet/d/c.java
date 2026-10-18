package com.google.android.wallet.d;

import android.webkit.JavascriptInterface;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final d f7313a;

    public c(d dVar) {
        this.f7313a = dVar;
    }

    @JavascriptInterface
    public final void send(String str, Object obj) {
        d dVar = this.f7313a;
        new a(str, obj);
        dVar.e = null;
    }

    @JavascriptInterface
    public final void submit(String str, String str2) {
        this.f7313a.e = new b(str, str2);
    }
}
