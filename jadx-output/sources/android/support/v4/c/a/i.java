package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class i extends h {
    i() {
    }

    @Override // android.support.v4.c.a.h, android.support.v4.c.a.g, android.support.v4.c.a.e, android.support.v4.c.a.d, android.support.v4.c.a.b, android.support.v4.c.a.c
    public final Drawable c(Drawable drawable) {
        return drawable;
    }

    @Override // android.support.v4.c.a.f, android.support.v4.c.a.b, android.support.v4.c.a.c
    public final void b(Drawable drawable, int i) {
        drawable.setLayoutDirection(i);
    }

    @Override // android.support.v4.c.a.f, android.support.v4.c.a.b, android.support.v4.c.a.c
    public final int d(Drawable drawable) {
        return drawable.getLayoutDirection();
    }
}
