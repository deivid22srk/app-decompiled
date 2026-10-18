package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.play.layout.ForegroundRelativeLayout;

/* loaded from: classes.dex */
public class CategoryRow extends ForegroundRelativeLayout implements com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    private TextView f2934a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f2935b;
    private com.google.android.finsky.a.ai c;
    private com.google.android.finsky.layout.play.cy d;

    public CategoryRow(Context context) {
        super(context);
        this.c = com.google.android.finsky.a.i.a(100);
    }

    public CategoryRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = com.google.android.finsky.a.i.a(100);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2934a = (TextView) findViewById(R.id.category_item_title);
        this.f2935b = (ImageView) findViewById(R.id.category_item_image);
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
