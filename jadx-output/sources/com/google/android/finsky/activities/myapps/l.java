package com.google.android.finsky.activities.myapps;

import android.os.Parcelable;
import android.support.v4.view.by;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.PlayCardViewMyAppsDownloading;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.fw;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.dx;
import com.google.android.finsky.utils.ik;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l extends y<com.google.android.finsky.api.model.t> implements f {

    /* renamed from: a, reason: collision with root package name */
    private static String f1829a = "already_shown_update_all_prompt";

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f1830b;
    private c c;
    private ListView l;
    private boolean m;
    private Map<String, List<String>> n;
    private dx o;
    private boolean p;
    private boolean q;

    public l(com.google.android.finsky.activities.d dVar, com.google.android.finsky.api.b bVar, DfeToc dfeToc, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, boolean z, cy cyVar) {
        super(dVar, bVar, dfeToc, bVar2);
        this.n = new HashMap();
        this.o = dx.f4838a;
        this.q = false;
        this.c = new c(dVar, this.i, FinskyApp.a().l, FinskyApp.a().s, eVar, this, this, cyVar);
        this.p = z;
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final void d() {
        new m(this).execute(new Void[0]);
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final View e() {
        return this.f1830b;
    }

    @Override // com.google.android.finsky.activities.hc
    public final View a() {
        if (this.f1830b == null) {
            this.f1830b = (ViewGroup) this.e.inflate(R.layout.my_apps_installed, (ViewGroup) null);
        }
        return this.f1830b;
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final void f() {
        l();
        d();
    }

    @Override // com.google.android.finsky.activities.myapps.y, com.google.android.finsky.api.model.x
    public final void m_() {
        super.m_();
        List<Document> list = ((com.google.android.finsky.api.model.t) this.k).f1990a;
        if (list != null) {
            c cVar = this.c;
            cVar.f1819a.clear();
            cVar.f1819a.addAll(list);
            cVar.notifyDataSetChanged();
            com.google.android.finsky.installer.n nVar = FinskyApp.a().l;
            Iterator<Document> it = list.iterator();
            while (it.hasNext()) {
                nVar.a(it.next());
            }
            if (FinskyApp.a().e().a(12605212L)) {
                for (Document document : list) {
                    for (fw fwVar : document.U()) {
                        FinskyLog.a("Package %s depends on %s min %d", document.E().w, fwVar.f3849a, Integer.valueOf(fwVar.c));
                    }
                }
            }
        }
        if (!this.m) {
            this.f1830b.findViewById(R.id.lists_loading_indicator).setVisibility(8);
            this.l = (ListView) this.f1830b.findViewById(R.id.my_apps_content_list);
            int a2 = ik.a(this.l.getResources());
            by.a(this.l, a2, this.l.getPaddingTop(), a2, this.l.getPaddingBottom());
            this.l.setAdapter((ListAdapter) this.c);
            this.l.setItemsCanFocus(true);
            this.m = true;
            if (this.o.a("MyAppsTab.KeyListParcel")) {
                this.l.onRestoreInstanceState((Parcelable) this.o.b("MyAppsTab.KeyListParcel"));
            }
            a(false, R.string.empty_myapps_description_installed);
            this.l.setRecyclerListener(this.c);
        }
        m();
        if (this.p && !this.q) {
            this.c.a();
            this.q = true;
        }
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final Document a(View view) {
        return c.a(view);
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final ListView h() {
        return this.l;
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final t i() {
        return this.c;
    }

    @Override // com.google.android.finsky.activities.hc
    public final void a(dx dxVar) {
        boolean z;
        if (dxVar != null) {
            this.o = dxVar;
            dx dxVar2 = this.o;
            String str = f1829a;
            if (dxVar2.f4839b.containsKey(str)) {
                z = ((Boolean) dxVar2.f4839b.get(str)).booleanValue();
            } else {
                z = dxVar2.c.getBoolean(str);
            }
            this.q = z;
        }
    }

    @Override // com.google.android.finsky.activities.hc
    public final dx c() {
        dx dxVar = new dx();
        if (this.l != null) {
            dxVar.a("MyAppsTab.KeyListParcel", this.l.onSaveInstanceState());
        }
        dxVar.f4839b.put(f1829a, Boolean.valueOf(this.q));
        return dxVar;
    }

    @Override // com.google.android.finsky.installer.p
    public final void a(String str, int i, int i2) {
        Document document;
        if (i == 1 || i == 4) {
            c cVar = this.c;
            ListView listView = this.l;
            if (listView != null) {
                int count = cVar.d.getCount();
                int i3 = 1;
                while (true) {
                    if (i3 >= count) {
                        document = null;
                        break;
                    }
                    Document document2 = (Document) cVar.d.getItem(i3);
                    if (str.equals(document2.E().w)) {
                        document = document2;
                        break;
                    }
                    i3++;
                }
                if (document != null) {
                    int firstVisiblePosition = listView.getFirstVisiblePosition();
                    int lastVisiblePosition = listView.getLastVisiblePosition();
                    for (int i4 = firstVisiblePosition; i4 <= lastVisiblePosition; i4++) {
                        if (document == listView.getItemAtPosition(i4)) {
                            ((PlayCardViewMyAppsDownloading) listView.getChildAt(i4 - firstVisiblePosition)).a(cVar.e.j(document.E().w));
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        d();
    }

    @Override // com.google.android.finsky.g.o
    public final void L_() {
        d();
    }
}
