package com.google.android.play.search;

import android.animation.Animator;
import android.graphics.Point;
import android.view.View;
import android.view.ViewAnimationUtils;

/* loaded from: classes.dex */
final class ac implements n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaySearchToolbar f7026a;

    ac(PlaySearchToolbar playSearchToolbar) {
        this.f7026a = playSearchToolbar;
    }

    @Override // com.google.android.play.search.n
    public final void a(int i) {
        PlaySearch playSearch;
        n nVar;
        n nVar2;
        if (i == 1 || i == 2) {
            this.f7026a.i();
            playSearch = this.f7026a.u;
            ad adVar = new ad(this);
            if (PlaySearch.f7007a) {
                g gVar = new g(playSearch, adVar);
                if (((View) playSearch.getParent()) != null && playSearch.d != null && playSearch.d.isAttachedToWindow()) {
                    Point revealCenter = playSearch.getRevealCenter();
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(playSearch.d, revealCenter.x, revealCenter.y, r0.getWidth(), 0.0f);
                    createCircularReveal.setDuration(300L);
                    createCircularReveal.addListener(new i(playSearch));
                    createCircularReveal.addListener(gVar);
                    createCircularReveal.start();
                }
            } else {
                playSearch.setVisibility(4);
                adVar.run();
            }
        }
        nVar = this.f7026a.x;
        if (nVar != null) {
            nVar2 = this.f7026a.x;
            nVar2.a(i);
        }
    }

    @Override // com.google.android.play.search.n
    public final void a(String str, boolean z) {
        PlaySearch playSearch;
        n nVar;
        n nVar2;
        PlaySearch playSearch2;
        playSearch = this.f7026a.p;
        if (playSearch != null) {
            playSearch2 = this.f7026a.p;
            playSearch2.setQuery(str);
        }
        nVar = this.f7026a.x;
        if (nVar != null) {
            nVar2 = this.f7026a.x;
            nVar2.a(str, z);
        }
    }

    @Override // com.google.android.play.search.n
    public final void a(v vVar) {
        PlaySearch playSearch;
        PlaySearch playSearch2;
        n nVar;
        n nVar2;
        if (!this.f7026a.g()) {
            playSearch = this.f7026a.u;
            playSearch.c.b();
        } else {
            this.f7026a.a(true, 2);
        }
        playSearch2 = this.f7026a.u;
        playSearch2.c.b();
        nVar = this.f7026a.x;
        if (nVar != null) {
            nVar2 = this.f7026a.x;
            nVar2.a(vVar);
        }
    }

    @Override // com.google.android.play.search.n
    public final boolean b(v vVar) {
        n nVar;
        n nVar2;
        nVar = this.f7026a.x;
        if (nVar == null) {
            return false;
        }
        nVar2 = this.f7026a.x;
        return nVar2.b(vVar);
    }

    @Override // com.google.android.play.search.n
    public final void a(String str) {
        PlaySearch playSearch;
        n nVar;
        n nVar2;
        if (!this.f7026a.g()) {
            playSearch = this.f7026a.u;
            playSearch.c.b();
        } else {
            this.f7026a.a(true, 2);
        }
        nVar = this.f7026a.x;
        if (nVar != null) {
            nVar2 = this.f7026a.x;
            nVar2.a(str);
        }
    }
}
