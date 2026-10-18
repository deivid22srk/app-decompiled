package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class PlayCardViewRateOverlay extends View {

    /* renamed from: a, reason: collision with root package name */
    final TextPaint f3345a;

    /* renamed from: b, reason: collision with root package name */
    final TextPaint f3346b;
    final Rect c;
    final Rect d;
    String e;
    String f;
    private final int g;

    public PlayCardViewRateOverlay(Context context) {
        this(context, null);
    }

    public PlayCardViewRateOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f3345a = new TextPaint();
        this.f3345a.setAntiAlias(true);
        this.f3345a.setTextSize(resources.getDimensionPixelSize(R.dimen.rate_card_stars_size));
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3345a.setTypeface(Typeface.create("sans-serif-light", 0));
        }
        this.f3346b = new TextPaint();
        this.f3346b.setAntiAlias(true);
        this.f3346b.setTextSize(resources.getDimensionPixelSize(R.dimen.rate_card_label_size));
        this.f3346b.setTypeface(Typeface.create("sans-serif", 0));
        this.c = new Rect();
        this.d = new Rect();
        this.g = resources.getDimensionPixelSize(R.dimen.rate_card_overlay_top_margin);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int height2 = this.c.height();
        int height3 = ((height - ((this.d.height() * 2) + height2)) / 2) + getPaddingTop() + this.g + height2;
        if (!TextUtils.isEmpty(this.e)) {
            canvas.drawText(this.e, ((width - this.c.width()) / 2) - this.c.left, height3, this.f3345a);
        }
        if (!TextUtils.isEmpty(this.f)) {
            canvas.drawText(this.f, ((width - this.d.width()) / 2) - this.d.left, height3 + (this.d.height() * 2), this.f3346b);
        }
    }
}
