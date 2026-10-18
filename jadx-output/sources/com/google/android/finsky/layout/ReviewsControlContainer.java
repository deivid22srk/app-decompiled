package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class ReviewsControlContainer extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f3062a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f3063b;

    public ReviewsControlContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3062a = (TextView) findViewById(R.id.reviews_sort_box);
        this.f3063b = (TextView) findViewById(R.id.reviews_filter_box);
    }
}
