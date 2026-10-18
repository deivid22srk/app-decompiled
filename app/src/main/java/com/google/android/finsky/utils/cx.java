package com.google.android.finsky.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
abstract class cx {
    public abstract Intent a(Context context, Document document, String str);

    public abstract Intent a(Context context, String str);

    public abstract String a();

    /* synthetic */ cx(byte b2) {
        this();
    }

    private cx() {
    }

    public Intent b(Context context, Document document, String str) {
        return a(context, document, str);
    }

    protected final Intent a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setPackage(a());
        a(intent, "authAccount", str2);
        return intent;
    }

    protected static final void a(Intent intent, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra(str, str2);
        }
    }
}
