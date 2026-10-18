package com.google.android.finsky.activities.b;

import android.app.Activity;
import android.view.View;
import com.google.android.finsky.utils.bb;

/* loaded from: classes.dex */
final class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1580a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f1581b;

    g(e eVar, String str) {
        this.f1581b = eVar;
        this.f1580a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1581b.c.a(bb.a((Activity) this.f1581b.c.f(), this.f1580a), 1);
    }
}
