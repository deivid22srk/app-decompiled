package com.google.android.finsky.adapters;

import android.content.Context;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.SearchResultCorrectionLayout;
import com.google.android.finsky.layout.play.cx;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.of;

/* loaded from: classes.dex */
public final class ax extends p<com.google.android.finsky.api.model.m> {
    private final boolean x;
    private boolean y;

    public ax(Context context, com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, DfeToc dfeToc, com.google.android.finsky.utils.ac acVar, com.google.android.finsky.api.model.s<com.google.android.finsky.api.model.m> sVar, boolean z, boolean z2, cy cyVar) {
        super(context, bVar, bVar2, eVar, dfeToc, acVar, sVar, null, null, z, false, 2, cyVar, null, false);
        this.y = z2;
        this.x = !TextUtils.isEmpty(((com.google.android.finsky.api.model.m) this.r.f1988a).d);
        if (this.v == 0 && w()) {
            this.v = 3;
        }
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final View.OnClickListener a(Document document, cy cyVar) {
        if (com.google.android.finsky.navigationmanager.b.b(document)) {
            return this.u.a(document, cyVar, ((com.google.android.finsky.api.model.m) this.r.f1988a).c, document.f1963a.g, (View) null);
        }
        return null;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        return i == 40 ? new cx(a(R.layout.search_result_correction, viewGroup, false)) : super.a(viewGroup, i);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final int a(int i) {
        if (this.x) {
            if (i == 1) {
                return 40;
            }
            if (i > 1) {
                i--;
            }
        }
        return super.a(i);
    }

    @Override // com.google.android.finsky.adapters.p, com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final void b(int i, eq eqVar) {
        if (!this.p) {
            super.b(i, eqVar);
        } else {
            e(i, eqVar);
        }
    }

    @Override // com.google.android.finsky.adapters.p, com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final void a(int i, eq eqVar) {
        if (!this.p) {
            super.a(i, eqVar);
        } else {
            e(i, eqVar);
        }
    }

    private void e(int i, eq eqVar) {
        Document a2 = this.r.a(i);
        int i2 = this.i && FinskyApp.a().e().a(12604267L) ? R.layout.play_card_mini : R.layout.play_card_small;
        if (a2.a() == 1) {
            i2 = R.layout.play_card_medium;
        }
        a(a2, eqVar, i2);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final boolean k() {
        return false;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final int f(int i) {
        return -1;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final void a(com.google.android.finsky.layout.play.ag agVar, Spinner spinner, View view) {
        agVar.setIdentifier("corpus_selector");
        of[] g = ((com.google.android.finsky.api.model.m) this.r.f1988a).g();
        String[] strArr = new String[g.length];
        int i = 0;
        int i2 = 3;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            of ofVar = g[i3];
            strArr[i3] = ofVar.c;
            if (i == 0 && ofVar.i) {
                i2 = ofVar.e;
                i = i3;
            }
        }
        spinner.setBackgroundResource(com.google.android.finsky.utils.ai.e(i2));
        view.setBackgroundColor(com.google.android.finsky.utils.ai.a(this.t, i2));
        int dimensionPixelSize = this.d + spinner.getResources().getDimensionPixelSize(R.dimen.search_spinner_selected_margin_left);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) spinner.getLayoutParams();
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.rightMargin = dimensionPixelSize;
        spinner.setLayoutParams(marginLayoutParams);
        spinner.setAdapter(new bb(this.t, strArr));
        spinner.setSelection(i);
        spinner.setOnItemSelectedListener(new ay(this, g, spinner));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    public final int p() {
        return (this.x ? 1 : 0) + super.p();
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final boolean h() {
        return w();
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final View a(ViewGroup viewGroup) {
        return a(R.layout.family_safe_search_header, viewGroup, false);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final void b(View view) {
        int dimensionPixelSize = this.d + view.getResources().getDimensionPixelSize(R.dimen.family_safe_search_title_margin_left);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.rightMargin = dimensionPixelSize;
    }

    @Override // com.google.android.finsky.adapters.al
    protected final void h(int i) {
        if (i == 0 && w()) {
            i = 3;
        }
        super.h(i);
    }

    @Override // com.google.android.finsky.adapters.al
    protected final int t() {
        return w() ? 3 : 0;
    }

    private boolean w() {
        com.google.android.finsky.api.model.m mVar = (com.google.android.finsky.api.model.m) this.r.f1988a;
        return this.y && mVar != null && mVar.p() > 0;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        if (eqVar.e == 40) {
            SearchResultCorrectionLayout searchResultCorrectionLayout = (SearchResultCorrectionLayout) eqVar.f795a;
            com.google.android.finsky.api.model.m mVar = (com.google.android.finsky.api.model.m) this.r.f1988a;
            String str = mVar.c;
            String str2 = mVar.d;
            boolean z = mVar.e;
            searchResultCorrectionLayout.f3076a = z;
            if (searchResultCorrectionLayout.f3076a) {
                searchResultCorrectionLayout.f3077b.a(searchResultCorrectionLayout.getContext().getString(R.string.full_page_replaced_question), str2);
                searchResultCorrectionLayout.c.a(searchResultCorrectionLayout.getContext().getString(R.string.search_instead_question), str);
                searchResultCorrectionLayout.f3077b.setVisibility(0);
                searchResultCorrectionLayout.f3077b.setVisibility(0);
            } else {
                searchResultCorrectionLayout.f3077b.a(searchResultCorrectionLayout.getContext().getString(R.string.suggestion_question), str2);
                searchResultCorrectionLayout.f3077b.setVisibility(0);
                searchResultCorrectionLayout.c.setVisibility(8);
            }
            if (z) {
                searchResultCorrectionLayout.setOnClickListener(new ba(this, str));
                searchResultCorrectionLayout.setClickable(true);
                searchResultCorrectionLayout.setFocusable(true);
            } else {
                searchResultCorrectionLayout.setOnClickListener(new az(this, str2));
                searchResultCorrectionLayout.setClickable(true);
                searchResultCorrectionLayout.setFocusable(true);
            }
            searchResultCorrectionLayout.setIdentifier("suggestion_header");
            return;
        }
        super.a(eqVar, i);
    }
}
