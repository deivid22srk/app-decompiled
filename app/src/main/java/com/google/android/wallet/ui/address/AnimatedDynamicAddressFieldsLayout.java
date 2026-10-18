package com.google.android.wallet.ui.address;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;

@TargetApi(11)
/* loaded from: classes.dex */
public class AnimatedDynamicAddressFieldsLayout extends DynamicAddressFieldsLayout implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    private ValueAnimator d;
    private ValueAnimator e;
    private ValueAnimator f;
    private int g;
    private ArrayList<View> h;
    private boolean i;
    private final ArrayList<View> j;
    private final ArrayList<View> k;

    public AnimatedDynamicAddressFieldsLayout(Context context) {
        this(context, null);
    }

    public AnimatedDynamicAddressFieldsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnimatedDynamicAddressFieldsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 1;
        this.j = new ArrayList<>();
        this.k = new ArrayList<>();
    }

    @Override // com.google.android.wallet.ui.address.DynamicAddressFieldsLayout, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.d = ValueAnimator.ofFloat(0.0f);
        this.d.addUpdateListener(this);
        this.d.addListener(this);
        this.e = ValueAnimator.ofFloat(0.0f);
        this.e.addUpdateListener(this);
        this.e.addListener(this);
        this.f = this.d;
    }

    @Override // com.google.android.wallet.ui.address.DynamicAddressFieldsLayout
    public void setFields(ArrayList<View> arrayList) {
        switch (this.g) {
            case 1:
                a(arrayList);
                setAddressFieldsVisibility(8);
                break;
            case 2:
                a(arrayList);
                break;
            case 3:
            case 4:
                this.h = arrayList;
                if (!this.j.isEmpty()) {
                    this.j.clear();
                    this.k.clear();
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.wallet.ui.address.DynamicAddressFieldsLayout
    public final void a() {
        switch (this.g) {
            case 1:
                setAddressFieldsVisibility(0);
                this.g = 4;
                this.f.setFloatValues(0.0f, 1.0f);
                this.f.start();
                break;
            case 3:
                this.i = true;
                break;
        }
    }

    @Override // com.google.android.wallet.ui.address.DynamicAddressFieldsLayout
    public final void b() {
        switch (this.g) {
            case 2:
                this.g = 3;
                this.f7374a.setVisibility(0);
                this.f.setFloatValues(1.0f, 0.0f);
                this.f.setStartDelay(200L);
                this.f.setCurrentPlayTime(0L);
                this.f.start();
                break;
            case 4:
                this.g = 3;
                this.f.reverse();
                break;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a((1.0f - ((Float) this.f.getAnimatedValue()).floatValue()) * (getViewHeightAtTransitionStart() - i2));
    }

    private int getViewHeightAtTransitionStart() {
        return this.f7374a.getMeasuredHeight();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int childCount = this.f7375b.getChildCount();
        for (int i = 1; i < childCount; i++) {
            View childAt = this.f7375b.getChildAt(i);
            childAt.setAlpha(floatValue);
            childAt.setY(childAt.getTop() * floatValue);
        }
        this.f7374a.setAlpha(1.0f - floatValue);
        a((1.0f - floatValue) * (getViewHeightAtTransitionStart() - getMeasuredHeight()));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        setFieldsLayerType(2);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        setFieldsLayerType(0);
        this.f.setStartDelay(0L);
        if (this.g == 4) {
            this.g = 2;
            this.f7374a.setVisibility(4);
        } else if (this.g == 3) {
            this.g = 1;
            setAddressFieldsVisibility(8);
        }
        if (this.h != null) {
            setFields(this.h);
            this.h = null;
        }
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            a(this.j.get(i), this.k.get(i));
        }
        this.j.clear();
        this.k.clear();
        if (this.i && this.g == 1) {
            this.i = false;
            if (this.f == this.d) {
                this.f = this.e;
            } else {
                this.f = this.d;
            }
            a();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    private void a(float f) {
        if (this.c != null) {
            this.c.a(f);
        }
    }

    private void setFieldsLayerType(int i) {
        int childCount = this.f7375b.getChildCount();
        for (int i2 = 1; i2 < childCount; i2++) {
            this.f7375b.getChildAt(i2).setLayerType(i, null);
        }
    }

    @Override // com.google.android.wallet.ui.address.DynamicAddressFieldsLayout
    public final void a(View view, View view2) {
        if (this.g == 4 || this.g == 3) {
            this.j.add(view);
            this.k.add(view2);
        } else {
            super.a(view, view2);
        }
    }
}
