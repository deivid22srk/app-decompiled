package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.layout.ReviewItemLayout;
import com.google.android.finsky.layout.play.PlayRatingBar;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class RateReviewModuleLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    cl f2502a;

    /* renamed from: b, reason: collision with root package name */
    boolean f2503b;
    FifeImageView c;
    TextView d;
    TextView e;
    PlayRatingBar f;
    ReviewItemLayout g;
    LinearLayout h;
    View i;

    public RateReviewModuleLayout(Context context) {
        this(context, null);
    }

    public RateReviewModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (FifeImageView) findViewById(R.id.my_avatar);
        this.d = (TextView) findViewById(R.id.my_display_name);
        this.e = (TextView) findViewById(R.id.my_rating_text);
        this.f = (PlayRatingBar) findViewById(R.id.my_rating_bar);
        this.g = (ReviewItemLayout) findViewById(R.id.review_item_container);
        this.h = (LinearLayout) findViewById(R.id.rating_layout);
        this.i = findViewById(R.id.gplus_disclaimer);
    }
}
