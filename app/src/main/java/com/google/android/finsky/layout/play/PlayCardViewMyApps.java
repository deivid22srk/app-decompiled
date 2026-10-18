package com.google.android.finsky.layout.play;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;

/* loaded from: classes.dex */
public class PlayCardViewMyApps extends com.google.android.play.layout.a implements Checkable, ag {
    private static final int[] J = {android.R.attr.state_checked};
    private View E;
    private final Rect F;
    private final Rect G;
    private boolean H;
    private String I;

    /* renamed from: a, reason: collision with root package name */
    private View f3341a;

    public PlayCardViewMyApps(Context context) {
        this(context, null);
    }

    public PlayCardViewMyApps(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = false;
        this.z = 1.0f;
        this.F = new Rect();
        this.G = new Rect();
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3341a = findViewById(com.deivid22srk.store.R.id.li_archive);
        this.E = findViewById(com.deivid22srk.store.R.id.rating_badge_container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        b(i2);
        int min = Math.min(View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) this.b_.getLayoutParams()).height, 1073741824), i2);
        this.b_.measure(min, min);
        super.onMeasure(i, i2);
        if (this.s != null && this.s.getVisibility() != 8) {
            int paddingLeft = getPaddingLeft();
            this.s.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - paddingLeft) - getPaddingRight(), Integer.MIN_VALUE), 0);
        }
    }

    public final void a(boolean z, cc ccVar) {
        if (!z) {
            this.f3341a.setVisibility(8);
            setNextFocusRightId(-1);
            this.f3341a.setOnClickListener(null);
            this.f3341a.setClickable(false);
            return;
        }
        this.f3341a.setVisibility(0);
        this.f3341a.setFocusable(true);
        this.f3341a.setNextFocusLeftId(com.deivid22srk.store.R.id.accessibility_overlay);
        setNextFocusRightId(this.f3341a.getId());
        this.f3341a.setOnClickListener(new cb(this, ccVar));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.H != z) {
            this.H = z;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.H;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.H);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.H) {
            mergeDrawableStates(onCreateDrawableState, J);
        }
        return onCreateDrawableState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.s != null && this.s.getVisibility() != 8) {
            boolean z2 = android.support.v4.view.by.h(this) == 0;
            int b2 = android.support.v4.view.ao.b((ViewGroup.MarginLayoutParams) this.s.getLayoutParams());
            int measuredWidth = this.s.getMeasuredWidth();
            int measuredHeight = this.s.getMeasuredHeight();
            int top = this.E.getTop() + (Math.max(this.q.getHeight(), this.r.getHeight()) / 2);
            int b3 = com.google.android.play.utils.j.b(getWidth(), measuredWidth, z2, b2 + getPaddingEnd());
            int i5 = top - (measuredHeight / 2);
            this.s.layout(b3, i5, measuredWidth + b3, measuredHeight + i5);
        }
        if (this.f3341a != null && this.f3341a.getVisibility() != 8) {
            this.f3341a.getHitRect(this.F);
            this.F.bottom += this.F.height() / 2;
            this.F.top -= this.f3341a.getTop();
            this.F.left -= this.F.width() / 2;
            this.F.right += getWidth() - this.f3341a.getRight();
            if (!this.F.equals(this.G)) {
                setTouchDelegate(new com.google.android.play.utils.i(this.F, this.f3341a));
                this.G.set(this.F);
            }
        }
    }

    @Override // com.google.android.finsky.layout.play.ag
    public void setIdentifier(String str) {
        this.I = str;
    }

    @Override // com.google.android.finsky.layout.play.ag
    public String getIdentifier() {
        return this.I;
    }
}
