package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class cn extends ViewGroup.MarginLayoutParams {
    public float g;
    public int h;

    public cn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.b.l.LinearLayoutCompat_Layout);
        this.g = obtainStyledAttributes.getFloat(android.support.v7.b.l.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
        this.h = obtainStyledAttributes.getInt(android.support.v7.b.l.LinearLayoutCompat_Layout_android_layout_gravity, -1);
        obtainStyledAttributes.recycle();
    }

    public cn(int i, int i2) {
        super(i, i2);
        this.h = -1;
        this.g = 0.0f;
    }

    public cn(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.h = -1;
    }
}
