package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
final class ft {
    private static final ThreadLocal<TypedValue> i = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    static final int[] f829a = {-16842910};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f830b = {android.R.attr.state_focused};
    static final int[] c = {android.R.attr.state_activated};
    static final int[] d = {android.R.attr.state_pressed};
    static final int[] e = {android.R.attr.state_checked};
    static final int[] f = {android.R.attr.state_selected};
    static final int[] g = {-16842919, -16842908};
    static final int[] h = new int[0];
    private static final int[] j = new int[1];

    public static int a(Context context, int i2) {
        j[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList b(Context context, int i2) {
        j[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j);
        try {
            return obtainStyledAttributes.getColorStateList(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int c(Context context, int i2) {
        ColorStateList b2 = b(context, i2);
        if (b2 != null && b2.isStateful()) {
            return b2.getColorForState(f829a, b2.getDefaultColor());
        }
        TypedValue typedValue = i.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            i.set(typedValue);
        }
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        return a(context, i2, typedValue.getFloat());
    }

    static int a(Context context, int i2, float f2) {
        return android.support.v4.c.a.b(a(context, i2), Math.round(Color.alpha(r0) * f2));
    }
}
