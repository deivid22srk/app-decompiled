package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* loaded from: classes.dex */
final class by implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    ValueCallback<String> f5909a = new bz(this);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bt f5910b;
    final /* synthetic */ WebView c;
    final /* synthetic */ bw d;

    by(bw bwVar, bt btVar, WebView webView) {
        this.d = bwVar;
        this.f5910b = btVar;
        this.c = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.getSettings().getJavaScriptEnabled()) {
            try {
                this.c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f5909a);
            } catch (Throwable th) {
                this.f5909a.onReceiveValue("");
            }
        }
    }
}
