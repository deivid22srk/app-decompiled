package com.google.android.finsky.activities;

import android.view.View;

/* loaded from: classes.dex */
final class br implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1627a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bi f1628b;

    br(bi biVar, String str) {
        this.f1628b = biVar;
        this.f1627a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1628b.f1614a.k(this.f1627a);
    }
}
