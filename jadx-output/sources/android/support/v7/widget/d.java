package android.support.v7.widget;

import android.graphics.Outline;

/* loaded from: classes.dex */
final class d extends c {
    public d(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f724a.d) {
            if (this.f724a.c != null) {
                this.f724a.c.getOutline(outline);
            }
        } else if (this.f724a.f606a != null) {
            this.f724a.f606a.getOutline(outline);
        }
    }
}
