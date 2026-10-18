package android.support.v4.c.apkg;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class i extends h {
    i() {
    }

    @Override // android.support.v4.c.apkg.h, android.support.v4.c.apkg.g, android.support.v4.c.apkg.e, android.support.v4.c.apkg.d, android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public final Drawable c(Drawable drawable) {
        return drawable;
    }

    @Override // android.support.v4.c.apkg.f, android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public final void b(Drawable drawable, int i) {
        drawable.setLayoutDirection(i);
    }

    @Override // android.support.v4.c.apkg.f, android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public final int d(Drawable drawable) {
        return drawable.getLayoutDirection();
    }
}
