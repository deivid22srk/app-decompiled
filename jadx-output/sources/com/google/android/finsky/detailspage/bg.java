package com.google.android.finsky.detailspage;

import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.DetailsFlagItemSection;

/* loaded from: classes.dex */
public class bg extends bd<bh> {
    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.details_flag_item;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (this.f2559b == 0 && z) {
            if (document.f1963a.e == 1 || document.f1963a.g == 2) {
                this.f2559b = new bh();
                ((bh) this.f2559b).f2560a = document;
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        DetailsFlagItemSection detailsFlagItemSection = (DetailsFlagItemSection) view;
        if (!detailsFlagItemSection.f2957a) {
            Document document = ((bh) this.f2559b).f2560a;
            com.google.android.finsky.navigationmanager.b bVar = this.i;
            com.google.android.finsky.layout.play.cy cyVar = this.s;
            if (document.f1963a.g == 3 || document.f1963a.g == 2) {
                detailsFlagItemSection.setOnClickListener(new com.google.android.finsky.layout.ai(detailsFlagItemSection, bVar, document, cyVar));
                detailsFlagItemSection.setContentDescription(detailsFlagItemSection.getResources().getString(R.string.flagging_title));
                detailsFlagItemSection.setVisibility(0);
            } else {
                detailsFlagItemSection.setVisibility(8);
            }
            detailsFlagItemSection.f2957a = true;
        }
    }
}
