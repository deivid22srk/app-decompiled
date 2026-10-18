package com.google.android.finsky.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class cs extends cx {
    cs() {
        super((byte) 0);
    }

    @Override // com.google.android.finsky.utils.cx
    public final Intent a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.books");
        launchIntentForPackage.setAction("android.intent.action.MAIN");
        launchIntentForPackage.setFlags(268435456);
        a(launchIntentForPackage, "authAccount", str);
        return launchIntentForPackage;
    }

    @Override // com.google.android.finsky.utils.cx
    public final Intent a(Context context, Document document, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(com.google.android.finsky.c.d.z.b()).buildUpon().appendQueryParameter("id", document.f1963a.c).build());
        intent.setPackage("com.google.android.apps.books");
        intent.setFlags(268451840);
        a(intent, "authAccount", str);
        com.google.android.finsky.protos.ea[] eaVarArr = document.f1963a.u;
        int length = eaVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            com.google.android.finsky.protos.ea eaVar = eaVarArr[i];
            if (!eaVar.B) {
                i++;
            } else {
                intent.putExtra("offerType", eaVar.A);
                break;
            }
        }
        intent.putExtra("books:addToMyEBooks", false);
        return intent;
    }

    @Override // com.google.android.finsky.utils.cx
    public final String a() {
        return "com.google.android.apps.books";
    }
}
