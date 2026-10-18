package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import com.android.vending.R;
import com.google.android.finsky.utils.et;
import com.google.android.play.layout.PlayCardViewMini;

/* loaded from: classes.dex */
public class PlayCardViewQuickSuggestionMini extends PlayCardViewMini implements Animation.AnimationListener, bo {
    private boolean E;
    private View F;
    private final int G;

    public PlayCardViewQuickSuggestionMini(Context context) {
        this(context, null);
    }

    public PlayCardViewQuickSuggestionMini(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = true;
        this.G = context.getResources().getDimensionPixelSize(R.dimen.play_card_inset);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.PlayCardViewMini, com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.F = findViewById(R.id.pending_overlay);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.F.setVisibility(this.E ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.setVisibility(0);
        this.E = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.F.setVisibility(8);
        this.E = false;
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.finsky.layout.play.bo
    public final void a(boolean z) {
        this.y.setVisibility(8);
        if (!this.E) {
            this.E = true;
            if (z) {
                Animation a2 = et.a(getContext(), 300L, this);
                this.F.setVisibility(0);
                this.F.startAnimation(a2);
                return;
            }
            this.F.setVisibility(0);
        }
    }

    @Override // com.google.android.finsky.layout.play.bo
    public final void b(boolean z) {
        if (this.E) {
            this.E = false;
            if (z) {
                this.F.startAnimation(et.b(getContext(), 300L, this));
            } else {
                this.F.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.PlayCardViewMini, com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.F.getVisibility() != 8) {
            this.F.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - (this.G * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - (this.G * 2), 1073741824));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.PlayCardViewMini, com.google.android.play.layout.a, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.F.getVisibility() != 8) {
            boolean z2 = android.support.v4.view.by.h(this) == 0;
            int width = getWidth();
            int measuredWidth = this.F.getMeasuredWidth();
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, this.G);
            int top = this.b_.getTop();
            this.F.layout(a2, top, measuredWidth + a2, this.F.getMeasuredHeight() + top);
        }
    }
}
