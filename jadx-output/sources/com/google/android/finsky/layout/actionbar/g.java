package com.google.android.finsky.layout.actionbar;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;

/* loaded from: classes.dex */
final class g implements com.google.android.play.image.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f3117a;

    g(e eVar) {
        this.f3117a = eVar;
    }

    @Override // com.android.volley.t
    /* renamed from: a */
    public final void a_(com.google.android.play.image.j jVar) {
        Activity activity;
        MenuItem menuItem;
        MenuItem menuItem2;
        activity = this.f3117a.p;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(activity.getResources(), jVar.f6944a);
        menuItem = this.f3117a.j;
        menuItem.setIcon(bitmapDrawable);
        menuItem2 = this.f3117a.j;
        menuItem2.setVisible(true);
    }
}
