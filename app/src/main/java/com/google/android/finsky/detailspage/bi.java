package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public class bi extends bd<bj> implements ai {
    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.footer_spacer_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0 && ((bj) this.f2559b).f2561a;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (this.f2559b == 0) {
            this.f2559b = new bj();
            ((bj) this.f2559b).f2561a = true;
        }
        if (z && ((bj) this.f2559b).f2561a) {
            ((bj) this.f2559b).f2561a = false;
            this.d.a(this);
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        FooterSpacerModuleLayout footerSpacerModuleLayout = (FooterSpacerModuleLayout) view;
        int dimensionPixelSize = this.c.getResources().getDisplayMetrics().heightPixels - this.c.getResources().getDimensionPixelSize(R.dimen.hero_image_height);
        ViewGroup.LayoutParams layoutParams = footerSpacerModuleLayout.getLayoutParams();
        if (layoutParams.height == dimensionPixelSize) {
            return;
        }
        layoutParams.height = dimensionPixelSize;
        footerSpacerModuleLayout.requestLayout();
    }
}
