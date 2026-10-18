package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.vending.R;

/* loaded from: classes.dex */
public class DetailsSectionStack extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2958a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2959b;
    private final int c;
    private final int d;
    private final Paint e;
    private final int f;
    private float g;

    public DetailsSectionStack(Context context) {
        this(context, null);
    }

    public DetailsSectionStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.DetailsSectionStack);
        this.f2959b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.e = new Paint();
        this.d = resources.getColor(R.color.play_translucent_separator_line);
        this.f = Color.alpha(this.d);
        this.e.setColor(this.d);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_hairline_separator_thickness);
        this.c = ((dimensionPixelSize + 2) - 1) / 2;
        this.e.setStrokeWidth(dimensionPixelSize);
        this.f2958a = true;
        this.g = 1.0f;
        setWillNotDraw(false);
    }

    public void setSeparatorsVisible(boolean z) {
        if (this.f2958a != z) {
            this.f2958a = z;
            invalidate();
        }
    }

    public void setSectionSeparatorAlphaMultiplier(float f) {
        if (this.g != f) {
            this.g = f;
            this.e.setColor((((int) (this.g * this.f)) << 24) | (this.d & 16777215));
            invalidate();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2958a) {
            boolean z = true;
            int childCount = getChildCount();
            View view = null;
            boolean z2 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    if (z2 || (childAt instanceof an)) {
                        z2 = childAt instanceof am;
                        z = false;
                        view = childAt;
                    } else {
                        if (!z) {
                            int top = childAt.getTop();
                            canvas.drawLine(childAt.getLeft() + this.f2959b, top, childAt.getRight() - this.f2959b, top, this.e);
                        }
                        z2 = childAt instanceof am;
                        z = false;
                        view = childAt;
                    }
                }
            }
            if (view instanceof al) {
                int bottom = view.getBottom() - this.c;
                canvas.drawLine(view.getLeft() + this.f2959b, bottom, view.getRight() - this.f2959b, bottom, this.e);
            }
        }
    }
}
