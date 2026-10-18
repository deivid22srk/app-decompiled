package com.google.android.finsky.layout;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;

/* loaded from: classes.dex */
public class DetailsExpandedExtraSecondaryView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f2953a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f2954b;

    public DetailsExpandedExtraSecondaryView(Context context) {
        this(context, null);
    }

    public DetailsExpandedExtraSecondaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2953a = (TextView) findViewById(R.id.extra_title);
        this.f2954b = (TextView) findViewById(R.id.extra_description);
        this.f2954b.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
