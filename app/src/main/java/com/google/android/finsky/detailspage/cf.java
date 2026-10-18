package com.google.android.finsky.detailspage;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.RateReviewEditor;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.utils.hg;

/* loaded from: classes.dex */
final class cf implements hg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2576a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ny f2577b;
    final /* synthetic */ cb c;

    cf(cb cbVar, int i, ny nyVar) {
        this.c = cbVar;
        this.f2576a = i;
        this.f2577b = nyVar;
    }

    @Override // com.google.android.finsky.utils.hg
    public final void a(Document document) {
        boolean z;
        z = this.c.v;
        if (!z) {
            if (!RateReviewEditor.a()) {
                this.c.a(document, this.f2577b, this.f2576a);
                return;
            }
            ((ci) this.c.f2559b).i = true;
            ((ci) this.c.f2559b).k = true;
            this.c.a(FinskyApp.a().j(), this.f2576a, "", "", document, 1201, false);
            this.c.j();
        }
    }

    @Override // com.google.android.finsky.utils.hg
    public final void a() {
        boolean z;
        z = this.c.v;
        if (!z) {
            this.c.j();
        }
    }
}
