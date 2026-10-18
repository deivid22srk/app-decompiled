package com.google.android.finsky.activities;

import android.view.View;

/* loaded from: classes.dex */
final class bo implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1623a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f1624b;
    final /* synthetic */ bi c;

    bo(bi biVar, String str, a aVar) {
        this.c = biVar;
        this.f1623a = str;
        this.f1624b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.r.a(214, (byte[]) null, this.c.s);
        this.c.a(this.f1623a, this.f1624b.i, false);
    }
}
