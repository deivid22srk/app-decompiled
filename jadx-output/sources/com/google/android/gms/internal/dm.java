package com.google.android.gms.internal;

import java.util.Map;

@gw
/* loaded from: classes.dex */
public final class dm implements ea {

    /* renamed from: a, reason: collision with root package name */
    private final dn f5947a;

    public dm(dn dnVar) {
        this.f5947a = dnVar;
    }

    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        if (map.get("name") == null) {
            com.google.android.gms.ads.internal.util.client.b.e("App event with no name parameter.");
        } else {
            map.get("info");
        }
    }
}
