package com.google.android.finsky.layout.play;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.android.vending.R;
import com.google.android.finsky.activities.dn;
import com.google.android.finsky.api.model.Document;
import com.google.android.play.widget.ScalingPageIndicator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class PlayHighlightsOverlayView extends LinearLayout implements dn {

    /* renamed from: a, reason: collision with root package name */
    public int f3353a;

    /* renamed from: b, reason: collision with root package name */
    private ScalingPageIndicator f3354b;
    private int c;

    public PlayHighlightsOverlayView(Context context) {
        this(context, null);
    }

    public PlayHighlightsOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayHighlightsOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = -1;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3354b = (ScalingPageIndicator) findViewById(R.id.page_indicator);
        android.support.v4.view.by.c((View) this.f3354b, 2);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setCurrentPage(int i) {
        a(i);
    }

    public final void c(int i) {
        this.f3354b.setPageCount(i);
        this.c = -1;
    }

    @Override // com.google.android.finsky.activities.dn
    public final void a(int i, Document document) {
        if (this.f3353a == i) {
            c(document.a());
        }
    }

    @Override // com.google.android.finsky.activities.dn
    public final void b(int i) {
        if (this.f3353a == i) {
            ScalingPageIndicator scalingPageIndicator = this.f3354b;
            if (Build.VERSION.SDK_INT >= 14) {
                if (scalingPageIndicator.f7088a != null) {
                    return;
                }
                scalingPageIndicator.d = new ArrayList(scalingPageIndicator.getChildCount() * 2);
                for (int i2 = 0; i2 < scalingPageIndicator.getChildCount(); i2++) {
                    View childAt = scalingPageIndicator.getChildAt(i2);
                    Animator a2 = scalingPageIndicator.a(childAt, 0.6f, 1.0f, 200L);
                    a2.setStartDelay(i2 * 100);
                    Animator a3 = scalingPageIndicator.a(childAt, 1.0f, 0.6f, 500L);
                    a3.setStartDelay(r12 + 200);
                    scalingPageIndicator.d.add(a2);
                    scalingPageIndicator.d.add(a3);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(scalingPageIndicator.d);
                animatorSet.addListener(new com.google.android.play.widget.c(scalingPageIndicator));
                scalingPageIndicator.f7088a = animatorSet;
                scalingPageIndicator.c = 0;
                scalingPageIndicator.f7088a.start();
                return;
            }
            if (scalingPageIndicator.f7089b != null && !scalingPageIndicator.f7089b.hasEnded()) {
                return;
            }
            int childCount = scalingPageIndicator.getChildCount();
            com.google.android.play.widget.d dVar = new com.google.android.play.widget.d(scalingPageIndicator, childCount);
            dVar.setDuration(childCount * 500);
            dVar.setRepeatCount(40);
            dVar.start();
        }
    }

    @Override // com.google.android.finsky.activities.dn
    public final void a(int i, int i2) {
        if (this.f3353a == i && i2 == this.c) {
            ScalingPageIndicator scalingPageIndicator = this.f3354b;
            if (Build.VERSION.SDK_INT >= 14) {
                if (scalingPageIndicator.f7088a != null) {
                    scalingPageIndicator.f7088a.cancel();
                    scalingPageIndicator.f7088a = null;
                    scalingPageIndicator.a();
                }
                this.f3354b.setSelectedPage(this.c);
            }
            if (scalingPageIndicator.f7089b != null) {
                scalingPageIndicator.f7089b.cancel();
                scalingPageIndicator.f7089b = null;
                scalingPageIndicator.a();
            }
            this.f3354b.setSelectedPage(this.c);
        }
    }

    @Override // com.google.android.finsky.activities.dn
    public final void a(int i) {
        if (i == this.c) {
            return;
        }
        this.c = i;
        if (i < 0) {
            return;
        }
        this.f3354b.setSelectedPage(this.c);
    }
}
