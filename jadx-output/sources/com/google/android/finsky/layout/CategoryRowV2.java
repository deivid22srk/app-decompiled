package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class CategoryRowV2 extends LinearLayout implements com.google.android.finsky.adapters.d, com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    public TextView f2936a;

    /* renamed from: b, reason: collision with root package name */
    public FifeImageView f2937b;
    public com.google.android.finsky.a.ai c;
    public com.google.android.finsky.layout.play.cy d;

    public CategoryRowV2(Context context) {
        this(context, null);
    }

    public CategoryRowV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = com.google.android.finsky.a.i.a(100);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2936a = (TextView) findViewById(R.id.category_item_title);
        this.f2937b = (FifeImageView) findViewById(R.id.category_item_image);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.c;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.d;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }
}
