package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f724a;

    public c(ActionBarContainer actionBarContainer) {
        this.f724a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f724a.d) {
            if (this.f724a.c != null) {
                this.f724a.c.draw(canvas);
            }
        } else {
            if (this.f724a.f606a != null) {
                this.f724a.f606a.draw(canvas);
            }
            if (this.f724a.f607b != null && this.f724a.e) {
                this.f724a.f607b.draw(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }
}
