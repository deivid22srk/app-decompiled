package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class RottenTomatoesMeter extends View {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f3066a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3067b;
    private final int c;
    private int d;

    public RottenTomatoesMeter(Context context) {
        this(context, null);
    }

    public RottenTomatoesMeter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f3067b = resources.getColor(R.color.play_main_background);
        this.c = resources.getColor(R.color.play_movies_primary);
        this.f3066a = new Paint();
        this.f3066a.setStyle(Paint.Style.FILL);
        this.f3066a.setAntiAlias(true);
        setWillNotDraw(false);
    }

    public void setPercentValue(int i) {
        if (this.d != i) {
            this.d = i;
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        boolean z = android.support.v4.view.by.h(this) == 0;
        int i = (this.d * width) / 100;
        if (i > 0) {
            int a2 = com.google.android.play.utils.j.a(width, i, z, 0);
            this.f3066a.setColor(this.c);
            canvas.drawRect(a2, 0.0f, a2 + i, height, this.f3066a);
        }
        int i2 = width - i;
        if (i2 > 0) {
            int b2 = com.google.android.play.utils.j.b(width, i2, z, 0);
            this.f3066a.setColor(this.f3067b);
            canvas.drawRect(b2, 0.0f, i2 + b2, height, this.f3066a);
        }
    }
}
