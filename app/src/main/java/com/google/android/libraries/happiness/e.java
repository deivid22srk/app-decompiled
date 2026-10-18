package com.google.android.libraries.happiness;

import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
final class e extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HatsSurveyManager f6731a;

    e(HatsSurveyManager hatsSurveyManager) {
        this.f6731a = hatsSurveyManager;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Log.w("HatsSurveyManager", str + " : " + str2);
    }
}
