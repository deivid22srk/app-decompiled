package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class g extends f {
    g() {
    }

    @Override // android.support.v4.c.a.b, android.support.v4.c.a.c
    public final void a(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    @Override // android.support.v4.c.a.b, android.support.v4.c.a.c
    public final boolean b(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Override // android.support.v4.c.a.e, android.support.v4.c.a.d, android.support.v4.c.a.b, android.support.v4.c.a.c
    public Drawable c(Drawable drawable) {
        return !(drawable instanceof s) ? new s(drawable) : drawable;
    }
}
