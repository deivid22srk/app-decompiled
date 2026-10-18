package com.google.android.finsky.activities;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class bs implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1629a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f1630b;
    final /* synthetic */ bi c;

    bs(bi biVar, String str, ViewGroup viewGroup) {
        this.c = biVar;
        this.f1629a = str;
        this.f1630b = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.f1614a.k(this.f1629a);
        FinskyApp.a().h().a(2911, (byte[]) null, this.c.s);
        this.c.c.a(this.c.f, this.c.g, 1, (com.google.android.finsky.utils.au) null, this.c.m, true);
        this.f1630b.setVisibility(0);
    }
}
