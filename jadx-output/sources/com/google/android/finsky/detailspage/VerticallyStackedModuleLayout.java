package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;

/* loaded from: classes.dex */
public class VerticallyStackedModuleLayout extends CardClusterModuleLayout {
    private ViewGroup c;
    private TextView d;
    private final int e;

    public VerticallyStackedModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = getPaddingTop();
    }

    @Override // com.google.android.finsky.detailspage.CardClusterModuleLayout, android.view.View
    protected void onFinishInflate() {
        this.c = (ViewGroup) findViewById(R.id.bucket_parent);
        super.onFinishInflate();
        this.d = (TextView) findViewById(R.id.footer_more);
        if (getResources().getBoolean(R.bool.use_wide_layout)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.leftMargin = 0;
        }
    }

    @Override // com.google.android.finsky.detailspage.CardClusterModuleLayout
    protected final int a(Resources resources) {
        return R.layout.play_card_verically_stacked;
    }

    @Override // com.google.android.finsky.detailspage.CardClusterModuleLayout
    protected final int b(Resources resources) {
        return 1;
    }

    @Override // com.google.android.finsky.detailspage.CardClusterModuleLayout
    protected ViewGroup getBucketParent() {
        return this.c;
    }

    @Override // com.google.android.finsky.detailspage.CardClusterModuleLayout
    public final void a(com.google.android.finsky.layout.s sVar, int i, String str, String str2, String str3, int i2, View.OnClickListener onClickListener) {
        super.a(sVar, i, str, str2, str3, i2, onClickListener);
        if (TextUtils.isEmpty(str3)) {
            this.d.setVisibility(8);
            this.c.setPadding(0, this.e, 0, this.e);
            return;
        }
        this.d.setVisibility(0);
        this.d.setText(str3.toUpperCase());
        this.d.setOnClickListener(onClickListener);
        this.d.setTextColor(getResources().getColor(com.google.android.finsky.utils.ai.b(i)));
        this.c.setPadding(0, this.e, 0, 0);
        if (this.d != this.c.getChildAt(this.c.getChildCount() - 1)) {
            this.c.removeView(this.d);
            this.c.addView(this.d);
        }
    }
}
