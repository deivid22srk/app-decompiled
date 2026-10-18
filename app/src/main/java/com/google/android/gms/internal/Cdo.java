package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Map;

@gw
/* renamed from: com.google.android.gms.internal.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo implements ea {
    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        String str = map.get("action");
        if ("tick".equals(str)) {
            String str2 = map.get("label");
            String str3 = map.get("start_label");
            String str4 = map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.b.e("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                com.google.android.gms.ads.internal.util.client.b.e("No timestamp given for CSI tick.");
                return;
            }
            try {
                long parseLong = (Long.parseLong(str4) - com.google.android.gms.ads.internal.d.g().a()) + com.google.android.gms.ads.internal.d.g().b();
                if (TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                cv s = imVar.s();
                cw cwVar = s.f5937b;
                cu cuVar = s.f5936a.get(str3);
                String[] strArr = {str2};
                if (cwVar != null && cuVar != null) {
                    cwVar.a(cuVar, parseLong, strArr);
                }
                Map<String, cu> map2 = s.f5936a;
                cw cwVar2 = s.f5937b;
                map2.put(str2, cwVar2 == null ? null : cwVar2.a(parseLong));
                return;
            } catch (NumberFormatException e) {
                com.google.android.gms.ads.internal.util.client.b.c("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = map.get("value");
            if (TextUtils.isEmpty(str5)) {
                com.google.android.gms.ads.internal.util.client.b.e("No value given for CSI experiment.");
                return;
            }
            cw cwVar3 = imVar.s().f5937b;
            if (cwVar3 == null) {
                com.google.android.gms.ads.internal.util.client.b.e("No ticker for WebView, dropping experiment ID.");
                return;
            } else {
                cwVar3.a("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = map.get("name");
            String str7 = map.get("value");
            if (TextUtils.isEmpty(str7)) {
                com.google.android.gms.ads.internal.util.client.b.e("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                com.google.android.gms.ads.internal.util.client.b.e("No name given for CSI extra.");
                return;
            }
            cw cwVar4 = imVar.s().f5937b;
            if (cwVar4 == null) {
                com.google.android.gms.ads.internal.util.client.b.e("No ticker for WebView, dropping extra parameter.");
            } else {
                cwVar4.a(str6, str7);
            }
        }
    }
}
