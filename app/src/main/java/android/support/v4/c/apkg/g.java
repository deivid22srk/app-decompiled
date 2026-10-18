package android.support.v4.c.apkg;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class g extends f {
    g() {
    }

    @Override // android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public final void a(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    @Override // android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public final boolean b(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Override // android.support.v4.c.apkg.e, android.support.v4.c.apkg.d, android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public Drawable c(Drawable drawable) {
        return !(drawable instanceof s) ? new s(drawable) : drawable;
    }
}
