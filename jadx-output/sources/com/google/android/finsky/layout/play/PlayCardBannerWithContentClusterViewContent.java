package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class PlayCardBannerWithContentClusterViewContent extends PlayCardClusterViewContent implements com.google.android.finsky.adapters.ap {

    /* renamed from: a, reason: collision with root package name */
    FifeImageView f3306a;

    /* renamed from: b, reason: collision with root package name */
    TextView f3307b;
    TextView c;
    final int d;
    private int e;
    private int f;
    private int l;

    public PlayCardBannerWithContentClusterViewContent(Context context) {
        this(context, null);
    }

    public PlayCardBannerWithContentClusterViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = context.getResources().getColor(R.color.play_multi_primary);
        Resources resources = getResources();
        this.e = resources.getDimensionPixelSize(R.dimen.creator_avatar_cover_image_height);
        this.l = this.i;
        this.f = resources.getDimensionPixelSize(R.dimen.play_cluster_header_xpadding);
        this.i = (this.e * 2) / 3;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3306a = (FifeImageView) findViewById(R.id.banner_image);
        this.f3307b = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.more_button);
        this.c.setText(getResources().getString(R.string.more_results_no_count).toUpperCase());
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent
    protected int getIndexOfFirstCard() {
        return 3;
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.h + this.f;
        this.f3306a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e, 1073741824));
        this.c.measure(0, 0);
        this.f3307b.measure(View.MeasureSpec.makeMeasureSpec((size - (i3 * 2)) - this.c.getMeasuredWidth(), Integer.MIN_VALUE), 0);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3306a.layout(0, 0, this.f3306a.getMeasuredWidth(), this.f3306a.getMeasuredHeight());
        int i5 = this.h + this.f;
        int i6 = this.i - this.l;
        int width = getWidth() - i5;
        this.c.layout(width - this.c.getMeasuredWidth(), i6 - this.c.getMeasuredHeight(), width, i6);
        this.f3307b.layout(i5, i6 - this.f3307b.getMeasuredHeight(), this.f3307b.getMeasuredWidth() + i5, i6);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent, com.google.android.finsky.adapters.ap
    public final void ab_() {
        this.f3306a.a();
    }
}
