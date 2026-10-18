package com.google.android.finsky.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.play.SingleLineContainer;
import com.google.android.finsky.protos.ny;
import com.google.android.play.layout.StarRatingBar;

/* loaded from: classes.dex */
public class ReviewItemHeaderLayout extends SingleLineContainer {

    /* renamed from: a, reason: collision with root package name */
    private StarRatingBar f3054a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f3055b;
    private TextView c;
    private TextView d;

    public ReviewItemHeaderLayout(Context context) {
        super(context);
    }

    public ReviewItemHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.SingleLineContainer, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3054a = (StarRatingBar) findViewById(R.id.review_rating);
        this.f3055b = (TextView) findViewById(R.id.review_source);
        this.c = (TextView) findViewById(R.id.review_date);
        this.d = (TextView) findViewById(R.id.review_edited);
    }

    public void setReviewInfo(ny nyVar) {
        String str = nyVar.m;
        String str2 = nyVar.k;
        if (!TextUtils.isEmpty(str)) {
            this.f3055b.setText(str.toUpperCase());
            this.f3055b.setVisibility(0);
            if (TextUtils.isEmpty(str2)) {
                this.f3055b.setOnClickListener(null);
            } else {
                this.f3055b.setOnClickListener(new dh(this, str2));
            }
        } else {
            this.f3055b.setVisibility(8);
        }
        if (nyVar.e) {
            this.f3054a.setVisibility(0);
            this.f3054a.setRating(nyVar.d);
            this.f3054a.setShowEmptyStars(!com.google.android.finsky.utils.v.a());
        } else {
            this.f3054a.setVisibility(8);
        }
        if (nyVar.r) {
            this.c.setText(com.google.android.finsky.utils.aj.a(nyVar.q));
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        this.d.setVisibility(8);
        if (nyVar.v && nyVar.x && nyVar.r && nyVar.q > nyVar.w) {
            this.d.setVisibility(0);
        }
    }
}
