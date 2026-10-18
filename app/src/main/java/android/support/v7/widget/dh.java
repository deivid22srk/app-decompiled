package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class dh extends android.support.v7.c.a.a {

    /* renamed from: a, reason: collision with root package name */
    boolean f765a;

    public dh(Drawable drawable) {
        super(drawable);
        this.f765a = true;
    }

    @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f765a) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f765a) {
            super.draw(canvas);
        }
    }

    @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f765a) {
            super.setHotspot(f, f2);
        }
    }

    @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f765a) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f765a) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
