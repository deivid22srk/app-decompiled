package com.android.volley.a;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public abstract class y<T> extends com.android.volley.l<T> {
    private static final String j = String.format("application/json; charset=%s", "utf-8");
    private final com.android.volley.t<T> k;
    private final String l;

    @Override // com.android.volley.l
    public abstract com.android.volley.r<T> a(com.android.volley.k kVar);

    public y(int i, String str, String str2, com.android.volley.t<T> tVar, com.android.volley.s sVar) {
        super(i, str, sVar);
        this.k = tVar;
        this.l = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final void a(T t) {
        this.k.a_(t);
    }

    @Override // com.android.volley.l
    public final byte[] h() {
        return k();
    }

    @Override // com.android.volley.l
    public final String j() {
        return j;
    }

    @Override // com.android.volley.l
    public final byte[] k() {
        try {
            if (this.l == null) {
                return null;
            }
            return this.l.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            com.android.volley.w.d("Unsupported Encoding while trying to get the bytes of %s using %s", this.l, "utf-8");
            return null;
        }
    }

    @Override // com.android.volley.l
    public final String g() {
        return j;
    }
}
