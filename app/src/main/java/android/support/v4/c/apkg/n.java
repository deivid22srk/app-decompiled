package android.support.v4.c.apkg;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends m {
    n(m mVar) {
        super(mVar);
    }

    @Override // android.support.v4.c.apkg.m, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new l(this, resources);
    }
}
