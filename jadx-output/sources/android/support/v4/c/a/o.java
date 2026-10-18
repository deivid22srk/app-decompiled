package android.support.v4.c.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class o extends l {
    o(Drawable drawable) {
        super(drawable);
    }

    o(m mVar, Resources resources) {
        super(mVar, resources);
    }

    @Override // android.support.v4.c.a.l
    final m b() {
        return new p(this.f267b);
    }

    @Override // android.support.v4.c.a.l
    protected final Drawable a(Drawable.ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }
}
