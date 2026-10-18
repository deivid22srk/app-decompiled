package com.google.android.finsky.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.android.vending.R;

/* loaded from: classes.dex */
public class WebViewDialog extends android.support.v7.a.ae {
    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) WebViewDialog.class);
        intent.putExtra("android.intent.extra.TITLE", R.string.os_licenses_label);
        intent.putExtra("android.intent.extra.STREAM", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getIntent().getIntExtra("android.intent.extra.TITLE", R.string.app_name));
        setContentView(R.layout.activity_licenses);
        ((WebView) findViewById(R.id.content)).loadUrl(getIntent().getStringExtra("android.intent.extra.STREAM"));
    }
}
