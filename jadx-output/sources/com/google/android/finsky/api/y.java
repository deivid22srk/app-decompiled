package com.google.android.finsky.api;

import com.google.protobuf.nano.c;

/* loaded from: classes.dex */
public class y<T extends com.google.protobuf.nano.c> extends n<T> {
    private final com.google.protobuf.nano.c j;

    public y(String str, com.google.protobuf.nano.c cVar, e eVar, Class<T> cls, com.android.volley.t<T> tVar, com.android.volley.s sVar) {
        super(str, eVar, cls, tVar, sVar, (byte) 0);
        this.j = cVar;
        this.e = false;
        this.p = true;
        this.r = true;
    }

    @Override // com.android.volley.l
    public final String j() {
        return "application/x-protobuf";
    }

    @Override // com.android.volley.l
    public final byte[] k() {
        return com.google.protobuf.nano.c.a(this.j);
    }
}
