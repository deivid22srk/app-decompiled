package com.google.android.finsky.uninstall;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.t;
import android.support.v7.widget.LinearLayoutManager;
import android.text.format.Formatter;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.adapters.ab;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.ButtonBar;
import com.google.android.finsky.layout.play.PlayRecyclerView;
import com.google.android.finsky.layout.r;
import com.google.android.finsky.receivers.aq;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.dx;
import com.google.android.finsky.utils.jm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends com.google.android.finsky.e.q implements r, aq, o {

    /* renamed from: a, reason: collision with root package name */
    private Document f4701a;
    private long aA;
    private ButtonBar ai;
    private TextView aj;
    private TextView ak;
    private ProgressBar al;
    private long am;
    private long an;

    /* renamed from: b, reason: collision with root package name */
    private c f4702b;
    private k c;
    private com.google.android.finsky.receivers.f d = FinskyApp.a().k;
    private dx e = new dx();
    private List<i> f = new ArrayList();
    private LinearLayout g;
    private PlayRecyclerView h;
    private l i;

    public static j a(Document document) {
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uninstall_manager_fragment_installing_doc", document);
        jVar.f(bundle);
        jVar.a("finsky.PageFragment.toc", FinskyApp.a().g);
        return jVar;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
        this.f4701a = (Document) this.r.getParcelable("uninstall_manager_fragment_installing_doc");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.uninstall_manager;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        try {
            this.c = (k) this.ao;
        } catch (ClassCastException e) {
            FinskyLog.b(e, "Uninstall Wizard host activity doesn't implement the callback interface", new Object[0]);
        }
        this.g = (LinearLayout) this.av.findViewById(R.id.content_layout);
        this.ai = (ButtonBar) this.av.findViewById(R.id.button_bar);
        this.aj = (TextView) this.av.findViewById(R.id.uninstall_manager_storage_text);
        this.ak = (TextView) this.av.findViewById(R.id.uninstall_manager_checked_text);
        this.h = (PlayRecyclerView) this.av.findViewById(R.id.uninstall_recycler_view);
        this.al = (ProgressBar) this.av.findViewById(R.id.uninstall_manager_progress_bar);
        this.h.setLayoutManager(new LinearLayoutManager());
        this.h.setAdapter(new ab());
        FinskyApp.a().i.a(this);
        if (!(this.f4702b != null && this.f4702b.a())) {
            N();
            y();
        } else {
            u();
        }
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        FinskyApp.a().i.b(this);
        if (this.h != null && this.h.getVisibility() == 0 && this.i != null) {
            l lVar = this.i;
            dx dxVar = this.e;
            dxVar.a("uninstall_manager__adapter_docs", lVar.c);
            dxVar.a("uninstall_manager__adapter_checked", lVar.d);
            dxVar.a("uninstall_manager__adapter_uninstalling", lVar.e);
            dxVar.a("uninstall_manager_adapter_selection", lVar.g);
        }
        this.h = null;
        if (this.i != null) {
            this.i.h = null;
            this.i = null;
        }
        this.ai = null;
        this.aj = null;
        this.al = null;
        this.g = null;
        super.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void y() {
        if (this.f4702b == null) {
            this.f4702b = new c(this.f4701a);
            this.f4702b.l = this;
        }
        c cVar = this.f4702b;
        t f = f();
        cVar.c = false;
        cVar.d = false;
        cVar.f4689b = false;
        if (cVar.k != null) {
            cVar.k.clear();
        }
        PackageManager packageManager = f.getPackageManager();
        if (!cVar.f4688a) {
            jm.a(new g(cVar, (byte) 0), new Void[0]);
        }
        new h(cVar, packageManager).execute(new Void[0]);
        jm.a(new f(cVar, (byte) 0), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void u() {
        this.g.setVisibility(0);
        if (this.f4702b == null) {
            FinskyLog.e("Tried binding views with null data model", new Object[0]);
            return;
        }
        if (this.h == null) {
            FinskyLog.c("Recycler view null, ignoring.", new Object[0]);
        } else {
            dx dxVar = this.e;
            boolean z = dxVar != null && dxVar.a("uninstall_manager__adapter_docs");
            if (this.i == null) {
                this.i = new l(this.ap);
                this.h.setAdapter(this.i);
                this.i.h = this;
                if (z) {
                    l lVar = this.i;
                    dx dxVar2 = this.e;
                    lVar.c = (ArrayList) dxVar2.b("uninstall_manager__adapter_docs");
                    lVar.d = (ArrayList) dxVar2.b("uninstall_manager__adapter_checked");
                    lVar.e = (ArrayList) dxVar2.b("uninstall_manager__adapter_uninstalling");
                    if (dxVar2.c("uninstall_manager_adapter_selection") == 1) {
                        lVar.g = 1;
                    } else {
                        lVar.g = 0;
                    }
                    lVar.f = l.g(lVar.g);
                    dx dxVar3 = this.e;
                    dxVar3.f4839b.clear();
                    dxVar3.c.clear();
                } else {
                    this.i.a(this.f4702b.j);
                }
                this.h.setEmptyView(this.av.findViewById(R.id.no_results_view));
            } else {
                this.i.a(this.f4702b.j);
            }
        }
        Resources g = g();
        long j = this.f4702b.f - this.f4702b.h;
        if (j > 0) {
            this.aj.setText(g.getString(R.string.uninstall_manager_space_to_free, Formatter.formatFileSize(this.ap, j)));
        } else {
            this.aj.setText(g.getString(R.string.uninstall_manager_done));
        }
        H();
        I();
        this.ai.setPositiveButtonTitle(R.string.continue_text);
        this.ai.setNegativeButtonTitle(R.string.uninstall);
        this.ai.setClickListener(this);
        if (this.i != null) {
            this.ai.setNegativeButtonEnabled(this.i.c());
        } else {
            this.ai.setNegativeButtonEnabled(false);
        }
        if (this.f4702b.f - this.f4702b.h > 0) {
            this.ai.setPositiveButtonEnabled(false);
        } else {
            this.ai.setPositiveButtonEnabled(true);
        }
    }

    private void H() {
        this.ak.setText(g().getString(R.string.uninstall_manager_selected_space, Formatter.formatFileSize(this.ap, this.aA)));
    }

    private void I() {
        long j = (this.f4702b.f - this.f4702b.h) + this.am;
        if (j > 0) {
            int max = (int) (((this.am + this.an) / j) * this.al.getMax());
            this.al.setProgress(max);
            this.al.setSecondaryProgress(((int) ((this.aA / j) * this.al.getMax())) + max);
            return;
        }
        this.al.setProgress(this.al.getMax());
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return null;
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        if (this.c != null) {
            this.c.o();
        }
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        this.an += this.aA;
        this.aA = 0L;
        List<i> list = this.f;
        l lVar = this.i;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < lVar.d.size(); i++) {
            if (lVar.d.get(i).booleanValue()) {
                i iVar = lVar.c.get(i);
                lVar.e.set(i, true);
                lVar.a(i, false);
                lVar.c(i + 1);
                arrayList.add(iVar);
            }
        }
        list.addAll(arrayList);
        Iterator<i> it = this.f.iterator();
        while (it.hasNext()) {
            this.d.b(it.next().f4699a, false);
        }
    }

    @Override // com.google.android.finsky.uninstall.o
    public final void a(boolean z, long j) {
        this.ai.setNegativeButtonEnabled(this.i.c());
        if (z) {
            this.aA += j;
        } else {
            this.aA -= j;
        }
        if (this.aA < 0) {
            this.aA = 0L;
        }
        I();
        H();
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String str, boolean z) {
        if (!z) {
            Iterator<i> it = this.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i next = it.next();
                if (next.f4699a.equals(str)) {
                    this.f.remove(next);
                    break;
                }
            }
            if (this.f.isEmpty()) {
                this.am += this.an;
                this.an = 0L;
                y();
            }
        }
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void b(String str) {
        y();
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void c(String str) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String[] strArr) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void d(String str) {
    }
}
