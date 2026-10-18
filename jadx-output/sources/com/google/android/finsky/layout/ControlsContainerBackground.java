package com.google.android.finsky.layout;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.vending.R;

/* loaded from: classes.dex */
public class ControlsContainerBackground extends FrameLayout {
    private static final boolean e;

    /* renamed from: a, reason: collision with root package name */
    bj f2943a;

    /* renamed from: b, reason: collision with root package name */
    int f2944b;
    int c;
    boolean d;
    private View f;

    static {
        e = Build.VERSION.SDK_INT >= 21;
    }

    public ControlsContainerBackground(Context context) {
        super(context);
    }

    public ControlsContainerBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ControlsContainerBackground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ControlsContainerBackground(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final boolean a(int i, int i2) {
        if (this.f2944b == i && this.c == i2) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.d ? i2 : i;
        setLayoutParams(layoutParams);
        this.f2944b = i;
        this.c = i2;
        if (this.f2943a != null) {
            this.f2943a.a();
            if (this.f2943a == getAnimation()) {
                clearAnimation();
            }
            this.f2943a = null;
        }
        if (this.f != null) {
            a(this.f.getBackground(), 0, false);
        }
        return true;
    }

    @TargetApi(21)
    public final void a(Drawable drawable, int i, boolean z) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.controls_container_background_drawable_container, (ViewGroup) this, false);
        addView(inflate);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) inflate.getLayoutParams();
        layoutParams.height = this.c;
        inflate.setLayoutParams(layoutParams);
        inflate.setBackgroundDrawable(drawable);
        View view = this.f;
        this.f = inflate;
        if (!z || !e || view == null) {
            removeView(view);
            return;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int height = ((iArr[1] < 0 ? iArr[1] : 0) + getHeight()) - (this.f2944b / 2);
        int max = Math.max(i, getWidth() - i);
        Animator duration = ViewAnimationUtils.createCircularReveal(inflate, i, this.c - (this.f2944b / 2), 0.0f, (float) Math.sqrt((height * height) + (max * max))).setDuration(400L);
        duration.addListener(new ac(this, view));
        duration.setInterpolator(Build.VERSION.SDK_INT >= 21 ? com.google.android.play.b.d.a(getContext()) : new android.support.v4.view.b.b());
        duration.start();
    }
}
