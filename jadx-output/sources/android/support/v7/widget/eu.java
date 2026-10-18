package android.support.v7.widget;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public final class eu extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final Interpolator i = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Runnable f801a;

    /* renamed from: b, reason: collision with root package name */
    int f802b;
    int c;
    private cm d;
    private Spinner e;
    private boolean f;
    private int g;
    private int h;

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        byte b2 = 0;
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.d.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f802b = (int) (View.MeasureSpec.getSize(i2) * 0.4f);
            } else {
                this.f802b = View.MeasureSpec.getSize(i2) / 2;
            }
            this.f802b = Math.min(this.f802b, this.c);
        } else {
            this.f802b = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
        if (!z && this.f) {
            this.d.measure(0, makeMeasureSpec);
            if (this.d.getMeasuredWidth() <= View.MeasureSpec.getSize(i2)) {
                b();
            } else if (!a()) {
                if (this.e == null) {
                    AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, android.support.v7.b.b.actionDropDownStyle);
                    appCompatSpinner.setLayoutParams(new cn(-2, -1));
                    appCompatSpinner.setOnItemSelectedListener(this);
                    this.e = appCompatSpinner;
                }
                removeView(this.d);
                addView(this.e, new ViewGroup.LayoutParams(-2, -1));
                if (this.e.getAdapter() == null) {
                    this.e.setAdapter((SpinnerAdapter) new ew(this, b2));
                }
                if (this.f801a != null) {
                    removeCallbacks(this.f801a);
                    this.f801a = null;
                }
                this.e.setSelection(this.h);
            }
        } else {
            b();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.h);
        }
    }

    private boolean a() {
        return this.e != null && this.e.getParent() == this;
    }

    public final void setAllowCollapse(boolean z) {
        this.f = z;
    }

    private boolean b() {
        if (a()) {
            removeView(this.e);
            addView(this.d, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.e.getSelectedItemPosition());
        }
        return false;
    }

    public final void setTabSelected(int i2) {
        this.h = i2;
        int childCount = this.d.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.d.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                View childAt2 = this.d.getChildAt(i2);
                if (this.f801a != null) {
                    removeCallbacks(this.f801a);
                }
                this.f801a = new ev(this, childAt2);
                post(this.f801a);
            }
            i3++;
        }
        if (this.e != null && i2 >= 0) {
            this.e.setSelection(i2);
        }
    }

    public final void setContentHeight(int i2) {
        this.g = i2;
        requestLayout();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        android.support.v7.view.a a2 = android.support.v7.view.a.a(getContext());
        TypedArray obtainStyledAttributes = a2.f556a.obtainStyledAttributes(null, android.support.v7.b.l.ActionBar, android.support.v7.b.b.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(android.support.v7.b.l.ActionBar_height, 0);
        Resources resources = a2.f556a.getResources();
        if (!a2.a()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(android.support.v7.b.e.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.c = a2.f556a.getResources().getDimensionPixelSize(android.support.v7.b.e.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f801a != null) {
            post(this.f801a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f801a != null) {
            removeCallbacks(this.f801a);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    static /* synthetic */ ex a(eu euVar, android.support.v7.a.d dVar) {
        ex exVar = new ex(euVar, euVar.getContext(), dVar);
        exVar.setBackgroundDrawable(null);
        exVar.setLayoutParams(new AbsListView.LayoutParams(-1, euVar.g));
        return exVar;
    }
}
