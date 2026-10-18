package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public class l extends eb<ec> implements com.google.android.finsky.g.o {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2661a;

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.bundle_card_cluster_module;
    }

    @Override // com.google.android.finsky.detailspage.eb, com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return super.W_() && ((ec) this.f2559b).f.p() != 0;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        BundleCardClusterModuleLayout bundleCardClusterModuleLayout = (BundleCardClusterModuleLayout) view;
        if (!bundleCardClusterModuleLayout.f2482a || this.f2661a) {
            this.f2661a = false;
            bundleCardClusterModuleLayout.a(((ec) this.f2559b).f, this.h, this.i, this.s, 17);
        }
    }

    @Override // com.google.android.finsky.detailspage.eb
    protected final void e() {
        this.m.a(this);
        super.e();
    }

    @Override // com.google.android.finsky.detailspage.eb, com.google.android.finsky.detailspage.bd
    public final void f() {
        this.m.b(this);
        super.f();
    }

    private void h() {
        if (W_()) {
            this.f2661a = true;
            this.d.a((bd) this, false);
        }
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        h();
    }

    @Override // com.google.android.finsky.g.o
    public final void M_() {
    }

    @Override // com.google.android.finsky.g.o
    public final void L_() {
        h();
    }

    @Override // com.google.android.finsky.detailspage.eb
    protected final ec a(Document document) {
        if (document.f1963a.e != 6 || !document.aS() || TextUtils.isEmpty(document.aT())) {
            return null;
        }
        ec ecVar = new ec();
        ecVar.e = document.aT();
        return ecVar;
    }
}
