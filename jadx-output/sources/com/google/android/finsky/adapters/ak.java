package com.google.android.finsky.adapters;

import android.view.View;

/* loaded from: classes.dex */
final class ak implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f1893a;

    ak(aj ajVar) {
        this.f1893a = ajVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        i = this.f1893a.f;
        if (i == 2) {
            this.f1893a.a();
        }
        this.f1893a.a(1);
    }
}
