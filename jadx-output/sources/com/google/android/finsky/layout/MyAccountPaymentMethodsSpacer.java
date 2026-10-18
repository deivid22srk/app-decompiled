package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.android.vending.R;

/* loaded from: classes.dex */
public class MyAccountPaymentMethodsSpacer extends StreamSpacerView {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f3036a;

    public MyAccountPaymentMethodsSpacer(Context context) {
        this(context, null);
    }

    public MyAccountPaymentMethodsSpacer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        Resources resources = getResources();
        this.f3036a = new Paint();
        this.f3036a.setColor(resources.getColor(R.color.my_account_separator));
        this.f3036a.setStrokeWidth(resources.getDimensionPixelSize(R.dimen.my_account_separator_thickness));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int height = getHeight();
        int width = getWidth();
        canvas.drawLine(0.0f, height, width, height, this.f3036a);
        canvas.drawLine(0.0f, 0.0f, width, 0.0f, this.f3036a);
    }
}
