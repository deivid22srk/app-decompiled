package com.google.android.finsky.detailspage;

import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public class bk extends bd<bl> {
    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.footer_text_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        String str;
        if (this.f2559b != 0 || !z) {
            return;
        }
        if (hVar.f1976a == null || hVar.f1976a.d.length() == 0) {
            str = null;
        } else {
            str = hVar.f1976a.d;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f2559b = new bl();
            ((bl) this.f2559b).f2562a = str;
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        FooterTextModuleLayout footerTextModuleLayout = (FooterTextModuleLayout) view;
        if (footerTextModuleLayout.f2501a) {
            return;
        }
        footerTextModuleLayout.setText(Html.fromHtml(((bl) this.f2559b).f2562a));
        footerTextModuleLayout.f2501a = true;
    }
}
