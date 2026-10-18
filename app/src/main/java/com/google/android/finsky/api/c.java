package com.google.android.finsky.api;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c<T extends com.google.protobuf.nano.c> extends n<T> {
    private final Map<String, String> j;

    public c(String str, e eVar, Class<T> cls, com.android.volley.t<T> tVar, com.android.volley.s sVar) {
        super(str, eVar, cls, tVar, sVar, (byte) 0);
        this.j = new HashMap();
        this.e = false;
        this.p = true;
        this.r = true;
    }

    public final void a(String str, String str2) {
        this.j.put(str, str2);
    }

    @Override // com.android.volley.l
    public final Map<String, String> i() {
        return this.j;
    }
}
