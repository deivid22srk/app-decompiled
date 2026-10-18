package com.google.android.wallet.ui.card;

import android.view.View;

/* loaded from: classes.dex */
final class b implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7418a;

    b(a aVar) {
        this.f7418a = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f7418a.c.getLayoutParams().height = i4 - i2;
        this.f7418a.e.removeOnLayoutChangeListener(this);
    }
}
