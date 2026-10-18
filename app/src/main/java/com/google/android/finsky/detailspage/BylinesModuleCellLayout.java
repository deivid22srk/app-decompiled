package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.AccessibleLinearLayout;

/* loaded from: classes.dex */
public class BylinesModuleCellLayout extends AccessibleLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    ImageView f2484a;

    /* renamed from: b, reason: collision with root package name */
    TextView f2485b;

    public BylinesModuleCellLayout(Context context) {
        this(context, null);
    }

    public BylinesModuleCellLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2484a = (ImageView) findViewById(R.id.byline_thumbnail);
        this.f2485b = (TextView) findViewById(R.id.byline_title);
    }
}
