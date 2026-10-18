package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;

/* loaded from: classes.dex */
public class MyReviewReplyLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f3037a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f3038b;
    public TextView c;
    public TextView d;

    public MyReviewReplyLayout(Context context) {
        this(context, null);
    }

    public MyReviewReplyLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3037a = (TextView) findViewById(R.id.review_reply_developer_name);
        this.f3038b = (TextView) findViewById(R.id.review_reply_subtitle);
        this.c = (TextView) findViewById(R.id.review_reply_text);
        this.d = (TextView) findViewById(R.id.read_more_label);
        this.d.setText(getContext().getString(R.string.read_more).toUpperCase());
    }
}
