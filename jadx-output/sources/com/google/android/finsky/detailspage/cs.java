package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.ic;

/* loaded from: classes.dex */
public class cs extends bd<cw> implements cz, com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.finsky.a.ai f2592a = com.google.android.finsky.a.i.a(1215);

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.review_snippets_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return (this.f2559b == 0 || ((cw) this.f2559b).f2597b == null || ((cw) this.f2559b).f2597b.isEmpty()) ? false : true;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (document != null && !TextUtils.isEmpty(document.f1963a.J) && z) {
            if (this.f2559b == 0) {
                this.f2559b = new cw();
                this.f.e(document.f1963a.J, new ct(this), new cu(this));
            }
            ((cw) this.f2559b).f2596a = document;
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        ReviewSnippetsModuleLayout reviewSnippetsModuleLayout = (ReviewSnippetsModuleLayout) view;
        if (!reviewSnippetsModuleLayout.a()) {
            boolean z = !ic.b(reviewSnippetsModuleLayout.getContext());
            reviewSnippetsModuleLayout.b(((cw) this.f2559b).f2597b, ((cw) this.f2559b).f2596a, z, this.i, this.s);
            reviewSnippetsModuleLayout.setReviewSnippetClickListener(this);
            if (z) {
                reviewSnippetsModuleLayout.setAllReviewsClickListener(new cv(this));
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.cz
    public final void a(da daVar) {
        if (!TextUtils.isEmpty(daVar.d)) {
            FinskyApp.a().h().a(1216, (byte[]) null, this);
            this.i.a(((cw) this.f2559b).f2596a, daVar.d, false);
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.f2592a;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.s;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
