package com.google.android.finsky.layout.play;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class CircularBackgroundView extends FifeImageView {
    private Paint e;

    public CircularBackgroundView(Context context) {
        this(context, null);
    }

    public CircularBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setBackgroundPaintColor(int i) {
        if (this.e == null) {
            this.e = new Paint();
            this.e.setAntiAlias(true);
            this.e.setStyle(Paint.Style.FILL);
        }
        this.e.setColor(i);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.image.FifeImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.e != null) {
            canvas.drawCircle((getRight() - getLeft()) / 2, (getBottom() - getTop()) / 2, Math.min(getWidth(), getHeight()) / 2, this.e);
        }
        super.onDraw(canvas);
    }
}
