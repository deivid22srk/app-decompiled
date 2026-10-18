package com.google.android.finsky.detailspage;

import android.view.View;
import com.google.android.finsky.protos.ny;

/* loaded from: classes.dex */
final class dj implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ny f2616a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ReviewsSamplesModuleLayout f2617b;

    dj(ReviewsSamplesModuleLayout reviewsSamplesModuleLayout, ny nyVar) {
        this.f2617b = reviewsSamplesModuleLayout;
        this.f2616a = nyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dl dlVar;
        dlVar = this.f2617b.j;
        dlVar.a(this.f2616a);
    }
}
