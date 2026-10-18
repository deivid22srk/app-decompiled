package com.android.volley.a;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
final class o implements com.android.volley.t<Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1217a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f1218b;

    o(n nVar, String str) {
        this.f1218b = nVar;
        this.f1217a = str;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        n nVar = this.f1218b;
        String str = this.f1217a;
        nVar.f1216b.a(str, bitmap2);
        r remove = nVar.c.remove(str);
        if (remove == null) {
            return;
        }
        remove.f1222a = bitmap2;
        nVar.a(str, remove);
    }
}
