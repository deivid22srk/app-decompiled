package com.google.android.wallet.ui.expander;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.by;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.wallet.e.g;
import com.google.android.wallet.e.k;
import com.google.android.wallet.ui.common.SummaryTextLayout;
import com.google.android.wallet.ui.common.ak;
import com.google.android.wallet.ui.common.ay;
import com.google.android.wallet.ui.common.bj;
import com.google.android.wallet.ui.common.o;
import com.google.android.wallet.ui.common.p;
import com.google.android.wallet.ui.common.r;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class SummaryExpanderWrapper extends RelativeLayout implements View.OnClickListener, ak, ay, o, p, r {

    /* renamed from: a, reason: collision with root package name */
    SummaryTextLayout f7542a;

    /* renamed from: b, reason: collision with root package name */
    ak f7543b;
    c c;
    ImageView d;
    View e;
    private final a f;
    private int g;
    private int h;
    private int i;
    private int j;

    public SummaryExpanderWrapper(Context context) {
        super(context);
        this.f = new a();
        this.g = 0;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        a(context, null);
    }

    public SummaryExpanderWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new a();
        this.g = 0;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        a(context, attributeSet);
    }

    public SummaryExpanderWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new a();
        this.g = 0;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        a(context, attributeSet);
    }

    @TargetApi(21)
    public SummaryExpanderWrapper(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f = new a();
        this.g = 0;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        a(context, attributeSet);
    }

    public View getSummaryView() {
        return this.f7542a;
    }

    public void setSummaryView(int i) {
        this.f7542a = (SummaryTextLayout) findViewById(i);
        this.f7542a.setSummaryOnClickListener(this);
        this.f7542a.setTag(g.summary_expander_transition_name, "summaryField");
    }

    public void setSummaryImage(int i) {
        this.d = (ImageView) findViewById(i);
        if (this.d != null) {
            Drawable c = android.support.v4.c.a.a.c(this.d.getDrawable().mutate());
            android.support.v4.c.a.a.a(c, bj.b(getContext()));
            this.d.setImageDrawable(c);
            j();
        }
    }

    public void setSummaryImageVisible(boolean z) {
        if (this.d != null) {
            this.d.setVisibility(z ? 0 : 4);
        }
    }

    public ImageView getSummaryImage() {
        return this.d;
    }

    public void setAlignToView(View view) {
        a(view, this.h, this.i, this.j);
    }

    private void a(View view, int i, int i2, int i3) {
        if (this.e != view || this.h != i || this.i != i2 || this.j != i3) {
            this.e = view;
            this.h = i;
            this.i = i2;
            this.j = i3;
            invalidate();
        }
    }

    public void setFormValidatable(ak akVar) {
        this.f7543b = akVar;
    }

    public void setExpanderVisibilityListener(c cVar) {
        this.c = cVar;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putParcelable("expandableInstanceState", this.f.a());
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
        this.f.a(bundle.getParcelable("expandableInstanceState"));
        j();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && !getExpandable().j && getExpandable().f7545b) {
            a expandable = getExpandable();
            if (!expandable.j) {
                expandable.a(null, true, 5);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        k();
    }

    @Override // com.google.android.wallet.ui.common.ay
    public final void h() {
        k();
    }

    @Override // com.google.android.wallet.ui.common.ay
    public final void i() {
        if (this.c != null) {
            this.c.E();
            this.c.C();
        }
        k();
    }

    @Override // com.google.android.wallet.ui.common.p
    public final void d() {
        if (this.f7542a != null) {
            if (!this.f.f7545b && hasFocus()) {
                bj.f(getRootView());
                if (bj.a(getContext())) {
                    bj.b(getContext(), this);
                }
            }
            this.f7542a.setVisibility(this.f.f7545b ? 8 : 0);
            if (this.c != null) {
                this.c.C();
                this.c.b(this.f.f7545b ? 0 : 8);
            }
        }
    }

    @Override // com.google.android.wallet.ui.common.p
    public final void e() {
        if (this.c != null) {
            this.c.x();
        }
    }

    @Override // com.google.android.wallet.ui.common.p
    public final boolean f() {
        if (this.c != null) {
            return this.c.y();
        }
        return false;
    }

    @Override // com.google.android.wallet.ui.common.p
    public final void g() {
        if (getParent() != null && by.H(this)) {
            if (this.f.f7545b) {
                getParent().requestChildFocus(this, this.e != null ? this.e : this);
            } else {
                getParent().requestChildFocus(this, this.f7542a);
            }
        }
    }

    @Override // com.google.android.wallet.ui.common.o
    public final void a() {
        if (this.c != null) {
            this.c.G();
            if (this.c.F() != null) {
                setExpanderViewsTransitionName(this.c.F());
            }
        }
    }

    @Override // com.google.android.wallet.ui.common.o
    public final void c() {
        j();
    }

    @Override // com.google.android.wallet.ui.common.o
    public final void b() {
        if (this.c != null) {
            this.c.H();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f7542a != null) {
            this.f7542a.setEnabled(z);
        }
        if (this.d != null) {
            this.d.setEnabled(z);
        }
    }

    @Override // com.google.android.wallet.ui.common.ak
    public final boolean b(int[] iArr) {
        return this.f7543b == null || this.f7543b.b(iArr);
    }

    @Override // com.google.android.wallet.ui.common.ak
    public final boolean c(int[] iArr) {
        return this.f7543b == null || this.f7543b.c(iArr);
    }

    @Override // com.google.android.wallet.ui.common.ak
    public final boolean d(int[] iArr) {
        return this.f7543b != null && this.f7543b.d(iArr);
    }

    @Override // com.google.android.wallet.ui.common.r
    public a getExpandable() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.view.View] */
    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    @TargetApi(11)
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        if (this.e != null && this.d != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
            if (getExpandable().f7545b) {
                View view = this.e;
                int top = view.getTop();
                if (view.getParent() instanceof View) {
                    SummaryExpanderWrapper summaryExpanderWrapper = (View) view.getParent();
                    i6 = top;
                    while (true) {
                        if (summaryExpanderWrapper == this) {
                            break;
                        }
                        int top2 = summaryExpanderWrapper.getTop() + i6;
                        if (!(summaryExpanderWrapper.getParent() instanceof View)) {
                            i6 = top2;
                            break;
                        } else {
                            summaryExpanderWrapper = (View) summaryExpanderWrapper.getParent();
                            i6 = top2;
                        }
                    }
                } else {
                    i6 = top;
                }
                if (this.j != -1 && bj.h(this.e)) {
                    i7 = this.j;
                } else {
                    i7 = this.i == -1 ? marginLayoutParams.topMargin : this.i;
                }
                i5 = i7 + i6;
            } else {
                i5 = this.h == -1 ? marginLayoutParams.topMargin : this.h;
            }
            this.d.layout(this.d.getLeft(), i5, this.d.getRight(), this.d.getHeight() + i5);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.g != 0) {
            a(findViewById(this.g), this.h, this.i, this.j);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        setFocusable(true);
        setOnClickListener(this);
        this.f.k = this;
        this.f.l.add(this);
        this.f.m = this;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.SummaryExpanderWrapper);
        this.h = obtainStyledAttributes.getDimensionPixelOffset(k.SummaryExpanderWrapper_internalUicIconOffsetWhenCollapsed, -1);
        this.i = obtainStyledAttributes.getDimensionPixelOffset(k.SummaryExpanderWrapper_internalUicIconOffsetWhenExpanded, -1);
        this.j = obtainStyledAttributes.getDimensionPixelOffset(k.SummaryExpanderWrapper_internalUicIconOffsetWhenExpandedAndReadOnlyAlignedField, -1);
        this.g = obtainStyledAttributes.getResourceId(k.SummaryExpanderWrapper_internalUicIconAlignToViewId, 0);
    }

    private void setExpanderViewsTransitionName(List<View> list) {
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            it.next().setTag(g.summary_expander_transition_name, "expandedField");
        }
    }

    private void j() {
        if (this.d != null) {
            this.d.setImageState(new int[]{this.f.f7545b ? R.attr.state_focused : -16842908}, true);
            this.d.invalidate();
        }
    }

    private void k() {
        if (!getExpandable().f7545b) {
            getExpandable().b(true);
        }
    }
}
