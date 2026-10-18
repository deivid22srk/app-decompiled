package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class RottenTomatoesReviewItem extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public FifeImageView f3068a;

    /* renamed from: b, reason: collision with root package name */
    public View f3069b;
    public TextView c;
    public TextView d;
    public TextView e;

    public RottenTomatoesReviewItem(Context context) {
        this(context, null);
    }

    public RottenTomatoesReviewItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3068a = (FifeImageView) findViewById(R.id.sentiment_image);
        this.f3069b = findViewById(R.id.external_link_action_image);
        this.c = (TextView) findViewById(R.id.review_comment);
        this.d = (TextView) findViewById(R.id.review_author);
        this.e = (TextView) findViewById(R.id.review_source);
    }
}
