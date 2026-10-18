package com.google.android.play.image;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
final class f implements m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f6939a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f6940b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ boolean e;
    final /* synthetic */ e f;

    f(e eVar, int i, int i2, String str, String str2, boolean z) {
        this.f = eVar;
        this.f6939a = i;
        this.f6940b = i2;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // com.google.android.play.image.m
    public final com.android.volley.l<?> a() {
        ag agVar;
        o oVar;
        o oVar2;
        agVar = this.f.j;
        int i = this.f6939a * this.f6940b * 2;
        if (agVar.f6931b) {
            agVar.f6930a += i;
            if (i > 81920 && agVar.f6930a > 524288) {
                agVar.c.post(agVar.d);
                agVar.f6930a = 0;
            }
        }
        l a2 = this.f.a(this.c, this.f6939a, this.f6940b, Bitmap.Config.RGB_565, new g(this), new h(this));
        oVar = this.f.f6938b;
        if (oVar != null) {
            oVar2 = this.f.f6938b;
            a2.g = new com.android.volley.e(oVar2.a(), 2, 2.0f);
        }
        return a2;
    }
}
