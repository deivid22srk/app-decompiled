package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.HeroGraphicView;

/* loaded from: classes.dex */
public class bm extends bd<bn> implements ai {
    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.header_list_spacer_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        super.a(bfVar);
        if (this.f2559b != 0) {
            ((bn) this.f2559b).f2564b = HeroGraphicView.a(this.c, ((bn) this.f2559b).f2563a, this.n);
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (this.f2559b == 0) {
            this.f2559b = new bn(this);
            ((bn) this.f2559b).f2563a = document;
            ((bn) this.f2559b).f2564b = HeroGraphicView.a(this.c, ((bn) this.f2559b).f2563a, this.n);
        }
        if (z) {
            ((bn) this.f2559b).f2563a = document;
            int a2 = HeroGraphicView.a(this.c, ((bn) this.f2559b).f2563a, this.n);
            if (a2 != ((bn) this.f2559b).f2564b) {
                ((bn) this.f2559b).f2564b = a2;
                this.d.a((bd) this, true);
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        HeaderListSpacerModuleLayout headerListSpacerModuleLayout = (HeaderListSpacerModuleLayout) view;
        int i = ((bn) this.f2559b).f2564b;
        ViewGroup.LayoutParams layoutParams = headerListSpacerModuleLayout.getLayoutParams();
        if (layoutParams.height == i) {
            return;
        }
        layoutParams.height = i;
        headerListSpacerModuleLayout.requestLayout();
    }
}
