package com.google.android.finsky.activities.bpkg;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.by;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.billing.refund.RefundActivity;
import com.google.android.finsky.gpkg.aq;
import com.google.android.finsky.layout.ContentFrame;
import com.google.android.finsky.layout.bi;
import com.google.android.finsky.layout.bv;
import com.google.android.finsky.layout.cr;
import com.google.android.finsky.layout.el;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.dh;
import com.google.android.finsky.utils.ik;
import com.google.android.play.headerlist.PlayHeaderListLayout;

/* loaded from: classes.dex */
public final class u extends com.google.android.finsky.epkg.q implements gp, com.google.android.finsky.gpkg.o, cr, el {
    public t ai;

    /* renamed from: b, reason: collision with root package name */
    public String f1598b;
    public com.google.android.finsky.api.model.i c;
    public com.google.android.finsky.gpkg.h d;
    public long e;
    public boolean f;
    public String g;
    public boolean h;
    public PlayRecyclerView i;

    /* renamed from: a, reason: collision with root package name */
    public final ai f1597a = com.google.android.finsky.apkg.i.a(11);
    public Bundle aj = new Bundle();

    public static u a(String str, String str2, DfeToc dfeToc, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("list_url", str);
        bundle.putString("title", str2);
        bundle.putBoolean("is_order_history_page", z);
        u uVar = new u();
        uVar.f(bundle);
        uVar.a("finsky.PageFragment.toc", dfeToc);
        return uVar;
    }

    public static u a(String str, int i, int i2, DfeToc dfeToc, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("list_url", str);
        bundle.putInt("title_id", i);
        bundle.putInt("empty_page_string_id", i2);
        bundle.putBoolean("is_order_history_page", z);
        u uVar = new u();
        uVar.f(bundle);
        uVar.a("finsky.PageFragment.toc", dfeToc);
        return uVar;
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
        this.h = FinskyApp.a().e().a(12605501L);
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        Bundle bundle2 = this.r;
        this.f = bundle2.getBoolean("is_order_history_page");
        if (this.h) {
            this.f1598b = f_(bundle2.getInt("title_id"));
            this.g = f_(bundle2.getInt("empty_page_string_id"));
        } else {
            this.f1598b = bundle2.getString("title");
        }
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.av;
        finskyHeaderListLayout.a(new v(this, finskyHeaderListLayout.getContext()));
        this.i = (PlayRecyclerView) this.av.findViewById(R.id.recycler_view);
        this.i.setSaveEnabled(false);
        if (!this.h) {
            Resources resources = this.i.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_card_default_inset) + ik.a(resources);
            by.a(this.i, dimensionPixelSize, this.i.getPaddingTop(), dimensionPixelSize, this.i.getPaddingBottom());
        }
        this.i.setLayoutManager(new LinearLayoutManager());
        this.i.setAdapter(new com.google.android.finsky.adapters.ab());
        this.d = FinskyApp.a().p;
        this.d.a(this);
        return a2;
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        boolean z = false;
        super.d(bundle);
        o_();
        if (this.f ? dh.a(this.e) : false) {
            H();
        }
        if (this.c != null && this.c.a()) {
            z = true;
        }
        if (!z) {
            y();
            N();
        } else {
            Document document = ((com.google.android.finsky.api.model.d) this.c).f1970a;
            if (document != null) {
                com.google.android.finsky.apkg.i.a(getPlayStoreUiElement(), document.f1963a.R);
            }
            I();
        }
        this.at.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final bv a(ContentFrame contentFrame) {
        return new bi(contentFrame, this);
    }

