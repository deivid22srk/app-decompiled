package com.google.android.finsky.layout.play;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.eg;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.utils.ex;

/* loaded from: classes.dex */
public class PlayCardClusterViewV2 extends ci implements com.google.android.finsky.api.model.x, af, ex {

    /* renamed from: a, reason: collision with root package name */
    protected PlayClusterViewContentV2 f3314a;

    public PlayCardClusterViewV2(Context context) {
        this(context, null);
    }

    public PlayCardClusterViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.utils.ex
    public int[] getImageTypePreference() {
        return ex.f;
    }

    @Override // com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3314a = (PlayClusterViewContentV2) findViewById(R.id.cluster_content);
    }

    @Override // com.google.android.finsky.layout.play.ci, com.google.android.finsky.adapters.ap
    public void ab_() {
        super.ab_();
        this.f3314a.ab_();
    }

    public final boolean a(int i) {
        return this.f3314a.b(i);
    }

    public final void a(com.google.android.finsky.layout.s sVar, com.google.android.finsky.layout.t tVar, int i, eg egVar, Bundle bundle, cy cyVar, byte[] bArr) {
        a(bArr, cyVar);
        this.f3314a.a(sVar, tVar, i, false, egVar, bundle, getImageTypePreference());
    }

    public String getContentId() {
        return this.f3314a.getChildContentSourceId();
    }

    @Override // com.google.android.finsky.layout.play.ci
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f3314a.a(bundle);
    }

    @Override // com.google.android.finsky.layout.play.af
    public final void b() {
        ((ah) this.f3314a).r = true;
    }

    @Override // com.google.android.finsky.layout.play.af
    public final boolean a(float f, float f2) {
        return f >= ((float) this.f3314a.getLeft()) && f < ((float) this.f3314a.getRight()) && f2 >= ((float) this.f3314a.getTop()) && f2 < ((float) this.f3314a.getBottom());
    }

    @Override // com.google.android.finsky.layout.play.af
    public int getHorizontalScrollerTop() {
        return this.f3314a.getTop();
    }

    @Override // com.google.android.finsky.layout.play.af
    public int getHorizontalScrollerBottom() {
        return this.f3314a.getBottom();
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        this.f3314a.m_();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int paddingTop;
        if (this.j == null || this.j.getVisibility() == 8) {
            i3 = 0;
        } else {
            this.j.measure(i, 0);
            i3 = this.j.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3314a.getLayoutParams();
        if (marginLayoutParams.height != -1) {
            this.f3314a.measure(i, 0);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            paddingTop = View.MeasureSpec.getSize(i2);
        } else {
            paddingTop = i3 + getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + this.f3314a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), paddingTop);
        if (marginLayoutParams.height == -1) {
            this.f3314a.measure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (this.j == null || this.j.getVisibility() == 8) {
            i5 = paddingTop;
        } else {
            this.j.layout(0, paddingTop, width, this.j.getMeasuredHeight() + paddingTop);
            i5 = paddingTop + this.j.getMeasuredHeight();
        }
        int i6 = ((ViewGroup.MarginLayoutParams) this.f3314a.getLayoutParams()).topMargin + i5;
        this.f3314a.layout(0, i6, width, this.f3314a.getMeasuredHeight() + i6);
    }
}
