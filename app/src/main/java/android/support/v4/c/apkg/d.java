package android.support.v4.c.apkg;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class d extends b {
    d() {
    }

    @Override // android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public Drawable c(Drawable drawable) {
        return !(drawable instanceof o) ? new o(drawable) : drawable;
    }
}
