package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import java.text.NumberFormat;

/* loaded from: classes.dex */
public class ReviewSnippetLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final NumberFormat f3060a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f3061b;
    public ReviewsTipHeaderLayout c;
    public boolean d;

    public ReviewSnippetLayout(Context context) {
        this(context, null);
    }

    public ReviewSnippetLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3060a = NumberFormat.getIntegerInstance();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3061b = (TextView) findViewById(R.id.snippet_body);
        this.c = (ReviewsTipHeaderLayout) findViewById(R.id.snippet_header);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        this.c.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), Integer.MIN_VALUE), i2);
        if (!this.c.f3064a) {
            this.f3061b.setGravity(1);
            this.d = true;
        } else {
            this.f3061b.setGravity(0);
            this.d = false;
        }
        super.onMeasure(i, i2);
    }
}
