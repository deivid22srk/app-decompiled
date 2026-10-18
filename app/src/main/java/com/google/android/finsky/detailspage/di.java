package com.google.android.finsky.detailspage;

import com.google.android.finsky.activities.ff;
import com.google.android.finsky.layout.ReviewItemLayout;
import com.google.android.finsky.protos.ny;

/* loaded from: classes.dex */
final class di implements com.google.android.finsky.layout.dl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ny f2614a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ReviewsSamplesModuleLayout f2615b;

    di(ReviewsSamplesModuleLayout reviewsSamplesModuleLayout, ny nyVar) {
        this.f2615b = reviewsSamplesModuleLayout;
        this.f2614a = nyVar;
    }

    @Override // com.google.android.finsky.layout.dl
    public final void a(ReviewItemLayout reviewItemLayout) {
        ReviewsSamplesModuleLayout.a(this.f2615b, this.f2614a, ff.HELPFUL);
    }

    @Override // com.google.android.finsky.layout.dl
    public final void b(ReviewItemLayout reviewItemLayout) {
        ReviewsSamplesModuleLayout.a(this.f2615b, this.f2614a, ff.SPAM);
    }
}
