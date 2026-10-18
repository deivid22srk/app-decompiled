package com.google.android.finsky.wear;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class af implements com.google.android.finsky.api.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f5076a;

    af(d dVar) {
        this.f5076a = dVar;
    }

    @Override // com.google.android.finsky.api.f
    public final void a(com.google.android.finsky.api.e eVar, Map<String, String> map) {
        String str = this.f5076a.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("X-DFE-Device-Checkin-Consistency-Token", str);
        }
        String f = eVar.f();
        if (!TextUtils.isEmpty(f)) {
            map.put("X-DFE-Proxy-Device-Checkin-Consistency-Token", f);
        }
    }
}
