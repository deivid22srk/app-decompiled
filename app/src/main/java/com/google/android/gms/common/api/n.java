package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.internal.kv;
import com.google.android.gms.internal.lr;
import com.google.android.gms.internal.mk;
import com.google.android.gms.internal.ml;
import com.google.android.gms.internal.pz;
import com.google.android.gms.internal.qe;
import com.google.android.gms.internal.qg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    android.support.v4.app.t f5579a;

    /* renamed from: b, reason: collision with root package name */
    private Account f5580b;
    private final Set<Scope> c;
    private final Set<Scope> d;
    private int e;
    private View f;
    private String g;
    private String h;
    private final Map<a<?>, com.google.android.gms.common.internal.i> i;
    private final Context j;
    private final Map<a<?>, b> k;
    private int l;
    private q m;
    private Looper n;
    private com.google.android.gms.common.b o;
    private f<? extends qe, qg> p;
    private final ArrayList<p> q;
    private final ArrayList<q> r;
    private qg s;

    public n(Context context) {
        this.c = new HashSet();
        this.d = new HashSet();
        this.i = new android.support.v4.h.a();
        this.k = new android.support.v4.h.a();
        this.l = -1;
        this.o = com.google.android.gms.common.b.a();
        this.p = pz.c;
        this.q = new ArrayList<>();
        this.r = new ArrayList<>();
        this.j = context;
        this.n = context.getMainLooper();
        this.g = context.getPackageName();
        this.h = context.getClass().getName();
    }

    public n(Context context, p pVar, q qVar) {
        this(context);
        av.a(pVar, "Must provide a connected listener");
        this.q.add(pVar);
        av.a(qVar, "Must provide a connection failed listener");
        this.r.add(qVar);
    }

    public final n a(p pVar) {
        av.a(pVar, "Listener must not be null");
        this.q.add(pVar);
        return this;
    }

    public final n a(q qVar) {
        av.a(qVar, "Listener must not be null");
        this.r.add(qVar);
        return this;
    }

    public final com.google.android.gms.common.internal.h a() {
        if (this.k.containsKey(pz.g)) {
            av.a(this.s == null, "SignIn.API can't be used in conjunction with requestServerAuthCode.");
            this.s = (qg) this.k.get(pz.g);
        }
        return new com.google.android.gms.common.internal.h(this.f5580b, this.c, this.i, this.e, this.f, this.g, this.h, this.s != null ? this.s : qg.f6244a);
    }

    public final n a(a<? extends d> aVar) {
        av.a(aVar, "Api must not be null");
        this.k.put(aVar, null);
        aVar.a();
        List emptyList = Collections.emptyList();
        this.d.addAll(emptyList);
        this.c.addAll(emptyList);
        return this;
    }

    public final <O extends c> n a(a<O> aVar, O o) {
        av.a(aVar, "Api must not be null");
        av.a(o, "Null options are not permitted for this Api");
        this.k.put(aVar, o);
        aVar.a();
        List emptyList = Collections.emptyList();
        this.d.addAll(emptyList);
        this.c.addAll(emptyList);
        return this;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [com.google.android.gms.common.api.i] */
    public final m b() {
        Set set;
        Set set2;
        Object a2;
        av.b(!this.k.isEmpty(), "must call addApi() to add at least one API");
        com.google.android.gms.common.internal.h a3 = a();
        Map<a<?>, com.google.android.gms.common.internal.i> map = a3.d;
        android.support.v4.h.a aVar = new android.support.v4.h.a();
        android.support.v4.h.a aVar2 = new android.support.v4.h.a();
        ArrayList arrayList = new ArrayList();
        for (a<?> aVar3 : this.k.keySet()) {
            b bVar = this.k.get(aVar3);
            int i = map.get(aVar3) != null ? map.get(aVar3).f5713b ? 1 : 2 : 0;
            aVar.put(aVar3, Integer.valueOf(i));
            kv kvVar = new kv(aVar3, i);
            arrayList.add(kvVar);
            if (aVar3.f5575b != null) {
                av.a(aVar3.f5574a != null, "This API was constructed with a ClientBuilder. Use getClientBuilder");
                j<?, ?> jVar = aVar3.f5574a;
                a2 = new com.google.android.gms.common.internal.c(this.j, this.n, jVar.b(), kvVar, kvVar, a3, jVar.a());
            } else {
                a2 = aVar3.a().a(this.j, this.n, a3, bVar, kvVar, kvVar);
            }
            aVar2.put(aVar3.b(), a2);
        }
        lr lrVar = new lr(this.j, new ReentrantLock(), this.n, a3, this.o, this.p, aVar, this.q, this.r, aVar2, this.l, lr.a((Iterable<g>) aVar2.values()), arrayList);
        set = com.google.android.gms.common.api.m.f5578a;
        synchronized (set) {
            set2 = com.google.android.gms.common.api.m.f5578a;
            set2.add(lrVar);
        }
        if (this.l >= 0) {
            mk a4 = mk.a(this.f5579a);
            if (a4 == null) {
                new Handler(this.j.getMainLooper()).post(new o(this, lrVar));
            } else {
                a(a4, lrVar);
            }
        }
        return lrVar;
    }

    final void a(mk mkVar, m mVar) {
        int i = this.l;
        q qVar = this.m;
        av.a(mVar, "GoogleApiClient instance cannot be null");
        av.a(mkVar.c.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        mkVar.c.put(i, new ml(mkVar, i, mVar, qVar));
        if (!mkVar.f6163a || mkVar.f6164b) {
            return;
        }
        mVar.b();
    }
}
