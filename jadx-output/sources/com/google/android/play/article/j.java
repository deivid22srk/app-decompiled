package com.google.android.play.article;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes.dex */
class j extends WebView {

    /* renamed from: b, reason: collision with root package name */
    private static final String f6806b = j.class.getSimpleName();
    private static boolean c;

    /* renamed from: a, reason: collision with root package name */
    n f6807a;

    public j(Context context) {
        this(context, (byte) 0);
    }

    private j(Context context, byte b2) {
        super(context, null, 0);
        setWebChromeClient(new WebChromeClient());
        setWebViewClient(new l((byte) 0));
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setAppCacheEnabled(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(false);
        settings.setUserAgentString(settings.getUserAgentString() + " OnyxArticleView/1.0");
        if (!c) {
            c = true;
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        }
        setOnLongClickListener(new k(this));
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }
}
