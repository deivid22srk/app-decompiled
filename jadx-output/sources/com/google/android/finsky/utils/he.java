package com.google.android.finsky.utils;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class he implements hg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4956a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4957b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ hh e;
    final /* synthetic */ android.support.v4.app.t f;
    final /* synthetic */ int g = 413;

    he(String str, String str2, int i, String str3, hh hhVar, android.support.v4.app.t tVar) {
        this.f4956a = str;
        this.f4957b = str2;
        this.c = i;
        this.d = str3;
        this.e = hhVar;
        this.f = tVar;
    }

    @Override // com.google.android.finsky.utils.hg
    public final void a(Document document) {
        if (bg.ao.a().booleanValue()) {
            new Handler(Looper.myLooper()).postDelayed(new hf(this, document), ((int) (Math.random() * 1500.0d)) + 500);
        } else {
            gx.a(this.f4956a, this.f4957b, this.d, this.c, "", "", document, this.f, this.e, this.g);
        }
    }

    @Override // com.google.android.finsky.utils.hg
    public final void a() {
        if (this.e != null) {
            this.e.a();
        }
    }
}
