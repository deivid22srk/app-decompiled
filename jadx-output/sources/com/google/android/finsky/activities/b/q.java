package com.google.android.finsky.activities.b;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.layout.ContentFrame;
import com.google.android.finsky.layout.bi;
import com.google.android.finsky.layout.bv;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.utils.jb;

/* loaded from: classes.dex */
public final class q extends com.google.android.finsky.e.q implements cy {

    /* renamed from: b, reason: collision with root package name */
    private String f1593b;
    private RecyclerView d;
    private e e;

    /* renamed from: a, reason: collision with root package name */
    private final ai f1592a = com.google.android.finsky.a.i.a(10);
    private final Bundle c = new Bundle();

    public static q J_() {
        q qVar = new q();
        qVar.a("finsky.PageFragment.toc", FinskyApp.a().g);
        return qVar;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.av;
        finskyHeaderListLayout.a(new r(this, finskyHeaderListLayout.getContext()));
        this.f1593b = viewGroup.getContext().getString(R.string.side_drawer_my_account);
        this.d = (RecyclerView) this.av.findViewById(R.id.recycler_view);
        this.d.setLayoutManager(new LinearLayoutManager());
        this.d.setAdapter(new com.google.android.finsky.adapters.ab());
        return a2;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        u();
        o_();
        this.at.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final bv a(ContentFrame contentFrame) {
        return new bi(contentFrame, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.header_list_container;
    }

    @Override // com.google.android.finsky.e.q
    public final void o_() {
        this.ao.b_(this.f1593b);
        this.ao.a(0, true);
        this.ao.s_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void y() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int E() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void u() {
        if (this.e == null) {
            this.e = new e(this.ap, this, this.as, this, this.c);
            this.d.setAdapter(this.e);
        }
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        if (this.d != null) {
            this.d = null;
        }
        if (this.e != null) {
            this.e = null;
        }
        super.d();
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        switch (i) {
            case 1:
                if (bb.a(i2, intent)) {
                    FinskyLog.a("Refreshing user settings for family state.", new Object[0]);
                    jb.a(FinskyApp.a().j(), 3);
                    break;
                }
                break;
            default:
                super.a(i, i2, intent);
                break;
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f1592a;
    }
}
