package com.google.android.finsky.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.layout.HeroGraphicView;
import com.google.android.finsky.layout.InsetsFrameLayout;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
final class eq extends com.google.android.finsky.layout.play.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ep f1723a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eq(ep epVar, Context context) {
        super(context);
        this.f1723a = epVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        HeroGraphicView heroGraphicView;
        HeroGraphicView heroGraphicView2;
        this.f1723a.ai = (HeroGraphicView) layoutInflater.inflate(R.layout.hero_graphic, viewGroup, false);
        heroGraphicView = this.f1723a.ai;
        heroGraphicView.setFocusable(false);
        heroGraphicView2 = this.f1723a.ai;
        viewGroup.addView(heroGraphicView2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x
    public final int a() {
        return R.layout.people_details;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int b() {
        return R.id.people_details_stream_list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final int c() {
        int a2 = HeroGraphicView.a(this.c, this.c.getResources().getDisplayMetrics().widthPixels, true, 0.5625f);
        if (InsetsFrameLayout.f3009a) {
            return a2 - ik.d(this.c);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final float d() {
        return 0.8f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final boolean e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final int f() {
        return 0;
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
        return com.google.android.finsky.utils.ai.a(this.c, 9);
    }
}
