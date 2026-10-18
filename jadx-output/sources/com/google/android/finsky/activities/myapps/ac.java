package com.google.android.finsky.activities.myapps;

import android.annotation.TargetApi;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.dl;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.billing.ar;
import com.google.android.finsky.layout.ContentFrame;
import com.google.android.finsky.layout.bi;
import com.google.android.finsky.layout.bv;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cz;
import com.google.android.finsky.utils.dx;
import com.google.android.finsky.utils.ik;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ac extends com.google.android.finsky.e.q implements dl, gp {

    /* renamed from: a, reason: collision with root package name */
    com.google.android.finsky.receivers.f f1807a;

    /* renamed from: b, reason: collision with root package name */
    aa f1808b;
    ar c;
    private String d;
    private dx e = new dx();
    private com.google.android.finsky.a.ai f = com.google.android.finsky.a.i.a(9);
    private ViewPager g;

    public static ac a(DfeToc dfeToc, boolean z) {
        ac acVar = new ac();
        acVar.a("finsky.PageFragment.toc", dfeToc);
        acVar.b("trigger_update_all", z);
        return acVar;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContentFrame contentFrame = (ContentFrame) super.a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.av;
        finskyHeaderListLayout.a(new ad(this, finskyHeaderListLayout.getContext()));
        return contentFrame;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        String d = com.google.android.finsky.utils.ai.d(3);
        if (TextUtils.isEmpty(d)) {
            d = this.ap.getString(R.string.my_downloads_menu);
        }
        this.d = d;
        this.f1807a = FinskyApp.a().k;
        FinskyApp.a().n.a();
        u();
        this.at.p();
    }

    @Override // android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        this.c = (ar) this.B.a("progress_dialog");
        I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.header_list_container;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final bv a(ContentFrame contentFrame) {
        return new bi(contentFrame, this);
    }

    @Override // com.google.android.finsky.e.q
    public final void o_() {
        this.ao.b_(this.d);
        this.ao.a(3, true);
        this.ao.s_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void y() {
        H();
    }

    private void H() {
        if (this.av != null) {
            ((PlayHeaderListLayout) this.av).setOnPageChangeListener(null);
        }
        if (this.g != null) {
            this.g.setAdapter(null);
            this.g = null;
        }
        this.f1808b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    @TargetApi(22)
    public final Transition v() {
        return new com.google.android.finsky.k.h(3);
    }

    @Override // com.google.android.finsky.e.q
    public final int B() {
        return com.google.android.finsky.utils.ai.a(f(), 3);
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        if (this.f1808b != null) {
            this.f1808b.a(this.e);
        }
        if (this.g != null) {
            this.e.a("MyAppsTabbedAdapter.CurrentTabType", com.google.android.libraries.bind.b.c.a(this.f1808b, this.g.getCurrentItem()));
        }
        this.f1808b.f();
        H();
        if (this.av instanceof PlayHeaderListLayout) {
            ((PlayHeaderListLayout) this.av).d();
        }
        super.d();
    }

    @Override // android.support.v4.view.dl
    public final void b(int i) {
    }

    @Override // android.support.v4.view.dl
    public final void a(int i, float f, int i2) {
    }

    @Override // android.support.v4.view.dl
    public final void a_(int i) {
        int a2 = com.google.android.libraries.bind.b.c.a(this.f1808b, i);
        this.f1808b.e(a2);
        String a3 = this.f1808b.a(a2);
        if (!TextUtils.isEmpty(a3)) {
            ik.a(this.ap, this.ap.getString(R.string.accessibility_event_tab_selected, a3), this.g);
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        switch (i) {
            case 6:
                ArrayList<String> stringArrayList = bundle.getStringArrayList("docid_list");
                this.f1808b.f();
                com.google.android.finsky.a.i h = FinskyApp.a().h();
                int size = stringArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    h.a(506, stringArrayList.get(i2), (String) null, 0, (String) null, (com.google.android.finsky.a.n) null);
                }
                this.c = ar.b(R.string.archiving);
                this.c.a(this.B, "progress_dialog");
                this.aq.c(stringArrayList, com.google.android.finsky.g.a.f2782a, new ae(this, stringArrayList), new ag(this));
                break;
            default:
                FinskyLog.e("Unexpected requestCode %d", Integer.valueOf(i));
                break;
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        if (this.c == null) {
            return;
        }
        this.c.a(false);
        this.c = null;
    }

    static ArrayList<String> a(List<Document> list) {
        ArrayList<String> a2 = cz.a(list.size());
        Iterator<Document> it = list.iterator();
        while (it.hasNext()) {
            a2.add(it.next().f1963a.f3890a);
        }
        return a2;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.f;
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.layout.actionbar.d
    public final void z() {
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.layout.actionbar.d
    public final void A() {
    }

    @Override // com.google.android.finsky.e.q
    public final void u() {
        this.au.b();
        o_();
        if (this.g == null || this.f1808b == null) {
            this.f1808b = new aa((com.google.android.finsky.activities.d) f(), this.as, this.aq, this.ax, this.ar, FinskyApp.a().p.f(), this.e, this, this.r.getBoolean("trigger_update_all"), this);
            this.g = (ViewPager) this.av.findViewById(R.id.viewpager);
            if (this.g != null) {
                this.g.setAdapter(this.f1808b);
                this.g.setPageMargin(g().getDimensionPixelSize(R.dimen.swipey_tab_gutter_width));
                PlayHeaderListLayout playHeaderListLayout = (PlayHeaderListLayout) this.av;
                playHeaderListLayout.c.a();
                playHeaderListLayout.setOnPageChangeListener(this);
                playHeaderListLayout.setFloatingControlsBackground(new ColorDrawable(com.google.android.finsky.utils.ai.a(f(), 3)));
            }
            int c = this.e.a("MyAppsTabbedAdapter.CurrentTabType") ? this.e.c("MyAppsTabbedAdapter.CurrentTabType") : 1;
            int i = 0;
            while (true) {
                if (i >= this.f1808b.a()) {
                    i = 0;
                    break;
                } else if (this.f1808b.c(i) == c) {
                    break;
                } else {
                    i++;
                }
            }
            this.g.a(com.google.android.libraries.bind.b.c.b(this.f1808b, i), false);
        }
    }

    @Override // com.google.android.finsky.e.q
    public final boolean G() {
        return this.f1808b.f();
    }
}
