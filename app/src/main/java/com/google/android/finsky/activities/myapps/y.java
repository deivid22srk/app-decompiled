package com.google.android.finsky.activities.myapps;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.hc;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.j;
import com.google.android.finsky.layout.play.PlayCardViewMyApps;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.pt;
import com.google.android.finsky.utils.aw;

/* loaded from: classes.dex */
public abstract class y<T extends com.google.android.finsky.api.model.j> implements View.OnClickListener, com.android.volley.s, hc, com.google.android.finsky.api.model.x, com.google.android.finsky.gpkg.o, com.google.android.finsky.installer.p {

    /* renamed from: b, reason: collision with root package name */
    private VolleyError f1848b;
    protected final com.google.android.finsky.activities.d d;
    protected final LayoutInflater e;
    protected final com.google.android.finsky.api.b f;
    protected final DfeToc g;
    protected final com.google.android.finsky.navigationmanager.b h;
    protected final com.google.android.finsky.gpkg.h j;
    protected T k;

    /* renamed from: a, reason: collision with root package name */
    private boolean f1847a = false;
    protected final com.google.android.finsky.receivers.f i = FinskyApp.a().k;

    protected abstract Document a(View view);

    protected abstract void d();

    protected abstract View e();

    protected abstract void f();

    protected abstract ListView h();

    protected abstract t i();

    protected y(com.google.android.finsky.activities.d dVar, com.google.android.finsky.api.b bVar, DfeToc dfeToc, com.google.android.finsky.navigationmanager.b bVar2) {
        this.d = dVar;
        this.e = LayoutInflater.from(this.d);
        this.f = bVar;
        this.g = dfeToc;
        this.h = bVar2;
        this.i.a(this);
        this.j = FinskyApp.a().p;
        this.j.a(this);
    }

    @Override // com.google.android.finsky.activities.hc
    public final void b() {
        l();
        this.i.b(this);
        this.j.b(this);
    }

    private boolean n() {
        return this.k != null && this.k.a();
    }

    final void k() {
        d();
        if (n()) {
            m_();
        }
    }

    protected final void l() {
        if (this.k != null) {
            this.k.b(this);
            this.k.b(this);
            this.k = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Document a2 = i().a(b(view));
        FinskyApp.a().h().a((cy) ((PlayCardViewMyApps) view).getLoggingData());
        this.h.a(a2, (cy) null, (String) null, -1, com.google.android.finsky.navigationmanager.b.h() ? view.findViewById(R.id.li_thumbnail) : null).onClick(view);
    }

    protected final int b(View view) {
        if (view.getId() == R.id.accessibility_overlay) {
            view = (View) view.getParent();
        }
        if (a(view) == null) {
            return -1;
        }
        ListView h = h();
        View view2 = view;
        while (view2 != null) {
            Object parent = view2.getParent();
            if (parent != h) {
                if (!(parent instanceof View)) {
                    return -1;
                }
                view2 = (View) parent;
            } else {
                return h.getPositionForView(view);
            }
        }
        return -1;
    }

    protected final void m() {
        View e = e();
        View findViewById = e.findViewById(R.id.lists_loading_indicator);
        View findViewById2 = e.findViewById(R.id.page_error_indicator);
        ListView listView = (ListView) e.findViewById(R.id.my_apps_content_list);
        if (this.f1848b != null) {
            findViewById2.setVisibility(0);
            ((TextView) findViewById2.findViewById(R.id.error_msg)).setText(aw.a(FinskyApp.a(), this.f1848b));
            findViewById2.findViewById(R.id.retry_button).setOnClickListener(new z(this));
            findViewById.setVisibility(8);
            listView.setVisibility(8);
            return;
        }
        if (n()) {
            listView.setVisibility(0);
            findViewById2.setVisibility(8);
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            listView.setVisibility(8);
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f1848b = volleyError;
        m();
    }

    public void m_() {
        this.f1848b = null;
    }

    public void a(boolean z) {
        this.f1847a = z;
    }

    protected boolean j() {
        return false;
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void M_() {
    }

    protected final void a(boolean z, int i) {
        MyAppsEmptyView myAppsEmptyView = (MyAppsEmptyView) e().findViewById(R.id.no_results_view);
        if (myAppsEmptyView != null) {
            DfeToc dfeToc = this.g;
            com.google.android.finsky.navigationmanager.b bVar = this.h;
            if (z) {
                myAppsEmptyView.f1800a.a();
            } else {
                myAppsEmptyView.f1800a.setVisibility(8);
            }
            myAppsEmptyView.f1801b.setText(i);
            pt a2 = dfeToc == null ? null : dfeToc.a(3);
            if (a2 == null) {
                myAppsEmptyView.c.setVisibility(8);
            } else {
                myAppsEmptyView.c.setOnClickListener(new a(myAppsEmptyView, bVar, a2, dfeToc));
            }
            String b2 = com.google.android.finsky.cpkg.d.m.b();
            if (dfeToc == null || TextUtils.isEmpty(b2)) {
                myAppsEmptyView.d.setVisibility(8);
            } else {
                myAppsEmptyView.d.setOnClickListener(new b(myAppsEmptyView, bVar, b2, dfeToc));
            }
            h().setEmptyView(myAppsEmptyView);
        }
    }
}
