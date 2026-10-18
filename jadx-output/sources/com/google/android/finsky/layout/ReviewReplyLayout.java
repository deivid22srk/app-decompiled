package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class ReviewReplyLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    TextView f3058a;

    /* renamed from: b, reason: collision with root package name */
    TextView f3059b;
    ImageView c;
    boolean d;

    public ReviewReplyLayout(Context context) {
        this(context, null);
    }

    public ReviewReplyLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3058a = (TextView) findViewById(R.id.review_reply_header);
        this.f3059b = (TextView) findViewById(R.id.review_reply_text);
        this.c = (ImageView) findViewById(R.id.review_reply_toggle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.setImageResource(R.drawable.ic_menu_expander_minimized_light);
        this.c.setContentDescription(getContext().getString(R.string.content_description_expand_reply));
    }

    final void b() {
        this.c.setVisibility(8);
        this.f3059b.setVisibility(0);
        setOnClickListener(null);
    }

    static /* synthetic */ void c(ReviewReplyLayout reviewReplyLayout) {
        reviewReplyLayout.c.setImageResource(R.drawable.ic_menu_expander_maximized_light);
        reviewReplyLayout.c.setContentDescription(reviewReplyLayout.getContext().getString(R.string.content_description_collapse_reply));
    }
}
