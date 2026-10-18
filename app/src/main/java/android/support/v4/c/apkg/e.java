package android.support.v4.c.apkg;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class e extends d {
    e() {
    }

    @Override // android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public final void a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @Override // android.support.v4.c.apkg.d, android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public Drawable c(Drawable drawable) {
        return !(drawable instanceof q) ? new q(drawable) : drawable;
    }
}
