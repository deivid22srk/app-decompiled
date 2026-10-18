package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public abstract class cm extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f3197a;

    protected abstract int a(boolean z);

    public cm(Context context) {
        this(context, null);
    }

    public cm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        Resources resources = getResources();
        this.f3197a = new Paint();
        this.f3197a.setColor(resources.getColor(R.color.my_account_separator));
        this.f3197a.setStrokeWidth(resources.getDimensionPixelSize(R.dimen.my_account_separator_thickness));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        if (aa_()) {
            int height = getHeight();
            if (android.support.v4.view.by.h(this) == 1) {
                canvas.drawLine(0.0f, height, a(true), height, this.f3197a);
            } else {
                canvas.drawLine(a(false), height, getWidth(), height, this.f3197a);
            }
        }
    }

    protected boolean aa_() {
        return true;
    }
}
