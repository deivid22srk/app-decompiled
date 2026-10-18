package com.google.android.finsky.activities.myapps;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.view.by;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.PlayListView;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.dx;
import com.google.android.finsky.utils.ik;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends y<com.google.android.finsky.api.model.i> implements View.OnLongClickListener, cy {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f1834a;

    /* renamed from: b, reason: collision with root package name */
    final n f1835b;
    PlayListView c;
    private final com.google.android.finsky.gpkg.a l;
    private final ac m;
    private ViewGroup n;
    private boolean o;
    private dx p;
    private ActionMode q;
    private cy r;
    private com.google.android.finsky.apkg.ai s;

    static {
        f1834a = Build.VERSION.SDK_INT >= 11;
    }

    public o(com.google.android.finsky.activities.d dVar, com.google.android.finsky.api.b bVar, DfeToc dfeToc, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, ac acVar, com.google.android.finsky.gpkg.a aVar, cy cyVar) {
        super(dVar, bVar, dfeToc, bVar2);
        this.o = false;
        this.p = dx.f4838a;
        this.s = com.google.android.finsky.apkg.i.a(408);
        this.m = acVar;
        this.l = aVar;
        p pVar = new p(this);
        this.r = cyVar;
        this.f1835b = new n(dVar, bVar2, FinskyApp.a().g, this.j, FinskyApp.a().v, this.i, eVar, this, pVar, this, this);
        n nVar = this.f1835b;
        nVar.f1833b = true;
        nVar.notifyDataSetChanged();
    }

    @Override // com.google.android.finsky.activities.hc
    public final View a() {
        if (this.n == null) {
            this.n = (ViewGroup) this.e.inflate(R.layout.my_apps_library, (ViewGroup) null);
        }
        return this.n;
    }

    @Override // com.google.android.finsky.activities.myapps.y, com.google.android.finsky.api.model.x
    @TargetApi(11)
    public final void m_() {
        super.m_();
        if (!this.o) {
            this.o = true;
            this.c = (PlayListView) this.n.findViewById(R.id.my_apps_content_list);
            int a2 = ik.a(this.c.getResources());
            by.a(this.c, a2, this.c.getPaddingTop(), a2, this.c.getPaddingBottom());
            this.c.setAnimateChanges(true);
            this.c.setAdapter((ListAdapter) this.f1835b);
            this.c.setItemsCanFocus(true);
            if (f1834a) {
                this.c.setMultiChoiceModeListener(new q(this, (byte) 0));
                if (this.p.a("MyAppsLibraryTab.ChoiceMode") && this.p.c("MyAppsLibraryTab.ChoiceMode") == 3) {
                    this.f1835b.a(true);
                    this.c.setChoiceMode(3);
                }
            }
            this.c.setRecyclerListener(this.f1835b);
            if (this.p.a("MyAppsTab.KeyListParcel")) {
                this.c.onRestoreInstanceState((Parcelable) this.p.b("MyAppsTab.KeyListParcel"));
            }
            a(true, R.string.empty_myapps_description_all);
        }
        m();
        this.f1835b.m_();
        Document document = ((com.google.android.finsky.api.model.d) ((com.google.android.finsky.api.model.i) this.k)).f1970a;
        if (document == null) {
            return;
        }
        com.google.android.finsky.apkg.i.a(this.s, document.f1963a.R);
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final View e() {
        return this.n;
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final void f() {
        ((com.google.android.finsky.api.model.i) this.k).e();
        ((com.google.android.finsky.api.model.i) this.k).g = null;
        ((com.google.android.finsky.api.model.i) this.k).q();
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final void d() {
        com.google.android.finsky.api.model.i iVar;
        l();
        String a2 = this.f.a(3, com.google.android.finsky.gpkg.a.f2782a, 1, this.l.i(com.google.android.finsky.gpkg.a.f2782a));
        if (this.p != null && this.p.a("MyAppsLibraryTab.ListData")) {
            iVar = (com.google.android.finsky.api.model.i) this.p.b("MyAppsLibraryTab.ListData");
            if (a2.equals(iVar.d)) {
                iVar.a(this.f);
                this.k = iVar;
                ((com.google.android.finsky.api.model.i) this.k).a((com.google.android.finsky.api.model.x) this);
                ((com.google.android.finsky.api.model.i) this.k).a((com.android.volley.s) this);
                ((com.google.android.finsky.api.model.i) this.k).q();
                n nVar = this.f1835b;
                nVar.f1832a = (com.google.android.finsky.api.model.i) this.k;
                nVar.notifyDataSetChanged();
            }
        }
        iVar = new com.google.android.finsky.api.model.i(this.f, a2, true);
        iVar.c = "com.google.android.gms";
        this.k = iVar;
        ((com.google.android.finsky.api.model.i) this.k).a((com.google.android.finsky.api.model.x) this);
        ((com.google.android.finsky.api.model.i) this.k).a((com.android.volley.s) this);
        ((com.google.android.finsky.api.model.i) this.k).q();
        n nVar2 = this.f1835b;
        nVar2.f1832a = (com.google.android.finsky.api.model.i) this.k;
        nVar2.notifyDataSetChanged();
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final Document a(View view) {
        return n.a(view);
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final ListView h() {
        return this.c;
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final t i() {
        return this.f1835b;
    }

    @Override // com.google.android.finsky.installer.p
    public final void a(String str, int i, int i2) {
        if (i == 6 || i == 8) {
            this.f1835b.notifyDataSetChanged();
        }
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void L_() {
    }

    @Override // com.google.android.finsky.activities.hc
    public final void a(dx dxVar) {
        if (dxVar != null) {
            this.p = dxVar;
        }
    }

    @Override // com.google.android.finsky.activities.hc
    public final dx c() {
        dx dxVar = new dx();
        if (this.k != 0 && ((com.google.android.finsky.api.model.i) this.k).a()) {
            dxVar.a("MyAppsLibraryTab.ListData", this.k);
        }
        if (this.c != null) {
            dxVar.a("MyAppsTab.KeyListParcel", this.c.onSaveInstanceState());
            dxVar.a("MyAppsLibraryTab.ChoiceMode", Integer.valueOf(this.c.getChoiceMode()));
        }
        return dxVar;
    }

    @Override // com.google.android.finsky.activities.myapps.y, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c.getChoiceMode() != 3) {
            super.onClick(view);
        } else {
            int b2 = b(view);
            this.c.setItemChecked(b2, !this.c.isItemChecked(b2));
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (!f1834a) {
            return false;
        }
        if (this.c.getChoiceMode() != 3) {
            this.f1835b.a(true);
            this.c.setChoiceMode(3);
        }
        int b2 = b(view);
        if (b2 == -1) {
            return true;
        }
        this.c.setItemChecked(b2, this.c.isItemChecked(b2) ? false : true);
        return true;
    }

    @Override // com.google.android.finsky.activities.myapps.y, com.google.android.finsky.activities.hc
    public final void a(boolean z) {
        super.a(z);
        if (!z) {
            j();
        }
    }

    @Override // com.google.android.finsky.activities.myapps.y
    @TargetApi(11)
    protected final boolean j() {
        if (this.q == null) {
            return false;
        }
        this.q.finish();
        return true;
    }

    public final void a(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= ((com.google.android.finsky.api.model.i) this.k).p()) {
                    break;
                }
                if (!list.get(i).equals(((com.google.android.finsky.api.model.i) this.k).c(i2).f1963a.f3890a)) {
                    i2++;
                } else {
                    ((com.google.android.finsky.api.model.i) this.k).d(i2);
                    break;
                }
            }
        }
        this.f1835b.notifyDataSetChanged();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.s;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final cy getParentNode() {
        return this.r;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        com.google.android.finsky.apkg.i.a(this, cyVar);
    }
}
