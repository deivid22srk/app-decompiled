package android.support.v4.c.apkg;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class b implements c {
    b() {
    }

    @Override // android.support.v4.c.apkg.c
    public void a(Drawable drawable) {
    }

    @Override // android.support.v4.c.apkg.c
    public void a(Drawable drawable, boolean z) {
    }

    @Override // android.support.v4.c.apkg.c
    public boolean b(Drawable drawable) {
        return false;
    }

    @Override // android.support.v4.c.apkg.c
    public void a(Drawable drawable, float f, float f2) {
    }

    @Override // android.support.v4.c.apkg.c
    public void a(Drawable drawable, int i, int i2, int i3, int i4) {
    }

    @Override // android.support.v4.c.apkg.c
    public void b(Drawable drawable, int i) {
    }

    @Override // android.support.v4.c.apkg.c
    public int d(Drawable drawable) {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.c.apkg.c
    public void a(Drawable drawable, int i) {
        if (!(drawable instanceof k)) {
            return;
        }
        ((k) drawable).a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.c.apkg.c
    public void a(Drawable drawable, ColorStateList colorStateList) {
        if (!(drawable instanceof k)) {
            return;
        }
        ((k) drawable).a(colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.c.apkg.c
    public void a(Drawable drawable, PorterDuff.Mode mode) {
        if (!(drawable instanceof k)) {
            return;
        }
        ((k) drawable).a(mode);
    }

    @Override // android.support.v4.c.apkg.c
    public Drawable c(Drawable drawable) {
        return !(drawable instanceof l) ? new l(drawable) : drawable;
    }
}
