package com.google.android.finsky.detailspage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.HeroGraphicView;

/* loaded from: classes.dex */
final class x extends com.google.android.finsky.layout.play.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f2674a;
    private boolean d;
    private int e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w wVar, Context context, boolean z, int i, int i2) {
        super(context);
        this.f2674a = wVar;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.d) {
            this.f2674a.al = (HeroGraphicView) layoutInflater.inflate(R.layout.hero_graphic, viewGroup, false);
            viewGroup.addView(this.f2674a.al);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x
    public final int a() {
        return R.layout.header_list_recycler_view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final int c() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int b() {
        return R.id.recycler_view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final boolean e() {
        return !this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final float d() {
        return 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final int f() {
        return this.d ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final boolean g() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int h() {
        return this.c.getResources().getColor(R.color.status_bar_overlay);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int i() {
        return com.google.android.finsky.utils.ai.a(this.c, this.f);
    }
}
