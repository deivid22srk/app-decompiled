package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class e extends d {
    e() {
    }

    @Override // android.support.v4.c.a.b, android.support.v4.c.a.c
    public final void a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @Override // android.support.v4.c.a.d, android.support.v4.c.a.b, android.support.v4.c.a.c
    public Drawable c(Drawable drawable) {
        return !(drawable instanceof q) ? new q(drawable) : drawable;
    }
}
