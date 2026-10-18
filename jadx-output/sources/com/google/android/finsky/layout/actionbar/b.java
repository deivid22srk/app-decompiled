package com.google.android.finsky.layout.actionbar;

import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes.dex */
final class b extends GradientDrawable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3112a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f3113b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar, GradientDrawable.Orientation orientation, int[] iArr, int i) {
        super(orientation, iArr);
        this.f3113b = aVar;
        this.f3112a = i;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        if (rect.bottom - rect.top > this.f3112a) {
            rect.bottom = rect.top + this.f3112a;
        }
        super.onBoundsChange(rect);
    }
}
