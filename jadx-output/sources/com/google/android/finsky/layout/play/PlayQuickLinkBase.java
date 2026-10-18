package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.ForegroundRelativeLayout;

/* loaded from: classes.dex */
public class PlayQuickLinkBase extends ForegroundRelativeLayout implements cy {

    /* renamed from: a, reason: collision with root package name */
    protected FifeImageView f3361a;

    /* renamed from: b, reason: collision with root package name */
    protected TextView f3362b;
    private com.google.android.finsky.a.ai c;
    private cy d;

    public PlayQuickLinkBase(Context context) {
        this(context, null, 0);
    }

    public PlayQuickLinkBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayQuickLinkBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getCardViewGroupDelegate().a(this, context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3361a = (FifeImageView) findViewById(R.id.li_icon);
        this.f3362b = (TextView) findViewById(R.id.li_title);
    }

    public com.google.android.play.c.i getCardViewGroupDelegate() {
        return com.google.android.play.c.j.f6829a;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.play.utils.g.a(accessibilityNodeInfo, Button.class.getName());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = this.f3361a.getVisibility() == 0;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        if (z) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3361a.getLayoutParams();
            int max = Math.max((paddingTop - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin, 0);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
            this.f3361a.measure(makeMeasureSpec, makeMeasureSpec);
            i3 = paddingLeft - (marginLayoutParams.rightMargin + (max + marginLayoutParams.leftMargin));
        } else {
            i3 = paddingLeft;
        }
        int max2 = Math.max(paddingTop, 0);
        this.f3362b.measure(View.MeasureSpec.makeMeasureSpec(Math.max(i3, 0), 1073741824), View.MeasureSpec.makeMeasureSpec(max2, 1073741824));
        setMeasuredDimension(size, size2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int n = android.support.v4.view.by.n(this);
        int paddingTop = getPaddingTop();
        int width = getWidth();
        if (this.f3361a.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3361a.getLayoutParams();
            int measuredWidth = this.f3361a.getMeasuredWidth();
            int a2 = android.support.v4.view.ao.a(marginLayoutParams);
            int b2 = android.support.v4.view.ao.b(marginLayoutParams);
            int i6 = marginLayoutParams.topMargin + paddingTop;
            int a3 = com.google.android.play.utils.j.a(width, measuredWidth, z2, n + a2);
            this.f3361a.layout(a3, i6, a3 + measuredWidth, this.f3361a.getMeasuredHeight() + i6);
            i5 = a2 + measuredWidth + b2 + n;
        } else {
            i5 = n;
        }
        int measuredWidth2 = this.f3362b.getMeasuredWidth();
        int a4 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, i5);
        this.f3362b.layout(a4, paddingTop, measuredWidth2 + a4, this.f3362b.getMeasuredHeight() + paddingTop);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.c;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return this.d;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }
}
