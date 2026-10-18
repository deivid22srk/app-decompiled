package android.support.v4.c.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class q extends l {
    q(Drawable drawable) {
        super(drawable);
    }

    q(m mVar, Resources resources) {
        super(mVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    @Override // android.support.v4.c.a.l
    m b() {
        return new r(this.f267b);
    }
}
