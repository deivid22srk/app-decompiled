package com.google.android.gms.internal;

import android.view.View;
import android.webkit.WebChromeClient;

@gw
/* loaded from: classes.dex */
public final class ji extends iz {
    public ji(im imVar) {
        super(imVar);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        a(view, i, customViewCallback);
    }
}
