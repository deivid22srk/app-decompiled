package com.google.android.finsky.layout.play;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* loaded from: classes.dex */
final class ac extends InsetDrawable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f3390a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ab abVar, Drawable drawable, int i) {
        super(drawable, i);
        this.f3390a = abVar;
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        rect.setEmpty();
        return false;
    }
}
