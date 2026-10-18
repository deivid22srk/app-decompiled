package com.google.android.play.article;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class l extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f6809a = Pattern.compile("https?", 2);

    private l() {
    }

    /* synthetic */ l(byte b2) {
        this();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return !TextUtils.isEmpty(str) && a(webView.getContext(), str);
    }

    private static boolean a(Context context, String str) {
        Uri parse = Uri.parse(str);
        if (!f6809a.matcher(parse.getScheme()).matches()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(parse);
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }
}
