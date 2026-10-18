package com.google.android.finsky.layout;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class av implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditorialDescriptionSection f3143a;

    av(EditorialDescriptionSection editorialDescriptionSection) {
        this.f3143a = editorialDescriptionSection;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean b2;
        b2 = this.f3143a.b();
        if (b2) {
            this.f3143a.c.setVisibility(8);
        } else {
            this.f3143a.c.setVisibility(0);
        }
        this.f3143a.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
