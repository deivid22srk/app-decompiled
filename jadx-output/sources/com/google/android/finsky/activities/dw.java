package com.google.android.finsky.activities;

import android.view.View;

/* loaded from: classes.dex */
final class dw implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View.OnClickListener f1699a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ du f1700b;

    dw(du duVar, View.OnClickListener onClickListener) {
        this.f1700b = duVar;
        this.f1699a = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        android.support.v4.app.t f = this.f1700b.f();
        if (f instanceof InlineAppDetailsDialog) {
            InlineAppDetailsDialog inlineAppDetailsDialog = (InlineAppDetailsDialog) f;
            if (inlineAppDetailsDialog.o != null) {
                inlineAppDetailsDialog.o.setVisibility(8);
            }
        }
        this.f1699a.onClick(view);
    }
}