    @Override // com.google.android.finsky.epkg.q
    public final void o_() {
        this.ao.b_(this.f1598b);
        this.ao.a(0, true);
        this.ao.s_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final int w() {
        return R.layout.header_list_container;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void y() {
        H();
        this.c = new com.google.android.finsky.api.model.i(this.aq, this.r.getString("list_url"), true);
        this.c.a((com.google.android.finsky.api.model.x) this);
        this.c.a((com.android.volley.s) this);
        this.c.q();
        this.e = System.currentTimeMillis();
    }

    public void H() {
        if (this.c != null) {
            this.c.b((com.google.android.finsky.api.model.x) this);
            this.c.b((com.android.volley.s) this);
            this.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void u() {
        I();
    }

    public void I() {
        if (this.i == null) {
            FinskyLog.c("Recycler view null, ignoring.", new Object[0]);
            return;
        }
        if (this.ai == null) {
            this.ai = new t(this.aq.b(), this.ap, this.c, this.ar, this.as, this, this, this.h, this, this.ax);
            this.i.setAdapter(this.ai);
            if (!this.aj.isEmpty()) {
                t tVar = this.ai;
                PlayRecyclerView playRecyclerView = this.i;
                Bundle bundle = this.aj;
                Parcelable parcelable = bundle.getParcelable("recycler_view_parcel");
                if (parcelable != null) {
                    playRecyclerView.a(parcelable);
                }
                if (tVar.e) {
                    tVar.d.f1572a = bundle.getInt("selected_position");
                } else {
                    tVar.c.f1570a = bundle.getInt("selected_position");
                }
                this.aj.clear();
            }
            if (this.h) {
                TextView textView = (TextView) this.av.findViewById(R.id.no_results_view);
                textView.setText(this.g);
                this.i.setEmptyView(textView);
                return;
            }
            return;
        }
        t tVar2 = this.ai;
        com.google.android.finsky.api.model.i iVar = this.c;
        tVar2.f.b((com.google.android.finsky.api.model.x) tVar2);
        tVar2.f = iVar;
        tVar2.f.a(tVar2);
        tVar2.f774a.a();
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d() {
        if (this.i != null && this.ai != null) {
            t tVar = this.ai;
            PlayRecyclerView playRecyclerView = this.i;
            Bundle bundle = this.aj;
            bundle.putParcelable("recycler_view_parcel", playRecyclerView.n());
            if (tVar.e) {
                bundle.putInt("selected_position", tVar.d.f1572a);
            } else {
                bundle.putInt("selected_position", tVar.c.f1570a);
            }
        }
        this.i = null;
        if (this.ai != null) {
            t tVar2 = this.ai;
            tVar2.f.b((com.google.android.finsky.api.model.x) tVar2);
            this.ai = null;
        }
        if (this.av instanceof PlayHeaderListLayout) {
            ((PlayHeaderListLayout) this.av).d();
        }
        this.d.b(this);
        super.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final int E() {
        return 3;
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        if (i == 1) {
            J();
        } else {
            super.a(i, i2, intent);
        }
    }

    @Override // com.google.android.finsky.layout.cr
    public final void a(byte[] bArr, String str, int i) {
        a(RefundActivity.a(this.aq.c(), bArr, str, i), 1);
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        if (i == 1) {
            com.google.android.finsky.utils.j.a(this.B, bundle.getString("package_name"), bundle.getString("refund_account_name"), true, new w(this));
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f1597a;
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void M_() {
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void L_() {
        J();
    }

    public void J() {
        if (this.ai == null) {
            return;
        }
        this.ai.f774a.a();
    }

    @Override // com.google.android.finsky.layout.cr
    public final void a(String str, String str2) {
        android.support.v4.app.ad adVar = this.B;
        if (adVar.a("refund_confirm") == null) {
            gn gnVar = new gn();
            gnVar.a(R.string.uninstall_refund_confirmation_body).d(R.string.yes).e(R.string.no);
            Bundle bundle = new Bundle();
            bundle.putString("package_name", str);
            bundle.putString("refund_account_name", str2);
            gnVar.a(this, 1, bundle);
            gnVar.b().a(adVar, "refund_confirm");
        }
    }

    @Override // com.google.android.finsky.layout.el
    public final void a(Document document, aq aqVar) {
        com.google.android.finsky.utils.z.a(this.B, document, aqVar);
    }
}
