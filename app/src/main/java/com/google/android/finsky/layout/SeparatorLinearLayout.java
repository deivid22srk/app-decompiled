package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class SeparatorLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f3078a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f3079b;
    private int c;
    private boolean d;

    public SeparatorLinearLayout(Context context) {
        this(context, null);
    }

    public SeparatorLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_hairline_separator_thickness);
        this.f3078a = (dimensionPixelSize + 1) / 2;
        this.f3079b = new Paint();
        this.f3079b.setColor(a(resources));
        this.f3079b.setStrokeWidth(dimensionPixelSize);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.deivid22srk.store.b.SeparatorLinearLayout);
        this.d = obtainStyledAttributes.getBoolean(1, false) ? false : true;
        this.c = obtainStyledAttributes.getInt(0, 2);
        obtainStyledAttributes.recycle();
    }

    protected int a(Resources resources) {
        return resources.getColor(R.color.play_translucent_separator_line);
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            invalidate();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.d) {
            if ((this.c & 1) != 0) {
                int i = this.f3078a;
                canvas.drawLine(0.0f, i, getWidth(), i, this.f3079b);
            }
            if ((this.c & 2) != 0) {
                int height = getHeight() - this.f3078a;
                canvas.drawLine(0.0f, height, getWidth(), height, this.f3079b);
            }
        }
        super.onDraw(canvas);
    }
}
