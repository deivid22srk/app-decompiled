package com.google.android.finsky.utils;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class cw extends cx {
    cw() {
        super((byte) 0);
    }

    @Override // com.google.android.finsky.utils.cx
    public final Intent a(Context context, Document document, String str) {
        Intent intent = new Intent("com.google.android.music.PLAY");
        intent.putExtra("storeId", document.f1963a.c);
        a(intent, "authAccount", str);
        intent.setFlags(268435456);
        return intent;
    }

    @Override // com.google.android.finsky.utils.cx
    public final Intent a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.google.android.music");
        launchIntentForPackage.setAction("android.intent.action.VIEW");
        a(launchIntentForPackage, "authAccount", str);
        launchIntentForPackage.setFlags(268435456);
        return launchIntentForPackage;
    }

    @Override // com.google.android.finsky.utils.cx
    public final String a() {
        return "com.google.android.music";
    }
}
