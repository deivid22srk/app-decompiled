package com.google.android.wallet.d;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.h.r;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;
import com.google.android.wallet.e.i;
import com.google.android.wallet.ui.common.ag;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class d extends com.google.android.wallet.ui.common.g {
    private static String i;

    /* renamed from: a, reason: collision with root package name */
    final r<String, Long> f7314a;

    /* renamed from: b, reason: collision with root package name */
    final r<String, Boolean> f7315b;
    final HashSet<String> c;
    final HashSet<String> d;
    b e;
    public g f;
    public ag g;
    private final Context j;
    private final Handler k;
    private final Pattern l;
    private final Pattern m;
    private final boolean n;
    private final ArrayList<Pattern> o;
    private int p = -1;
    private DisplayMetrics q;

    @TargetApi(11)
    public d(Context context, WebView webView, String str, String str2, boolean z, String[] strArr) {
        if (Build.VERSION.SDK_INT < 14) {
            throw new IllegalStateException("RedirectWebViewClient is not supported on API < 14.");
        }
        this.j = context;
        this.k = new Handler();
        this.l = TextUtils.isEmpty(str) ? null : Pattern.compile(str);
        this.m = TextUtils.isEmpty(str2) ? null : Pattern.compile(str2);
        this.n = z;
        this.o = a(strArr);
        this.f7314a = new r<>(25);
        this.f7315b = new r<>(25);
        this.c = new HashSet<>(25);
        this.d = new HashSet<>(5);
        if (Build.VERSION.SDK_INT >= 19) {
            webView.addJavascriptInterface(new c(this), "comGoogleAndroidWalletInterceptor");
        }
    }

    @Override // com.google.android.wallet.ui.common.g, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        b(str);
        this.d.add(str);
        a(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (!this.d.contains(str)) {
            if (com.google.android.wallet.a.e.f7231b.b().booleanValue()) {
                a(0, str, 0, (String) null);
            }
            this.f7314a.remove(str);
            this.c.remove(str);
            this.f7315b.remove(str);
        }
    }

    @Override // com.google.android.wallet.ui.common.g, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (str.startsWith("http")) {
            this.e = null;
            if (i == null) {
                try {
                    i = a(this.j.getResources().openRawResource(i.redirect_intercept));
                } catch (IOException e) {
                    throw new RuntimeException("Failed to load intercept js file.", e);
                }
            }
            String valueOf = String.valueOf(i);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
        }
        a(0, str, 0, (String) null);
        this.f7314a.remove(str);
        this.c.remove(str);
        this.d.remove(str);
        this.f7315b.remove(str);
    }

    @Override // com.google.android.wallet.ui.common.g, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        a(40, str2, i2, str);
        g gVar = this.f;
        if (gVar == null) {
            return;
        }
        this.k.post(new f(this, gVar, str2, i2, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        b(str);
        return a(str) || super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        b(str);
        if (!a(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        Charset defaultCharset = Charset.defaultCharset();
        return new WebResourceResponse("text/html", defaultCharset.name(), new ByteArrayInputStream("".getBytes(defaultCharset)));
    }

    private boolean a(String str) {
        boolean z;
        boolean z2;
        if (this.f7315b.containsKey(str)) {
            return this.f7315b.get(str).booleanValue();
        }
        if (this.l != null && this.l.matcher(str).matches()) {
            if (this.e != null && this.e.c()) {
                a(2, this.f, str, this.e);
                a(41, str, 0, (String) null);
                z2 = true;
                this.f7315b.put(str, Boolean.valueOf(z2));
                return z2;
            }
        }
        if (this.m != null && this.m.matcher(str).matches()) {
            a(1, this.f, str, this.e);
            a(42, str, 0, (String) null);
            z2 = true;
        } else {
            int size = this.o.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                if (this.o.get(i2).matcher(str).matches()) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                if (this.n) {
                    a(3, this.f, str, (b) null);
                    a(43, str, 0, (String) null);
                    z2 = true;
                } else {
                    a(44, str, 0, (String) null);
                }
            }
            z2 = false;
        }
        this.f7315b.put(str, Boolean.valueOf(z2));
        return z2;
    }

    private void a(int i2, g gVar, String str, b bVar) {
        if (gVar != null) {
            this.k.post(new e(this, i2, gVar, str, bVar));
        }
    }

    private void a(int i2, String str, int i3, String str2) {
        if (this.g != null && !this.c.contains(str) && com.google.android.wallet.a.e.f7230a.b().booleanValue()) {
            this.c.add(str);
            WebViewPageLoadEvent webViewPageLoadEvent = new WebViewPageLoadEvent();
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.query(null);
            buildUpon.fragment(null);
            webViewPageLoadEvent.f7234a = buildUpon.build().toString();
            webViewPageLoadEvent.f7235b = this.f7314a.containsKey(str) ? this.f7314a.get(str).longValue() : -1L;
            webViewPageLoadEvent.c = i3;
            if (str2 != null) {
                webViewPageLoadEvent.d = str2;
            }
            webViewPageLoadEvent.e = this.j.getResources().getConfiguration().orientation;
            DisplayMetrics displayMetrics = this.q;
            if (displayMetrics == null || webViewPageLoadEvent.e != this.p) {
                displayMetrics = com.google.android.wallet.common.util.a.b(this.j);
                this.p = webViewPageLoadEvent.e;
                this.q = displayMetrics;
            }
            webViewPageLoadEvent.f = displayMetrics.widthPixels;
            webViewPageLoadEvent.g = displayMetrics.heightPixels;
            webViewPageLoadEvent.h = displayMetrics.xdpi;
            webViewPageLoadEvent.i = displayMetrics.ydpi;
            Bundle bundle = new Bundle();
            bundle.putInt("FormEventListener.EXTRA_BACKGROUND_EVENT_TYPE", 772);
            bundle.putParcelable("FormEventListener.EXTRA_BACKGROUND_EVENT_DATA", webViewPageLoadEvent);
            bundle.putInt("FormEventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", i2);
            this.g.a(7, bundle);
        }
    }

    private void b(String str) {
        if (!this.f7314a.containsKey(str)) {
            this.f7314a.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    private static String a(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(200);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Keyczar.DEFAULT_ENCODING));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    try {
                        break;
                    } catch (IOException e) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                }
            }
        }
        return sb.toString();
    }

    private static ArrayList<Pattern> a(String[] strArr) {
        ArrayList<Pattern> arrayList = new ArrayList<>(strArr.length);
        for (String str : strArr) {
            arrayList.add(Pattern.compile(str));
        }
        return arrayList;
    }
}
