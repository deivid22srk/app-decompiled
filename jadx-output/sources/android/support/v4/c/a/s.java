package android.support.v4.c.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class s extends q {
    s(Drawable drawable) {
        super(drawable);
    }

    s(m mVar, Resources resources) {
        super(mVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    @Override // android.support.v4.c.a.q, android.support.v4.c.a.l
    m b() {
        return new t(this.f267b);
    }
}
