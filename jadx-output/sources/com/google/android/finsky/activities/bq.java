package com.google.android.finsky.activities;

import android.view.View;

/* loaded from: classes.dex */
final class bq implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bi f1626a;

    bq(bi biVar) {
        this.f1626a = biVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1626a.r.a(220, (byte[]) null, this.f1626a.s);
        this.f1626a.e.getPackageManager().setApplicationEnabledSetting(this.f1626a.g.f1963a.f3890a, 1, 0);
    }
}
