package com.google.android.finsky.activities;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class bj implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1615a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f1616b;
    final /* synthetic */ bi c;

    bj(bi biVar, String str, ViewGroup viewGroup) {
        this.c = biVar;
        this.f1615a = str;
        this.f1616b = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.f1614a.k(this.f1615a);
        this.f1616b.setVisibility(4);
    }
}
