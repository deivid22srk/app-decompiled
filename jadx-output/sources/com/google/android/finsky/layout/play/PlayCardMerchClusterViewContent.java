package com.google.android.finsky.layout.play;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.FadingEdgeImageView;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class PlayCardMerchClusterViewContent extends PlayCardClusterViewContent implements com.google.android.finsky.adapters.ap, com.google.android.play.image.t {

    /* renamed from: a, reason: collision with root package name */
    FadingEdgeImageView f3322a;

    /* renamed from: b, reason: collision with root package name */
    int f3323b;
    final int c;
    int d;

    public PlayCardMerchClusterViewContent(Context context) {
        this(context, null);
    }

    public PlayCardMerchClusterViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context.getResources().getColor(R.color.play_multi_primary);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3322a = (FadingEdgeImageView) findViewById(R.id.merch_image);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent
    protected int getIndexOfFirstCard() {
        return 1;
    }

    final void c() {
        this.f3322a.a(this.d == 1, this.d == 0, this.f3322a.getMeasuredWidth() / 4, this.f3323b);
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView, Bitmap bitmap) {
        c();
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView) {
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        this.f3322a.measure(View.MeasureSpec.makeMeasureSpec((int) (1.7777778f * measuredHeight), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        if (this.f3322a.c()) {
            c();
        } else {
            this.f3322a.b();
        }
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int f;
        a(true);
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = this.f3322a.getMeasuredWidth();
        int measuredHeight = this.f3322a.getMeasuredHeight();
        if (measuredWidth > 0) {
            int i5 = (measuredHeight * 3) / 4;
            if (this.d == 0) {
                f = (e(width) / 2) - i5;
            } else {
                f = (width - (f(width) / 2)) - i5;
                int i6 = f + measuredWidth;
                if (i6 < width) {
                    f += width - i6;
                }
            }
            this.f3322a.layout(f, 0, measuredWidth + f, height);
            return;
        }
        this.f3322a.layout(0, 0, measuredWidth, height);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent, com.google.android.finsky.adapters.ap
    public final void ab_() {
        this.f3322a.a();
    }
}
