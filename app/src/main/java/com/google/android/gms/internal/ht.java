package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebSettings;

/* loaded from: classes.dex */
public class ht extends hq {
    @Override // com.google.android.gms.internal.hm
    public final void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.ho, com.google.android.gms.internal.hm
    public boolean a(Context context, WebSettings webSettings) {
        super.a(context, webSettings);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    @Override // com.google.android.gms.internal.hm
    public final void a(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        window.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
