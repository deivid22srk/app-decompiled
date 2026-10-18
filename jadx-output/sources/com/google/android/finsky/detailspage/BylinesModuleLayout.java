package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.android.vending.R;
import com.google.android.finsky.layout.DecoratedTextView;

/* loaded from: classes.dex */
public class BylinesModuleLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    LayoutInflater f2486a;

    /* renamed from: b, reason: collision with root package name */
    LinearLayout f2487b;
    DecoratedTextView c;
    boolean d;

    public BylinesModuleLayout(Context context) {
        this(context, null);
    }

    public BylinesModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2486a = LayoutInflater.from(context);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2487b = (LinearLayout) findViewById(R.id.listing_layout);
        this.c = (DecoratedTextView) findViewById(R.id.section_header);
    }
}
