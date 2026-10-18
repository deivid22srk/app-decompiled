package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.layout.FadingEdgeImageView;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class PlayCardMerchClusterViewV2 extends PlayCardClusterViewV2 implements com.google.android.play.image.t {

    /* renamed from: b, reason: collision with root package name */
    public View f3324b;
    public FadingEdgeImageView c;
    public int d;
    public final int e;
    private final int h;
    private final int i;

    public PlayCardMerchClusterViewV2(Context context) {
        this(context, null);
    }

    public PlayCardMerchClusterViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.h = resources.getDimensionPixelSize(R.dimen.play_merch_content_vmargin);
        this.i = resources.getDimensionPixelSize(R.dimen.play_merch_content_vpadding);
        this.e = context.getResources().getColor(R.color.play_multi_primary);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewV2, com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3324b = findViewById(R.id.merch_fill);
        this.c = (FadingEdgeImageView) findViewById(R.id.merch_image);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 407;
    }

    public final void c() {
        this.c.a(false, true, this.c.getMeasuredWidth() / 4, this.d);
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView, Bitmap bitmap) {
        c();
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView) {
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewV2, com.google.android.finsky.layout.play.ci, com.google.android.finsky.adapters.ap
    public final void ab_() {
        super.ab_();
        this.c.a();
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewV2, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j == null || this.j.getVisibility() == 8) {
            i3 = paddingTop;
        } else {
            this.j.measure(i, 0);
            i3 = paddingTop + this.j.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3314a.getLayoutParams();
        this.f3314a.measure(i, 0);
        if (this.c.getVisibility() != 8) {
            int measuredHeight2 = this.f3314a.getMeasuredHeight() + (this.i * 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
            this.f3324b.measure(i, makeMeasureSpec);
            this.c.measure(View.MeasureSpec.makeMeasureSpec((int) (1.7777778f * measuredHeight2), 1073741824), makeMeasureSpec);
            if (this.c.c()) {
                c();
            } else {
                this.c.b();
            }
            measuredHeight = measuredHeight2 + (this.h * 2) + i3;
        } else {
            measuredHeight = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin + this.f3314a.getMeasuredHeight() + i3;
        }
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewV2, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int paddingTop = getPaddingTop();
        if (this.j != null && this.j.getVisibility() != 8) {
            this.j.layout(0, paddingTop, width, this.j.getMeasuredHeight() + paddingTop);
            paddingTop += this.j.getMeasuredHeight();
        }
        if (this.c.getVisibility() != 8) {
            int i5 = paddingTop + this.h;
            this.f3324b.layout(0, i5, width, this.f3324b.getMeasuredHeight() + i5);
            int measuredWidth = this.c.getMeasuredWidth();
            int measuredHeight = this.c.getMeasuredHeight();
            if (measuredWidth > 0) {
                int d = (this.f3314a.d(width, height) / 2) - ((measuredHeight * 3) / 4);
                this.c.layout(d, i5, measuredWidth + d, measuredHeight + i5);
            } else {
                this.c.layout(0, i5, measuredWidth, measuredHeight + i5);
            }
            paddingTop = i5 + this.i;
        }
        this.f3314a.layout(0, paddingTop, width, this.f3314a.getMeasuredHeight() + paddingTop);
    }
}
