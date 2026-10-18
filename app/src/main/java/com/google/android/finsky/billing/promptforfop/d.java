package com.google.android.finsky.billing.promptforfop;

import android.view.View;

/* loaded from: classes.dex */
final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2416a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f2417b;

    d(b bVar, int i) {
        this.f2417b = bVar;
        this.f2416a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f2417b.b(this.f2416a);
    }
}
