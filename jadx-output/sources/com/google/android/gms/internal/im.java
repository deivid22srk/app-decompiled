package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

@gw
/* loaded from: classes.dex */
public interface im {
    void a();

    void a(int i);

    void a(AdSizeParcel adSizeParcel);

    void a(zzd zzdVar);

    void a(String str);

    void a(String str, Map<String, ?> map);

    void a(String str, JSONObject jSONObject);

    void a(boolean z);

    void b();

    void b(zzd zzdVar);

    void b(boolean z);

    Activity c();

    void c(boolean z);

    Context d();

    com.google.android.gms.ads.internal.a e();

    zzd f();

    zzd g();

    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    View getView();

    WebView getWebView();

    AdSizeParcel h();

    in i();

    boolean j();

    au k();

    VersionInfoParcel l();

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    boolean m();

    void measure(int i, int i2);

    boolean n();

    void o();

    void onPause();

    void onResume();

    boolean p();

    il q();

    cu r();

    cv s();

    void setBackgroundColor(int i);

    void setContext(Context context);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t();

    void u();
}
