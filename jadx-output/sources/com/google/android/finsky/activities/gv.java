package com.google.android.finsky.activities;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.ContentFrame;
import com.google.android.finsky.layout.FinskyTabStrip;
import com.google.android.finsky.layout.HeroGraphicView;
import com.google.android.finsky.layout.InsetsFrameLayout;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.FinskyViewPager;
import com.google.android.finsky.layout.play.PlayHighlightsOverlayView;
import com.google.android.finsky.protos.pt;
import com.google.android.finsky.protos.qm;
import com.google.android.finsky.utils.ik;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gv extends com.google.android.finsky.e.w implements android.support.v4.view.dl, gq, gt, com.google.android.play.headerlist.k {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.finsky.api.model.e f1784a;
    private int aB;
    private boolean aC;
    private FinskyHeaderListLayout aD;
    private com.google.android.finsky.layout.actionbar.a aE;
    private ViewGroup aF;
    private HeroGraphicView aG;
    private FinskyViewPager aH;
    private dl aI;
    private PlayHighlightsOverlayView aJ;
    private ViewGroup aK;
    private FinskyTabStrip aL;
    private qm ak;
    private boolean an;
    public FinskyViewPager c;
    public gr d;
    public com.google.android.finsky.layout.ad e;
    private com.google.android.finsky.api.model.i[] f;
    private boolean g;
    private String h;
    private int i;

    /* renamed from: b, reason: collision with root package name */
    public int f1785b = 0;
    private int ai = 3;
    private int aj = -1;
    private com.google.android.finsky.utils.dx al = new com.google.android.finsky.utils.dx();
    private com.google.android.finsky.a.ai am = com.google.android.finsky.a.i.a(1);

    static /* synthetic */ int b(gv gvVar, int i) {
        int i2 = gvVar.aB - i;
        gvVar.aB = i2;
        return i2;
    }

    public static gv a(String str, String str2, int i, DfeToc dfeToc) {
        gv gvVar = new gv();
        if (i >= 0) {
            gvVar.f1785b = i;
        }
        if (!TextUtils.isEmpty(str2)) {
            gvVar.h = str2;
        }
        gvVar.a(dfeToc, str);
        return gvVar;
    }

    private boolean H() {
        if (this.an) {
            return true;
        }
        DfeToc dfeToc = this.ax;
        String str = this.aA;
        return (TextUtils.equals(str, dfeToc.f1961a.l) || TextUtils.equals(str, dfeToc.f1961a.n)) && dfeToc.b().size() > 1;
    }

    @Override // com.google.android.finsky.e.w, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
        this.i = H() ? 1 : 0;
        this.ak = com.google.android.finsky.api.model.e.a(this.aA);
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        if (!this.g) {
            N();
            K();
            o_();
        } else {
            u();
        }
        this.at.p();
        if (this.f1785b == 3) {
            com.google.android.finsky.utils.hats.h.a(3, this.ao);
        } else if (this.f1785b == 0) {
            com.google.android.finsky.utils.hats.h.a(1, this.ao);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    @TargetApi(22)
    public final Transition v() {
        return new com.google.android.finsky.k.h(this.f1785b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final com.google.android.finsky.layout.bv a(ContentFrame contentFrame) {
        return new com.google.android.finsky.layout.bi(contentFrame, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.header_list_container;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final boolean C() {
        return true;
    }

    @Override // com.google.android.finsky.activities.gq
    public final int a() {
        return this.aB;
    }

    @Override // com.google.android.finsky.e.q, com.android.volley.s
    public final void a(VolleyError volleyError) {
        if (this.f1784a != null && this.f1784a.a()) {
            this.aC = true;
            this.f = null;
            K();
            if (this.g) {
                super.m_();
                return;
            }
            return;
        }
        super.a(volleyError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I() {
        return this.f1784a.f1973a.e.length > 1 && this.f1784a.f1973a.l == 2;
    }

    private ColorDrawable J() {
        return new ColorDrawable(com.google.android.finsky.utils.ai.a(f(), this.f1785b));
    }

    @Override // com.google.android.finsky.e.q
    public final int B() {
        return (H() || !this.g) ? g().getColor(R.color.play_transparent) : com.google.android.finsky.utils.ai.a(f(), this.f1785b);
    }

    @Override // com.google.android.finsky.activities.gt
    public final void a(gy gyVar) {
        if (!this.an) {
            if (this.d.a() == 1 && gyVar.c()) {
                this.aG.setVisibility(0);
                this.aD.post(new gx(this, gyVar));
                this.aD.setAlwaysUseFloatingBackground(false);
                this.aD.setHeaderShadowMode(1);
                int a2 = HeroGraphicView.a(this.ap, this.ap.getResources().getDisplayMetrics().widthPixels, true, 0.0f) + ((int) (r1.getDimensionPixelSize(R.dimen.play_profile_avatar_size) * 0.3f));
                if (InsetsFrameLayout.f3009a) {
                    a2 -= ik.d(this.ap);
                }
                this.aD.b(2, a2);
                this.aE = new com.google.android.finsky.layout.actionbar.a(f().getWindow(), this.aD);
                this.aD.setOnLayoutChangedListener(this.aE);
                this.aE.b();
                return;
            }
            this.aG.setVisibility(4);
            this.aD.setAlwaysUseFloatingBackground(this.i != 1);
            this.aD.setOnLayoutChangedListener(null);
        }
    }

    @Override // com.google.android.finsky.e.q
    public final void o_() {
        this.ao.b_(this.h);
        this.ao.a(this.f1785b, this.g);
        if (H()) {
            Resources resources = this.ap.getResources();
            if (resources.getBoolean(R.bool.use_wide_layout_for_highlights_banner)) {
                this.ao.c(com.google.android.finsky.utils.cq.a(resources.getDimensionPixelSize(R.dimen.highlights_banner_wide_layout_height) - resources.getDimensionPixelSize(R.dimen.highlight_banner_swatch_solid_height)) - (resources.getDimensionPixelOffset(R.dimen.searchbox_padding_from_highlight) * 2));
            }
            this.ao.b(1);
            return;
        }
        if (this.g) {
            this.ao.s_();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void y() {
        K();
    }

    private void K() {
        byte[] bArr;
        if (this.f1784a == null || !this.f1784a.a()) {
            this.aC = false;
            this.f1784a = new com.google.android.finsky.api.model.e(this.aq, this.aA, this.ak);
            this.f1784a.a((com.google.android.finsky.api.model.x) this);
            this.f1784a.a((com.android.volley.s) this);
            return;
        }
        int i = this.f1784a.f1973a.f;
        com.google.android.finsky.protos.az[] azVarArr = this.f1784a.f1973a.e;
        if (!this.aC && !TextUtils.isEmpty(azVarArr[i].h)) {
            if (this.f == null || !this.f[i].a()) {
                this.f = new com.google.android.finsky.api.model.i[azVarArr.length];
                for (int i2 = 0; i2 < azVarArr.length; i2++) {
                    com.google.android.finsky.api.model.i iVar = new com.google.android.finsky.api.model.i(this.aq, azVarArr[i2].h, false, this.ak);
                    this.f[i2] = iVar;
                    if (i2 == this.f1784a.f1973a.f) {
                        iVar.a((com.google.android.finsky.api.model.x) this);
                        iVar.a((com.android.volley.s) this);
                        iVar.q();
                    }
                }
                return;
            }
            this.an = this.f[i].p() > 0;
        }
        com.google.android.finsky.a.ai aiVar = this.am;
        com.google.android.finsky.api.model.e eVar = this.f1784a;
        if (eVar.f1973a == null || eVar.f1973a.n.length == 0) {
            bArr = null;
        } else {
            bArr = eVar.f1973a.n;
        }
        com.google.android.finsky.a.i.a(aiVar, bArr);
        this.g = true;
    }

    @Override // android.support.v4.view.dl
    public final void b(int i) {
        gu.a(this.d.c, i);
    }

    @Override // android.support.v4.view.dl
    public final void a(int i, float f, int i2) {
    }

    @Override // android.support.v4.view.dl
    public final void a_(int i) {
        int a2 = com.google.android.libraries.bind.b.c.a(this.d, i);
        this.d.f(a2);
        String a3 = this.d.a(a2);
        if (!TextUtils.isEmpty(a3) && this.as != null && this.as.r()) {
            ik.a(this.ap, this.ap.getString(R.string.accessibility_event_tab_selected, a3), this.c);
        }
    }

    @Override // com.google.android.play.headerlist.k
    public final void D_() {
        gu.a(this.d.c);
    }

    @Override // com.google.android.play.headerlist.k
    public final void c(int i) {
        a(i, true);
    }

    public final void a(int i, boolean z) {
        int i2;
        Document unused;
        int a2 = com.google.android.libraries.bind.b.c.a(this.d, i);
        if (z) {
            gr grVar = this.d;
            if (a2 >= 0 && a2 < grVar.f1779b.size()) {
                FinskyApp.a().h().a(grVar.f1779b.get(a2).f);
            }
        }
        if (I()) {
            this.f1785b = this.f1784a.f1973a.e[a2].o;
            this.ao.a(this.f1785b, true);
            com.google.android.finsky.layout.ad adVar = this.e;
            ColorDrawable colorDrawable = new ColorDrawable(com.google.android.finsky.utils.ai.a(adVar.c, this.f1785b));
            if (adVar.d == null) {
                adVar.e = colorDrawable;
            } else {
                adVar.e = null;
                adVar.d.a(colorDrawable, adVar.l, true);
            }
            this.aD.a(this.ap.getResources().getColor(R.color.status_bar_overlay), Color.alpha(0));
            if (this.an) {
                this.aH.setCurrentItem(i);
                if (this.aJ != null) {
                    PlayHighlightsOverlayView playHighlightsOverlayView = this.aJ;
                    dl dlVar = this.aI;
                    if (a2 >= 0 && a2 < dlVar.f1686b.size()) {
                        unused = dlVar.f1686b.get(a2).f1690b;
                    }
                    int e = this.aI.e(a2);
                    if (a2 != playHighlightsOverlayView.f3353a) {
                        playHighlightsOverlayView.c(e);
                        playHighlightsOverlayView.f3353a = a2;
                    }
                    PlayHighlightsOverlayView playHighlightsOverlayView2 = this.aJ;
                    dl dlVar2 = this.aI;
                    if (a2 < 0 || a2 >= dlVar2.f1686b.size()) {
                        i2 = 0;
                    } else {
                        Cdo cdo = dlVar2.f1686b.get(a2);
                        i2 = cdo.b(cdo.e);
                    }
                    playHighlightsOverlayView2.setCurrentPage(i2);
                }
                this.aI.f(a2);
                this.aH.setBackgroundColor(com.google.android.finsky.utils.ai.a(this.ap, 0));
            }
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.am;
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.layout.actionbar.d
    public final void z() {
        if (this.d != null && this.d.a() == 1) {
            super.z();
            if (this.aE == null) {
                return;
            }
            this.aE.a(true);
        }
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.layout.actionbar.d
    public final void A() {
        if (this.d != null && this.d.a() == 1) {
            super.A();
            if (this.aE == null) {
                return;
            }
            this.aE.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int E() {
        return this.ai;
    }

    @Override // com.google.android.finsky.e.q
    public final com.google.android.finsky.layout.play.cy F() {
        return (this.c == null || this.d == null) ? super.F() : this.d.g(this.c.getCurrentItem());
    }

    @Override // com.google.android.finsky.e.q
    public final boolean G() {
        if (this.as.q() == 1 && this.f1785b != 3) {
            DfeToc dfeToc = this.ax;
            if (TextUtils.equals(this.aA, dfeToc.f1961a.l)) {
                FinskyApp.a().h().a(600, (byte[]) null, this.as.s());
                this.as.a(dfeToc);
                return true;
            }
        }
        return super.G();
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.api.model.x
    public final void m_() {
        if (!this.g) {
            K();
        }
        if (this.g) {
            super.m_();
        }
    }

    @Override // com.google.android.finsky.e.q
    public final void u() {
        int i;
        if (this.f1784a != null && this.f1784a.b()) {
            com.google.android.finsky.utils.ac a2 = FinskyApp.a().a(FinskyApp.a().j());
            com.google.android.finsky.api.model.e eVar = this.f1784a;
            a2.e = eVar.b() && eVar.f1973a.v;
        }
        Resources g = g();
        this.aD = (FinskyHeaderListLayout) this.av;
        this.aD.a(new gz(this, this.aD.getContext(), this.i));
        this.aD.setBackgroundViewForTouchPassthrough(this.aF);
        if (this.i != 1) {
            this.aD.setAlwaysUseFloatingBackground(true);
            this.aD.setFloatingControlsBackground(J());
        }
        this.f1785b = this.f1784a.f1973a.c;
        String str = this.f1784a.f1973a.f3615a;
        if (str == null) {
            pt a3 = this.ax.a(this.f1785b);
            if (a3 == null) {
                str = "";
            } else if (!this.as.c()) {
                str = this.ap.getString(R.string.launcher_name);
            } else {
                str = a3.c;
            }
        }
        this.h = str;
        o_();
        if (!TextUtils.isEmpty(this.h) && this.as != null && this.as.r()) {
            ik.a(this.ap, this.h, this.R);
        }
        LayoutInflater layoutInflater = f().getLayoutInflater();
        this.d = new gr(this.ap, layoutInflater, this.as, this.ax, this.aq, FinskyApp.a().a(FinskyApp.a().j()), this.ak, this.ar, this.f1784a.f1973a.e, this.f1785b, (com.google.android.finsky.utils.dx) this.al.b("TabbedBrowseFragment.AdapterState"), this, this.at, this, this, this.aD);
        int i2 = this.d.a() > 1 ? 0 : 2;
        this.aL.setAnimateOnTabClick(I());
        if (I() || this.an) {
            FinskyTabStrip finskyTabStrip = this.aL;
            finskyTabStrip.f2989a = true;
            Resources resources = finskyTabStrip.getResources();
            finskyTabStrip.setSelectedUnderlineThickness(resources.getDimensionPixelSize(R.dimen.finsky_fixed_tab_underline_thickness));
            finskyTabStrip.c = resources.getBoolean(R.bool.use_wide_layout);
            if (finskyTabStrip.c) {
                View findViewById = finskyTabStrip.findViewById(R.id.play_header_list_tab_scroll);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams.gravity = 17;
                findViewById.setLayoutParams(layoutParams);
            }
            finskyTabStrip.requestLayout();
            this.aL.a();
            this.aD.setAlwaysUseFloatingBackground(false);
            com.google.android.finsky.layout.ad adVar = this.e;
            adVar.h = this.aD;
            adVar.j = null;
        }
        this.aD.setShouldUseScrollLocking(this.f1785b != 9);
        this.c = (FinskyViewPager) this.av.findViewById(R.id.viewpager);
        this.c.setAdapter(this.d);
        this.c.setPageMargin(g.getDimensionPixelSize(R.dimen.swipey_tab_gutter_width));
        this.aD.c.a();
        this.aD.setOnPageChangeListener(this);
        this.aD.setOnTabSelectedListener(this);
        if (!I()) {
            this.aD.a(g.getColor(R.color.status_bar_overlay), com.google.android.finsky.utils.ai.a(this.ap, this.f1785b));
        }
        LayoutInflater from = LayoutInflater.from(e());
        if (this.an || I()) {
            this.c.f3294b = true;
            this.aD.setHeaderMode(0);
        }
        if (this.an) {
            this.aI = new dl(this.aq, this.f, this.ap, layoutInflater, this.ar, this.as, this.d, (com.google.android.finsky.utils.dx) this.al.b("TabbedBrowseFragment.HighlightsState"));
            this.aH = (FinskyViewPager) from.inflate(R.layout.highlights_view_pager, this.aF, false);
            int dimensionPixelSize = i2 == 2 ? 0 : g.getDimensionPixelSize(R.dimen.play_header_list_tab_strip_height);
            this.aH.setMeasureOverrider(new gw(this, g, dimensionPixelSize, i2));
            this.aH.setAdapter(this.aI);
            this.aH.setPageTransformer$382b7817(new be(this.aI));
            this.aH.f3294b = true;
            this.aH.setAnimationParameters$3059d049(new LinearInterpolator());
            this.c.setAnimationParameters$3059d049(Build.VERSION.SDK_INT >= 21 ? com.google.android.play.b.d.a(this.ap) : new android.support.v4.view.b.b());
            this.aD.setHeaderShadowMode(this.aI.a() > 1 ? 3 : 2);
            this.aD.setAlwaysUseFloatingBackground(false);
            this.aH.setClickable(true);
            this.aD.setBackgroundViewForTouchPassthrough(this.aH);
            this.aF.addView(this.aH);
            if (this.aJ == null && this.aK != null) {
                this.aJ = (PlayHighlightsOverlayView) layoutInflater.inflate(R.layout.play_highlights_overlay, this.aK, false);
                this.aK.getLayoutParams().width = -1;
                this.aK.getLayoutParams().height = -1;
                this.aK.addView(this.aJ);
                this.aJ.setPadding(0, 0, 0, dimensionPixelSize);
                this.aJ.c(this.aI.e(0));
                this.aI.a((dn) this.aJ);
            }
        } else {
            this.aG = (HeroGraphicView) from.inflate(R.layout.hero_graphic, this.aF, false);
            this.aG.setVisibility(4);
            this.aF.addView(this.aG);
            this.aB = FinskyHeaderListLayout.a(this.ap, i2, this.aD.getActionBarHeight());
            this.aD.b(i2, this.aB);
        }
        if (this.i != 1) {
            this.aD.setFloatingControlsBackground(J());
        }
        if (this.aj != -1) {
            i = this.aj;
            this.aj = -1;
        } else {
            i = this.f1784a.f1973a.f;
        }
        int a4 = com.google.android.libraries.bind.b.c.a(this.d, this.c.getCurrentItem());
        int b2 = com.google.android.libraries.bind.b.c.b(this.d, i);
        if (a4 == i) {
            this.d.f(i);
            a(b2, false);
        } else {
            this.c.a(b2, false);
            a(b2, false);
        }
        this.au.b();
        this.az.run();
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        ArrayList arrayList;
        if (this.g && this.c != null) {
            this.aj = com.google.android.libraries.bind.b.c.a(this.d, this.c.getCurrentItem());
            com.google.android.finsky.utils.dx dxVar = new com.google.android.finsky.utils.dx();
            gr grVar = this.d;
            grVar.e = true;
            if (grVar.f1779b == null || grVar.f1779b.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (gs gsVar : grVar.f1779b) {
                    if (gsVar.c != null) {
                        arrayList2.add(gsVar.c.c());
                    } else {
                        arrayList2.add(gsVar.d);
                    }
                }
                arrayList = arrayList2;
            }
            dxVar.a("TabbedAdapter.TabInstanceStates", arrayList);
            dxVar.a("TabbedAdapter.TabDfeLists", grVar.f());
            this.al.a("TabbedBrowseFragment.AdapterState", dxVar);
        }
        this.ao.m();
        if (this.aD != null) {
            this.aD.setOnPageChangeListener(null);
            this.aD.setOnTabSelectedListener(null);
        }
        if (this.c != null) {
            this.c.setAdapter(null);
            this.c = null;
        }
        this.d = null;
        if (this.aD != null) {
            this.aD.d();
        }
        if (this.aE != null) {
            this.aE.e();
            this.aE = null;
        }
        this.aF = null;
        this.aG = null;
        if (this.aI != null) {
            com.google.android.finsky.utils.dx dxVar2 = new com.google.android.finsky.utils.dx();
            this.aI.a(dxVar2);
            this.al.a("TabbedBrowseFragment.HighlightsState", dxVar2);
        }
        this.aH = null;
        this.aI = null;
        this.aJ = null;
        this.aK = null;
        this.aL = null;
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
        super.d();
    }
}
