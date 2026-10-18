package android.support.v4.c.apkg;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class o extends l {
    o(Drawable drawable) {
        super(drawable);
    }

    o(m mVar, Resources resources) {
        super(mVar, resources);
    }

    @Override // android.support.v4.c.apkg.l
    public final m b() {
        return new p(this.f267b);
    }

    @Override // android.support.v4.c.apkg.l
    public final Drawable a(Drawable.ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }
}
