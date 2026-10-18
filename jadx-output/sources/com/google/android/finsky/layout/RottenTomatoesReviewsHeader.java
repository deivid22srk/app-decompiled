package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class RottenTomatoesReviewsHeader extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f3070a;

    /* renamed from: b, reason: collision with root package name */
    public FifeImageView f3071b;
    public TextView c;
    public TextView d;
    public RottenTomatoesMeter e;
    public TextView f;
    private final int g;
    private final Paint h;
    private final int i;

    public RottenTomatoesReviewsHeader(Context context) {
        this(context, null);
    }

    public RottenTomatoesReviewsHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_hairline_separator_thickness);
        this.g = ((dimensionPixelSize + 2) - 1) / 2;
        this.h = new Paint();
        this.h.setColor(resources.getColor(R.color.play_translucent_separator_line));
        this.h.setStrokeWidth(dimensionPixelSize);
        this.i = resources.getDimensionPixelSize(R.dimen.details_new_content_margin);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3070a = (TextView) findViewById(R.id.title);
        this.f3071b = (FifeImageView) findViewById(R.id.sentiment_image);
        this.c = (TextView) findViewById(R.id.favorable_percent_value);
        this.d = (TextView) findViewById(R.id.reviews_count);
        this.e = (RottenTomatoesMeter) findViewById(R.id.favorable_percent_bar);
        this.f = (TextView) findViewById(R.id.source);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() - this.g;
        canvas.drawLine(this.i, height, getWidth() - this.i, height, this.h);
    }
}
