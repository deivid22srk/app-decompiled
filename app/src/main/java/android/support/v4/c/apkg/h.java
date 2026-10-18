package android.support.v4.c.apkg;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class h extends g {
    h() {
    }

    @Override // android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public final void a(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    @Override // android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public final void a(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public final void a(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    @Override // android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public final void a(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    @Override // android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public final void a(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    @Override // android.support.v4.c.apkg.g, android.support.v4.c.apkg.e, android.support.v4.c.apkg.d, android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public Drawable c(Drawable drawable) {
        return !(drawable instanceof u) ? new u(drawable) : drawable;
    }
}
