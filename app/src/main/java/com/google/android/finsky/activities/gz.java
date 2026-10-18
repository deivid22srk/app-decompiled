package com.google.android.finsky.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.FinskyTabStrip;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;
import com.google.android.play.search.PlaySearchToolbar;

/* loaded from: classes.dex */
final class gz extends com.google.android.finsky.layout.play.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gv f1790a;
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(gv gvVar, Context context, int i) {
        super(context);
        this.f1790a = gvVar;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f1790a.aF = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final int a(Context context) {
        boolean I;
        boolean z;
        I = this.f1790a.I();
        if (!I) {
            z = this.f1790a.an;
            if (!z) {
                return super.a(context);
            }
        }
        return PlaySearchToolbar.a(this.c) + this.f1790a.g().getDimensionPixelSize(R.dimen.finsky_extra_toolbar_height);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final void a(ViewGroup viewGroup) {
        this.f1790a.aK = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int k() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x
    public final int a() {
        return R.layout.header_list_pager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final boolean l() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int m() {
        return R.id.viewpager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int n() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final int o() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int b() {
        return R.id.tab_recycler_view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final boolean e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final float d() {
        return 0.8f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int j() {
        return this.d != 1 ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final boolean g() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int h() {
        return this.c.getResources().getColor(R.color.status_bar_overlay);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int i() {
        int i;
        Context context = this.c;
        i = this.f1790a.f1785b;
        return com.google.android.finsky.utils.ai.a(context, i);
    }

    @Override // com.google.android.finsky.layout.play.x
    public final int p() {
        int i;
        i = this.f1790a.aB;
        return i;
    }

    @Override // com.google.android.finsky.layout.play.x
    public final com.google.android.finsky.layout.ad q() {
        com.google.android.finsky.layout.ad adVar;
        adVar = this.f1790a.e;
        return adVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final int r() {
        boolean z;
        z = this.f1790a.an;
        if (z) {
            return 1;
        }
        return super.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final boolean s() {
        boolean z;
        boolean I;
        if (super.s()) {
            z = this.f1790a.an;
            if (z) {
                I = this.f1790a.I();
                if (!I) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final /* synthetic */ PlayHeaderListTabStrip a(Context context, LayoutInflater layoutInflater) {
        com.google.android.finsky.layout.ad adVar;
        FinskyTabStrip finskyTabStrip;
        com.google.android.finsky.layout.ad adVar2;
        FinskyTabStrip finskyTabStrip2;
        this.f1790a.aL = (FinskyTabStrip) layoutInflater.inflate(R.layout.finsky_tab_strip, (ViewGroup) null);
        adVar = this.f1790a.e;
        if (adVar == null) {
            this.f1790a.e = new com.google.android.finsky.layout.ad(context);
        }
        finskyTabStrip = this.f1790a.aL;
        adVar2 = this.f1790a.e;
        finskyTabStrip.setControlsContainerBackgroundCoordinator(adVar2);
        finskyTabStrip2 = this.f1790a.aL;
        return finskyTabStrip2;
    }
}
