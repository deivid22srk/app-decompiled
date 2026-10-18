package com.google.android.libraries.happiness;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.r;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.android.vending.R;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class HatsSurveyManager {

    /* renamed from: a, reason: collision with root package name */
    protected HatsSurveyClientImpl f6725a;

    /* renamed from: b, reason: collision with root package name */
    protected l f6726b;
    protected final WebView c;
    private final Context d;
    private final Handler e;
    private final int f;
    private final int g;
    private b h;

    public class HatsSurveyClientImpl implements a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f6727a;

        /* renamed from: b, reason: collision with root package name */
        private final a f6728b;
        private final WebView c;
        private boolean d = false;

        public HatsSurveyClientImpl(a aVar, Handler handler, WebView webView) {
            this.f6728b = aVar;
            this.f6727a = handler;
            this.c = webView;
        }

        public boolean isComplete() {
            return this.d;
        }

        @Override // com.google.android.libraries.happiness.a
        @JavascriptInterface
        public void onWindowError() {
            this.d = false;
            this.f6727a.post(new g(this));
        }

        @Override // com.google.android.libraries.happiness.a
        @JavascriptInterface
        public void onSurveyReady() {
            this.d = false;
            this.f6727a.post(new h(this));
        }

        @Override // com.google.android.libraries.happiness.a
        @JavascriptInterface
        public void onSurveyComplete(boolean z, boolean z2) {
            this.d = true;
            this.f6727a.post(new i(this, z, z2));
        }

        @Override // com.google.android.libraries.happiness.a
        @JavascriptInterface
        public void onSurveyResponse(String str, String str2) {
            if (str.contains("t=a")) {
                this.f6727a.post(new j(this, str, str2));
            }
        }

        @Override // com.google.android.libraries.happiness.a
        @JavascriptInterface
        public void onSurveyCanceled() {
            this.f6727a.post(new k(this));
        }
    }

    public HatsSurveyManager(Context context, a aVar, l lVar) {
        if (context == null) {
            throw new NullPointerException();
        }
        if (aVar == null) {
            throw new NullPointerException();
        }
        this.d = context;
        this.c = new WebView(this.d);
        this.e = new Handler(this.d.getMainLooper());
        this.f6726b = lVar;
        this.f6725a = new HatsSurveyClientImpl(aVar, this.e, this.c);
        this.f = R.layout.survey_dialog;
        this.g = R.id.survey_container;
        WebSettings settings = this.c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(true);
        String a2 = this.f6726b.a("user_agent");
        if (a2 != null) {
            settings.setUserAgentString(a2);
        }
        this.c.addJavascriptInterface(this.f6725a, "_402m_native");
        this.c.setOnLongClickListener(new c(this));
        this.c.setWebChromeClient(new d(this));
        this.c.setWebViewClient(new e(this));
        String a3 = this.f6726b.a("survey_url");
        if (a3 == null) {
            return;
        }
        try {
            String lowerCase = new URL(a3).getHost().toLowerCase();
            int indexOf = lowerCase.indexOf("google.");
            String str = "." + lowerCase.substring(indexOf >= 0 ? indexOf : 0);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, 1);
            String format = simpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
            String a4 = this.f6726b.a("zwieback_cookie");
            if (a4 == null) {
                return;
            }
            a4 = a4.startsWith("NID=") ? a4 : "NID=" + a4;
            CookieSyncManager.createInstance(this.c.getContext().getApplicationContext());
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setCookie(str, a4 + "; expires=" + format + "; path=/; domain=" + str + "; HttpOnly");
            CookieSyncManager.getInstance().sync();
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Value for HatsSurveyParams.SURVEY_URL_KEY is an invalid URL: " + a3);
        }
    }

    public final r a() {
        if (this.h == null) {
            this.h = new b();
            this.h.f(new Bundle());
            this.h.aj = new f(this);
            b bVar = this.h;
            bVar.ai = this.c;
            bVar.u();
            this.h.a(2, android.R.style.Theme.Panel);
        }
        return this.h;
    }

    private static String a(String str, String[] strArr) {
        String join = strArr == null ? "" : TextUtils.join(", ", Arrays.asList(strArr));
        return String.format("_402m['%s'] = function(%s) { _402m_native.%s(%s); };\n", str, join, str, join);
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 11) {
            this.c.onResume();
        }
        this.c.loadUrl("about:blank");
        this.c.loadData("<!doctype><html><head><meta name=\"viewport\" content=\"initial-scale=1.0,user-scalable=no\"><script>_402m = {};" + a("onWindowError", null) + "window.onerror=function(){_402m.onWindowError();};" + a("onSurveyReady", null) + a("onSurveyComplete", new String[]{"justAnswered", "unused"}) + a("onSurveyCanceled", null) + "_402m['onSurveyResponse'] = function(response) {var surveyId = _402.params.svyid;_402m_native.onSurveyResponse(response, surveyId);};\n" + this.f6726b.b("_402m") + "</script>" + String.format("<script src=\"%s?site=%s&force_http=1\"></script>", this.f6726b.a("survey_url"), this.f6726b.a("site_id")) + "</head><body></body></html>", "text/html", null);
    }

    public final void c() {
        this.c.loadUrl("javascript:try { _402.close(true) } catch(e) {}");
    }
}
