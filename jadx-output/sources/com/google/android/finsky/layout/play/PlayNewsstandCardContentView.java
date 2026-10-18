package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayTextView;

/* loaded from: classes.dex */
public class PlayNewsstandCardContentView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f3359a;

    /* renamed from: b, reason: collision with root package name */
    public PlayTextView f3360b;
    public TextView c;
    public TextView d;
    public FifeImageView e;

    public PlayNewsstandCardContentView(Context context) {
        this(context, null);
    }

    public PlayNewsstandCardContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3359a = (TextView) findViewById(R.id.article_title);
        this.f3360b = (PlayTextView) findViewById(R.id.article_snippet);
        this.c = (TextView) findViewById(R.id.publisher_name);
        this.d = (TextView) findViewById(R.id.published_date);
        this.e = (FifeImageView) findViewById(R.id.publisher_icon);
    }
}
