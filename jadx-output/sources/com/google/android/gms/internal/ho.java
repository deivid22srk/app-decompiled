package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.io.File;
import java.util.Set;

/* loaded from: classes.dex */
public class ho extends hn {
    @Override // com.google.android.gms.internal.hm
    public WebChromeClient a(im imVar) {
        return new iz(imVar);
    }

    @Override // com.google.android.gms.internal.hm
    public final in a(im imVar, boolean z) {
        return new jh(imVar, z);
    }

    @Override // com.google.android.gms.internal.hm
    public final Set<String> a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    @Override // com.google.android.gms.internal.hn, com.google.android.gms.internal.hm
    public final boolean a(DownloadManager.Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    @Override // com.google.android.gms.internal.hm
    public boolean a(Context context, WebSettings webSettings) {
        super.a(context, webSettings);
        if (((File) ig.a(new hp(this, context))) != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0L);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(false);
        return true;
    }

    @Override // com.google.android.gms.internal.hm
    public final boolean a(View view) {
        view.setLayerType(0, null);
        return true;
    }

    @Override // com.google.android.gms.internal.hm
    public final boolean a(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    @Override // com.google.android.gms.internal.hm
    public final boolean b(View view) {
        view.setLayerType(1, null);
        return true;
    }
}
