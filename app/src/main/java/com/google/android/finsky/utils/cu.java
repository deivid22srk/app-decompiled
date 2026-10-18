package com.google.android.finsky.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class cu extends cx {
    cu() {
        super((byte) 0);
    }

    @Override // com.google.android.finsky.utils.cx
    public final Intent a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.google.android.videos");
        launchIntentForPackage.setAction("android.intent.action.MAIN");
        launchIntentForPackage.setFlags(268435456);
        launchIntentForPackage.addFlags(67108864);
        a(launchIntentForPackage, "authAccount", str);
        return launchIntentForPackage;
    }

    @Override // com.google.android.finsky.utils.cx
    public final Intent b(Context context, Document document, String str) {
        Intent a2 = a(context, str);
        a2.putExtra("download_video_id", document.f1963a.c);
        return a2;
    }

    @Override // com.google.android.finsky.utils.cx
    public final String a() {
        return "com.google.android.videos";
    }

    @Override // com.google.android.finsky.utils.cx
    public final Intent a(Context context, Document document, String str) {
        String str2;
        if (document.f1963a.g == 4) {
            str2 = document.f1963a.L;
        } else {
            str2 = null;
        }
        Intent intent = new Intent("com.google.android.videos.intent.action.VIEW", Uri.parse(str2));
        intent.setPackage("com.google.android.videos");
        intent.setFlags(268451840);
        a(intent, "authAccount", str);
        return intent;
    }
}
