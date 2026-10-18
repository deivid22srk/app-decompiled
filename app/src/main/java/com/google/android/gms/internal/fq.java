package com.google.android.gms.internal;

import android.view.View;

/* loaded from: classes.dex */
final class fq implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fp f5982a;

    fq(fp fpVar) {
        this.f5982a = fpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5982a.a(true);
    }
}
