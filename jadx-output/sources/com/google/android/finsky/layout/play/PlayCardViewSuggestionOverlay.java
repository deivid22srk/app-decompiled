package com.google.android.finsky.layout.play;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.android.vending.R;

/* loaded from: classes.dex */
public class PlayCardViewSuggestionOverlay extends View {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f3347a;

    public PlayCardViewSuggestionOverlay(Context context) {
        this(context, null);
    }

    public PlayCardViewSuggestionOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3347a = android.support.v4.b.g.a(context, R.drawable.ic_hidden_cards);
        setBackgroundResource(R.drawable.card_suggestion_overlay);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int intrinsicWidth = this.f3347a.getIntrinsicWidth();
        int intrinsicHeight = this.f3347a.getIntrinsicHeight();
        float min = Math.min(intrinsicWidth <= width ? 1.0f : width / intrinsicWidth, intrinsicHeight > height ? height / intrinsicHeight : 1.0f);
        int i = (int) (intrinsicWidth * min);
        int i2 = (int) (min * intrinsicHeight);
        int i3 = (width - i) / 2;
        int i4 = (height - i2) / 2;
        this.f3347a.setBounds(i3, i4, i + i3, i2 + i4);
        this.f3347a.draw(canvas);
    }
}
