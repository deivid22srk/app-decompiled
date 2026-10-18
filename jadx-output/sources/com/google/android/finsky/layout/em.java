package com.google.android.finsky.layout;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.adapters.CardRecyclerViewAdapter;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.utils.ik;

@TargetApi(16)
/* loaded from: classes.dex */
public final class em {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f3269a;

    /* renamed from: b, reason: collision with root package name */
    public final android.support.v7.widget.ef f3270b;
    public RecyclerView c;
    public CardRecyclerViewAdapter d;
    public boolean e;
    public boolean f;
    public FinskyTabStrip g;
    public com.google.android.finsky.utils.ac h;
    com.google.android.finsky.layout.play.cy i;
    eq j;
    private final Context k;
    private final int l;
    private final Handler m = new Handler();
    private final int[] n = new int[2];
    private final Pair<Integer, Integer> o;
    private final int p;
    private Integer q;
    private boolean r;
    private TabBubbleView s;
    private View t;
    private final cu u;
    private final Runnable v;
    private final int w;

    static /* synthetic */ boolean f(em emVar) {
        emVar.r = false;
        return false;
    }

    static {
        f3269a = Build.VERSION.SDK_INT >= 22;
    }

    public em(Context context, eq eqVar, com.google.android.finsky.utils.ac acVar, FinskyHeaderListLayout finskyHeaderListLayout, com.google.android.finsky.layout.play.cy cyVar) {
        this.k = context.getApplicationContext();
        Resources resources = context.getResources();
        this.l = resources.getInteger(R.integer.layout_slide_in_animation_duration_ms) + 500;
        this.j = eqVar;
        this.h = acVar;
        this.i = cyVar;
        this.o = ik.a(context);
        this.g = finskyHeaderListLayout.getTabStrip();
        FinskyTabStrip finskyTabStrip = this.g;
        int i = this.j.f3274a;
        ViewPager pager = finskyTabStrip.getPager();
        android.support.v4.view.bn adapter = pager == null ? null : pager.getAdapter();
        this.t = adapter != null ? finskyTabStrip.f2990b.getChildAt(com.google.android.libraries.bind.b.c.b(adapter, i)) : null;
        this.u = new cu(finskyHeaderListLayout, finskyHeaderListLayout.getFloatingHeaderElevation() + 1.0f);
        this.w = resources.getDimensionPixelSize(R.dimen.play_header_list_header_shadow_height) + resources.getDimensionPixelSize(R.dimen.finsky_fixed_tab_underline_thickness);
        this.p = resources.getDimensionPixelSize(R.dimen.tab_bubble_scroll_slop);
        this.f3270b = new en(this);
        this.v = new eo(this);
        cu cuVar = this.u;
        this.s = (TabBubbleView) cuVar.f3207a.inflate(R.layout.tab_bubble_view, cuVar.f3208b, false);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_card_inset) + ik.a(context.getResources());
        this.s.setVisibility(4);
        cu cuVar2 = this.u;
        cuVar2.c.add(this.s);
        if (!cuVar2.e) {
            cuVar2.e = true;
            cuVar2.f3208b.getViewTreeObserver().addOnPreDrawListener(cuVar2);
        }
        ep epVar = new ep(this);
        TabBubbleView tabBubbleView = this.s;
        String str = this.j.f3275b;
        int i2 = this.w;
        View view = this.t;
        com.google.android.finsky.layout.play.cy cyVar2 = this.i;
        int i3 = this.j.c;
        tabBubbleView.i = view;
        tabBubbleView.j.setText(str);
        tabBubbleView.p = epVar;
        tabBubbleView.q = cyVar2;
        tabBubbleView.r = i3;
        tabBubbleView.l = i2;
        tabBubbleView.setSideMargin(dimensionPixelSize);
        tabBubbleView.d();
        this.r = true;
    }

    public final void a() {
        if (this.e && this.f) {
            if (!ik.c(this.k) || f3269a) {
                this.m.postDelayed(this.v, this.l);
            }
        }
    }

    public final void b() {
        this.m.removeCallbacksAndMessages(null);
        this.h.f = true;
        if (!this.r) {
            this.r = true;
            TabBubbleView tabBubbleView = this.s;
            if (!tabBubbleView.k) {
                tabBubbleView.k = true;
                float measuredHeight = tabBubbleView.j.getMeasuredHeight();
                float scaleX = tabBubbleView.getScaleX();
                float scaleY = tabBubbleView.getScaleY();
                ObjectAnimator duration = ObjectAnimator.ofFloat(tabBubbleView.j, "translationY", 0.0f, (-measuredHeight) / 2.0f).setDuration(tabBubbleView.f3098a);
                duration.setInterpolator(tabBubbleView.f);
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(tabBubbleView, "scaleX", scaleX, tabBubbleView.n).setDuration(tabBubbleView.c);
                duration2.setInterpolator(tabBubbleView.f);
                duration2.setStartDelay(tabBubbleView.f3099b);
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(tabBubbleView, "scaleY", scaleY, tabBubbleView.o).setDuration(tabBubbleView.f3098a);
                duration3.setInterpolator(tabBubbleView.f);
                ObjectAnimator duration4 = ObjectAnimator.ofFloat(tabBubbleView, "alpha", 1.0f, 0.0f).setDuration(tabBubbleView.e);
                duration4.setInterpolator(tabBubbleView.f);
                duration4.setStartDelay(tabBubbleView.d);
                duration3.addListener(tabBubbleView);
                tabBubbleView.b();
                tabBubbleView.g.add(duration2);
                tabBubbleView.g.add(duration3);
                tabBubbleView.g.add(duration4);
                tabBubbleView.g.add(duration);
                tabBubbleView.c();
            }
            this.d.g(0);
        }
    }

    static /* synthetic */ int b(em emVar) {
        emVar.t.getLocationOnScreen(emVar.n);
        if (emVar.q == null) {
            emVar.q = Integer.valueOf(emVar.n[1]);
            return 0;
        }
        return emVar.q.intValue() - emVar.n[1];
    }

    static /* synthetic */ boolean a(em emVar, int i) {
        emVar.t.getLocationOnScreen(emVar.n);
        return (emVar.n[1] + emVar.t.getMeasuredHeight()) + i < ((Integer) emVar.o.second).intValue();
    }
}
