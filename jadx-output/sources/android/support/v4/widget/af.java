package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
class af implements ag {
    af() {
    }

    @Override // android.support.v4.widget.ag
    public final boolean a(Object obj, float f) {
        return ai.a(obj, f);
    }

    @Override // android.support.v4.widget.ag
    public boolean a(Object obj, float f, float f2) {
        return ai.a(obj, f);
    }

    @Override // android.support.v4.widget.ag
    public final Object a(Context context) {
        return new EdgeEffect(context);
    }

    @Override // android.support.v4.widget.ag
    public final void a(Object obj, int i, int i2) {
        ((EdgeEffect) obj).setSize(i, i2);
    }

    @Override // android.support.v4.widget.ag
    public final boolean a(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    @Override // android.support.v4.widget.ag
    public final void b(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    @Override // android.support.v4.widget.ag
    public final boolean c(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }

    @Override // android.support.v4.widget.ag
    public final boolean a(Object obj, int i) {
        ((EdgeEffect) obj).onAbsorb(i);
        return true;
    }

    @Override // android.support.v4.widget.ag
    public final boolean a(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }
}
