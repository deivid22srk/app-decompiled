package com.google.android.volley.ok;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.volley.guava.UrlRules;
import com.google.android.volley.ok.UrlRewriter;

/* loaded from: classes.dex */
public final class h implements UrlRewriter {

    /* renamed from: a, reason: collision with root package name */
    private ContentResolver f7221a;

    public h(Context context) {
        this.f7221a = context.getContentResolver();
    }

    @Override // com.google.android.volley.ok.UrlRewriter
    public final String a(String str) {
        com.google.android.volley.guava.c a2 = UrlRules.a(this.f7221a).a(str);
        String a3 = a2.a(str);
        if (a3 == null) {
            throw new UrlRewriter.BlockedRequestException(a2.f7201a);
        }
        return a3;
    }
}
