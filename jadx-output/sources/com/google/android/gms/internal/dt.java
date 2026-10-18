package com.google.android.gms.internal;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class dt implements ea {
    dt() {
    }

    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        String str = map.get("urls");
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.client.b.e("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = imVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            hashMap.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null));
        }
        imVar.a("openableURLs", hashMap);
    }
}
