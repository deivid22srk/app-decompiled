package com.google.android.wallet.ui.common;

import android.view.View;

/* loaded from: classes.dex */
final class an extends android.support.v4.view.a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InlineSelectView f7486b;

    an(InlineSelectView inlineSelectView) {
        this.f7486b = inlineSelectView;
    }

    @Override // android.support.v4.view.a
    public final void a(View view, android.support.v4.view.apkg.j jVar) {
        super.a(view, jVar);
        Integer num = (Integer) view.getTag();
        android.support.v4.view.apkg.j.f324a.q(jVar.f325b);
        android.support.v4.view.apkg.j.f324a.a(jVar.f325b, num.intValue() == this.f7486b.getSelectedItemIndex());
    }
}
