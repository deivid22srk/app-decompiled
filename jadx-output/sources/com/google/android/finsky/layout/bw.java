package com.google.android.finsky.layout;

import android.view.View;

/* loaded from: classes.dex */
final class bw implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bv f3174a;

    bw(bv bvVar) {
        this.f3174a = bvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3174a.a();
        this.f3174a.f3172a.n_();
    }
}
