package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public class WebViewLayout extends RelativeLayout implements View.OnKeyListener, View.OnTouchListener, com.google.android.wallet.analytics.e, h {

    /* renamed from: a, reason: collision with root package name */
    WebView f7465a;

    /* renamed from: b, reason: collision with root package name */
    View f7466b;
    TextView c;
    View d;
    g e;
    private final com.google.android.wallet.analytics.f f;
    private boolean g;
    private boolean h;
    private String i;
    private String j;
    private com.google.android.wallet.analytics.e k;

    public WebViewLayout(Context context) {
        super(context);
        this.f = new com.google.android.wallet.analytics.f(1630);
        this.e = new g(this);
    }

    public WebViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new com.google.android.wallet.analytics.f(1630);
        this.e = new g(this);
    }

    public WebViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new com.google.android.wallet.analytics.f(1630);
        this.e = new g(this);
    }

    @TargetApi(21)
    public WebViewLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f = new com.google.android.wallet.analytics.f(1630);
        this.e = new g(this);
    }

    public void setHeaderView(View view) {
        if (this.d != null) {
            throw new IllegalArgumentException("Only a single header view is supported.");
        }
        this.d = view;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) getResources().getDimension(com.google.android.wallet.e.f.wallet_uic_web_view_layout_header_bottom_margin);
        this.d.setLayoutParams(layoutParams);
        ((RelativeLayout.LayoutParams) this.f7465a.getLayoutParams()).addRule(bj.a(3), com.google.android.wallet.e.g.web_view_layout_header);
        ((RelativeLayout.LayoutParams) this.f7466b.getLayoutParams()).addRule(bj.a(3), com.google.android.wallet.e.g.web_view_layout_header);
        ((RelativeLayout.LayoutParams) this.c.getLayoutParams()).addRule(bj.a(3), com.google.android.wallet.e.g.web_view_layout_header);
        this.d.setId(com.google.android.wallet.e.g.web_view_layout_header);
        addView(this.d, 0);
    }

    @Override // com.google.android.wallet.analytics.e
    public void setParentUiNode(com.google.android.wallet.analytics.e eVar) {
        this.k = eVar;
    }

    public void setWebViewClient(g gVar) {
        if (gVar == null) {
            gVar = new g();
        }
        this.e = gVar;
        this.e.h = this;
        if (this.f7465a != null) {
            this.f7465a.setWebViewClient(this.e);
        }
    }

    public void setUserAgent(String str) {
        this.f7465a.getSettings().setUserAgentString(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = true;
        if (TextUtils.isEmpty(this.f7465a.getOriginalUrl())) {
            this.g = false;
            if (!TextUtils.isEmpty(this.i)) {
                b(this.i, this.j);
            }
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(com.google.android.wallet.e.g.error_msg);
        this.f7466b = ((ViewStub) findViewById(com.google.android.wallet.e.g.progress_bar)).inflate();
        this.f7465a = new br(getContext(), (byte) 0);
        this.f7465a.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f7465a.setId(com.google.android.wallet.e.g.web_view_layout_web_view);
        this.f7465a.setVisibility(8);
        this.f7465a.setOnKeyListener(this);
        this.f7465a.setOnTouchListener(this);
        WebSettings settings = this.f7465a.getSettings();
        settings.setSupportZoom(true);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        if (Build.VERSION.SDK_INT >= 11) {
            settings.setDisplayZoomControls(false);
        }
        this.f7465a.setWebViewClient(this.e);
        addView(this.f7465a);
        this.f7465a.requestFocus();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        this.g = bundle.getBoolean("pageLoaded");
        if (!this.g || this.f7465a.restoreState(bundle) == null) {
            this.g = false;
            b(this.i, this.j);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f7465a.canGoBack()) {
            return false;
        }
        this.f7465a.goBack();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT <= 10) {
            switch (motionEvent.getAction()) {
                case 0:
                case 1:
                    if (!view.hasFocus()) {
                        view.requestFocus();
                        break;
                    }
                    break;
            }
        }
        if (motionEvent.getPointerCount() > 1) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
        return false;
    }

    public WebView getWebView() {
        return this.f7465a;
    }

    @Override // com.google.android.wallet.analytics.e
    public com.google.android.wallet.analytics.e getParentUiNode() {
        return this.k;
    }

    @Override // com.google.android.wallet.analytics.e
    public com.google.android.wallet.analytics.f getUiElement() {
        return this.f;
    }

    @Override // com.google.android.wallet.analytics.e
    public List<com.google.android.wallet.analytics.e> getChildren() {
        if (this.d instanceof com.google.android.wallet.analytics.e) {
            return Collections.singletonList((com.google.android.wallet.analytics.e) this.d);
        }
        return null;
    }

    @Override // com.google.android.wallet.ui.common.h
    public final void a(WebView webView, String str) {
        if (str.equals(this.i)) {
            this.f7466b.setVisibility(0);
            this.c.setVisibility(8);
            webView.setVisibility(8);
        }
    }

    @Override // com.google.android.wallet.ui.common.h
    public final void a(WebView webView) {
        this.f7466b.setVisibility(8);
        this.c.setVisibility(8);
        webView.setVisibility(0);
        this.g = true;
    }

    @Override // com.google.android.wallet.ui.common.h
    public final void b(WebView webView) {
        this.f7466b.setVisibility(8);
        this.c.setVisibility(0);
        webView.setVisibility(8);
        this.g = false;
    }

    public final void a(String str, String str2) {
        if (!this.h) {
            this.i = str;
            this.j = str2;
        } else {
            b(str, str2);
        }
    }

    private void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            this.f7465a.loadUrl(str);
            return;
        }
        try {
            this.f7465a.postUrl(str, str2.getBytes(Keyczar.DEFAULT_ENCODING));
        } catch (UnsupportedEncodingException e) {
            if (com.google.android.wallet.a.a.g.b().booleanValue()) {
                throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length()).append("Couldn't post to url: ").append(str).append(" with data: ").append(str2).toString(), e);
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Couldn't post to url: ".concat(valueOf) : new String("Couldn't post to url: "));
        }
    }

    @Override // android.view.View
    public /* synthetic */ Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("pageLoaded", this.g);
        if (this.g) {
            this.f7465a.saveState(bundle);
        }
        return bundle;
    }
}
