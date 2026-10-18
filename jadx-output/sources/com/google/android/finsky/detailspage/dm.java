package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.ic;

/* loaded from: classes.dex */
public class dm extends bd<dn> implements View.OnClickListener {
    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.reviews_statistics_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        if (this.f2559b != 0) {
            if (((dn) this.f2559b).f2620a.aP() && ((dn) this.f2559b).f2620a.B() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (document != null && !TextUtils.isEmpty(document.f1963a.H) && this.f2559b == 0) {
            this.f2559b = new dn();
            ((dn) this.f2559b).f2620a = document;
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        ReviewsStatisticsModuleLayout reviewsStatisticsModuleLayout = (ReviewsStatisticsModuleLayout) view;
        if (!reviewsStatisticsModuleLayout.f2507b) {
            long B = ((dn) this.f2559b).f2620a.B();
            float A = ((dn) this.f2559b).f2620a.A();
            int[] C = ((dn) this.f2559b).f2620a.C();
            reviewsStatisticsModuleLayout.f2506a = this.s;
            reviewsStatisticsModuleLayout.f2507b = true;
            reviewsStatisticsModuleLayout.c.a(B, A, C);
            if (!ic.b(view.getContext())) {
                reviewsStatisticsModuleLayout.setOnClickListener(this);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.i.a(((dn) this.f2559b).f2620a, ((dn) this.f2559b).f2620a.f1963a.H, false);
    }
}
