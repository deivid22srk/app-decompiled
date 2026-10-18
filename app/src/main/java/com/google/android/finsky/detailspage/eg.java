package com.google.android.finsky.detailspage;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.SubscriptionView;
import com.google.android.finsky.protos.ga;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class eg extends bd<ej> implements com.google.android.finsky.gpkg.o, com.google.android.finsky.layout.el {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2640a;
    private boolean u;

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.subscriptions_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return (this.f2559b == 0 || !((ej) this.f2559b).c || ((ej) this.f2559b).d.isEmpty() || ((ej) this.f2559b).e.isEmpty()) ? false : true;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        super.a(bfVar);
        if (this.f2559b != 0) {
            this.m.a(this);
            if (!((ej) this.f2559b).c) {
                g();
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (this.f2559b == 0) {
            this.f2559b = new ej();
            ((ej) this.f2559b).f2644a = document;
            ((ej) this.f2559b).f2645b = new Bundle();
            ((ej) this.f2559b).d = new ArrayList();
            ((ej) this.f2559b).e = new ArrayList();
            this.m.a(this);
            g();
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        SubscriptionsModuleLayout subscriptionsModuleLayout = (SubscriptionsModuleLayout) view;
        if (!subscriptionsModuleLayout.f2515b || this.f2640a) {
            List<Document> list = ((ej) this.f2559b).d;
            List<com.google.android.finsky.gpkg.aq> list2 = ((ej) this.f2559b).e;
            int i = ((ej) this.f2559b).f2644a.f1963a.g;
            Bundle bundle = ((ej) this.f2559b).f2645b;
            com.google.android.finsky.layout.play.cy cyVar = this.s;
            com.google.android.finsky.navigationmanager.b bVar = this.i;
            subscriptionsModuleLayout.f2515b = true;
            subscriptionsModuleLayout.removeAllViews();
            SubscriptionView subscriptionView = null;
            boolean a2 = FinskyApp.a().e().a(12605423L);
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < list.size()) {
                    if (!a2 || list2.get(i3).a() != 3) {
                        Document document = list.get(i3);
                        com.google.android.finsky.gpkg.aq aqVar = list2.get(i3);
                        subscriptionView = (SubscriptionView) subscriptionsModuleLayout.f2514a.inflate(R.layout.subscription_item, (ViewGroup) subscriptionsModuleLayout, false);
                        subscriptionView.f3093a = document;
                        subscriptionView.f3094b = this;
                        subscriptionView.c.setText(subscriptionView.f3093a.f1963a.i);
                        com.google.android.finsky.protos.ea N = document.N();
                        if (N != null && N.G != null) {
                            String str = N.G.e;
                            if (!TextUtils.isEmpty(str)) {
                                subscriptionView.d.setVisibility(0);
                                subscriptionView.d.setText(str);
                            } else {
                                subscriptionView.d.setVisibility(8);
                                FinskyLog.e("Document for %s does not contain a formatted price.", document.f1963a.f3890a);
                            }
                        } else {
                            subscriptionView.d.setVisibility(8);
                            FinskyLog.e("Document for %s does not contain a subscription offer or terms.", document.f1963a.f3890a);
                        }
                        subscriptionView.f.setTextColor(com.google.android.finsky.utils.ai.c(subscriptionView.getContext(), i));
                        id idVar = subscriptionView.m;
                        Resources resources = subscriptionView.getContext().getResources();
                        String a3 = com.google.android.finsky.utils.aj.a(aqVar.n);
                        int a4 = aqVar.a();
                        switch (a4) {
                            case 0:
                                idVar.c = true;
                                idVar.f4988b = R.string.subscription_renewing;
                                idVar.f4987a = Html.fromHtml(resources.getString(R.string.subscription_renews_on, a3));
                                break;
                            case 1:
                                idVar.c = true;
                                idVar.f4988b = R.string.subscription_trial;
                                idVar.f4987a = Html.fromHtml(resources.getString(R.string.subscription_charges_on, com.google.android.finsky.utils.aj.a(aqVar.d)));
                                break;
                            case 2:
                                idVar.c = true;
                                idVar.f4988b = R.string.subscription_renewing;
                                idVar.f4987a = null;
                                break;
                            case 3:
                                idVar.c = false;
                                idVar.f4988b = R.string.subscription_canceled;
                                idVar.f4987a = Html.fromHtml(resources.getString(R.string.subscription_expires_on, a3));
                                break;
                            case 4:
                                throw new UnsupportedOperationException("Unsupported subscription state: grace period");
                            default:
                                throw new IllegalStateException("Unknown subscription state: " + a4);
                        }
                        if (TextUtils.isEmpty(subscriptionView.m.f4987a)) {
                            subscriptionView.e.setVisibility(8);
                        } else {
                            subscriptionView.e.setVisibility(0);
                            subscriptionView.e.setText(subscriptionView.m.f4987a);
                        }
                        if (a2) {
                            subscriptionView.f.setVisibility(8);
                        } else {
                            subscriptionView.f.setVisibility(0);
                            subscriptionView.f.setText(subscriptionView.m.f4988b);
                        }
                        if (subscriptionView.m.c && !FinskyApp.a().e().a(12605447L)) {
                            subscriptionView.g.setVisibility(0);
                            com.google.android.finsky.layout.ei eiVar = new com.google.android.finsky.layout.ei(subscriptionView, document, cyVar, aqVar);
                            if (a2) {
                                subscriptionView.h.a(i, R.string.cancel_subscription_full, eiVar);
                                subscriptionView.a(subscriptionView.h);
                                subscriptionView.h.setVisibility(0);
                                subscriptionView.g.setVisibility(8);
                            } else {
                                subscriptionView.g.a(i, R.string.cancel_subscription, eiVar);
                                subscriptionView.a(subscriptionView.g);
                            }
                        } else {
                            subscriptionView.g.setVisibility(8);
                            subscriptionView.setNextFocusRightId(-1);
                        }
                        if (!TextUtils.isEmpty(document.u()) && !a2) {
                            subscriptionView.j.setText(document.u());
                            if (subscriptionView.n < 0) {
                                subscriptionView.n = com.google.android.finsky.utils.ax.a(bundle, document.f1963a.f3890a);
                            }
                            if (subscriptionView.n == 2) {
                                subscriptionView.a();
                            } else {
                                subscriptionView.b();
                            }
                            subscriptionView.setOnClickListener(new com.google.android.finsky.layout.ej(subscriptionView));
                        } else {
                            subscriptionView.j.setVisibility(8);
                            subscriptionView.l.setVisibility(8);
                            subscriptionView.k.setVisibility(8);
                        }
                        subscriptionsModuleLayout.addView(subscriptionView);
                    }
                    i2 = i3 + 1;
                } else {
                    if (a2 && subscriptionView != null) {
                        subscriptionView.i.setVisibility(0);
                        subscriptionView.i.a(i, R.string.manage_subscriptions, new com.google.android.finsky.layout.ek(subscriptionView, bVar, cyVar));
                        FinskyApp.a().h().a(1840, cyVar);
                    }
                    ((ej) this.f2559b).f2645b.clear();
                    this.f2640a = false;
                    return;
                }
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void b(View view) {
        SubscriptionsModuleLayout subscriptionsModuleLayout = (SubscriptionsModuleLayout) view;
        Bundle bundle = ((ej) this.f2559b).f2645b;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= subscriptionsModuleLayout.getChildCount()) {
                return;
            }
            View childAt = subscriptionsModuleLayout.getChildAt(i2);
            if (childAt instanceof SubscriptionView) {
                SubscriptionView subscriptionView = (SubscriptionView) childAt;
                String str = subscriptionView.f3093a.f1963a.f3890a;
                if (!TextUtils.isEmpty(str)) {
                    com.google.android.finsky.utils.ax.a(bundle, str, subscriptionView.n);
                }
            }
            i = i2 + 1;
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        this.m.b(this);
        this.u = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (W_()) {
            this.f2640a = true;
            this.d.a((bd) this, true);
        } else {
            this.d.a(this);
        }
    }

    private void g() {
        Document document = ((ej) this.f2559b).f2644a;
        if (document.f1963a.e == 1) {
            if ("com.google.android.music".equals(document.f1963a.c)) {
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                for (com.google.android.finsky.gpkg.aq aqVar : ((com.google.android.finsky.gpkg.at) this.m.a(this.f.b()).j(com.google.android.finsky.gpkg.a.a(2))).b()) {
                    String str = aqVar.j;
                    hashMap.put(str, aqVar);
                    arrayList.add(com.google.android.finsky.utils.as.a(aqVar.k, str));
                }
                a(arrayList, hashMap);
                return;
            }
            Document document2 = ((ej) this.f2559b).f2644a;
            HashMap hashMap2 = new HashMap();
            com.google.android.finsky.gpkg.a a2 = this.m.a(this.f.b());
            for (com.google.android.finsky.gpkg.a aVar : this.m.e()) {
                if (aVar != a2) {
                    a(document2, aVar, hashMap2);
                }
            }
            a(document2, a2, hashMap2);
            a(com.google.android.finsky.utils.cz.a(hashMap2.keySet()), hashMap2);
            return;
        }
        if (document.f1963a.g != 6) {
            return;
        }
        Document document3 = ((ej) this.f2559b).f2644a;
        ((ej) this.f2559b).d.clear();
        ((ej) this.f2559b).e.clear();
        if (!document3.aM()) {
            return;
        }
        Account b2 = this.f.b();
        for (Document document4 : document3.aN()) {
            com.google.android.finsky.gpkg.aq h = this.m.a(b2).h(document4.f1963a.c);
            if (h != null) {
                ((ej) this.f2559b).d.add(document4);
                ((ej) this.f2559b).e.add(h);
            }
        }
        ((ej) this.f2559b).c = true;
        e();
    }

    private void a(List<String> list, Map<String, com.google.android.finsky.gpkg.aq> map) {
        if (!list.isEmpty()) {
            this.f.a(list, (int[]) null, false, (com.android.volley.t<ga>) new eh(this, map), (com.android.volley.s) new ei(this));
        }
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void M_() {
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void L_() {
        g();
    }

    @Override // com.google.android.finsky.layout.el
    public final void a(Document document, com.google.android.finsky.gpkg.aq aqVar) {
        com.google.android.finsky.utils.z.a(this.j.B, document, aqVar);
    }

    private static void a(Document document, com.google.android.finsky.gpkg.a aVar, Map<String, com.google.android.finsky.gpkg.aq> map) {
        for (com.google.android.finsky.gpkg.u uVar : aVar.g(document.f1963a.c)) {
            map.put(uVar.j, uVar);
        }
    }
}
