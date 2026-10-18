package com.google.android.finsky.activities;

import android.view.View;

/* loaded from: classes.dex */
final class bm implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1620a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f1621b;
    final /* synthetic */ boolean c;
    final /* synthetic */ bi d;

    bm(bi biVar, String str, a aVar, boolean z) {
        this.d = biVar;
        this.f1620a = str;
        this.f1621b = aVar;
        this.c = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d.r.a(215, (byte[]) null, this.d.s);
        bi.a(this.d, this.f1620a, this.f1621b.h, this.f1621b.i, this.f1621b.c, this.f1621b.f1528b, this.c);
    }
}
