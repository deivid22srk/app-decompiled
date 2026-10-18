package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class bz implements ValueCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ by f5911a;

    bz(by byVar) {
        this.f5911a = byVar;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        String str2 = str;
        bw bwVar = this.f5911a.d;
        bt btVar = this.f5911a.f5910b;
        WebView webView = this.f5911a.c;
        synchronized (btVar.f5899a) {
            btVar.d--;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                String optString = new JSONObject(str2).optString("text");
                if (TextUtils.isEmpty(webView.getTitle())) {
                    btVar.a(optString);
                } else {
                    btVar.a(webView.getTitle() + "\n" + optString);
                }
            }
            if (btVar.a()) {
                bwVar.f5905a.b(btVar);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.b.a("Json string may be malformed.");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to get webview content.", th);
            bwVar.f5906b.a(th, true);
        }
    }
}
