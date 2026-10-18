package com.google.android.wallet.ui.common;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes2.dex */
public class g extends WebViewClient {
    h h;

    public g() {
    }

    public g(h hVar) {
        this.h = hVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (this.h != null) {
            this.h.a(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.h != null) {
            this.h.a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (this.h != null) {
            this.h.b(webView);
        }
    }
}
