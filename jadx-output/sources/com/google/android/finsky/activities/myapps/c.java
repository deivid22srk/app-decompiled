package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.IdentifiableLinearLayout;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.PlayCardViewMyApps;
import com.google.android.finsky.layout.play.PlayCardViewMyAppsDownloading;
import com.google.android.finsky.layout.play.cc;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.fe;
import com.google.android.finsky.utils.jm;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends BaseAdapter implements AbsListView.RecyclerListener, t {
    private static final Collator r = Collator.getInstance();
    private static final Comparator<Document> s = new d();

    /* renamed from: b, reason: collision with root package name */
    protected final LayoutInflater f1820b;
    protected Context c;
    final com.google.android.finsky.receivers.f e;
    private final f f;
    private final View.OnClickListener l;
    private final com.google.android.finsky.installer.n m;
    private final com.google.android.finsky.b.a n;
    private final com.google.android.play.image.e o;
    private cy p;
    private final int q;

    /* renamed from: a, reason: collision with root package name */
    final List<Document> f1819a = new ArrayList();
    private final j g = new j(this, 0, R.string.waiting_for_wifi_section, null, 2804);
    final j d = new j(this, 0, R.string.downloading_section, g.f1824b, 2800);
    private final j h = new j(this, 2, R.string.updates_available_section, g.f1823a, 2801);
    private final j i = new j(this, 3, R.string.recently_updated_section, null, 2802);
    private final j j = new j(this, 1, R.string.installed_section, null, 2803);
    private final com.google.android.finsky.adapters.a<j> k = new com.google.android.finsky.adapters.a<>(new j[]{this.g, this.d, this.h, this.i, this.j});

    public c(Context context, com.google.android.finsky.receivers.f fVar, com.google.android.finsky.installer.n nVar, com.google.android.finsky.b.a aVar, com.google.android.play.image.e eVar, View.OnClickListener onClickListener, f fVar2, cy cyVar) {
        this.p = null;
        this.c = context;
        this.e = fVar;
        this.m = nVar;
        this.n = aVar;
        this.l = onClickListener;
        this.o = eVar;
        this.p = cyVar;
        this.f1820b = LayoutInflater.from(context);
        this.f = fVar2;
        this.q = FinskyHeaderListLayout.a(context, 0);
    }

    public final void a() {
        if (this.h.f1825a.size() > 0) {
            this.h.d.a(this.c, this);
        }
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 3;
        }
        return this.k.getItemViewType(i - 1);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 4;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.k.areAllItemsEnabled();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        if (i == 0) {
            return false;
        }
        return this.k.isEnabled(i - 1);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int count = this.k.getCount();
        if (count == 0) {
            return 0;
        }
        return count + 1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (i != 0) {
            return this.k.getView(i - 1, view, viewGroup);
        }
        if (view == null) {
            view = this.f1820b.inflate(R.layout.play_list_vspacer, viewGroup, false);
        }
        view.getLayoutParams().height = this.q;
        view.setId(R.id.play_header_spacer);
        return view;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.k.getItem(i - 1);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        c();
        this.k.notifyDataSetChanged();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        c();
        this.k.notifyDataSetInvalidated();
        super.notifyDataSetInvalidated();
    }

    private void c() {
        j[] jVarArr = this.k.f1881a;
        for (j jVar : jVarArr) {
            jVar.f1825a.clear();
        }
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis() - com.google.android.finsky.c.d.di.b().longValue();
        for (Document document : this.f1819a) {
            String str = document.E().w;
            com.google.android.finsky.b.y a2 = this.n.f2061b.a(str);
            int i = this.e.i(str);
            com.google.android.finsky.b.t a3 = this.n.f2060a.a(str);
            if (jm.a(i)) {
                if ((a3.m & 2048) != 0 && FinskyApp.a().l.a()) {
                    this.g.a(document);
                } else {
                    this.d.a(document);
                }
            } else if (a2 == null || a2.f) {
                arrayList.add(document);
            } else if (this.m.a(a2, document)) {
                this.h.a(document);
            } else if (a3 != null && a3.o > currentTimeMillis) {
                this.i.a(document);
            } else {
                this.j.a(document);
            }
        }
        this.f1819a.removeAll(arrayList);
        for (j jVar2 : jVarArr) {
            Collections.sort(jVar2.f1825a, s);
        }
    }

    @Override // com.google.android.finsky.activities.myapps.t
    public final Document a(int i) {
        return (Document) getItem(i);
    }

    public static Document a(View view) {
        Object tag = view.getTag();
        if (tag instanceof Document) {
            return (Document) tag;
        }
        return null;
    }

    private void d() {
        FinskyLog.a("****** INSTALLED ADAPTER START ******", new Object[0]);
        FinskyLog.a("Total docs: %d", Integer.valueOf(this.f1819a.size()));
        StringBuilder sb = new StringBuilder("Total items: ");
        sb.append(getCount());
        sb.append(" [ ");
        for (j jVar : this.k.f1881a) {
            sb.append(jVar.getCount());
            sb.append(" ");
        }
        sb.append("]");
        FinskyLog.a(sb.toString(), new Object[0]);
        StringBuilder sb2 = new StringBuilder("Index translation: ");
        for (int i = 0; i < getCount(); i++) {
            sb2.append(i);
            sb2.append(":");
            sb2.append(getItemViewType(i));
            sb2.append(" ");
        }
        FinskyLog.a(sb2.toString(), new Object[0]);
        FinskyLog.a("****** INSTALLED ADAPTER  END  ******", new Object[0]);
        this.k.a();
    }

    @Override // android.widget.AbsListView.RecyclerListener
    public final void onMovedToScrapHeap(View view) {
        if (view instanceof com.google.android.play.layout.a) {
            fe.a((com.google.android.play.layout.a) view);
        }
    }

    static /* synthetic */ View a(c cVar, Document document, View view, ViewGroup viewGroup, cy cyVar) {
        View inflate = view == null ? cVar.f1820b.inflate(R.layout.play_card_myapps_downloading, viewGroup, false) : view;
        if (!(inflate instanceof PlayCardViewMyAppsDownloading)) {
            cVar.d();
        }
        PlayCardViewMyAppsDownloading playCardViewMyAppsDownloading = (PlayCardViewMyAppsDownloading) inflate;
        fe.a(playCardViewMyAppsDownloading, document, "my_apps:installed", cVar.o, null, cyVar);
        playCardViewMyAppsDownloading.a(cVar.e.j(document.E().w));
        playCardViewMyAppsDownloading.setOnClickListener(cVar.l);
        playCardViewMyAppsDownloading.setTag(document);
        playCardViewMyAppsDownloading.setIdentifier(document.f1963a.c);
        return inflate;
    }

    static /* synthetic */ View b(c cVar, Document document, View view, ViewGroup viewGroup, cy cyVar) {
        View inflate = view == null ? cVar.f1820b.inflate(R.layout.play_card_myapps, viewGroup, false) : view;
        PlayCardViewMyApps playCardViewMyApps = (PlayCardViewMyApps) inflate;
        fe.a(playCardViewMyApps, document, "my_apps:installed", cVar.o, null, cyVar);
        playCardViewMyApps.setOnClickListener(cVar.l);
        playCardViewMyApps.a(false, (cc) null);
        playCardViewMyApps.setTag(document);
        playCardViewMyApps.setIdentifier(document.f1963a.c);
        return inflate;
    }

    static /* synthetic */ View a(c cVar, View view, ViewGroup viewGroup, j jVar) {
        IdentifiableLinearLayout identifiableLinearLayout = (IdentifiableLinearLayout) view;
        if (identifiableLinearLayout == null) {
            identifiableLinearLayout = (IdentifiableLinearLayout) cVar.f1820b.inflate(R.layout.my_apps_section_header, viewGroup, false);
        }
        Object tag = identifiableLinearLayout.getTag();
        if (tag instanceof Document) {
            cVar.d();
        }
        k kVar = (k) tag;
        if (kVar == null) {
            kVar = new k(identifiableLinearLayout);
        }
        kVar.f1827a.setText(cVar.c.getString(jVar.f1826b));
        kVar.f1828b.setVisibility(8);
        kVar.c.setVisibility(8);
        g gVar = jVar.d;
        boolean z = gVar != null && gVar.a(cVar);
        if (gVar != null) {
            gVar.b(cVar);
        }
        if (z) {
            kVar.f1828b.setVisibility(0);
            kVar.f1828b.a(3, cVar.c.getString(gVar.a()), new e(cVar, gVar));
        }
        boolean z2 = (jVar == cVar.g || z) ? false : true;
        kVar.d.setVisibility(z2 ? 0 : 8);
        if (z2) {
            int count = jVar.getCount() - 1;
            kVar.d.setText(cVar.c.getResources().getQuantityString(R.plurals.number_of_apps, count, Integer.toString(count)));
        }
        identifiableLinearLayout.setIdentifier(jVar.c);
        return identifiableLinearLayout;
    }
}
