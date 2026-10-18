package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class MyAccountInlineNotification extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f3022a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f3023b;

    public MyAccountInlineNotification(Context context) {
        this(context, null);
    }

    public MyAccountInlineNotification(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.f3023b = new Paint();
        this.f3023b.setColor(resources.getColor(R.color.my_account_separator));
        this.f3023b.setStrokeWidth(resources.getDimensionPixelSize(R.dimen.play_hairline_separator_thickness));
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3022a = (TextView) findViewById(R.id.notification);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        int height = getHeight();
        canvas.drawLine(0.0f, height, getWidth(), height, this.f3023b);
    }
}
