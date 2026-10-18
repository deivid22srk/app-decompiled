package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class d extends b {
    d() {
    }

    @Override // android.support.v4.c.a.b, android.support.v4.c.a.c
    public Drawable c(Drawable drawable) {
        return !(drawable instanceof o) ? new o(drawable) : drawable;
    }
}
