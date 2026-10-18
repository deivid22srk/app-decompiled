package com.google.android.finsky.layout.play;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class DiscoveryBadgeGeneric extends a {
    private Paint f;

    public DiscoveryBadgeGeneric(Context context) {
        this(context, null);
    }

    public DiscoveryBadgeGeneric(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new Paint(1);
        this.f.setStyle(Paint.Style.FILL_AND_STROKE);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.SeparatorLinearLayout, android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int i = this.d;
        this.f.setColor(this.c);
        canvas.drawCircle(width, i, this.d, this.f);
    }

    @Override // com.google.android.finsky.layout.play.a
    protected int getPlayStoreUiElementType() {
        return 1801;
    }

    @Override // com.google.android.finsky.layout.play.a
    protected final void a() {
        this.f3386a.setBitmapTransformation(com.google.android.play.image.a.b(getResources(), this.c));
    }
}
