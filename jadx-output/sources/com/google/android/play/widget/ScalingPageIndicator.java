package com.google.android.play.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.play.h;
import com.google.android.play.i;
import java.util.List;

/* loaded from: classes.dex */
public class ScalingPageIndicator extends PageIndicator {

    /* renamed from: a, reason: collision with root package name */
    public Animator f7088a;

    /* renamed from: b, reason: collision with root package name */
    public Animation f7089b;
    public int c;
    public List<Animator> d;
    private SparseArray<Animator> e;

    static /* synthetic */ int d(ScalingPageIndicator scalingPageIndicator) {
        int i = scalingPageIndicator.c;
        scalingPageIndicator.c = i + 1;
        return i;
    }

    public ScalingPageIndicator(Context context) {
        super(context);
        this.e = new SparseArray<>();
    }

    public ScalingPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new SparseArray<>();
    }

    public ScalingPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new SparseArray<>();
    }

    @Override // com.google.android.play.widget.PageIndicator
    protected int getDotHorizontalMargin() {
        return Build.VERSION.SDK_INT < 14 ? super.getDotHorizontalMargin() : ((int) (getResources().getDimensionPixelSize(i.play_onboard__page_indicator_dot_diameter) * 0.6f)) / 4;
    }

    @Override // com.google.android.play.widget.PageIndicator
    protected final ImageView a(ImageView imageView, boolean z, boolean z2, int i) {
        if (Build.VERSION.SDK_INT < 14) {
            return super.a(imageView, z, z2, i);
        }
        float f = z ? 1.0f : 0.6f;
        imageView.setTag(Integer.valueOf(i));
        if (!z2) {
            setDotColor(imageView);
            imageView.setScaleX(f);
            imageView.setScaleY(f);
            return imageView;
        }
        setDotColor(imageView);
        a(i);
        Animator animator = this.e.get(i);
        if (animator != null) {
            animator.cancel();
        }
        Animator a2 = a(imageView, imageView.getScaleX(), f, f == 1.0f ? 200L : 500L);
        a2.start();
        this.e.put(i, a2);
        return imageView;
    }

    private void setDotColor(ImageView imageView) {
        ((GradientDrawable) imageView.getDrawable()).setColor(getResources().getColor(h.play_onboard__page_indicator_dot_active));
    }

    @TargetApi(14)
    public final Animator a(View view, float f, float f2, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(j);
        if (Build.VERSION.SDK_INT >= 21) {
            ofFloat.setInterpolator(com.google.android.play.b.d.a(view.getContext()));
        } else {
            ofFloat.setInterpolator(new android.support.v4.view.b.b());
        }
        ofFloat.addUpdateListener(new b(this, view));
        return ofFloat;
    }

    public final void a() {
        int selectedPage = getSelectedPage();
        if (selectedPage >= 0 && selectedPage < getPageCount()) {
            if (Build.VERSION.SDK_INT >= 14) {
                a(selectedPage);
            }
            a((ImageView) getChildAt(selectedPage), true, true, selectedPage);
        }
    }

    @TargetApi(14)
    private void a(int i) {
        if (this.d != null && this.d.size() > (i * 2) + 1) {
            this.d.get(i * 2).cancel();
            this.d.get((i * 2) + 1).cancel();
            this.d.clear();
        }
    }
}
