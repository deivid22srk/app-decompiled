package android.support.design.widget;

import android.graphics.Outline;

/* loaded from: classes.dex */
final class f extends e {
    f() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        copyBounds(this.f134b);
        outline.setOval(this.f134b);
    }
}
