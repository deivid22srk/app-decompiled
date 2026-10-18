package android.support.v7.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
final class fs extends Animation {

    /* renamed from: a, reason: collision with root package name */
    final float f827a;

    /* renamed from: b, reason: collision with root package name */
    final float f828b;
    final float c;
    final /* synthetic */ SwitchCompat d;

    /* synthetic */ fs(SwitchCompat switchCompat, float f, float f2, byte b2) {
        this(switchCompat, f, f2);
    }

    private fs(SwitchCompat switchCompat, float f, float f2) {
        this.d = switchCompat;
        this.f827a = f;
        this.f828b = f2;
        this.c = f2 - f;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        this.d.setThumbPosition(this.f827a + (this.c * f));
    }
}
