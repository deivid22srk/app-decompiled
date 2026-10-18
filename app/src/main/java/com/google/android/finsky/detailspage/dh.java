package com.google.android.finsky.detailspage;

import android.view.View;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class dh implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f2612a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ReviewsSamplesModuleLayout f2613b;

    dh(ReviewsSamplesModuleLayout reviewsSamplesModuleLayout, Document document) {
        this.f2613b = reviewsSamplesModuleLayout;
        this.f2612a = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f2613b.h.a(this.f2612a, this.f2612a.f1963a.H, false);
    }
}
