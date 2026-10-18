package com.google.android.gms.internal;

import java.util.Map;

@gw
/* loaded from: classes.dex */
public final class fr {

    /* renamed from: a, reason: collision with root package name */
    final im f5983a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f5984b;
    final String c;

    public fr(im imVar, Map<String, String> map) {
        this.f5983a = imVar;
        this.c = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f5984b = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.f5984b = true;
        }
    }
}
