package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.layout.StarRatingBar;
import java.text.NumberFormat;

/* loaded from: classes.dex */
public class HistogramView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private LinearLayout f3003a;

    /* renamed from: b, reason: collision with root package name */
    private HistogramTable f3004b;
    private TextView c;
    private StarRatingBar d;
    private TextView e;
    private NumberFormat f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final Paint j;
    private final int k;

    public HistogramView(Context context) {
        this(context, null);
    }

    public HistogramView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = NumberFormat.getIntegerInstance();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.HistogramView);
        this.g = obtainStyledAttributes.getBoolean(0, false);
        this.h = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_hairline_separator_thickness);
        this.i = ((dimensionPixelSize + 2) - 1) / 2;
        this.j = new Paint();
        this.j.setColor(resources.getColor(R.color.play_translucent_separator_line));
        this.j.setStrokeWidth(dimensionPixelSize);
        this.k = resources.getDimensionPixelSize(R.dimen.details_new_content_margin);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3003a = (LinearLayout) findViewById(R.id.ratings_summary_box);
        this.f3004b = (HistogramTable) findViewById(R.id.histogram);
        this.c = (TextView) findViewById(R.id.average_value);
        this.d = (StarRatingBar) this.f3003a.findViewById(R.id.summary_rating_bar);
        this.e = (TextView) this.f3003a.findViewById(R.id.num_reviews);
    }

    public View getSummaryBox() {
        return this.f3003a;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        super.onMeasure(i, i2);
        if (this.g) {
            int size = View.MeasureSpec.getSize(i);
            int measuredHeight2 = this.c.getMeasuredHeight() + this.f3003a.getMeasuredHeight();
            int measuredHeight3 = this.f3004b.getMeasuredHeight();
            if (measuredHeight2 > measuredHeight3) {
                measuredHeight = measuredHeight2 + (this.f3004b.getMeasuredHeight() - this.f3004b.getBaseline());
            } else {
                measuredHeight = (this.e.getMeasuredHeight() - this.e.getBaseline()) + measuredHeight3;
            }
            setMeasuredDimension(size, measuredHeight + getPaddingBottom() + getPaddingTop());
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            int height = getHeight() - this.i;
            canvas.drawLine(this.k, height, getWidth() - this.k, height, this.j);
        }
    }

    public final void a(long j, float f, int[] iArr) {
        setVisibility(0);
        Resources resources = getResources();
        this.e.setText(this.f.format(j));
        this.e.setContentDescription(resources.getQuantityString(R.plurals.content_description_review_histogram_review_count, (int) j, Long.valueOf(j)));
        String a2 = com.google.android.finsky.utils.v.a(f);
        this.c.setText(a2);
        this.c.setContentDescription(resources.getString(R.string.content_description_review_histogram_rating, a2));
        this.d.setRating(f);
        this.d.setShowEmptyStars(com.google.android.finsky.utils.v.a() ? false : true);
        this.f3004b.setHistogram(iArr);
    }
}
