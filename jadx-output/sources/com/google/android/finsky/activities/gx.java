package com.google.android.finsky.activities;

import com.google.android.finsky.layout.HeroGraphicView;

/* loaded from: classes.dex */
final class gx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gy f1788a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gv f1789b;

    gx(gv gvVar, gy gyVar) {
        this.f1789b = gvVar;
        this.f1788a = gyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HeroGraphicView heroGraphicView;
        int unused;
        gy gyVar = this.f1788a;
        heroGraphicView = this.f1789b.aG;
        unused = this.f1789b.f1785b;
        gyVar.a(heroGraphicView);
    }
}
