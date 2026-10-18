package com.google.android.play.drawer;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class n extends android.support.v7.c.a.b {

    /* renamed from: b, reason: collision with root package name */
    protected static final boolean f6870b;
    private ValueAnimator c;

    static {
        f6870b = Build.VERSION.SDK_INT >= 11;
    }

    public n(Context context) {
        super(context);
    }

    @TargetApi(11)
    public final void a(int i, int i2) {
        if (!f6870b) {
            a(i != 0 ? 1.0f : 0.0f);
        }
        switch (i2) {
            case 0:
                a(i != 0 ? 1.0f : 0.0f);
                break;
            case 1:
                a(i != 0 ? 1.0f : 0.0f);
                ObjectAnimator duration = ObjectAnimator.ofInt(this, "alpha", 0, 255).setDuration(400L);
                duration.setInterpolator(com.google.android.play.utils.b.f7067a);
                duration.start();
                break;
            case 2:
                if (this.c != null) {
                    this.c.cancel();
                }
                float f = this.f553a;
                float[] fArr = new float[2];
                fArr[0] = f;
                fArr[1] = i != 0 ? 1.0f : 0.0f;
                this.c = ValueAnimator.ofFloat(fArr);
                this.c.setDuration(i == 0 ? (long) (f * 350.0f) : (long) ((1.0f - f) * 350.0f));
                this.c.setInterpolator(com.google.android.play.utils.b.f7067a);
                this.c.addUpdateListener(new o(this));
                this.c.start();
                break;
        }
    }

    public final void a(float f) {
        if (f == 1.0f) {
            a(true);
        } else if (f == 0.0f) {
            a(false);
        }
        b(f);
    }

    @Override // android.support.v7.c.a.b, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        invalidateSelf();
    }
}
