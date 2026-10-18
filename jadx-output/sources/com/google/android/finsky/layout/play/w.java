package com.google.android.finsky.layout.play;

import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;

/* loaded from: classes.dex */
final class w implements dd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyHeaderListLayout f3517a;

    w(FinskyHeaderListLayout finskyHeaderListLayout) {
        this.f3517a = finskyHeaderListLayout;
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final View a() {
        return this.f3517a;
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final View b() {
        View view;
        view = this.f3517a.f3293a;
        return view;
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final ViewGroup c() {
        return this.f3517a.getCurrentListView();
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final View d() {
        View view;
        view = this.f3517a.r;
        return view;
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final View e() {
        View view;
        view = this.f3517a.l;
        return view;
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final View a(float f, float f2) {
        int childDrawingOrder;
        int childCount = this.f3517a.getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            FinskyHeaderListLayout finskyHeaderListLayout = this.f3517a;
            childDrawingOrder = this.f3517a.getChildDrawingOrder(childCount, i);
            View childAt = finskyHeaderListLayout.getChildAt(childDrawingOrder);
            if (childAt.getId() != R.id.play_header_status_bar_underlay) {
                float q = android.support.v4.view.by.q(childAt);
                float p = android.support.v4.view.by.p(childAt);
                if (f >= childAt.getLeft() + p && f < p + childAt.getRight() && f2 >= childAt.getTop() + q && f2 < q + childAt.getBottom()) {
                    return childAt;
                }
            }
        }
        return null;
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final int f() {
        int i;
        i = this.f3517a.n;
        return i;
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final boolean a(View view) {
        return view instanceof y;
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final int g() {
        return this.f3517a.getTabBarHeight();
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final void h() {
        a(0);
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final void i() {
        a(1);
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final void j() {
        a(2);
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final void k() {
        a(this.f3517a.getLastSnapControlsWasDown() ? 1 : 2);
    }

    private void a(int i) {
        com.google.android.finsky.layout.ad adVar;
        com.google.android.finsky.layout.ad adVar2;
        FinskyHeaderListLayout finskyHeaderListLayout = this.f3517a;
        if (finskyHeaderListLayout.i != i) {
            finskyHeaderListLayout.i = i;
            finskyHeaderListLayout.j = false;
            switch (i) {
                case 1:
                    finskyHeaderListLayout.a(true, true);
                    break;
                case 2:
                    finskyHeaderListLayout.a(false, true);
                    break;
            }
        }
        adVar = this.f3517a.p;
        if (adVar != null) {
            adVar2 = this.f3517a.p;
            adVar2.k = i != 0;
        }
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final int l() {
        return this.f3517a.getActionBarHeight() + this.f3517a.getTabBarHeight();
    }

    @Override // com.google.android.finsky.layout.play.dd
    public final int m() {
        ViewGroup viewGroup;
        int controlsContainerTranslatedTop = (int) this.f3517a.getControlsContainerTranslatedTop();
        viewGroup = this.f3517a.m;
        return controlsContainerTranslatedTop + viewGroup.getHeight();
    }
}
