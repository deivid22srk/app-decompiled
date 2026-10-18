package com.google.android.libraries.bind.data;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class g {
    private static final com.google.android.libraries.bind.c.b k = com.google.android.libraries.bind.c.b.a(g.class);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f6689a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f6690b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    protected final View j;

    public g(Context context, AttributeSet attributeSet, View view) {
        this.j = view;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.libraries.bind.e.BoundView);
        this.f6689a = a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundView_bindBackground);
        this.f6690b = a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundView_bindContentDescription);
        this.c = a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundView_bindEnabled);
        this.f = a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundView_bindOnClickListener);
        this.d = a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundView_bindInvisibility);
        this.e = a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundView_bindMinHeight);
        this.g = a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundView_bindPaddingTop);
        this.i = a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundView_bindVisibility);
        this.h = a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundView_bindTransitionName);
        obtainStyledAttributes.recycle();
    }

    public final void a(Data data) {
        Object b2;
        String str = null;
        View view = this.j;
        Integer num = this.f6689a;
        if (num != null) {
            Object b3 = data == null ? null : data.b(num.intValue());
            if (b3 == null) {
                view.setBackgroundResource(0);
            } else if (b3 instanceof Integer) {
                view.setBackgroundResource(((Integer) b3).intValue());
            } else if (b3 instanceof Drawable) {
                view.setBackgroundDrawable((Drawable) b3);
            } else {
                k.c("Unrecognized bound background for key: %s", num);
            }
        }
        View view2 = this.j;
        Integer num2 = this.f6690b;
        if (num2 != null) {
            view2.setContentDescription(data == null ? null : (CharSequence) data.b(num2.intValue()));
        }
        View view3 = this.j;
        Integer num3 = this.c;
        if (num3 != null) {
            view3.setEnabled((data == null || !data.a(num3.intValue()) || data.b(num3.intValue()).equals(Boolean.FALSE)) ? false : true);
        }
        a(this.j, this.d, data, true);
        View view4 = this.j;
        Integer num4 = this.e;
        if (num4 != null) {
            Number number = data == null ? 0 : (Number) data.b(num4.intValue());
            view4.setMinimumHeight(number == null ? 0 : number.intValue());
        }
        View view5 = this.j;
        Integer num5 = this.f;
        if (num5 != null) {
            view5.setOnClickListener(data == null ? null : (View.OnClickListener) data.b(num5.intValue()));
        }
        View view6 = this.j;
        Integer num6 = this.g;
        if (num6 != null) {
            Number number2 = data == null ? 0 : (Number) data.b(num6.intValue());
            int intValue = number2 == null ? 0 : number2.intValue();
            int paddingBottom = view6.getPaddingBottom();
            if (Build.VERSION.SDK_INT >= 17 && view6.isPaddingRelative()) {
                view6.setPaddingRelative(view6.getPaddingStart(), intValue, view6.getPaddingEnd(), paddingBottom);
            } else {
                view6.setPadding(view6.getPaddingLeft(), intValue, view6.getPaddingRight(), paddingBottom);
            }
        }
        View view7 = this.j;
        Integer num7 = this.h;
        if (num7 != null && Build.VERSION.SDK_INT >= 21) {
            if (data != null && (b2 = data.b(num7.intValue())) != null) {
                str = b2.toString();
            }
            view7.setTransitionName(str);
        }
        a(this.j, this.i, data, false);
    }

    public static Integer a(TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, Integer.MAX_VALUE);
        if (resourceId == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(resourceId);
    }

    private static void a(View view, Integer num, Data data, boolean z) {
        int i;
        int i2 = 8;
        if (num != null) {
            if (data == null || !data.a(num.intValue())) {
                i = 8;
            } else if (data.b(num.intValue()) instanceof Boolean) {
                i = ((Boolean) data.b(num.intValue())).booleanValue() ? 0 : 8;
            } else {
                i = 0;
            }
            if (!z) {
                i2 = i;
            } else if (i != 0) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }
}
