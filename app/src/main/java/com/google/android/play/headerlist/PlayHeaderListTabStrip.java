package com.google.android.play.headerlist;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bn;
import android.support.v4.view.dl;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class PlayHeaderListTabStrip extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private HorizontalScrollView f6893a;

    /* renamed from: b, reason: collision with root package name */
    private ViewPager f6894b;
    private final t c;
    PlayHeaderListTabContainer d;
    boolean e;
    int f;
    private WeakReference<bn> g;
    private dl h;
    private boolean i;
    private float j;
    private int k;
    private boolean l;
    private k m;
    private int n;
    private boolean o;

    public PlayHeaderListTabStrip(Context context) {
        this(context, null, 0);
    }

    public PlayHeaderListTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayHeaderListTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new t(this, (byte) 0);
        this.i = true;
        this.j = getResources().getDisplayMetrics().density * 5.0f;
    }

    void setExternalOnPageChangeListener(dl dlVar) {
        this.h = dlVar;
    }

    void setTabsBackgroundResource(int i) {
        if (this.f != i) {
            this.f = i;
            int childCount = this.d.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.d.getChildAt(i2).setBackgroundResource(i);
            }
        }
    }

    final void a(boolean z, boolean z2) {
        this.d.setUseFloatingTabPadding(z);
        this.l = z2;
        b();
    }

    void setOnTabSelectedListener(k kVar) {
        this.m = kVar;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        getSubViewReferences();
        this.d.setSelectedIndicatorColor(getResources().getColor(com.google.android.play.h.play_header_list_tab_underline_color));
    }

    void getSubViewReferences() {
        this.f6893a = (HorizontalScrollView) findViewById(com.google.android.play.k.play_header_list_tab_scroll);
        this.d = (PlayHeaderListTabContainer) findViewById(com.google.android.play.k.play_header_list_tab_container);
    }

    public void setSelectedUnderlineThickness(int i) {
        this.d.setSelectedUnderlineThickness(i);
    }

    public void setAnimateOnTabClick(boolean z) {
        this.o = z;
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f6894b != null) {
            this.f6894b.setOnPageChangeListener(null);
        }
        this.f6894b = viewPager;
        if (this.f6894b != null) {
            this.f6894b.setOnPageChangeListener(this.c);
        }
        a();
    }

    public final void a() {
        bn adapter = this.f6894b == null ? null : this.f6894b.getAdapter();
        bn bnVar = this.g != null ? this.g.get() : null;
        if (bnVar != null) {
            bnVar.f355a.unregisterObserver(this.c);
            this.g = null;
        }
        if (adapter != null) {
            adapter.f355a.registerObserver(this.c);
            this.g = new WeakReference<>(adapter);
        }
        c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size > 0) {
            this.d.setStripWidth(size);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.d.removeAllViews();
        bn adapter = this.f6894b == null ? null : this.f6894b.getAdapter();
        if (adapter != null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            int a2 = adapter.a();
            for (int i = 0; i < a2; i++) {
                int a3 = com.google.android.libraries.bind.bpkg.c.a(adapter, i);
                View a4 = a(from, this.d, a3);
                TextView textView = (TextView) a4;
                textView.setText(adapter.a(a3));
                textView.setOnClickListener(new s(this, com.google.android.libraries.bind.bpkg.c.b(adapter, a3)));
                this.d.addView(a4);
            }
            this.d.getViewTreeObserver().addOnGlobalLayoutListener(new r(this));
            b();
            this.d.c = false;
        }
    }

    @TargetApi(14)
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        TextView textView = (TextView) layoutInflater.inflate(com.google.android.play.l.play_header_list_tab_text, viewGroup, false);
        textView.setMaxWidth(getMaxTabWidth());
        a(textView, this.e);
        textView.setBackgroundResource(this.f);
        return textView;
    }

    final void a(TextView textView, boolean z) {
        if (z) {
            textView.setTextColor(-1);
        } else {
            textView.setTextColor(getResources().getColorStateList(com.google.android.play.h.play_header_list_tab_text_color));
        }
    }

    protected int getMaxTabWidth() {
        if (this.n == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            this.n = displayMetrics.widthPixels;
        }
        return this.n;
    }

    public String getCurrentTabTitle() {
        if (this.f6894b == null || this.f6894b.getAdapter() == null) {
            return null;
        }
        return (String) this.f6894b.getAdapter().a(this.f6894b.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, boolean z) {
        int childCount;
        View childAt;
        int left;
        if (this.f6893a != null && (childCount = this.d.getChildCount()) != 0 && i >= 0 && i < childCount && (childAt = this.d.getChildAt(i)) != null && childAt.getMeasuredWidth() != 0 && (left = ((childAt.getLeft() + i2) - (getWidth() / 2)) + (childAt.getWidth() / 2)) != this.k) {
            if ((((float) Math.abs(left - this.f6893a.getScrollX())) > this.j) && z) {
                this.f6893a.smoothScrollTo(left, 0);
            } else {
                this.f6893a.smoothScrollBy(0, 0);
                this.f6893a.smoothScrollBy(0, 0);
                this.f6893a.scrollTo(left, 0);
            }
            this.k = left;
        }
    }

    protected final void b() {
        if (this.f6894b != null) {
            a(this.f6894b.getCurrentItem(), false);
        }
    }

    protected final void a(int i, boolean z) {
        a(i, 0, z);
        int i2 = 0;
        while (i2 < this.d.getChildCount()) {
            this.d.getChildAt(i2).setSelected(i2 == i);
            i2++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @TargetApi(12)
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int selectedTabPosition;
        int selectedTabPosition2 = this.l ? getSelectedTabPosition() : 0;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f6893a.getScrollX() != this.k) {
            this.f6893a.scrollTo(this.k, 0);
        }
        if (this.l) {
            b();
            if (Build.VERSION.SDK_INT >= 12 && (selectedTabPosition = getSelectedTabPosition()) != selectedTabPosition2) {
                this.d.setTranslationX(-(selectedTabPosition - selectedTabPosition2));
                this.d.animate().translationX(0.0f).setDuration(200L);
            }
        }
    }

    private int getSelectedTabPosition() {
        if (this.f6894b == null) {
            return 0;
        }
        View childAt = this.d.getChildAt(this.f6894b.getCurrentItem());
        if (childAt != null) {
            return childAt.getLeft() - this.f6893a.getScrollX();
        }
        return 0;
    }

    public ViewPager getPager() {
        return this.f6894b;
    }
}
