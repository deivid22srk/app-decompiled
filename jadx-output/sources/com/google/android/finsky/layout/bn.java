package com.google.android.finsky.layout;

import android.view.View;

/* loaded from: classes.dex */
final class bn implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3166a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HorizontalStrip f3167b;

    bn(HorizontalStrip horizontalStrip, int i) {
        this.f3167b = horizontalStrip;
        this.f3166a = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f3167b.a(this.f3166a);
        }
    }
}
