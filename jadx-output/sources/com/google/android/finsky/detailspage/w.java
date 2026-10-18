package com.google.android.finsky.detailspage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Fade;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.fe;
import com.google.android.finsky.activities.ff;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.HeroGraphicView;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class w extends com.google.android.finsky.activities.bh implements fe, gp, be, com.google.android.finsky.installer.p {
    private boolean aB;
    private com.google.android.finsky.api.b aC;
    private com.google.android.finsky.api.model.h aD;
    private y aE;
    private List<Class> aF;
    private List<bf> aG;
    private Boolean aH;
    private Boolean aI;
    private boolean aJ;
    private int aK;
    private int aL;
    private int aM;
    private com.google.android.finsky.layout.actionbar.a aO;
    private RecyclerView aP;
    private boolean aQ;
    private int aR;
    private android.support.v7.widget.eg aS;
    private com.google.android.finsky.layout.u aT;
    protected FinskyHeaderListLayout ai;
    protected HeroGraphicView aj;
    protected bu ak;
    protected HeroGraphicView al;
    protected String am;
    protected boolean an;
    protected List<bd> g;
    boolean i;
    protected List<bw> h = new ArrayList();
    private boolean aN = true;

    static /* synthetic */ boolean a(w wVar) {
        wVar.aB = false;
        return false;
    }

    public static w a(Document document, String str, String str2, String str3, boolean z) {
        FinskyApp a2 = FinskyApp.a();
        w wVar = new w();
        wVar.f(str3);
        wVar.a(a2.g, str);
        wVar.a("finsky.DetailsDataBasedFragment.document", (Parcelable) document);
        wVar.b("finsky.DetailsFragment.continueUrl", str2);
        wVar.b("finsky.DetailsFragment.acquisitionOverride", z);
        return wVar;
    }

    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.header_list_container;
    }

    @Override // com.google.android.finsky.activities.bh, com.google.android.finsky.e.w, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
    }

    @Override // com.google.android.finsky.activities.bh, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        Context context = viewGroup.getContext();
        this.aH = Boolean.valueOf(context.getResources().getBoolean(R.bool.use_combined_title_in_details));
        Document document = ((com.google.android.finsky.activities.bh) this).f1612a;
        int i = document.f1963a.g;
        this.aQ = HeroGraphicView.a(document, this.f);
        this.aR = HeroGraphicView.a(context, document, this.f);
        this.ai = (FinskyHeaderListLayout) this.av;
        this.ai.a(new x(this, context, this.aQ, this.aR, i));
        this.ai.setFloatingControlsBackground(new ColorDrawable(com.google.android.finsky.utils.ai.a(f(), i)));
        com.google.android.finsky.layout.actionbar.c h = ((com.google.android.finsky.e.t) f()).h();
        if (this.aQ) {
            h.r();
        } else {
            h.s();
        }
        this.aO = new com.google.android.finsky.layout.actionbar.a(f().getWindow(), this.ai);
        this.ai.setOnLayoutChangedListener(this.aO);
        this.aO.b();
        this.aj = (HeroGraphicView) this.ai.findViewById(R.id.hero_promo);
        this.aP = (RecyclerView) this.ai.findViewById(R.id.recycler_view);
        this.aP.setSaveEnabled(false);
        if (!FinskyApp.a().e().a(12603629L)) {
            this.aP.setScrollContainer(false);
        }
        this.ai.setBackgroundViewForTouchPassthrough(this.aj);
        FinskyApp.a().k.a(this);
        return a2;
    }

    @Override // com.google.android.finsky.activities.bh, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        if (this.aD != null) {
            this.aD.a((com.google.android.finsky.api.model.x) this);
            this.aE = new y(this, (byte) 0);
            this.aD.a(this.aE);
        }
        super.d(bundle);
        if (!this.as.t()) {
            return;
        }
        com.google.android.finsky.utils.hats.h.a(2, this.ao);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.bh, com.google.android.finsky.e.q
    public final void y() {
        com.google.android.finsky.api.b bVar;
        byte b2 = 0;
        super.y();
        boolean z = this.r.getBoolean("finsky.DetailsFragment.acquisitionOverride");
        Document document = ((com.google.android.finsky.activities.bh) this).f1612a;
        if (z) {
            Object[] objArr = new Object[1];
            objArr[0] = document != null ? document.f1963a.f3890a : null;
            FinskyLog.c("mAcquisitionOverride true for docId=%s - I hope it came from deep link!", objArr);
        }
        boolean z2 = document.f1963a.g == 3;
        this.aB = false;
        if (z2) {
            String c = this.aq.c();
            String j = FinskyApp.a().j();
            if (!c.equals(j)) {
                FinskyLog.a("Using current account %s to fetch social details for %s", FinskyLog.a(j), document.f1963a.f3890a);
                this.aB = true;
                if (this.aD != null) {
                    this.aD.b((com.google.android.finsky.api.model.x) this);
                    this.aD.b(this.aE);
                }
                this.aD = new com.google.android.finsky.api.model.h(FinskyApp.a().b(j), this.aA, true, null);
                this.aD.a((com.google.android.finsky.api.model.x) this);
                this.aE = new y(this, b2);
                this.aD.a(this.aE);
            }
            FinskyApp.a().f(j).b(new com.google.android.finsky.a.b(509).a(((com.google.android.finsky.activities.bh) this).f1612a.f1963a.f3890a).a(this.aB).f1473a);
        }
        if (!this.aB) {
            bVar = this.aq;
        } else {
            bVar = FinskyApp.a().b((String) null);
        }
        this.aC = bVar;
    }

    protected boolean b(bd bdVar) {
        return bdVar.W_();
    }

    protected boolean Z_() {
        return false;
    }

    @Override // com.google.android.finsky.e.q
    public final void o_() {
        this.at.p();
        this.ao.b_(((com.google.android.finsky.activities.bh) this).f1612a.f1963a.i);
        this.ao.a(((com.google.android.finsky.activities.bh) this).f1612a.f1963a.g, true);
        this.ao.s_();
    }

    @Override // com.google.android.finsky.detailspage.be
    public final void a(bd bdVar, boolean z) {
        if (this.ak != null) {
            if (!this.g.contains(bdVar)) {
                FinskyLog.e("FinskyModule does not belong to this page", new Object[0]);
                return;
            }
            if (!bdVar.W_()) {
                FinskyLog.e("FinskyModule that is not ready for display asked for refresh", new Object[0]);
                return;
            }
            if (b(bdVar)) {
                if (!this.h.contains(bdVar)) {
                    c(bdVar);
                    return;
                }
                int indexOf = this.h.indexOf(bdVar);
                if (!z) {
                    bu buVar = this.ak;
                    buVar.d.post(new bv(buVar, buVar.c.get(indexOf)));
                    return;
                }
                this.ak.c(indexOf);
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.be
    public final void a(bd bdVar) {
        if (this.ak != null && this.h.contains(bdVar)) {
            bu buVar = this.ak;
            int indexOf = this.h.indexOf(bdVar);
            buVar.c.remove(indexOf);
            buVar.e(indexOf);
            this.h.remove(bdVar);
        }
    }

    @Override // com.google.android.finsky.detailspage.be
    public final void a(String str, Object obj) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.g.size()) {
                this.g.get(i2).a_(str, obj);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    protected final void c(bd bdVar) {
        if (this.h.contains(bdVar)) {
            FinskyLog.e("Trying to add a module that is already added", new Object[0]);
            return;
        }
        if (!b(bdVar)) {
            FinskyLog.e("Trying to add a module that is not ready for display", new Object[0]);
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.g.size() && i != this.h.size() && this.g.get(i2) != bdVar; i2++) {
            if (this.g.get(i2) == this.h.get(i)) {
                i++;
            }
        }
        this.h.add(i, bdVar);
        bu buVar = this.ak;
        buVar.c.add(i, bdVar);
        buVar.d(i);
    }

    @Override // com.google.android.finsky.activities.bh, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public void d() {
        int n = ((LinearLayoutManager) this.aP.getLayoutManager()).n();
        View childAt = this.aP.getChildAt(0);
        if (childAt != null) {
            this.aJ = true;
            this.aK = this.g.indexOf(this.h.get(n));
            this.aL = childAt.getTop();
            this.aM = childAt.getHeight();
        }
        this.aI = this.aH;
        bu buVar = this.ak;
        for (int i = 0; i < buVar.c.size(); i++) {
            bw bwVar = buVar.c.get(i);
            if (bwVar.t != null) {
                bwVar.b(bwVar.t.f795a);
                bwVar.t.l = null;
                bwVar.t = null;
            }
        }
        this.aF = new ArrayList();
        this.aG = new ArrayList();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            bd bdVar = this.g.get(i2);
            this.aF.add(bdVar.getClass());
            this.aG.add(bdVar.Y_());
            bdVar.f();
        }
        if (this.aD != null) {
            this.aD.b((com.google.android.finsky.api.model.x) this);
            this.aD.b(this.aE);
        }
        if (this.ai != null) {
            this.ai.d();
        }
        if (this.aO != null) {
            this.aO.e();
        }
        FinskyApp.a().k.b(this);
        this.ai = null;
        this.aO = null;
        this.aj = null;
        this.al = null;
        this.aP = null;
        this.aS = null;
        this.aT = null;
        this.ak = null;
        this.g.clear();
        this.h.clear();
        super.d();
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < this.g.size()) {
                this.g.get(i4).a(i, i2, intent);
                i3 = i4 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.g.size()) {
                this.g.get(i3).a(i, bundle);
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.g.size()) {
                this.g.get(i3).b(i, bundle);
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.finsky.activities.fe
    public final void a(String str, String str2, ff ffVar) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.g.size()) {
                this.g.get(i2).a(str, str2, ffVar);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.bh
    public final int l_() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    @TargetApi(22)
    public final Transition v() {
        return new Fade();
    }

    @Override // com.google.android.finsky.e.q
    public final int B() {
        return com.google.android.finsky.utils.ai.a(this.ap, ((com.google.android.finsky.activities.bh) this).f1612a.f1963a.g);
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.layout.actionbar.d
    public final void z() {
        this.aO.a(true);
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.layout.actionbar.d
    public final void A() {
        this.aO.a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.bh
    public final void k_() {
        int headerHeight;
        Document document = ((com.google.android.finsky.activities.bh) this).f1612a;
        if (document == null) {
            return;
        }
        com.google.android.finsky.api.model.h hVar = ((com.google.android.finsky.activities.bh) this).f1613b;
        com.google.android.finsky.api.model.h hVar2 = this.aB ? this.aD : hVar;
        Document b2 = this.aB ? this.aD.b() : document;
        boolean x = this.aB ? x() && this.aD.a() : x();
        if (this.ak == null) {
            if (this.ak != null) {
                FinskyLog.e("Modules system is already set up", new Object[0]);
            }
            this.aP.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            this.aP.setLayoutManager(linearLayoutManager);
            this.aP.a(new bo(this.ap));
            this.aP.a(new br(this.ap, this.f));
            this.aP.a(new u(this.ap));
            if (this.aI != null) {
                by.a(this.aF, this.aG, document, this.aI.booleanValue(), this.aH.booleanValue());
            }
            if (this.aF != null) {
                this.g = by.a(this.aF);
            } else {
                this.g = by.a(document, this.aH.booleanValue());
            }
            com.google.android.finsky.api.b b3 = this.aB ? FinskyApp.a().b((String) null) : this.aq;
            android.support.v4.app.t f = f();
            if (!FinskyApp.a().e().a(12604101L)) {
                this.aS = new android.support.v7.widget.eg();
                this.aT = new com.google.android.finsky.layout.u(f);
            }
            String str = Z_() ? this.am : null;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.g.size()) {
                    break;
                }
                bd bdVar = this.g.get(i2);
                bdVar.a(f, this, this.ax, this.aq, b3, this.ar, this.as, this, this.aA, this.r.getString("finsky.DetailsFragment.continueUrl"), this.d, this.f, str, this.an, this.aS, this.aT, this);
                bdVar.a(this.aG != null ? this.aG.get(i2) : null);
                if (b(bdVar)) {
                    this.h.add(bdVar);
                }
                i = i2 + 1;
            }
            this.ak = new bu(this.h);
            this.aP.setAdapter(this.ak);
            this.aP.setScrollingTouchSlop(1);
            if (this.aJ) {
                if (this.aK == 0) {
                    linearLayoutManager.a(0, Math.min(this.aL + this.aM, this.ai.getHeaderHeight()) - this.ai.getHeaderHeight());
                } else {
                    linearLayoutManager.a(this.h.indexOf(this.g.get(by.a(this.aK, document, this.aI.booleanValue(), this.aH.booleanValue()))), this.aL);
                }
            }
        }
        if (x && !this.i) {
            this.i = true;
            List<bd> a2 = by.a(document, this.aH.booleanValue(), this.g);
            String str2 = Z_() ? this.am : null;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= a2.size()) {
                    break;
                }
                a2.get(i4).a(f(), this, this.ax, this.aq, this.aC, this.ar, this.as, this, this.aA, this.r.getString("finsky.DetailsFragment.continueUrl"), this.d, this.f, str2, this.an, this.aS, this.aT, this);
                i3 = i4 + 1;
            }
        }
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= this.g.size()) {
                break;
            }
            bd bdVar2 = this.g.get(i6);
            bdVar2.a(x, document, hVar, b2, hVar2);
            if (b(bdVar2) && !this.h.contains(bdVar2)) {
                c(bdVar2);
            }
            i5 = i6 + 1;
        }
        if (this.aj != null) {
            this.aQ = HeroGraphicView.a(document, this.f);
            int i7 = this.aR;
            this.aR = HeroGraphicView.a(this.ap, document, this.f);
            if (this.aR != i7 && this.ai != null) {
                this.ai.b(2, this.aR);
            }
            this.aj.a(HeroGraphicView.b(document, this.f), document, this.ar, HeroGraphicView.b(document), this);
            int i8 = document.f1963a.e;
            if ((this.aN && !this.f && (i8 == 2 || i8 == 25 || i8 == 24)) && (headerHeight = this.ai.getHeaderHeight() - g().getDimensionPixelSize(R.dimen.hero_image_height)) > 0) {
                ((LinearLayoutManager) this.aP.getLayoutManager()).a(0, -headerHeight);
            }
            this.aN = false;
        }
    }

    @Override // com.google.android.finsky.installer.p
    public final void a(String str, int i, int i2) {
        Document document = ((com.google.android.finsky.activities.bh) this).f1612a;
        if (document != null && document.f1963a.e == 1 && str.equals(document.E().w)) {
            if (i == 3 && i2 == 944) {
                this.as.a(document, this.aA, this.r.getString("finsky.DetailsFragment.continueUrl"), this.aq.c());
            } else {
                o_();
            }
        }
    }
}
