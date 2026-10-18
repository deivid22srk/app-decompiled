package com.google.android.finsky.setup;

import com.google.android.finsky.protos.lm;
import com.google.android.finsky.services.VpaService;
import com.google.android.finsky.services.bg;

/* loaded from: classes.dex */
final class y implements bg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f4683a;

    y(x xVar) {
        this.f4683a = xVar;
    }

    @Override // com.google.android.finsky.services.bg
    public final void a(lm[] lmVarArr) {
        VpaService vpaService;
        vpaService = this.f4683a.f4682a.v;
        if (vpaService != null) {
            this.f4683a.f4682a.u = lmVarArr;
            VpaSelectionActivity.c(this.f4683a.f4682a);
        }
    }
}
