package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import com.android.vending.R;
import com.google.android.finsky.layout.ForegroundLinearLayout;
import com.google.android.finsky.layout.HistogramView;

/* loaded from: classes.dex */
public class ReviewsStatisticsModuleLayout extends ForegroundLinearLayout implements bp {

    /* renamed from: a, reason: collision with root package name */
    com.google.android.finsky.layout.play.cy f2506a;

    /* renamed from: b, reason: collision with root package name */
    boolean f2507b;
    HistogramView c;

    public ReviewsStatisticsModuleLayout(Context context) {
        this(context, null);
    }

    public ReviewsStatisticsModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (HistogramView) findViewById(R.id.reviews_statistics_panel);
    }
}
