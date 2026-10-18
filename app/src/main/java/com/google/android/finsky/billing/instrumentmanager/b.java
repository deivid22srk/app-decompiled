package com.google.android.finsky.billing.instrumentmanager;

import com.google.android.finsky.apkg.ac;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.apkg.aq;
import com.google.android.finsky.apkg.i;
import com.google.android.finsky.apkg.s;
import com.google.android.finsky.apkg.z;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.cz;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;
import com.google.android.wallet.analytics.f;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements com.google.android.wallet.common.pub.apkg.b {

    /* renamed from: a, reason: collision with root package name */
    private final cy f2267a;

    /* renamed from: b, reason: collision with root package name */
    private final i f2268b;

    public b(cy cyVar, i iVar) {
        this.f2267a = cyVar;
        this.f2268b = iVar;
        if (cyVar == null) {
            throw new IllegalArgumentException("node cannot be null");
        }
    }

    @Override // com.google.android.wallet.common.pub.apkg.b
    public final void a(com.google.android.wallet.analytics.apkg.a aVar) {
        i iVar = this.f2268b;
        com.google.android.finsky.apkg.b a2 = new com.google.android.finsky.apkg.b(aVar.f7236a).c(aVar.c).a(aVar.e).b(aVar.d).a(aVar.f7237b);
        if (aVar.f > 0) {
            a2.c(aVar.f);
        }
        if (aVar.i != null && aVar.i.length > 0) {
            a2.a(aVar.i);
        }
        CreditCardEntryAction creditCardEntryAction = aVar.g;
        if (creditCardEntryAction != null) {
            s sVar = new s();
            sVar.f1500a = creditCardEntryAction.f7232a;
            sVar.f1501b = true;
            sVar.c = creditCardEntryAction.f7233b;
            sVar.d = true;
            sVar.e = creditCardEntryAction.c;
            sVar.f = true;
            sVar.g = creditCardEntryAction.d;
            sVar.h = true;
            sVar.i = creditCardEntryAction.e;
            sVar.j = true;
            sVar.k = creditCardEntryAction.f;
            sVar.l = true;
            sVar.m = creditCardEntryAction.g;
            sVar.n = true;
            sVar.o = creditCardEntryAction.h;
            sVar.p = true;
            sVar.q = creditCardEntryAction.i;
            sVar.r = true;
            sVar.s = creditCardEntryAction.j;
            sVar.t = true;
            sVar.u = creditCardEntryAction.k;
            sVar.v = true;
            sVar.w = creditCardEntryAction.l;
            sVar.x = true;
            sVar.y = creditCardEntryAction.m;
            sVar.z = true;
            sVar.A = creditCardEntryAction.n;
            sVar.B = true;
            sVar.C = creditCardEntryAction.o;
            sVar.D = true;
            sVar.E = creditCardEntryAction.p;
            sVar.F = true;
            sVar.G = creditCardEntryAction.q;
            sVar.H = true;
            sVar.I = creditCardEntryAction.r;
            sVar.J = true;
            sVar.K = creditCardEntryAction.s;
            sVar.L = true;
            sVar.M = creditCardEntryAction.u;
            sVar.N = true;
            sVar.O = creditCardEntryAction.t;
            sVar.P = true;
            sVar.Q = creditCardEntryAction.v;
            sVar.R = true;
            sVar.S = creditCardEntryAction.w;
            sVar.T = true;
            sVar.U = creditCardEntryAction.x;
            sVar.V = true;
            sVar.W = creditCardEntryAction.y;
            sVar.X = true;
            a2.f1473a.Q = sVar;
        }
        WebViewPageLoadEvent webViewPageLoadEvent = aVar.h;
        if (webViewPageLoadEvent != null) {
            aq aqVar = new aq();
            aqVar.f1469a = webViewPageLoadEvent.f7234a;
            aqVar.f1470b = true;
            aqVar.c = webViewPageLoadEvent.f7235b;
            aqVar.d = true;
            aqVar.e = webViewPageLoadEvent.c;
            aqVar.f = true;
            a2.f1473a.T = aqVar;
        }
        iVar.b(a2.f1473a);
    }

    @Override // com.google.android.wallet.common.pub.apkg.b
    public final void a(com.google.android.wallet.common.pub.apkg.apkg.a aVar) {
        i iVar = this.f2268b;
        int size = aVar.f7287a.size();
        if (size == 0) {
            throw new IllegalArgumentException("Click path must have at least one item");
        }
        ArrayList a2 = cz.a(size + 1);
        for (int i = 0; i < size; i++) {
            a2.add(b(aVar.f7287a.get(i)));
        }
        cy cyVar = this.f2267a;
        do {
            a2.add(i.a(cyVar.getPlayStoreUiElement()));
            cyVar = cyVar.getParentNode();
        } while (cyVar != null);
        z c = i.c();
        c.f1513a = (ai[]) a2.toArray(new ai[a2.size()]);
        iVar.a(c);
    }

    @Override // com.google.android.wallet.common.pub.apkg.b
    public final void a(com.google.android.wallet.common.pub.apkg.apkg.b bVar) {
        i iVar = this.f2268b;
        ArrayList arrayList = new ArrayList();
        for (cy cyVar = this.f2267a; cyVar != null; cyVar = cyVar.getParentNode()) {
            arrayList.add(cyVar.getPlayStoreUiElement());
        }
        ai a2 = i.a(arrayList);
        ai aiVar = a2;
        while (aiVar.f != null && aiVar.f.length != 0) {
            aiVar = aiVar.f[0];
        }
        if (aiVar.f1453a != this.f2267a.getPlayStoreUiElement().f1453a) {
            throw new IllegalStateException("Unexpected types in tree: " + aiVar.f1453a + " and " + this.f2267a.getPlayStoreUiElement().f1453a);
        }
        aiVar.f = new ai[]{a(bVar.f7288a)};
        ac d = i.d();
        d.f1441a = a2;
        iVar.a(d);
    }

    private ai a(f fVar) {
        ai b2 = b(fVar);
        if (fVar.c != null && !fVar.c.isEmpty()) {
            int size = fVar.c.size();
            b2.f = new ai[size];
            for (int i = 0; i < size; i++) {
                b2.f[i] = a(fVar.c.get(i));
            }
        }
        return b2;
    }

    private static ai b(f fVar) {
        ai a2 = i.a(fVar.f7240a);
        if (fVar.f7241b != null && fVar.f7241b.length > 0) {
            a2.c = fVar.f7241b;
            a2.d = true;
        }
        return a2;
    }
}
