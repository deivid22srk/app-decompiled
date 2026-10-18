package com.google.android.finsky.activities.bpkg;

import android.view.View;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f1579a;

    f(e eVar) {
        this.f1579a = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1579a.e.putBoolean("PaymentMethodsNotification", false);
        this.f1579a.d.a(4);
    }
}
