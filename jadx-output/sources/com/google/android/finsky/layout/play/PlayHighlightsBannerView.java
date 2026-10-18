package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class PlayHighlightsBannerView extends PlayCardClusterViewV2 implements com.google.android.finsky.activities.bg {

    /* renamed from: b, reason: collision with root package name */
    private boolean f3352b;
    private co c;

    public PlayHighlightsBannerView(Context context) {
        this(context, null);
    }

    public PlayHighlightsBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewV2, com.google.android.finsky.utils.ex
    public int[] getImageTypePreference() {
        return PlayHighlightsBannerItemView.f3350a;
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 428;
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewV2, com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3314a.a(new cm(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        int scrolledToItemPosition;
        if (this.c != null && !this.f3352b && (scrolledToItemPosition = this.f3314a.getScrolledToItemPosition()) >= 0) {
            this.c.a(scrolledToItemPosition);
        }
    }

    public void setHighlightBannerListener(co coVar) {
        this.c = coVar;
        c();
    }

    public final boolean b(int i) {
        PlayHighlightsBannerItemView c = this.f3314a.c(i);
        return c != null && c.g.c();
    }

    public final PlayHighlightsBannerItemView c(int i) {
        return this.f3314a.c(i);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewV2, com.google.android.finsky.layout.play.ci, com.google.android.finsky.adapters.ap
    public final void ab_() {
        super.ab_();
        this.f3352b = false;
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewV2, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3314a.getClusterContentConfigurator() != null && a((getMeasuredWidth() - this.f3314a.getClusterContentConfigurator().a(getMeasuredHeight())) / 2)) {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.google.android.finsky.activities.bg
    public final void a(float f, boolean z) {
        this.f3352b = true;
        if (this.f3314a instanceof com.google.android.finsky.activities.bg) {
            ((com.google.android.finsky.activities.bg) this.f3314a).a(f, z);
        }
        if (z && f == 0.0f) {
            this.f3352b = false;
            c();
        }
    }
}
