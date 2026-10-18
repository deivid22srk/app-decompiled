package com.google.android.finsky.utils;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class ct extends cx {
    ct() {
        super((byte) 0);
    }

    @Override // com.google.android.finsky.utils.cx
    public final Intent a(Context context, String str) {
        Class<?> c;
        Intent intent = new Intent("com.google.android.finsky.VIEW_MY_DOWNLOADS");
        c = cr.c();
        intent.setClass(context, c);
        intent.setFlags(268435456);
        a(intent, "account", str);
        return intent;
    }

    private static Intent a(Context context, Document document, String str, String str2) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.deivid22srk.store");
        launchIntentForPackage.setAction(str);
        launchIntentForPackage.setFlags(268435456);
        a(launchIntentForPackage, "account", str2);
        launchIntentForPackage.putExtra("asset_package", document.E().w);
        return launchIntentForPackage;
    }

    @Override // com.google.android.finsky.utils.cx
    public final Intent a(Context context, Document document, String str) {
        String str2 = document.E().w;
        com.google.android.finsky.b.b a2 = FinskyApp.a().s.a(str2);
        String str3 = null;
        if (a2 != null && a2.d != null) {
            str3 = a2.d.n;
        }
        Intent a3 = cr.a(str2, str3, context.getPackageManager());
        if (a3 == null) {
            a3 = a(context, document, "android.intent.action.RUN", str);
        }
        a3.setFlags(268435456);
        return a3;
    }

    @Override // com.google.android.finsky.utils.cx
    public final Intent b(Context context, Document document, String str) {
        return a(context, document, "android.intent.action.VIEW", str);
    }

    @Override // com.google.android.finsky.utils.cx
    public final String a() {
        return "com.deivid22srk.store";
    }
}
