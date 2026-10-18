package com.google.android.finsky.layout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.android.vending.R;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

@TargetApi(12)
/* loaded from: classes.dex */
public class AddressFieldsLayoutHoneycomb extends e implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, View.OnFocusChangeListener {
    private static String d = "support_showing_one_field";
    private static String e = "parent_instance_state";
    private int f;
    private List<View> g;
    private boolean h;
    private ValueAnimator i;
    private ValueAnimator j;
    private ValueAnimator k;
    private co l;
    private boolean m;
    private CharSequence n;

    public AddressFieldsLayoutHoneycomb(Context context) {
        this(context, null);
    }

    public AddressFieldsLayoutHoneycomb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddressFieldsLayoutHoneycomb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = 0;
        this.m = true;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(e, super.onSaveInstanceState());
        bundle.putBoolean(d, this.m);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.m = bundle.getBoolean(d);
            super.onRestoreInstanceState(bundle.getParcelable(e));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.google.android.finsky.layout.e, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.i = ValueAnimator.ofFloat(0.0f);
        this.i.addUpdateListener(this);
        this.i.addListener(this);
        this.j = ValueAnimator.ofFloat(0.0f);
        this.j.addUpdateListener(this);
        this.j.addListener(this);
        this.k = this.i;
    }

    @Override // com.google.android.finsky.layout.e
    public final void a() {
        this.c.setVisibility(0);
        this.c.setAlpha(0.0f);
        this.c.animate().alpha(1.0f);
    }

    @Override // com.google.android.finsky.layout.e
    public final void b() {
        this.c.animate().alpha(0.0f).setListener(new f(this));
    }

    @Override // com.google.android.finsky.layout.e
    public void setFields(List<View> list) {
        boolean z = this.m && list.size() > 1 && (list.get(0) instanceof EditText);
        switch (this.f) {
            case 0:
                a(list);
                setChildrenViewVisibility(8);
                break;
            case 1:
                a(list);
                break;
            case 2:
                a(list);
                f();
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                this.g = list;
                break;
            default:
                FinskyLog.e("enum %d", Integer.valueOf(this.f));
                break;
        }
        if (z) {
            EditText editText = (EditText) list.get(0);
            this.n = editText.getHint();
            editText.setHint(R.string.address);
            editText.setOnFocusChangeListener(this);
            return;
        }
        if (this.m) {
            this.m = false;
        }
    }

    @Override // com.google.android.finsky.layout.e
    public final void c() {
        switch (this.f) {
            case 0:
                if (this.m) {
                    f();
                    this.f = 5;
                } else {
                    setChildrenViewVisibility(0);
                    this.f = 4;
                }
                this.k.setFloatValues(0.0f, 1.0f);
                this.k.start();
                break;
            case 3:
                this.h = true;
                break;
        }
    }

    @Override // com.google.android.finsky.layout.e
    public final void d() {
        switch (this.f) {
            case 1:
            case 2:
                this.f = 3;
                this.f3249a.setVisibility(0);
                this.k.setFloatValues(1.0f, 0.0f);
                this.k.setStartDelay(200L);
                this.k.setCurrentPlayTime(0L);
                this.k.start();
                break;
            case 4:
            case 5:
            case 6:
                this.f = 3;
                this.k.reverse();
                break;
        }
    }

    @Override // com.google.android.finsky.layout.e
    public final void e() {
        this.m = false;
        switch (this.f) {
            case 2:
                setChildrenViewVisibility(0);
                break;
            case 5:
                this.k.end();
                this.f = 1;
                setChildrenViewVisibility(0);
                break;
        }
    }

    @Override // com.google.android.finsky.layout.e
    public void setOnHeightOffsetChangedListener(co coVar) {
        this.l = coVar;
    }

    private void a(float f) {
        if (this.l != null) {
            this.l.a(f);
        }
    }

    private void f() {
        setChildrenViewVisibility(8);
        if (this.f3250b.getChildCount() > 0) {
            this.f3250b.getChildAt(0).setVisibility(0);
        }
    }

    private void setChildrenViewVisibility(int i) {
        int childCount = this.f3250b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f3250b.getChildAt(i2).setVisibility(i);
        }
    }

    private void a(List<View> list) {
        this.f3250b.removeAllViews();
        for (View view : list) {
            view.setLayerType(2, null);
            this.f3250b.addView(view, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a((1.0f - ((Float) this.k.getAnimatedValue()).floatValue()) * (getViewHeightAtTransitionStart() - i2));
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        if (z) {
            if (this.f == 2 || this.f == 5) {
                view.setOnFocusChangeListener(null);
                this.m = false;
                this.f = 6;
                setChildrenViewVisibility(0);
                this.k.setFloatValues(0.0f, 1.0f);
                this.k.setStartDelay(200L);
                this.k.setCurrentPlayTime(0L);
                this.k.start();
                ((EditText) view).setHint(this.n);
                onAnimationUpdate(this.k);
            }
        }
    }

    private int getViewHeightAtTransitionStart() {
        return (this.f != 6 || this.f3250b.getChildCount() <= 0) ? this.f3249a.getMeasuredHeight() : this.f3250b.getChildAt(0).getHeight();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int childCount = this.f3250b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f3250b.getChildAt(i);
            if (i != 0 || this.f != 6) {
                childAt.setAlpha(floatValue);
            }
            childAt.setY(childAt.getTop() * floatValue);
        }
        if (this.f == 6 && this.f3250b.getChildCount() > 0) {
            this.f3249a.setAlpha(0.0f);
        } else {
            this.f3249a.setAlpha(1.0f - floatValue);
        }
        a((1.0f - floatValue) * (getViewHeightAtTransitionStart() - getMeasuredHeight()));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.k.setStartDelay(0L);
        if (this.f == 4) {
            this.f = 1;
            this.f3249a.setVisibility(4);
        } else if (this.f == 5) {
            this.f = 2;
            this.f3249a.setVisibility(4);
        } else if (this.f == 3) {
            this.f = 0;
            setChildrenViewVisibility(8);
        } else if (this.f == 6) {
            this.f = 1;
        }
        if (this.g != null) {
            setFields(this.g);
            this.g = null;
        }
        if (this.h && this.f == 0 && this.h) {
            this.h = false;
            if (this.k == this.i) {
                this.k = this.j;
            } else {
                this.k = this.i;
            }
            c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }
}
