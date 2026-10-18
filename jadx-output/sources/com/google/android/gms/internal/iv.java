package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@gw
/* loaded from: classes.dex */
public final class iv extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, im {
    private Map<String, el> A;
    private final WindowManager B;

    /* renamed from: a, reason: collision with root package name */
    private final ix f6071a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6072b;
    private final au c;
    private final VersionInfoParcel d;
    private final com.google.android.gms.ads.internal.a e;
    private in f;
    private zzd g;
    private AdSizeParcel h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private Boolean m;
    private int n;
    private boolean o;
    private String p;
    private cu q;
    private cu r;
    private cu s;
    private cv t;
    private zzd u;
    private ih v;
    private int w;
    private int x;
    private int y;
    private int z;

    private void A() {
        synchronized (this.f6072b) {
            if (this.l) {
                com.google.android.gms.ads.internal.d.e().a((View) this);
            }
            this.l = false;
        }
    }

    public static iv a(Context context, AdSizeParcel adSizeParcel, VersionInfoParcel versionInfoParcel) {
        return new iv(new ix(context), adSizeParcel, versionInfoParcel);
    }

    private void b(String str) {
        synchronized (this.f6072b) {
            if (n()) {
                com.google.android.gms.ads.internal.util.client.b.e("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    private Boolean w() {
        Boolean bool;
        synchronized (this.f6072b) {
            bool = this.m;
        }
        return bool;
    }

    private void y() {
        synchronized (this.f6072b) {
            if (this.k || this.h.e) {
                if (Build.VERSION.SDK_INT < 14) {
                    com.google.android.gms.ads.internal.util.client.b.a("Disabling hardware acceleration on an overlay.");
                    z();
                } else {
                    com.google.android.gms.ads.internal.util.client.b.a("Enabling hardware acceleration on an overlay.");
                    A();
                }
            } else if (Build.VERSION.SDK_INT < 18) {
                com.google.android.gms.ads.internal.util.client.b.a("Disabling hardware acceleration on an AdView.");
                z();
            } else {
                com.google.android.gms.ads.internal.util.client.b.a("Enabling hardware acceleration on an AdView.");
                A();
            }
        }
    }

    private void z() {
        synchronized (this.f6072b) {
            if (!this.l) {
                com.google.android.gms.ads.internal.d.e().b(this);
            }
            this.l = true;
        }
    }

    @Override // com.google.android.gms.internal.im
    public final void a() {
        x();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.d.f5352b);
        a("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.im
    public final void a(int i) {
        x();
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.d.f5352b);
        a("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.im
    public final void a(AdSizeParcel adSizeParcel) {
        synchronized (this.f6072b) {
            this.h = adSizeParcel;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.im
    public final void a(zzd zzdVar) {
        synchronized (this.f6072b) {
            this.g = zzdVar;
        }
    }

    @Override // com.google.android.gms.internal.im
    public final void a(String str) {
        synchronized (this.f6072b) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.b.e("Could not call loadUrl. " + th);
            }
        }
    }

    @Override // com.google.android.gms.internal.im
    public final void a(String str, Map<String, ?> map) {
        try {
            a(str, com.google.android.gms.ads.internal.d.c().a(map));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.b.e("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.im
    public final void a(boolean z) {
        synchronized (this.f6072b) {
            this.k = z;
            y();
        }
    }

    @Override // com.google.android.gms.internal.im
    public final void b(zzd zzdVar) {
        synchronized (this.f6072b) {
            this.u = zzdVar;
        }
    }

    @Override // com.google.android.gms.internal.im
    public final void b(boolean z) {
        synchronized (this.f6072b) {
            if (this.g != null) {
                this.g.a(this.f.a(), z);
            } else {
                this.i = z;
            }
        }
    }

    @Override // com.google.android.gms.internal.im
    public final void c(boolean z) {
        synchronized (this.f6072b) {
            this.o = z;
        }
    }

    @Override // com.google.android.gms.internal.im
    public final com.google.android.gms.ads.internal.a e() {
        return this.e;
    }

    @Override // android.webkit.WebView
    public final void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        synchronized (this.f6072b) {
            if (!n()) {
                super.evaluateJavascript(str, valueCallback);
                return;
            }
            com.google.android.gms.ads.internal.util.client.b.e("The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        }
    }

    @Override // com.google.android.gms.internal.im
    public final zzd f() {
        zzd zzdVar;
        synchronized (this.f6072b) {
            zzdVar = this.g;
        }
        return zzdVar;
    }

    @Override // com.google.android.gms.internal.im
    public final zzd g() {
        zzd zzdVar;
        synchronized (this.f6072b) {
            zzdVar = this.u;
        }
        return zzdVar;
    }

    @Override // com.google.android.gms.internal.im
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.im
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.im
    public final AdSizeParcel h() {
        AdSizeParcel adSizeParcel;
        synchronized (this.f6072b) {
            adSizeParcel = this.h;
        }
        return adSizeParcel;
    }

    @Override // com.google.android.gms.internal.im
    public final in i() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.im
    public final boolean j() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.im
    public final au k() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.im
    public final VersionInfoParcel l() {
        return this.d;
    }

    @Override // android.webkit.WebView
    public final void loadData(String str, String str2, String str3) {
        synchronized (this.f6072b) {
            if (n()) {
                com.google.android.gms.ads.internal.util.client.b.e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadData(str, str2, str3);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.im
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.f6072b) {
            if (n()) {
                com.google.android.gms.ads.internal.util.client.b.e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.im
    public final void loadUrl(String str) {
        synchronized (this.f6072b) {
            if (n()) {
                com.google.android.gms.ads.internal.util.client.b.e("The webview is destroyed. Ignoring action.");
            } else {
                try {
                    super.loadUrl(str);
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.b.e("Could not call loadUrl. " + th);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.im
    public final boolean m() {
        boolean z;
        synchronized (this.f6072b) {
            z = this.k;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.im
    public final boolean n() {
        boolean z;
        synchronized (this.f6072b) {
            z = this.j;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.im
    public final void o() {
        synchronized (this.f6072b) {
            com.google.android.gms.ads.internal.util.client.b.d("Destroying WebView!");
            hk.f6031a.post(new iw(this));
        }
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.d.c();
            hk.a(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.b.a("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (n()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        synchronized (this.f6072b) {
            if (n()) {
                setMeasuredDimension(0, 0);
                return;
            }
            if (isInEditMode() || this.k || this.h.i || this.h.j) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.h.e) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.B.getDefaultDisplay().getMetrics(displayMetrics);
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            int i3 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
            int i4 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size2 : Integer.MAX_VALUE;
            if (this.h.g > i3 || this.h.d > i4) {
                float f = this.f6071a.getResources().getDisplayMetrics().density;
                com.google.android.gms.ads.internal.util.client.b.e("Not enough space to show ad. Needs " + ((int) (this.h.g / f)) + "x" + ((int) (this.h.d / f)) + " dp, but only has " + ((int) (size / f)) + "x" + ((int) (size2 / f)) + " dp.");
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
            } else {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                setMeasuredDimension(this.h.g, this.h.d);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.c != null) {
            this.c.a(motionEvent);
        }
        if (n()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.im
    public final il q() {
        return null;
    }

    @Override // com.google.android.gms.internal.im
    public final cu r() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.im
    public final cv s() {
        return this.t;
    }

    @Override // com.google.android.gms.internal.im
    public final void setRequestedOrientation(int i) {
        synchronized (this.f6072b) {
            this.n = i;
            if (this.g != null) {
                this.g.a(this.n);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.im
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof in) {
            this.f = (in) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (n()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.b.b("Could not stop loading webview.", e);
        }
    }

    private iv(ix ixVar, AdSizeParcel adSizeParcel, VersionInfoParcel versionInfoParcel) {
        super(ixVar);
        this.f6072b = new Object();
        this.o = true;
        this.p = "";
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.f6071a = ixVar;
        this.h = adSizeParcel;
        this.k = true;
        this.n = -1;
        this.c = null;
        this.d = versionInfoParcel;
        this.e = null;
        this.B = (WindowManager) getContext().getSystemService("window");
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.d.c().a(ixVar, versionInfoParcel.f5352b));
        com.google.android.gms.ads.internal.d.e().a(getContext(), settings);
        setDownloadListener(this);
        y();
        if (com.google.android.gms.common.c.g.a(17)) {
            addJavascriptInterface(new iy(this), "googleAdsJsInterface");
        }
        this.v = new ih(this.f6071a.f6074a, this);
        B();
        this.t = new cv(new cw("make_wv", this.h.f5300b));
        cw cwVar = this.t.f5937b;
        synchronized (cwVar.f5939b) {
            cwVar.c = null;
        }
        this.r = cp.a(this.t.f5937b);
        this.t.a("native:view_create", this.r);
        this.s = null;
        this.q = null;
    }

    private boolean v() {
        int i;
        int i2;
        if (!this.f.a()) {
            return false;
        }
        com.google.android.gms.ads.internal.d.c();
        DisplayMetrics a2 = hk.a(this.B);
        com.google.android.gms.ads.internal.client.j.a();
        int b2 = com.google.android.gms.ads.internal.util.client.a.b(a2, a2.widthPixels);
        com.google.android.gms.ads.internal.client.j.a();
        int b3 = com.google.android.gms.ads.internal.util.client.a.b(a2, a2.heightPixels);
        Activity activity = this.f6071a.f6074a;
        if (activity == null || activity.getWindow() == null) {
            i = b3;
            i2 = b2;
        } else {
            com.google.android.gms.ads.internal.d.c();
            int[] a3 = hk.a(activity);
            com.google.android.gms.ads.internal.client.j.a();
            i2 = com.google.android.gms.ads.internal.util.client.a.b(a2, a3[0]);
            com.google.android.gms.ads.internal.client.j.a();
            i = com.google.android.gms.ads.internal.util.client.a.b(a2, a3[1]);
        }
        if (this.x == b2 && this.w == b3 && this.y == i2 && this.z == i) {
            return false;
        }
        boolean z = (this.x == b2 && this.w == b3) ? false : true;
        this.x = b2;
        this.w = b3;
        this.y = i2;
        this.z = i;
        new fy(this).a(b2, b3, i2, i, a2.density, this.B.getDefaultDisplay().getRotation());
        return z;
    }

    private void a(Boolean bool) {
        this.m = bool;
        gz f = com.google.android.gms.ads.internal.d.f();
        synchronized (f.f6012a) {
            f.f6013b = bool;
        }
    }

    @Override // com.google.android.gms.internal.im
    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("AFMA_ReceiveMessage('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        com.google.android.gms.ads.internal.util.client.b.d("Dispatching AFMA event: " + sb.toString());
        String sb2 = sb.toString();
        if (!com.google.android.gms.common.c.g.a(19)) {
            b("javascript:" + sb2);
            return;
        }
        if (w() == null) {
            synchronized (this.f6072b) {
                this.m = com.google.android.gms.ads.internal.d.f().c();
                if (this.m == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        a((Boolean) true);
                    } catch (IllegalStateException e) {
                        a((Boolean) false);
                    }
                }
            }
        }
        if (!w().booleanValue()) {
            b("javascript:" + sb2);
            return;
        }
        synchronized (this.f6072b) {
            if (n()) {
                com.google.android.gms.ads.internal.util.client.b.e("The webview is destroyed. Ignoring action.");
            } else {
                evaluateJavascript(sb2, null);
            }
        }
    }

    private void x() {
        cp.a(this.t.f5937b, this.q, "aeh");
    }

    @Override // com.google.android.gms.internal.im
    public final void b() {
        if (this.q == null) {
            cp.a(this.t.f5937b, this.s, "aes");
            this.q = cp.a(this.t.f5937b);
            this.t.a("native:view_show", this.q);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.d.f5352b);
        a("onshow", hashMap);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean v = v();
        zzd f = f();
        if (f != null && v && f.m) {
            f.m = false;
            f.m();
        }
    }

    @Override // com.google.android.gms.internal.im
    public final void t() {
        ih ihVar = this.v;
        ihVar.c = true;
        if (ihVar.f6056b) {
            ihVar.a();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        synchronized (this.f6072b) {
            super.onAttachedToWindow();
            if (!n()) {
                ih ihVar = this.v;
                ihVar.f6056b = true;
                if (ihVar.c) {
                    ihVar.a();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        synchronized (this.f6072b) {
            if (!n()) {
                ih ihVar = this.v;
                ihVar.f6056b = false;
                ihVar.b();
            }
            super.onDetachedFromWindow();
        }
    }

    @Override // com.google.android.gms.internal.im
    public final void setContext(Context context) {
        this.f6071a.setBaseContext(context);
        this.v.f6055a = this.f6071a.f6074a;
    }

    @Override // com.google.android.gms.internal.im
    public final Activity c() {
        return this.f6071a.f6074a;
    }

    @Override // com.google.android.gms.internal.im
    public final Context d() {
        return this.f6071a.f6075b;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        synchronized (this.f6072b) {
            B();
            ih ihVar = this.v;
            ihVar.c = false;
            ihVar.b();
            if (this.g != null) {
                this.g.a();
                this.g.k();
                this.g = null;
            }
            in inVar = this.f;
            synchronized (inVar.c) {
                inVar.f6064b.clear();
                inVar.d = null;
                inVar.e = null;
                inVar.f = null;
                inVar.g = null;
                inVar.i = false;
                inVar.k = false;
                inVar.l = false;
                inVar.j = null;
                inVar.m = null;
                inVar.h = null;
                if (inVar.o != null) {
                    inVar.o.a(true);
                    inVar.o = null;
                }
                inVar.p = false;
            }
            if (this.j) {
                return;
            }
            com.google.android.gms.ads.internal.d.l();
            ek.a(this);
            synchronized (this.f6072b) {
                if (this.A != null) {
                    Iterator<el> it = this.A.values().iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
            this.j = true;
            com.google.android.gms.ads.internal.util.client.b.d("Initiating WebView self destruct sequence in 3...");
            this.f.b();
        }
    }

    @Override // com.google.android.gms.internal.im
    public final void u() {
        if (this.s == null) {
            this.s = cp.a(this.t.f5937b);
            this.t.a("native:view_load", this.s);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.im
    public final void onPause() {
        if (n()) {
            return;
        }
        try {
            if (com.google.android.gms.common.c.g.a(11)) {
                super.onPause();
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.b.b("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.im
    public final void onResume() {
        if (n()) {
            return;
        }
        try {
            if (com.google.android.gms.common.c.g.a(11)) {
                super.onResume();
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.b.b("Could not resume webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.im
    public final boolean p() {
        boolean z;
        synchronized (this.f6072b) {
            cp.a(this.t.f5937b, this.q, "aebb");
            z = this.o;
        }
        return z;
    }

    private void B() {
        cw cwVar;
        if (this.t == null || (cwVar = this.t.f5937b) == null || com.google.android.gms.ads.internal.d.f().a() == null) {
            return;
        }
        com.google.android.gms.ads.internal.d.f().a().f5930a.offer(cwVar);
    }
}
