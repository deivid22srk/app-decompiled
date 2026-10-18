package com.google.android.finsky.layout;

import android.support.v7.widget.RecyclerView;

/* loaded from: classes.dex */
final class en extends android.support.v7.widget.ef {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ em f3271a;

    en(em emVar) {
        this.f3271a = emVar;
    }

    @Override // android.support.v7.widget.ef
    public final void a(RecyclerView recyclerView, int i, int i2) {
        TabBubbleView tabBubbleView;
        int i3;
        super.a(recyclerView, i, i2);
        tabBubbleView = this.f3271a.s;
        tabBubbleView.i.getLocationOnScreen(tabBubbleView.h);
        int i4 = tabBubbleView.h[1];
        int i5 = i4 + tabBubbleView.m;
        float translationY = tabBubbleView.getTranslationY() - i2;
        if (i4 > 0) {
            translationY = i5;
        }
        tabBubbleView.setTranslationY(translationY);
        int b2 = em.b(this.f3271a);
        i3 = this.f3271a.p;
        if (b2 > i3) {
            this.f3271a.b();
        }
    }
}
