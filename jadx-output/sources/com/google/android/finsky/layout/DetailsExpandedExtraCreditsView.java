package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class DetailsExpandedExtraCreditsView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f2949a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f2950b;

    public DetailsExpandedExtraCreditsView(Context context) {
        this(context, null);
    }

    public DetailsExpandedExtraCreditsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2949a = (TextView) findViewById(R.id.extra_credit);
        this.f2950b = (TextView) findViewById(R.id.extra_names);
    }
}
