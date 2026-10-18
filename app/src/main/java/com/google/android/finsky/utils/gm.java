package com.google.android.finsky.utils;

import android.view.View;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class gm implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.layout.play.cy f4908a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f4909b;
    final /* synthetic */ gp c;
    final /* synthetic */ String d;

    gm(com.google.android.finsky.layout.play.cy cyVar, com.google.android.finsky.navigationmanager.b bVar, gp gpVar, String str) {
        this.f4908a = cyVar;
        this.f4909b = bVar;
        this.c = gpVar;
        this.d = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(221, (byte[]) null, this.f4908a);
        this.f4909b.a(this.c.i, this.c.h, this.c.e, this.c.f, this.d, false);
        if (view != null) {
            view.postDelayed(new gn(this), 300L);
        }
    }
}
