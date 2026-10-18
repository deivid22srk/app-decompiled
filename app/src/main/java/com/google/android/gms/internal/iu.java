package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

@gw
/* loaded from: classes.dex */
public final class iu extends FrameLayout implements im {

    /* renamed from: a, reason: collision with root package name */
    private final im f6069a;

    /* renamed from: b, reason: collision with root package name */
    private final il f6070b;

    public iu(im imVar) {
        super(imVar.getContext());
        this.f6069a = imVar;
        this.f6070b = new il(imVar.d(), this, this);
        in i = this.f6069a.i();
        if (i != null) {
            i.a(this);
        }
        addView(this.f6069a.getView());
    }

    @Override // com.google.android.gms.internal.im
    public final void a() {
        this.f6069a.a();
    }

    @Override // com.google.android.gms.internal.im
    public final void a(int i) {
        this.f6069a.a(i);
    }

    @Override // com.google.android.gms.internal.im
    public final void a(AdSizeParcel adSizeParcel) {
        this.f6069a.a(adSizeParcel);
    }

    @Override // com.google.android.gms.internal.im
    public final void a(zzd zzdVar) {
        this.f6069a.a(zzdVar);
    }

    @Override // com.google.android.gms.internal.im
    public final void a(String str) {
        this.f6069a.a(str);
    }

    @Override // com.google.android.gms.internal.im
    public final void a(String str, Map<String, ?> map) {
        this.f6069a.a(str, map);
    }

    @Override // com.google.android.gms.internal.im
    public final void a(String str, JSONObject jSONObject) {
        this.f6069a.a(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.im
    public final void a(boolean z) {
        this.f6069a.a(z);
    }

    @Override // com.google.android.gms.internal.im
    public final void b() {
        this.f6069a.b();
    }

    @Override // com.google.android.gms.internal.im
    public final void b(zzd zzdVar) {
        this.f6069a.b(zzdVar);
    }

    @Override // com.google.android.gms.internal.im
    public final void b(boolean z) {
        this.f6069a.b(z);
    }

    @Override // com.google.android.gms.internal.im
    public final Activity c() {
        return this.f6069a.c();
    }

    @Override // com.google.android.gms.internal.im
    public final void c(boolean z) {
        this.f6069a.c(z);
    }

    @Override // com.google.android.gms.internal.im
    public final Context d() {
        return this.f6069a.d();
    }

    @Override // com.google.android.gms.internal.im
    public final com.google.android.gms.ads.internal.a e() {
        return this.f6069a.e();
    }

    @Override // com.google.android.gms.internal.im
    public final zzd f() {
        return this.f6069a.f();
    }

    @Override // com.google.android.gms.internal.im
    public final zzd g() {
        return this.f6069a.g();
    }

    @Override // com.google.android.gms.internal.im
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.im
    public final WebView getWebView() {
        return this.f6069a.getWebView();
    }

    @Override // com.google.android.gms.internal.im
    public final AdSizeParcel h() {
        return this.f6069a.h();
    }

    @Override // com.google.android.gms.internal.im
    public final in i() {
        return this.f6069a.i();
    }

    @Override // com.google.android.gms.internal.im
    public final boolean j() {
        return this.f6069a.j();
    }

    @Override // com.google.android.gms.internal.im
    public final au k() {
        return this.f6069a.k();
    }

    @Override // com.google.android.gms.internal.im
    public final VersionInfoParcel l() {
        return this.f6069a.l();
    }

    @Override // com.google.android.gms.internal.im
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f6069a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.im
    public final void loadUrl(String str) {
        this.f6069a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.im
    public final boolean m() {
        return this.f6069a.m();
    }

    @Override // com.google.android.gms.internal.im
    public final boolean n() {
        return this.f6069a.n();
    }

    @Override // com.google.android.gms.internal.im
    public final void onResume() {
        this.f6069a.onResume();
    }

    @Override // com.google.android.gms.internal.im
    public final boolean p() {
        return this.f6069a.p();
    }

    @Override // com.google.android.gms.internal.im
    public final il q() {
        return this.f6070b;
    }

    @Override // com.google.android.gms.internal.im
    public final cu r() {
        return this.f6069a.r();
    }

    @Override // com.google.android.gms.internal.im
    public final cv s() {
        return this.f6069a.s();
    }

    @Override // android.view.View, com.google.android.gms.internal.im
    public final void setBackgroundColor(int i) {
        this.f6069a.setBackgroundColor(i);
    }

    @Override // com.google.android.gms.internal.im
    public final void setContext(Context context) {
        this.f6069a.setContext(context);
    }

    @Override // android.view.View, com.google.android.gms.internal.im
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6069a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.im
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f6069a.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.im
    public final void setRequestedOrientation(int i) {
        this.f6069a.setRequestedOrientation(i);
    }

    @Override // com.google.android.gms.internal.im
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f6069a.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.im
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f6069a.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.im
    public final void t() {
        this.f6069a.t();
    }

    @Override // com.google.android.gms.internal.im
    public final void u() {
        this.f6069a.u();
    }

    @Override // com.google.android.gms.internal.im
    public final void onPause() {
        com.google.android.gms.common.internal.av.b("onPause must be called from the UI thread.");
        this.f6069a.onPause();
    }

    @Override // com.google.android.gms.internal.im
    public final void o() {
        il ilVar = this.f6070b;
        com.google.android.gms.common.internal.av.b("onDestroy must be called from the UI thread.");
        if (ilVar.d != null) {
            com.google.android.gms.ads.internal.overlay.m mVar = ilVar.d;
            com.google.android.gms.ads.internal.overlay.q qVar = mVar.c;
            qVar.f5331a = true;
            hk.f6031a.removeCallbacks(qVar);
            if (mVar.f5327a.c() != null && mVar.e && !mVar.f) {
                mVar.f5327a.c().getWindow().clearFlags(128);
                mVar.e = false;
            }
        }
        this.f6069a.o();
    }
}
