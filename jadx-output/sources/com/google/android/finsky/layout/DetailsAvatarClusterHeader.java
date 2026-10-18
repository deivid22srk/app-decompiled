package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.play.PlayCardClusterViewHeader;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class DetailsAvatarClusterHeader extends PlayCardClusterViewHeader {
    private FifeImageView f;
    private final int g;
    private final int h;
    private final int i;

    public DetailsAvatarClusterHeader(Context context) {
        this(context, null);
    }

    public DetailsAvatarClusterHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.g = resources.getDimensionPixelSize(R.dimen.hero_image_height);
        this.h = resources.getDimensionPixelSize(R.dimen.play_profile_avatar_size);
        this.i = resources.getDimensionPixelSize(R.dimen.play_cluster_header_xpadding);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewHeader, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f = (FifeImageView) findViewById(R.id.avatar);
    }

    public final void a(com.google.android.play.image.e eVar, int i, com.google.android.finsky.protos.ds dsVar, com.google.android.finsky.protos.ds dsVar2, com.google.android.finsky.protos.an anVar, String str, String str2, View.OnClickListener onClickListener) {
        Resources resources = getContext().getResources();
        this.f3312a.setBackgroundColor(resources.getColor(R.color.play_fg_button_secondary));
        super.a(i, str, null, str2, onClickListener, eVar, dsVar, 0, null);
        com.google.android.finsky.utils.v.a(anVar, eVar, (DecoratedTextView) this.c);
        int color = resources.getColor(R.color.play_fg_primary);
        this.f3312a.setColorFilter(Color.argb(51, Color.red(color), Color.green(color), Color.blue(color)));
        if (dsVar2 != null) {
            this.f.a(dsVar2.f, dsVar2.l, eVar);
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }

    public int getBackgroundImageHeight() {
        return this.g;
    }

    public int getContentBottom() {
        return this.d.getBottom();
    }

    public int getBackgroundImageTopMargin() {
        if (this.f.getVisibility() != 8) {
            return ((ViewGroup.MarginLayoutParams) this.f3312a.getLayoutParams()).topMargin;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewHeader, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.f3312a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.g, 1073741824));
        if (this.f.getVisibility() != 8) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
            this.f.measure(makeMeasureSpec, makeMeasureSpec);
        }
        this.f3313b.measure(0, 0);
        this.d.measure(0, 0);
        int paddingTop = this.g + getPaddingTop() + getPaddingBottom() + getBackgroundImageTopMargin();
        if (mode != 1073741824) {
            size2 = mode == Integer.MIN_VALUE ? Math.min(paddingTop, size2) : paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewHeader, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int width = getWidth();
        int height = getHeight();
        int n = android.support.v4.view.by.n(this);
        int paddingTop = getPaddingTop();
        this.f3312a.layout(n, getBackgroundImageTopMargin() + paddingTop, this.f3312a.getMeasuredWidth() + n, getBackgroundImageTopMargin() + paddingTop + this.f3312a.getMeasuredHeight());
        int i5 = width / 2;
        if (this.f.getVisibility() != 8) {
            int measuredWidth = this.f.getMeasuredWidth();
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, i5 - (this.f.getMeasuredWidth() / 2));
            this.f.layout(a2, paddingTop, measuredWidth + a2, this.f.getMeasuredHeight() + paddingTop);
            int bottom = this.f.getBottom();
            int measuredWidth2 = this.f3313b.getMeasuredWidth();
            int a3 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, i5 - (this.f3313b.getMeasuredWidth() / 2));
            this.f3313b.layout(a3, bottom, measuredWidth2 + a3, this.f3313b.getMeasuredHeight() + bottom);
            int measuredWidth3 = this.d.getMeasuredWidth();
            int a4 = com.google.android.play.utils.j.a(width, measuredWidth3, z2, i5 - (this.d.getMeasuredWidth() / 2));
            this.d.layout(a4, this.f3313b.getBottom(), measuredWidth3 + a4, this.f3313b.getBottom() + this.d.getMeasuredHeight());
            return;
        }
        int i6 = (height * 2) / 3;
        int measuredWidth4 = this.f3313b.getMeasuredWidth();
        int measuredHeight = this.f3313b.getMeasuredHeight();
        int a5 = com.google.android.play.utils.j.a(width, measuredWidth4, z2, n + this.i);
        this.f3313b.layout(a5, i6 - measuredHeight, measuredWidth4 + a5, i6);
        int measuredWidth5 = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight();
        int i7 = i6 - ((measuredHeight - measuredHeight2) / 2);
        int b2 = com.google.android.play.utils.j.b(width, measuredWidth5, z2, android.support.v4.view.by.o(this) + this.i);
        this.d.layout(b2, i7 - measuredHeight2, measuredWidth5 + b2, i7);
    }
}
