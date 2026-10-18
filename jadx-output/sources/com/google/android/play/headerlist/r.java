package com.google.android.play.headerlist;

import android.support.v4.view.ViewPager;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class r implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayHeaderListTabStrip f6912a;

    r(PlayHeaderListTabStrip playHeaderListTabStrip) {
        this.f6912a = playHeaderListTabStrip;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewPager viewPager;
        PlayHeaderListTabContainer playHeaderListTabContainer;
        viewPager = this.f6912a.f6894b;
        this.f6912a.a(viewPager.getCurrentItem(), 0, false);
        playHeaderListTabContainer = this.f6912a.d;
        playHeaderListTabContainer.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
