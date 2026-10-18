package com.android.volley.a;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class af extends com.android.volley.l<String> {
    private final com.android.volley.t<String> j;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final /* synthetic */ void a(String str) {
        this.j.a_(str);
    }

    public af(int i, String str, com.android.volley.t<String> tVar, com.android.volley.s sVar) {
        super(i, str, sVar);
        this.j = tVar;
    }

    public af(String str, com.android.volley.t<String> tVar, com.android.volley.s sVar) {
        this(0, str, tVar, sVar);
    }

    @Override // com.android.volley.l
    public com.android.volley.r<String> a(com.android.volley.k kVar) {
        String str;
        try {
            str = new String(kVar.f1244b, l.a(kVar.c));
        } catch (UnsupportedEncodingException e) {
            str = new String(kVar.f1244b);
        }
        return com.android.volley.r.a(str, l.a(kVar));
    }
}
