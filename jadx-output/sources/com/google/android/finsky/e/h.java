package com.google.android.finsky.e;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.gq;
import com.google.android.finsky.activities.gt;
import com.google.android.finsky.adapters.CardRecyclerViewAdapter;
import com.google.android.finsky.adapters.z;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.em;
import com.google.android.finsky.layout.play.PlayRecyclerView;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.ba;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.utils.ac;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public final class h extends x<com.google.android.finsky.api.model.s> implements com.android.volley.s, com.google.android.finsky.api.model.x {

    /* renamed from: a, reason: collision with root package name */
    public CardRecyclerViewAdapter f2754a;

    /* renamed from: b, reason: collision with root package name */
    public PlayRecyclerView f2755b;
    protected DfeToc c;
    private ViewGroup h;
    private boolean i;
    private final com.google.android.finsky.api.b j;
    private final ac k;
    private gt l;

    public h(DfeToc dfeToc, com.google.android.finsky.api.b bVar, ac acVar) {
        this.c = dfeToc;
        this.j = bVar;
        this.k = acVar;
    }

    @Override // com.google.android.finsky.e.x
    public final void a(com.google.android.finsky.api.model.s sVar) {
        T t;
        a();
        super.a((h) sVar);
        this.i = false;
        if (this.g != 0 && (t = sVar.f1988a) != 0) {
            t.a(this);
            t.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ViewGroup viewGroup, Document document, ba[] baVarArr, String str, int i, Bundle bundle, gt gtVar, cy cyVar, gq gqVar, em emVar) {
        CardRecyclerViewAdapter pVar;
        this.h = viewGroup;
        this.l = gtVar;
        this.f2755b = (PlayRecyclerView) viewGroup.findViewById(R.id.tab_recycler_view);
        this.f2755b.setLayoutManager(new LinearLayoutManager());
        boolean z = emVar != null;
        if (document == null || (document.a() == 0 && (this.g == 0 || ((com.google.android.finsky.api.model.s) this.g).f1988a.p() == 0))) {
            View findViewById = this.h.findViewById(R.id.no_results_view);
            if (findViewById != null) {
                FifeImageView fifeImageView = (FifeImageView) findViewById.findViewById(R.id.empty_list_image);
                if (document != null && document.c(4)) {
                    ds dsVar = document.b(4).get(0);
                    fifeImageView.a(dsVar.f, dsVar.l, FinskyApp.a().d);
                    fifeImageView.setVisibility(0);
                } else {
                    fifeImageView.setVisibility(8);
                }
                if (document != null && document.ax()) {
                    String str2 = document.aJ().y.f3903a;
                    if (!TextUtils.isEmpty(str2)) {
                        ((TextView) findViewById.findViewById(R.id.no_results_textview)).setText(str2);
                    }
                }
                this.f2755b.setEmptyView(findViewById);
                return;
            }
            return;
        }
        if (this.f2754a != null) {
            this.f2754a.r();
        }
        boolean z2 = bundle != null;
        if ((document.f1963a.C == null || document.f1963a.C.k == null || document.f1963a.C.k.k == null) ? false : true) {
            pVar = new z(this.d, this.j, this.e, this.f, this.c, this.k, document, (com.google.android.finsky.api.model.s) this.g, z2, cyVar);
        } else {
            if ((document.aJ() == null || document.aJ().v == null) ? false : true) {
                pVar = new a(this.d, this.j, this.e, this.f, this.c, this.k, document, (com.google.android.finsky.api.model.s) this.g, z2, cyVar);
            } else {
                pVar = new com.google.android.finsky.adapters.p(this.d, this.j, this.e, this.f, this.c, this.k, (com.google.android.finsky.api.model.s) this.g, baVarArr, str, z2, (document.f1963a.C != null && document.f1963a.C.k != null && document.f1963a.C.k.l != null) || document.aq(), i, cyVar, gqVar, z);
            }
        }
        this.f2754a = pVar;
        if (this.i) {
            this.f2755b.setEmptyView(null);
        } else {
            this.f2755b.setEmptyView(this.h.findViewById(R.id.no_results_view));
        }
        this.f2755b.setAdapter(this.f2754a);
        this.f2755b.getRecycledViewPool().a(6, 20);
        if (this.f2754a instanceof com.google.android.finsky.adapters.p) {
            this.f2755b.setScrollingTouchSlop(1);
        }
        this.f2755b.a(new com.google.android.finsky.adapters.r(viewGroup.getContext()));
        if (this.l != null) {
            this.l.a(this.f2754a);
        }
        if (bundle != null) {
            this.f2754a.b(this.f2755b, bundle);
        }
        if (emVar != null) {
            CardRecyclerViewAdapter cardRecyclerViewAdapter = this.f2754a;
            PlayRecyclerView playRecyclerView = this.f2755b;
            emVar.d = cardRecyclerViewAdapter;
            emVar.c = playRecyclerView;
            emVar.c.a(emVar.f3270b);
            emVar.e = true;
            if (em.f3269a) {
                emVar.g.setAccessibilityTraversalBefore(emVar.c.getId());
            }
            emVar.a();
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        if (this.f2755b != null) {
            this.f2754a.u();
        }
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        if (!this.i && this.f2755b != null) {
            this.f2755b.setEmptyView(this.h.findViewById(R.id.no_results_view));
            this.i = true;
        }
        if (this.f2754a == null) {
            return;
        }
        this.f2754a.f774a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        if (this.g == 0) {
            return;
        }
        T t = ((com.google.android.finsky.api.model.s) this.g).f1988a;
        t.b(this);
        t.b(this);
        this.g = null;
    }
}
