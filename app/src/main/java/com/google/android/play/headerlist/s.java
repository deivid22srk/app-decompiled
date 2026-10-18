package com.google.android.play.headerlist;

import android.support.v4.view.ViewPager;
import android.view.View;

/* loaded from: classes.dex */
final class s implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f6913a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayHeaderListTabStrip f6914b;

    s(PlayHeaderListTabStrip playHeaderListTabStrip, int i) {
        this.f6914b = playHeaderListTabStrip;
        this.f6913a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar;
        boolean z;
        ViewPager viewPager;
        k kVar2;
        k kVar3;
        k kVar4;
        kVar = this.f6914b.m;
        if (kVar != null) {
            kVar4 = this.f6914b.m;
            kVar4.D_();
        }
        PlayHeaderListTabStrip playHeaderListTabStrip = this.f6914b;
        z = this.f6914b.o;
        playHeaderListTabStrip.i = z;
        this.f6914b.a(this.f6913a, true);
        viewPager = this.f6914b.f6894b;
        viewPager.setCurrentItem(this.f6913a);
        kVar2 = this.f6914b.m;
        if (kVar2 != null) {
            kVar3 = this.f6914b.m;
            kVar3.c(this.f6913a);
        }
    }
}
