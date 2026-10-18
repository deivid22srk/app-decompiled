package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@gw
/* loaded from: classes.dex */
public class in extends WebViewClient {
    private static final String[] q = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] r = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: a, reason: collision with root package name */
    protected im f6063a;

    /* renamed from: b, reason: collision with root package name */
    final HashMap<String, List<ea>> f6064b;
    final Object c;
    com.google.android.gms.ads.internal.client.a d;
    com.google.android.gms.ads.internal.overlay.j e;
    public ip f;
    dn g;
    iq h;
    boolean i;
    eb j;
    boolean k;
    boolean l;
    com.google.android.gms.ads.internal.overlay.o m;
    public com.google.android.gms.ads.internal.b n;
    fp o;
    boolean p;
    private ec s;
    private final fx t;
    private fz u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;

    public in(im imVar, boolean z) {
        this(imVar, z, new fx(imVar, imVar.d(), new cm(imVar.getContext())));
    }

    private in(im imVar, boolean z, fx fxVar) {
        this.f6064b = new HashMap<>();
        this.c = new Object();
        this.i = false;
        this.f6063a = imVar;
        this.k = z;
        this.t = fxVar;
        this.o = null;
    }

    private void a(Uri uri) {
        String path = uri.getPath();
        List<ea> list = this.f6064b.get(path);
        if (list == null) {
            com.google.android.gms.ads.internal.util.client.b.d("No GMSG handler found for GMSG: " + uri);
            return;
        }
        com.google.android.gms.ads.internal.d.c();
        Map<String, String> a2 = hk.a(uri);
        if (com.google.android.gms.ads.internal.util.client.b.a(2)) {
            com.google.android.gms.ads.internal.util.client.b.d("Received GMSG: " + path);
            for (String str : a2.keySet()) {
                com.google.android.gms.ads.internal.util.client.b.d("  " + str + ": " + a2.get(str));
            }
        }
        Iterator<ea> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(this.f6063a, a2);
        }
    }

    private void a(String str, ea eaVar) {
        synchronized (this.c) {
            List<ea> list = this.f6064b.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.f6064b.put(str, list);
            }
            list.add(eaVar);
        }
    }

    private void c() {
        if (this.f != null && ((this.w && this.y <= 0) || this.x)) {
            this.f.a(this.f6063a);
            this.f = null;
        }
        this.f6063a.u();
    }

    static /* synthetic */ iq e(in inVar) {
        inVar.h = null;
        return null;
    }

    public final void a(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel) {
        boolean m = this.f6063a.m();
        a(new AdOverlayInfoParcel(adLauncherIntentInfoParcel, (!m || this.f6063a.h().e) ? this.d : null, m ? null : this.e, this.m, this.f6063a.l()));
    }

    public final void a(im imVar) {
        this.f6063a = imVar;
    }

    public final void a(boolean z, int i) {
        a(new AdOverlayInfoParcel((!this.f6063a.m() || this.f6063a.h().e) ? this.d : null, this.e, this.m, this.f6063a, z, i, this.f6063a.l()));
    }

    public final void a(boolean z, int i, String str) {
        boolean m = this.f6063a.m();
        a(new AdOverlayInfoParcel((!m || this.f6063a.h().e) ? this.d : null, m ? null : new ir(this.f6063a, this.e), this.g, this.m, this.f6063a, z, i, str, this.f6063a.l(), this.j));
    }

    public final void a(boolean z, int i, String str, String str2) {
        boolean m = this.f6063a.m();
        a(new AdOverlayInfoParcel((!m || this.f6063a.h().e) ? this.d : null, m ? null : new ir(this.f6063a, this.e), this.g, this.m, this.f6063a, z, i, str, str2, this.f6063a.l(), this.j));
    }

    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.k;
        }
        return z;
    }

    public final void b() {
        synchronized (this.c) {
            com.google.android.gms.ads.internal.util.client.b.d("Loading blank page in WebView, 2...");
            this.v = true;
            this.f6063a.a("about:blank");
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.client.b.d("Loading resource: " + str);
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            a(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.c) {
            if (this.v) {
                com.google.android.gms.ads.internal.util.client.b.d("Blank page loaded, 1...");
                this.f6063a.o();
            } else {
                this.w = true;
                c();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        a(this.f6063a.getContext(), "http_err", (i >= 0 || (-i) + (-1) >= q.length) ? String.valueOf(i) : q[(-i) - 1], str2);
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            a(this.f6063a.getContext(), "ssl_err", (primaryError < 0 || primaryError >= r.length) ? String.valueOf(primaryError) : r[primaryError], com.google.android.gms.ads.internal.d.e().a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 79:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 222:
                return true;
            default:
                return false;
        }
    }

    public final void a(dn dnVar, com.google.android.gms.ads.internal.overlay.o oVar, eb ebVar, com.google.android.gms.ads.internal.b bVar) {
        byte b2 = 0;
        if (bVar == null) {
            bVar = new com.google.android.gms.ads.internal.b((byte) 0);
        }
        this.o = new fp(this.f6063a);
        a("/appEvent", new dm(dnVar));
        a("/backButton", dp.j);
        a("/canOpenURLs", dp.f5949b);
        a("/canOpenIntents", dp.c);
        a("/click", dp.d);
        a("/close", dp.e);
        a("/customClose", dp.f);
        a("/instrument", dp.m);
        a("/delayPageLoaded", new is(this, b2));
        a("/httpTrack", dp.g);
        a("/log", dp.h);
        a("/mraid", new ed(bVar, this.o));
        a("/mraidLoaded", this.t);
        a("/open", new ee(ebVar, bVar, this.o));
        a("/precache", dp.l);
        a("/touch", dp.i);
        a("/video", dp.k);
        this.d = null;
        this.e = null;
        this.g = dnVar;
        this.j = ebVar;
        this.m = oVar;
        this.n = bVar;
        this.u = null;
        this.s = null;
        this.i = true;
        this.p = false;
    }

    private void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean a2 = this.o != null ? this.o.a() : false;
        com.google.android.gms.ads.internal.d.b();
        Context context = this.f6063a.getContext();
        boolean z = a2 ? false : true;
        if (adOverlayInfoParcel.l == 4 && adOverlayInfoParcel.d == null) {
            if (adOverlayInfoParcel.c != null) {
                com.google.android.gms.ads.internal.client.a aVar = adOverlayInfoParcel.c;
            }
            com.google.android.gms.ads.internal.d.a();
            AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = adOverlayInfoParcel.f5319b;
            com.google.android.gms.ads.internal.overlay.o oVar = adOverlayInfoParcel.j;
            com.google.android.gms.ads.internal.overlay.a.a(context, adLauncherIntentInfoParcel);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.n.e);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.a(intent, adOverlayInfoParcel);
        if (!com.google.android.gms.common.c.g.a(21)) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        com.google.android.gms.ads.internal.d.c();
        hk.a(context, intent);
    }

    private void a(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) com.google.android.gms.ads.internal.d.j().a(com.google.android.gms.ads.internal.a.f.ao)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                    com.google.android.gms.ads.internal.d.c();
                    hk.a(context, this.f6063a.l().f5352b, "gmob-apps", bundle);
                }
            }
            str4 = "";
            bundle.putString("host", str4);
            com.google.android.gms.ads.internal.d.c();
            hk.a(context, this.f6063a.l().f5352b, "gmob-apps", bundle);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        com.google.android.gms.ads.internal.util.client.b.d("AdWebView shouldOverrideUrlLoading: " + str);
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            a(parse);
        } else {
            if (this.i && webView == this.f6063a.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    if (!this.p) {
                        this.p = true;
                        if (this.d != null) {
                            ((Boolean) com.google.android.gms.ads.internal.d.j().a(com.google.android.gms.ads.internal.a.f.W)).booleanValue();
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f6063a.getWebView().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.b.e("AdWebView unable to handle URL: " + str);
            } else {
                try {
                    au k = this.f6063a.k();
                    if (k != null && k.b(parse)) {
                        parse = k.a(parse, this.f6063a.getContext());
                    }
                    uri = parse;
                } catch (zzap e) {
                    com.google.android.gms.ads.internal.util.client.b.e("Unable to append parameter to URL: " + str);
                    uri = parse;
                }
                if (this.n == null || this.n.a()) {
                    a(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
                } else {
                    com.google.android.gms.ads.internal.util.client.b.a("Action was blocked because no click was detected.");
                }
            }
        }
        return true;
    }

    static /* synthetic */ void a(in inVar) {
        synchronized (inVar.c) {
            inVar.l = true;
        }
        inVar.y++;
        inVar.c();
    }

    static /* synthetic */ void b(in inVar) {
        inVar.y--;
        inVar.c();
    }

    static /* synthetic */ void c(in inVar) {
        inVar.x = true;
        inVar.c();
    }
}
