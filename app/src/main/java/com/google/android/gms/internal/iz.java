package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzd;

@gw
/* loaded from: classes.dex */
public class iz extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final im f6077a;

    public iz(im imVar) {
        this.f6077a = imVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Context a(WebView webView) {
        if (!(webView instanceof im)) {
            return webView.getContext();
        }
        im imVar = (im) webView;
        Activity c = imVar.c();
        return c == null ? imVar.getContext() : c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof im)) {
            com.google.android.gms.ads.internal.util.client.b.e("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzd f = ((im) webView).f();
        if (f == null) {
            com.google.android.gms.ads.internal.util.client.b.e("Tried to close an AdWebView not associated with an overlay.");
        } else {
            f.a();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (jg.f6087a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                com.google.android.gms.ads.internal.util.client.b.b(str);
                break;
            case 2:
                com.google.android.gms.ads.internal.util.client.b.e(str);
                break;
            case 3:
            case 4:
                com.google.android.gms.ads.internal.util.client.b.c(str);
                break;
            case 5:
                com.google.android.gms.ads.internal.util.client.b.a(str);
                break;
            default:
                com.google.android.gms.ads.internal.util.client.b.c(str);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.f6077a.i());
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(Math.min(131072L, j4) + j, 1048576L);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        zzd f = this.f6077a.f();
        if (f == null) {
            com.google.android.gms.ads.internal.util.client.b.e("Could not get ad overlay when hiding custom view.");
        } else {
            f.b();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(a(webView), str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = 131072 + j;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        a(view, -1, customViewCallback);
    }

    private static boolean a(Context context, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(str);
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str2);
                EditText editText = new EditText(context);
                editText.setText(str3);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builder.setView(linearLayout).setPositiveButton(android.R.string.ok, new jf(jsPromptResult, editText)).setNegativeButton(android.R.string.cancel, new je(jsPromptResult)).setOnCancelListener(new jd(jsPromptResult)).create().show();
            } else {
                builder.setMessage(str2).setPositiveButton(android.R.string.ok, new jc(jsResult)).setNegativeButton(android.R.string.cancel, new jb(jsResult)).setOnCancelListener(new ja(jsResult)).create().show();
            }
        } catch (WindowManager.BadTokenException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Fail to display Dialog.", e);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            com.google.android.gms.ads.internal.d.c();
            if (!hk.a(this.f6077a.getContext().getPackageManager(), this.f6077a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) {
                com.google.android.gms.ads.internal.d.c();
                if (!hk.a(this.f6077a.getContext().getPackageManager(), this.f6077a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    protected final void a(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        zzd f = this.f6077a.f();
        if (f == null) {
            com.google.android.gms.ads.internal.util.client.b.e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        f.h = new FrameLayout(f.f5334b);
        f.h.setBackgroundColor(-16777216);
        f.h.addView(view, -1, -1);
        f.f5334b.setContentView(f.h);
        f.o = true;
        f.i = customViewCallback;
        f.g = true;
        f.a(i);
    }
}
