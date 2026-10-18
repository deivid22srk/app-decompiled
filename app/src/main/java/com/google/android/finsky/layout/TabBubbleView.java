package com.google.android.finsky.layout;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.play.CardBubbleLinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(16)
/* loaded from: classes.dex */
public class TabBubbleView extends CardBubbleLinearLayout implements Animator.AnimatorListener, View.OnClickListener, com.google.android.play.layout.k {
    private int A;
    private final com.google.android.finsky.apkg.i B;

    /* renamed from: a, reason: collision with root package name */
    final int f3098a;

    /* renamed from: b, reason: collision with root package name */
    final int f3099b;
    final int c;
    final int d;
    final int e;
    final Interpolator f;
    final List<ObjectAnimator> g;
    final int[] h;
    View i;
    TextView j;
    boolean k;
    int l;
    int m;
    float n;
    float o;
    Runnable p;
    com.google.android.finsky.layout.play.cy q;
    int r;
    private final int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    public TabBubbleView(Context context) {
        this(context, null);
    }

    public TabBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new android.support.v4.view.bpkg.b();
        this.g = new ArrayList();
        this.h = new int[2];
        this.B = FinskyApp.a().h();
        setOnClickListener(this);
        this.f3098a = context.getResources().getInteger(R.integer.layout_slide_in_animation_duration_ms);
        this.f3099b = this.f3098a / 6;
        this.c = this.f3098a - this.f3099b;
        this.d = this.f3098a / 5;
        this.e = this.c - this.d;
        this.s = this.f3098a / 2;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.j = (TextView) findViewById(R.id.text);
        this.j.setPivotY(0.0f);
        setPivotY(0.0f);
        setScaleY(0.0f);
        this.k = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public final void a() {
        if (!this.k || !this.u) {
            this.v = true;
            return;
        }
        this.k = false;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.j, "translationY", (-this.j.getMeasuredHeight()) / 2.0f, 0.0f).setDuration(this.f3098a);
        duration.setInterpolator(this.f);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "scaleY", this.o, 1.0f).setDuration(this.f3098a);
        duration2.setInterpolator(this.f);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this, "scaleX", this.n, 1.0f).setDuration(this.s);
        duration3.setInterpolator(this.f);
        b();
        this.g.add(duration3);
        this.g.add(duration2);
        this.g.add(duration);
        c();
        this.q.a(new com.google.android.finsky.layout.play.ad(this.r, this.q));
    }

    final void b() {
        Iterator<ObjectAnimator> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.g.clear();
    }

    final void c() {
        Iterator<ObjectAnimator> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
    }

    @Override // com.google.android.finsky.layout.ForegroundLinearLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.o = 1.0f / getMeasuredHeight();
        this.n = 1.0f / getMeasuredWidth();
        this.t = true;
        d();
    }

    final void d() {
        if (this.t && this.i != null) {
            int measuredWidth = ((View) getParent()).getMeasuredWidth();
            int measuredWidth2 = this.i.getMeasuredWidth();
            int measuredHeight = this.i.getMeasuredHeight();
            getLocationOnScreen(this.h);
            int i = this.h[0];
            int measuredWidth3 = (getMeasuredWidth() / 2) + i;
            int measuredWidth4 = getMeasuredWidth() + i;
            this.i.getLocationOnScreen(this.h);
            int i2 = (measuredWidth2 / 2) + this.h[0];
            this.m = (measuredHeight - this.l) - cu.a(getContext());
            int i3 = this.h[1] + this.m;
            setArrowOffset(i2 - (measuredWidth3 + Math.max(this.w - i, Math.min(i2 - measuredWidth3, (measuredWidth - this.w) - measuredWidth4))));
            setTranslationX((int) (r0 + getTranslationX()));
            setTranslationY(i3);
            this.u = true;
            if (this.v) {
                a();
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        if (f > 0.0f) {
            this.j.setScaleX(1.0f / f);
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        if (f > 0.0f) {
            this.j.setScaleY(1.0f / f);
        }
    }

    private void setArrowOffset(int i) {
        ((com.google.android.play.cpkg.d) getCardViewGroupDelegate()).c(this, i);
        setPivotX((getWidth() * 0.5f) + i);
        this.j.setPivotX(getPivotX() - getPaddingLeft());
    }

    void setSideMargin(int i) {
        if (this.w != i) {
            this.w = i;
            ((FrameLayout.LayoutParams) getLayoutParams()).setMargins(this.w, 0, this.w, 0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.i.performClick();
        this.B.a(this.r, (byte[]) null, this.q);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.p.run();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // com.google.android.play.layout.k
    public final void a(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.A = i4;
    }

    @Override // com.google.android.play.layout.k
    public final void a(int[] iArr) {
        iArr[0] = this.x;
        iArr[1] = this.y;
        iArr[2] = this.z;
        iArr[3] = this.A;
    }
}
