package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class SizingLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f3084a;

    /* renamed from: b, reason: collision with root package name */
    private int f3085b;
    private final float c;
    private final float d;
    private final int e;
    private final int f;

    public SizingLayout(Context context) {
        this(context, null, 0);
    }

    public SizingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SizingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.deivid22srk.store.b.SizingLayout);
        setWidthSource(a(obtainStyledAttributes.getString(0)));
        setHeightSource(a(obtainStyledAttributes.getString(1)));
        this.c = obtainStyledAttributes.getFloat(2, 1.0f);
        this.d = obtainStyledAttributes.getFloat(3, 1.0f);
        this.e = obtainStyledAttributes.getDimensionPixelSize(4, Integer.MAX_VALUE);
        this.f = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MAX_VALUE);
        obtainStyledAttributes.recycle();
    }

    public void setHeightSource(int i) {
        this.f3085b = i;
    }

    public void setWidthSource(int i) {
        this.f3084a = i;
    }

    private static int a(String str) {
        if (str == null) {
            return 0;
        }
        if (str.toUpperCase().equals("WIDTH")) {
            return 1;
        }
        if (str.toUpperCase().equals("HEIGHT")) {
            return 2;
        }
        FinskyLog.e("Unsupported SizingLayout dimension " + str, new Object[0]);
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int a2 = a(true, i, i2);
        super.onMeasure(a2, a(false, a2, i2));
    }

    private int a(boolean z, int i, int i2) {
        if (this.e < View.MeasureSpec.getSize(i)) {
            i = View.MeasureSpec.makeMeasureSpec(this.e, View.MeasureSpec.getMode(i));
        }
        int makeMeasureSpec = this.f < View.MeasureSpec.getSize(i2) ? View.MeasureSpec.makeMeasureSpec(this.f, View.MeasureSpec.getMode(i2)) : i2;
        int i3 = z ? this.f3084a : this.f3085b;
        int i4 = z ? i : makeMeasureSpec;
        if (i3 != 0) {
            int mode = View.MeasureSpec.getMode(i3 == 1 ? i : makeMeasureSpec);
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                int max = Math.max((int) ((z ? this.c : this.d) * View.MeasureSpec.getSize(r0)), z ? android.support.v4.view.by.r(this) : android.support.v4.view.by.s(this));
                if (i3 != 1) {
                    makeMeasureSpec = i;
                }
                int size = View.MeasureSpec.getSize(makeMeasureSpec);
                if (View.MeasureSpec.getMode(makeMeasureSpec) == Integer.MIN_VALUE) {
                    max = Math.min(max, size);
                }
                return View.MeasureSpec.makeMeasureSpec(max, mode);
            }
        }
        return i4;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        requestLayout();
    }
}
