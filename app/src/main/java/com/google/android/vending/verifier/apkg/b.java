package com.google.android.vending.verifier.apkg;

import com.android.volley.s;
import com.android.volley.t;
import com.google.protobuf.nano.c;

/* loaded from: classes.dex */
public abstract class b<T, U extends com.google.protobuf.nano.c> extends a<T, U> {
    public final t<T> k;

    public b(String str, t<T> tVar, s sVar, U u) {
        super(str, sVar, u);
        this.k = tVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final void a(T t) {
        this.k.a_(t);
    }
}
