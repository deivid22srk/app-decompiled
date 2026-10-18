package com.google.android.finsky.detailspage;

import com.google.android.finsky.layout.RateReviewEditor;
import com.google.android.finsky.utils.hh;

/* loaded from: classes.dex */
final class cg implements hh {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cb f2578a;

    cg(cb cbVar) {
        this.f2578a = cbVar;
    }

    @Override // com.google.android.finsky.utils.hh
    public final void a(int i) {
        if (RateReviewEditor.a()) {
            ((ci) this.f2578a.f2559b).d = null;
        }
        this.f2578a.j();
    }

    @Override // com.google.android.finsky.utils.hh
    public final void a() {
        if (RateReviewEditor.a()) {
            ((ci) this.f2578a.f2559b).i = false;
        }
        this.f2578a.j();
    }
}
