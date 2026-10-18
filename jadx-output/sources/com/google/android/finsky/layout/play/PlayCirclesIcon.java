package com.google.android.finsky.layout.play;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class PlayCirclesIcon extends ImageView {
    public PlayCirclesIcon(Context context) {
        this(context, null);
    }

    public PlayCirclesIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (isPressed() && isClickable()) {
            com.google.android.play.image.a.a(getResources()).b(canvas, width, height);
        } else if (isFocused()) {
            com.google.android.play.image.a.a(getResources()).a(canvas, width, height);
        }
    }
}
