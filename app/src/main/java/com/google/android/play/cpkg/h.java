package com.google.android.play.cpkg;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class h extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public int f6828a;
    public ColorStateList l;
    public Paint m = new Paint(5);
    public float n;
    public float o;

    h(ColorStateList colorStateList, float f, float f2) {
        this.n = f;
        this.l = colorStateList;
        this.f6828a = this.l.getDefaultColor();
        this.m.setColor(this.f6828a);
        this.o = f2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.l == null || !this.l.isStateful()) {
            return super.onStateChange(iArr);
        }
        this.m.setColor(this.l.getColorForState(iArr, this.f6828a));
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.l != null && this.l.isStateful();
    }

    public final void c(int i) {
        this.l = null;
        this.m.setColor(i);
        invalidateSelf();
    }

    public final void a(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.m.setColor(this.l.getColorForState(getState(), this.l.getDefaultColor()));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }
}
