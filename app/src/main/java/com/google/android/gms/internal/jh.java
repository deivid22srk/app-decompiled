package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.keyczar.Keyczar;

@gw
/* loaded from: classes.dex */
public final class jh extends in {
    public jh(im imVar, boolean z) {
        super(imVar, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        String str2;
        try {
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                return super.shouldInterceptRequest(webView, str);
            }
            if (!(webView instanceof im)) {
                com.google.android.gms.ads.internal.util.client.b.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webView, str);
            }
            im imVar = (im) webView;
            in i = imVar.i();
            synchronized (i.c) {
                i.i = false;
                i.k = true;
                hk.a(new io(i));
            }
            if (imVar.h().e) {
                str2 = (String) com.google.android.gms.ads.internal.d.j().a(com.google.android.gms.ads.internal.apkg.f.F);
            } else if (imVar.m()) {
                str2 = (String) com.google.android.gms.ads.internal.d.j().a(com.google.android.gms.ads.internal.apkg.f.E);
            } else {
                str2 = (String) com.google.android.gms.ads.internal.d.j().a(com.google.android.gms.ads.internal.apkg.f.D);
            }
            com.google.android.gms.ads.internal.util.client.b.d("shouldInterceptRequest(" + str2 + ")");
            Context context = imVar.getContext();
            String str3 = this.f6063a.l().f5352b;
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.d.c().a(context, str3));
            hashMap.put("Cache-Control", "max-stale=3600");
            hy hyVar = new hy(context);
            id idVar = new id(hyVar, (byte) 0);
            hy.f6042a.a(new ib(hyVar, str2, idVar, new ia(hyVar, str2, idVar), hashMap));
            String str4 = (String) idVar.get(60L, TimeUnit.SECONDS);
            if (str4 == null) {
                return null;
            }
            return new WebResourceResponse("application/javascript", Keyczar.DEFAULT_ENCODING, new ByteArrayInputStream(str4.getBytes(Keyczar.DEFAULT_ENCODING)));
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.b.e("Could not fetch MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, str);
        }
    }
}
