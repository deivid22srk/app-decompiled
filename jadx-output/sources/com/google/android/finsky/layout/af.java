package com.google.android.finsky.layout;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes.dex */
final class af extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f3126a;

    af(ad adVar) {
        this.f3126a = adVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        View view2;
        int height = view.getHeight();
        view2 = this.f3126a.i;
        outline.setRect(0, height - (view2.getHeight() / 2), view.getWidth(), view.getHeight());
    }
}
