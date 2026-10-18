package com.android.volley.apkg;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
public final class p implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f1220b;

    p(n nVar, String str) {
        this.f1220b = nVar;
        this.f1219a = str;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        n nVar = this.f1220b;
        String str = this.f1219a;
        r remove = nVar.c.remove(str);
        if (remove == null) {
            return;
        }
        remove.f1223b = volleyError;
        nVar.a(str, remove);
    }
}
