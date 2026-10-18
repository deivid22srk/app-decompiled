package com.google.android.finsky.activities.myapps;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.adapters.aj;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.AccountSelectorView;
import com.google.android.finsky.layout.IdentifiableLinearLayout;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.PlayCardViewMyApps;
import com.google.android.finsky.layout.play.cc;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.as;
import com.google.android.finsky.utils.aw;
import com.google.android.finsky.utils.fe;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public final class n extends aj implements AbsListView.RecyclerListener, t {
    private static boolean h = com.google.android.finsky.c.d.cF.b().booleanValue();

    /* renamed from: a, reason: collision with root package name */
    com.google.android.finsky.api.model.i f1832a;

    /* renamed from: b, reason: collision with root package name */
    boolean f1833b;
    private final com.google.android.play.image.e i;
    private final View.OnClickListener j;
    private final cc k;
    private final View.OnLongClickListener l;
    private cy m;
    private boolean n;
    private DfeToc o;
    private com.google.android.finsky.g.h p;
    private com.google.android.finsky.b.x q;
    private com.google.android.finsky.receivers.f r;
    private final int s;

    public n(com.google.android.finsky.activities.d dVar, com.google.android.finsky.navigationmanager.b bVar, DfeToc dfeToc, com.google.android.finsky.g.h hVar, com.google.android.finsky.b.x xVar, com.google.android.finsky.receivers.f fVar, com.google.android.play.image.e eVar, View.OnClickListener onClickListener, cc ccVar, View.OnLongClickListener onLongClickListener, cy cyVar) {
        super(dVar, bVar);
        this.m = null;
        this.i = eVar;
        this.j = onClickListener;
        this.k = ccVar;
        this.l = onLongClickListener;
        this.m = cyVar;
        this.n = false;
        this.o = dfeToc;
        this.p = hVar;
        this.q = xVar;
        this.r = fVar;
        this.s = FinskyHeaderListLayout.a(dVar, 0);
    }

    @Override // com.google.android.finsky.activities.myapps.t
    public final Document a(int i) {
        Object item = getItem(i);
        if (item instanceof Document) {
            return (Document) item;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f1832a == null) {
            return 0;
        }
        int p = this.f1832a.p();
        if (c()) {
            p++;
        }
        if (p == 0) {
            return 0;
        }
        if (this.f1833b) {
            p++;
        }
        return p + 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 5;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 4;
        }
        if (i != getCount() - 1) {
            return (this.f1833b && i == 1) ? 3 : 0;
        }
        switch (this.f) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                throw new IllegalStateException("No footer or item at row " + i);
        }
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        if (this.f1833b && i2 == 0) {
            return null;
        }
        if (this.f1833b) {
            i2--;
        }
        return this.f1832a.c(i2);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z;
        switch (getItemViewType(i)) {
            case 0:
                Document a2 = a(i);
                View inflate = view == null ? this.c.inflate(R.layout.play_card_myapps, viewGroup, false) : view;
                PlayCardViewMyApps playCardViewMyApps = (PlayCardViewMyApps) inflate;
                if (a2 == null) {
                    playCardViewMyApps.a();
                } else {
                    String str = a2.E().w;
                    boolean z2 = ((this.q.a(str) != null) || jm.a(this.r.i(str)) || !com.google.android.finsky.utils.cy.a(a2, this.o, this.p)) ? false : true;
                    boolean z3 = this.n ? z2 : true;
                    fe.a(playCardViewMyApps, a2, "my_apps:library", this.i, this.e, !z3, null, this.m, true, -1, false);
                    if (z3) {
                        playCardViewMyApps.setOnClickListener(this.j);
                    } else {
                        playCardViewMyApps.setOnClickListener(null);
                    }
                    if (h) {
                        if (!this.n) {
                            if (a2.f1963a.e != 1) {
                                FinskyLog.e("Method invalid for non-ANDROID_APP docs.", new Object[0]);
                                z = false;
                            } else {
                                com.google.android.finsky.g.h hVar = FinskyApp.a().p;
                                com.google.android.finsky.activities.a aVar = new com.google.android.finsky.activities.a(a2.f1963a.c, FinskyApp.a().s, hVar);
                                if (aVar.f1527a) {
                                    z = false;
                                } else if (aVar.h) {
                                    z = false;
                                } else if (as.a(hVar, a2.E().w)) {
                                    z = false;
                                } else if (FinskyApp.a().k.i(a2.E().w) != 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                            }
                            if (z) {
                                playCardViewMyApps.a(true, this.k);
                            }
                        }
                        playCardViewMyApps.a(false, (cc) null);
                    }
                    if (!this.n && z2) {
                        playCardViewMyApps.setOnLongClickListener(this.l);
                    } else {
                        playCardViewMyApps.setOnLongClickListener(null);
                    }
                }
                playCardViewMyApps.setTag(a2);
                playCardViewMyApps.setIdentifier(a2.f1963a.f3890a);
                return inflate;
            case 1:
                IdentifiableLinearLayout identifiableLinearLayout = (IdentifiableLinearLayout) (view != null ? view : a(R.layout.loading_footer, viewGroup));
                identifiableLinearLayout.setIdentifier("loading_footer");
                return identifiableLinearLayout;
            case 2:
                return a(view, viewGroup);
            case 3:
                if (view == null) {
                    view = a(R.layout.my_apps_library_account_switcher, viewGroup);
                }
                AccountSelectorView accountSelectorView = (AccountSelectorView) view.findViewById(R.id.account_name);
                accountSelectorView.a();
                accountSelectorView.setIdentifier("account_switcher");
                return view;
            case 4:
                if (view == null) {
                    view = a(R.layout.play_list_vspacer, viewGroup);
                }
                view.getLayoutParams().height = this.s;
                view.setId(R.id.play_header_spacer);
                return view;
            default:
                throw new IllegalStateException("Unknown type for getView " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.aj
    public final void a() {
        if (this.f1832a != null) {
            this.f1832a.r();
        }
    }

    @Override // android.widget.AbsListView.RecyclerListener
    public final void onMovedToScrapHeap(View view) {
        if (view instanceof com.google.android.play.layout.a) {
            fe.a((com.google.android.play.layout.a) view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.aj
    public final String b() {
        return aw.a(this.d, this.f1832a.h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.aj
    public final boolean c() {
        return this.f1832a != null && this.f1832a.m;
    }

    public static Document a(View view) {
        return (Document) view.getTag();
    }

    public final void a(boolean z) {
        this.n = z;
        notifyDataSetChanged();
    }
}
