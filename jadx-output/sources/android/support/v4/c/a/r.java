package android.support.v4.c.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class r extends m {
    r(m mVar) {
        super(mVar);
    }

    @Override // android.support.v4.c.a.m, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this, resources);
    }
}
