package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import com.android.vending.R;
import com.google.android.finsky.utils.et;
import com.google.android.play.layout.PlayCardViewSmall;

/* loaded from: classes.dex */
public class PlayCardViewQuickSuggestionSmall extends PlayCardViewSmall implements Animation.AnimationListener, bo {
    private boolean F;
    private View G;
    private final int H;

    public PlayCardViewQuickSuggestionSmall(Context context) {
        this(context, null);
    }

    public PlayCardViewQuickSuggestionSmall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = true;
        this.H = context.getResources().getDimensionPixelSize(R.dimen.play_card_inset);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.PlayCardViewSmall, com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.G = findViewById(R.id.pending_overlay);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.G.setVisibility(this.F ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G.setVisibility(0);
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.G.setVisibility(8);
        this.F = false;
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.finsky.layout.play.bo
    public final void a(boolean z) {
        this.y.setVisibility(8);
        if (!this.F) {
            this.F = true;
            if (z) {
                Animation a2 = et.a(getContext(), 300L, this);
                this.G.setVisibility(0);
                this.G.startAnimation(a2);
                return;
            }
            this.G.setVisibility(0);
        }
    }

    @Override // com.google.android.finsky.layout.play.bo
    public final void b(boolean z) {
        if (this.F) {
            this.F = false;
            if (z) {
                this.G.startAnimation(et.b(getContext(), 300L, this));
            } else {
                this.G.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.PlayCardViewSmall, com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.G.getVisibility() != 8) {
            this.G.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - (this.H * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - (this.H * 2), 1073741824));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.PlayCardViewSmall, com.google.android.play.layout.a, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.G.getVisibility() != 8) {
            boolean z2 = android.support.v4.view.by.h(this) == 0;
            int width = getWidth();
            int measuredWidth = this.G.getMeasuredWidth();
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, this.H);
            int top = this.b_.getTop();
            this.G.layout(a2, top, measuredWidth + a2, this.G.getMeasuredHeight() + top);
        }
    }
}
