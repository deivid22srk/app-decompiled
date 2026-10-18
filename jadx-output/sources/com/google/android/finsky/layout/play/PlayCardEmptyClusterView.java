package com.google.android.finsky.layout.play;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ds;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class PlayCardEmptyClusterView extends ci {

    /* renamed from: a, reason: collision with root package name */
    private FifeImageView f3317a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f3318b;

    public PlayCardEmptyClusterView(Context context) {
        this(context, null);
    }

    public PlayCardEmptyClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3317a = (FifeImageView) findViewById(R.id.empty_image);
        this.f3318b = (TextView) findViewById(R.id.empty_text);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j.getVisibility() != 8) {
            this.j.measure(i, 0);
            i3 = paddingTop + this.j.getMeasuredHeight();
        } else {
            i3 = paddingTop;
        }
        if (this.f3317a.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3317a.getLayoutParams();
            this.f3317a.measure(i, View.MeasureSpec.makeMeasureSpec(marginLayoutParams.height, 1073741824));
            i3 += marginLayoutParams.bottomMargin + marginLayoutParams.topMargin + this.f3317a.getMeasuredHeight();
        }
        this.f3318b.measure(View.MeasureSpec.makeMeasureSpec(size / 2, 1073741824), 0);
        setMeasuredDimension(size, this.f3318b.getMeasuredHeight() + i3);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (this.j.getVisibility() != 8) {
            this.j.layout(0, paddingTop, width, this.j.getMeasuredHeight() + paddingTop);
            i5 = paddingTop + this.j.getMeasuredHeight();
        } else {
            i5 = paddingTop;
        }
        if (this.f3317a.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3317a.getLayoutParams();
            int i6 = i5 + marginLayoutParams.topMargin;
            this.f3317a.layout(0, i6, width, this.f3317a.getMeasuredHeight() + i6);
            i5 = i6 + marginLayoutParams.bottomMargin + this.f3317a.getMeasuredHeight();
        }
        int measuredWidth = this.f3318b.getMeasuredWidth();
        int i7 = (width - measuredWidth) / 2;
        this.f3318b.layout(i7, i5, measuredWidth + i7, this.f3318b.getMeasuredHeight() + i5);
    }

    @Override // com.google.android.finsky.layout.play.ci, com.google.android.finsky.adapters.ap
    public final void ab_() {
        super.ab_();
        this.f3317a.a();
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 416;
    }

    public final void a(Document document, cy cyVar) {
        a(document.f1963a.R, cyVar);
        String str = document.ax() ? document.aJ().y.f3903a : null;
        ds a2 = com.google.android.play.utils.c.a(document.f1963a, 4);
        if (!TextUtils.isEmpty(str)) {
            this.f3318b.setText(com.google.android.finsky.utils.bc.a(str));
            this.f3318b.setVisibility(0);
        } else {
            this.f3318b.setVisibility(8);
        }
        if (a2 != null) {
            this.f3317a.a(a2.f, a2.l, FinskyApp.a().d);
            this.f3317a.setVisibility(0);
        } else {
            this.f3317a.setVisibility(8);
        }
        e();
    }
}
