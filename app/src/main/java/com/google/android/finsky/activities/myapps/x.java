package com.google.android.finsky.activities.myapps;

import android.os.Parcelable;
import android.support.v4.view.by;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.de;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.as;
import com.google.android.finsky.utils.dx;
import com.google.android.finsky.utils.ik;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class x extends y<com.google.android.finsky.api.model.f> {

    /* renamed from: a, reason: collision with root package name */
    Map<String, com.google.android.finsky.gpkg.u> f1845a;

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f1846b;
    private ListView c;
    private u l;
    private boolean m;
    private dx n;

    public x(com.google.android.finsky.activities.d dVar, com.google.android.finsky.api.b bVar, DfeToc dfeToc, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, de deVar) {
        super(dVar, bVar, dfeToc, bVar2);
        this.m = false;
        this.f1845a = new HashMap();
        this.n = dx.f4838a;
        this.l = new u(dVar, this.e, eVar, this, deVar);
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final void d() {
        l();
        this.f1845a.clear();
        u uVar = this.l;
        uVar.f1842a.clear();
        uVar.notifyDataSetChanged();
        com.google.android.finsky.gpkg.h hVar = FinskyApp.a().p;
        HashSet hashSet = new HashSet();
        com.google.android.finsky.gpkg.a a2 = hVar.a(this.f.b());
        for (com.google.android.finsky.gpkg.a aVar : hVar.e()) {
            if (aVar != a2) {
                for (com.google.android.finsky.gpkg.u uVar2 : aVar.c()) {
                    String str = uVar2.j;
                    this.f1845a.put(str, uVar2);
                    hashSet.add(str);
                    hashSet.add(as.b(str));
                }
            }
        }
        for (com.google.android.finsky.gpkg.u uVar3 : a2.c()) {
            String str2 = uVar3.j;
            this.f1845a.put(str2, uVar3);
            hashSet.add(str2);
            hashSet.add(as.b(str2));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(hashSet);
        this.k = new com.google.android.finsky.api.model.f(this.f, arrayList, null, false);
        ((com.google.android.finsky.api.model.f) this.k).a((com.google.android.finsky.api.model.x) this);
        ((com.google.android.finsky.api.model.f) this.k).a((com.android.volley.s) this);
    }

    @Override // com.google.android.finsky.activities.myapps.y, com.google.android.finsky.api.model.x
    public final void m_() {
        super.m_();
        List<Document> b2 = ((com.google.android.finsky.api.model.f) this.k).b();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Document document : b2) {
            switch (document.f1963a.e) {
                case 1:
                    hashMap2.put(document.f1963a.f3890a, document);
                    break;
                case 15:
                    hashMap.put(document.f1963a.f3890a, document);
                    break;
            }
        }
        for (Map.Entry<String, com.google.android.finsky.gpkg.u> entry : this.f1845a.entrySet()) {
            String key = entry.getKey();
            Document document2 = (Document) hashMap.get(key);
            String b3 = as.b(key);
            Document document3 = (Document) hashMap2.get(b3);
            if (document2 == null) {
                FinskyLog.c("Subscription %s is unavailable, ignoring this entry", key);
            } else if (document3 == null) {
                FinskyLog.c("Parent app %s of subscription %s is unavailable, ignoring this entry", b3, key);
            } else {
                u uVar = this.l;
                uVar.f1842a.add(new w(uVar, document2, document3, entry.getValue()));
                uVar.notifyDataSetChanged();
            }
        }
        Collections.sort(this.l.f1842a, u.f1841b);
        if (!this.m) {
            this.c = (ListView) this.f1846b.findViewById(R.id.my_apps_content_list);
            int a2 = ik.a(this.c.getResources());
            by.a(this.c, a2, this.c.getPaddingTop(), a2, this.c.getPaddingBottom());
            this.c.setAdapter((ListAdapter) this.l);
            this.c.setItemsCanFocus(true);
            if (this.n.a("MyAppsTab.KeyListParcel")) {
                this.c.onRestoreInstanceState((Parcelable) this.n.b("MyAppsTab.KeyListParcel"));
            }
            this.m = true;
            this.c.setRecyclerListener(this.l);
        }
        m();
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final View e() {
        return this.f1846b;
    }

    @Override // com.google.android.finsky.activities.hc
    public final View a() {
        if (this.f1846b == null) {
            this.f1846b = (ViewGroup) this.e.inflate(R.layout.my_apps_subscriptions, (ViewGroup) null);
        }
        return this.f1846b;
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final void f() {
        d();
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final t i() {
        return this.l;
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final ListView h() {
        return this.c;
    }

    @Override // com.google.android.finsky.activities.myapps.y
    protected final Document a(View view) {
        return (Document) view.getTag();
    }

    @Override // com.google.android.finsky.activities.hc
    public final void a(dx dxVar) {
        if (dxVar != null) {
            this.n = dxVar;
        }
    }

    @Override // com.google.android.finsky.activities.hc
    public final dx c() {
        dx dxVar = new dx();
        if (this.c != null) {
            dxVar.a("MyAppsTab.KeyListParcel", this.c.onSaveInstanceState());
            this.c.setRecyclerListener(null);
        }
        return dxVar;
    }

    @Override // com.google.android.finsky.installer.p
    public final void a(String str, int i, int i2) {
        if (i == 6 || i == 8) {
            this.l.notifyDataSetChanged();
        }
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void L_() {
        d();
    }
}
