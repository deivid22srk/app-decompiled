package com.google.android.finsky.layout.play;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.android.vending.R;

/* loaded from: classes.dex */
public class PlayCardRateAndSuggestContentScroller extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private PlayCardClusterViewContent f3332a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3333b;
    private final Handler c;

    public PlayCardRateAndSuggestContentScroller(Context context) {
        this(context, null);
    }

    public PlayCardRateAndSuggestContentScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Handler(Looper.myLooper());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3332a = (PlayCardClusterViewContent) findViewById(R.id.cluster_content);
    }

    @TargetApi(14)
    public final void a() {
        if (this.f3332a.getCardChildCount() != 0) {
            int width = this.f3332a.b(0).getWidth();
            if (Build.VERSION.SDK_INT < 14) {
                bp bpVar = new bp(this, width, width);
                bpVar.setDuration(200L);
                bpVar.setInterpolator(new AccelerateDecelerateInterpolator());
                startAnimation(bpVar);
                this.f3332a.b(0).startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                return;
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollX", width);
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(200L);
            ofInt.start();
            this.f3332a.b(0).animate().alpha(0.0f);
        }
    }

    public final void b() {
        this.f3333b = true;
        requestLayout();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f3332a.getMetadata() == null) {
            super.onMeasure(i, i2);
            return;
        }
        int cardContentHorizontalPadding = this.f3332a.getCardContentHorizontalPadding() * 2;
        int size = View.MeasureSpec.getSize(i) - cardContentHorizontalPadding;
        this.f3332a.measure(View.MeasureSpec.makeMeasureSpec(((int) (r0.f3411a * (size / r0.c))) + cardContentHorizontalPadding, 1073741824), 0);
        setMeasuredDimension(size, this.f3332a.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int width = getWidth();
        int measuredWidth = this.f3332a.getMeasuredWidth();
        int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, 0);
        this.f3332a.layout(a2, 0, measuredWidth + a2, this.f3332a.getMeasuredHeight());
        if (this.f3333b) {
            this.f3333b = false;
            this.c.post(new bq(this));
        }
    }
}
