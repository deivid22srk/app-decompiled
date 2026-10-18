package com.google.android.finsky.adapters;

import android.content.Context;
import android.support.v7.widget.eq;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.ReviewsActivity;
import com.google.android.finsky.activities.fe;
import com.google.android.finsky.activities.ff;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.Cdo;
import com.google.android.finsky.layout.HistogramView;
import com.google.android.finsky.layout.ReviewItemLayout;
import com.google.android.finsky.layout.ReviewsControlContainer;
import com.google.android.finsky.layout.ReviewsTipHeaderLayout;
import com.google.android.finsky.layout.RottenTomatoesReviewItem;
import com.google.android.finsky.layout.RottenTomatoesReviewsHeader;
import com.google.android.finsky.layout.dn;
import com.google.android.finsky.layout.dr;
import com.google.android.finsky.layout.ds;
import com.google.android.finsky.layout.play.cx;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.fp;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.protos.oc;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.hl;
import com.google.android.finsky.utils.ic;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class aq extends al implements com.android.volley.s {
    final Document c;
    public final com.google.android.finsky.api.model.l d;
    final aw e;
    final com.google.android.finsky.utils.ac f;
    final List<av> g;
    private final DfeToc h;
    private final com.google.android.play.image.e i;
    private final boolean j;
    private final au k;
    private final com.google.android.finsky.navigationmanager.b l;
    private final cy m;
    private final int n;
    private final boolean o;
    private final fe p;
    private final NumberFormat q;

    public aq(Context context, Document document, com.google.android.finsky.api.model.l lVar, boolean z, DfeToc dfeToc, aw awVar, au auVar, com.google.android.finsky.navigationmanager.b bVar, com.google.android.play.image.e eVar, fe feVar, cy cyVar) {
        super(context, null, lVar.i(), lVar.m);
        this.g = new ArrayList();
        this.c = document;
        this.d = lVar;
        this.j = z;
        this.d.a((com.google.android.finsky.api.model.x) this);
        this.d.a((com.android.volley.s) this);
        this.n = Integer.MAX_VALUE;
        this.e = awVar;
        this.k = auVar;
        this.l = bVar;
        this.m = cyVar;
        this.o = ReviewsActivity.o();
        this.p = feVar;
        this.f = FinskyApp.a().a(FinskyApp.a().j());
        this.q = NumberFormat.getIntegerInstance();
        this.i = eVar;
        this.h = dfeToc;
        f();
    }

    @Override // android.support.v7.widget.dt
    public final int a() {
        return this.g.size();
    }

    @Override // android.support.v7.widget.dt
    public final int a(int i) {
        return this.g.get(i).f1903a;
    }

    @Override // android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        View a2;
        if (i == R.layout.loading_footer) {
            a2 = g(viewGroup);
        } else if (i == R.layout.error_footer) {
            a2 = h(viewGroup);
        } else {
            a2 = a(i, viewGroup, false);
        }
        return new cx(a2);
    }

    @Override // android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        View view = eqVar.f795a;
        int i2 = eqVar.e;
        switch (i2) {
            case R.layout.error_footer /* 2130968734 */:
                f(view);
                return;
            case R.layout.loading_footer /* 2130968836 */:
                e(view);
                return;
            case R.layout.review_item /* 2130969098 */:
                ReviewItemLayout reviewItemLayout = (ReviewItemLayout) view;
                av avVar = this.g.get(i);
                ny c = this.d.c(avVar.f1904b);
                boolean z = !TextUtils.isEmpty(c.f4191a);
                reviewItemLayout.a(this.c, c, this.n, this.l, false, this.o, b(c), a(c), this.m);
                if (z) {
                    if (this.o) {
                        reviewItemLayout.setReviewFeedbackActionListener(new ar(this, c, avVar));
                        return;
                    } else {
                        reviewItemLayout.setActionClickListener(new as(this, c));
                        return;
                    }
                }
                reviewItemLayout.setActionClickListener(null);
                return;
            case R.layout.reviews_filters /* 2130969103 */:
                ReviewsControlContainer reviewsControlContainer = (ReviewsControlContainer) view;
                com.google.android.finsky.api.model.l lVar = this.d;
                au auVar = this.k;
                reviewsControlContainer.f3062a.setText(hl.a(reviewsControlContainer.getContext(), lVar.d));
                reviewsControlContainer.f3062a.setOnClickListener(new dn(reviewsControlContainer, auVar));
                reviewsControlContainer.f3063b.setOnClickListener(new Cdo(reviewsControlContainer, auVar));
                return;
            case R.layout.reviews_no_matching /* 2130969104 */:
                return;
            case R.layout.reviews_statistics_expanded /* 2130969107 */:
                HistogramView histogramView = (HistogramView) view;
                if (!this.c.aP()) {
                    FinskyLog.c("No histogram data received from server", new Object[0]);
                    histogramView.setVisibility(8);
                }
                histogramView.a(this.c.B(), this.c.A(), this.c.C());
                return;
            case R.layout.reviews_tip_header /* 2130969109 */:
                ReviewsTipHeaderLayout reviewsTipHeaderLayout = (ReviewsTipHeaderLayout) view;
                oc ocVar = this.d.f;
                reviewsTipHeaderLayout.a(ocVar.c, ocVar.h ? this.t.getResources().getQuantityString(R.plurals.review_snippet_count, (int) ocVar.g, this.q.format(ocVar.g)) : null);
                return;
            case R.layout.rotten_tomatoes_review_item /* 2130969112 */:
                RottenTomatoesReviewItem rottenTomatoesReviewItem = (RottenTomatoesReviewItem) view;
                ny c2 = this.d.c(this.g.get(i).f1904b);
                rottenTomatoesReviewItem.f3068a.a(c2.f.f, c2.f.l, this.i);
                if (TextUtils.isEmpty(c2.k)) {
                    rottenTomatoesReviewItem.f3069b.setVisibility(4);
                } else {
                    rottenTomatoesReviewItem.f3069b.setVisibility(0);
                    rottenTomatoesReviewItem.f3069b.setOnClickListener(new dr(rottenTomatoesReviewItem, c2));
                }
                rottenTomatoesReviewItem.c.setText(c2.i);
                rottenTomatoesReviewItem.d.setText(c2.D);
                rottenTomatoesReviewItem.e.setText(c2.m);
                return;
            case R.layout.rotten_tomatoes_reviews_header /* 2130969113 */:
                RottenTomatoesReviewsHeader rottenTomatoesReviewsHeader = (RottenTomatoesReviewsHeader) view;
                fp fpVar = this.d.e;
                com.google.android.finsky.navigationmanager.b bVar = this.l;
                DfeToc dfeToc = this.h;
                com.google.android.play.image.e eVar = this.i;
                rottenTomatoesReviewsHeader.f3070a.setText(fpVar.f3836a.toUpperCase());
                rottenTomatoesReviewsHeader.f3071b.a(fpVar.c.f, fpVar.c.l, eVar);
                rottenTomatoesReviewsHeader.c.setText(Integer.toString(fpVar.f));
                if (fpVar.e) {
                    rottenTomatoesReviewsHeader.d.setText(Html.fromHtml(rottenTomatoesReviewsHeader.getResources().getString(R.string.reviews_count_label, Integer.valueOf(fpVar.d))));
                    rottenTomatoesReviewsHeader.d.setVisibility(0);
                } else {
                    rottenTomatoesReviewsHeader.d.setVisibility(8);
                }
                rottenTomatoesReviewsHeader.e.setPercentValue(fpVar.f);
                rottenTomatoesReviewsHeader.f.setText(fpVar.h);
                if (fpVar.j != null) {
                    rottenTomatoesReviewsHeader.f.setOnClickListener(new ds(rottenTomatoesReviewsHeader, bVar, fpVar, dfeToc));
                    return;
                } else {
                    rottenTomatoesReviewsHeader.f.setOnClickListener(null);
                    return;
                }
            default:
                throw new IllegalStateException("Unknown type for onBindViewHolder " + i2);
        }
    }

    private void f() {
        this.g.clear();
        if (this.d.a()) {
            if ((h() || this.c == null || !this.c.aP() || this.j) ? false : true) {
                this.g.add(new av(R.layout.reviews_statistics_expanded));
            }
            if ((h() || this.c == null || this.c.f1963a.e != 1 || this.j || ic.b(this.t)) ? false : true) {
                this.g.add(new av(R.layout.reviews_filters));
            }
            if ((h() || !this.j || this.d.e == null) ? false : true) {
                this.g.add(new av(R.layout.rotten_tomatoes_reviews_header));
            }
            if (h()) {
                this.g.add(new av(R.layout.reviews_tip_header));
            }
            if (this.d.p() == 0) {
                this.g.add(new av(this.d.m ? R.layout.loading_footer : R.layout.reviews_no_matching));
            }
            for (int i = 0; i < this.d.p(); i++) {
                ny a2 = this.d.a(i, false);
                if (this.j) {
                    this.g.add(new av(R.layout.rotten_tomatoes_review_item, i));
                } else if (!a(a2)) {
                    this.g.add(new av(R.layout.review_item, i));
                }
            }
            int v = v();
            if (v != 0) {
                if (v == 1) {
                    this.g.add(new av(R.layout.loading_footer));
                } else if (v == 2) {
                    this.g.add(new av(R.layout.error_footer));
                } else {
                    FinskyLog.d("No footer or item in last row", new Object[0]);
                    this.g.add(new av(R.layout.error_footer));
                }
            }
            this.f774a.a();
        }
    }

    final void a(ReviewItemLayout reviewItemLayout, ff ffVar, ny nyVar) {
        if (this.p != null) {
            this.p.a(this.c.f1963a.f3890a, nyVar.f4191a, ffVar);
        }
        if (this.f.c(this.c.f1963a.f3890a, nyVar.f4191a, ffVar)) {
            this.f.b(this.c.f1963a.f3890a, nyVar.f4191a, ffVar);
        } else {
            this.f.a(this.c.f1963a.f3890a, nyVar.f4191a, ffVar);
        }
        reviewItemLayout.a(this.c, nyVar, this.n, this.l, false, this.o, b(nyVar), a(nyVar), this.m);
    }

    private boolean a(ny nyVar) {
        return this.f.c(this.c.f1963a.f3890a, nyVar.f4191a, ff.SPAM);
    }

    private boolean b(ny nyVar) {
        return this.f.c(this.c.f1963a.f3890a, nyVar.f4191a, ff.HELPFUL);
    }

    @Override // com.google.android.finsky.adapters.al, com.google.android.finsky.api.model.x
    public final void m_() {
        super.m_();
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.al
    public final String e() {
        return com.google.android.finsky.utils.aw.a(this.t, this.d.h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.al
    public final boolean O_() {
        return this.d.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.al
    public final void d() {
        this.d.r();
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        u();
    }

    private boolean h() {
        return this.d.f != null;
    }
}
