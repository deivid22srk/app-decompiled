package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.layout.CardLinearLayout;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class MyAccountNewsstandCard extends CardLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f3026a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f3027b;
    public PlayActionButton c;

    public MyAccountNewsstandCard(Context context) {
        this(context, null);
    }

    public MyAccountNewsstandCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3026a = (TextView) findViewById(R.id.title);
        this.f3027b = (TextView) findViewById(R.id.description);
        this.c = (PlayActionButton) findViewById(R.id.dismiss_button);
    }
}
