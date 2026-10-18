package com.google.android.finsky.layout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.ik;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;

/* loaded from: classes.dex */
public class FinskyTabStrip extends PlayHeaderListTabStrip {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2989a;

    /* renamed from: b, reason: collision with root package name */
    ViewGroup f2990b;
    public boolean c;
    private ad g;

    public FinskyTabStrip(Context context) {
        super(context);
    }

    public FinskyTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FinskyTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setControlsContainerBackgroundCoordinator(ad adVar) {
        this.g = adVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.PlayHeaderListTabStrip, android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void onFinishInflate() {
        android.support.v4.view.by.c((View) this, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        super.onFinishInflate();
        ad adVar = this.g;
        adVar.a();
        adVar.i = this;
        adVar.i.getViewTreeObserver().addOnPreDrawListener(adVar.m);
        Object parent = adVar.i.getParent();
        while (true) {
            view = (View) parent;
            if (view.getId() == R.id.controls_container) {
                break;
            } else {
                parent = view.getParent();
            }
        }
        adVar.f = (ViewGroup) view;
        adVar.g = adVar.f.findViewById(R.id.hero_container);
        adVar.d = (ControlsContainerBackground) LayoutInflater.from(adVar.i.getContext()).inflate(R.layout.controls_container_background, adVar.f, false);
        if (InsetsFrameLayout.f3009a) {
            ((FrameLayout.LayoutParams) adVar.d.getLayoutParams()).topMargin = -ik.d(adVar.d.getContext());
        }
        if (adVar.e != null) {
            adVar.d.a(adVar.e, 0, false);
            adVar.e = null;
        }
        adVar.f.addView(adVar.d, 0);
        if (ad.f3123a) {
            adVar.f.setOutlineProvider(new af(adVar));
        }
        adVar.j = null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.g.l = (int) motionEvent.getX();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.PlayHeaderListTabStrip, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f2989a) {
            super.onMeasure(i, i2);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.f2990b != null) {
            this.f2990b.setPadding(0, 0, 0, 0);
        }
        setChildWidths(getMeasuredWidth());
        measureChildren(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.PlayHeaderListTabStrip
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        if (!this.f2989a) {
            return super.a(layoutInflater, viewGroup, i);
        }
        this.f2990b = viewGroup;
        return layoutInflater.inflate(R.layout.finsky_fixed_tab_text, viewGroup, false);
    }

    private void setChildWidths(int i) {
        if (this.f2990b != null) {
            int childCount = this.f2990b.getChildCount();
            int i2 = i / childCount;
            for (int i3 = 0; i3 < childCount; i3++) {
                TextView textView = (TextView) this.f2990b.getChildAt(i3);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                textView.setMaxWidth(i2);
                if (!this.c && i2 != layoutParams.width) {
                    layoutParams.width = i2;
                    textView.setLayoutParams(layoutParams);
                }
            }
        }
    }
}
