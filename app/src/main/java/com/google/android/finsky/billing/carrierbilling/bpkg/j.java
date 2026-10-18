package com.google.android.finsky.billing.carrierbilling.bpkg;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.finsky.layout.ButtonBar;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class j extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f2187a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2188b;
    public final View c;
    public boolean d = false;

    public j(h hVar, View view, View view2) {
        this.f2187a = hVar;
        this.f2188b = view;
        this.c = view2;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        i iVar;
        FinskyLog.c("Web error: (" + str2 + ") " + str, new Object[0]);
        this.d = true;
        iVar = this.f2187a.ai;
        iVar.a(1);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ButtonBar buttonBar;
        webView.setVisibility(0);
        this.c.setVisibility(0);
        if (!this.d) {
            buttonBar = this.f2187a.ak;
            buttonBar.setPositiveButtonEnabled(true);
        }
        this.f2188b.setVisibility(8);
    }
}
