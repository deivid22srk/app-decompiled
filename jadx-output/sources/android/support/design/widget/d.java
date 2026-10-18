package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class d extends LinearLayout.LayoutParams {

    /* renamed from: a, reason: collision with root package name */
    int f131a;

    /* renamed from: b, reason: collision with root package name */
    Interpolator f132b;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f131a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.design.i.AppBarLayout_LayoutParams);
        this.f131a = obtainStyledAttributes.getInt(android.support.design.i.AppBarLayout_LayoutParams_layout_scrollFlags, 0);
        if (obtainStyledAttributes.hasValue(android.support.design.i.AppBarLayout_LayoutParams_layout_scrollInterpolator)) {
            this.f132b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(android.support.design.i.AppBarLayout_LayoutParams_layout_scrollInterpolator, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public d() {
        super(-1, -2);
        this.f131a = 1;
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f131a = 1;
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f131a = 1;
    }

    public d(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.f131a = 1;
    }
}
