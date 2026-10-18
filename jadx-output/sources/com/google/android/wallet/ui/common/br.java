package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.webkit.WebView;

/* loaded from: classes2.dex */
final class br extends WebView {
    /* synthetic */ br(Context context, byte b2) {
        this(context);
    }

    private br(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    @TargetApi(11)
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 11 && Build.VERSION.SDK_INT < 19) {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
        }
    }
}
