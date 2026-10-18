package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class lc implements lz {

    /* renamed from: a, reason: collision with root package name */
    final ma f6125a;

    /* renamed from: b, reason: collision with root package name */
    final Lock f6126b;
    final Context c;
    qe d;
    boolean e;
    boolean f;
    com.google.android.gms.common.internal.ad g;
    boolean h;
    boolean i;
    private final com.google.android.gms.common.b j;
    private ConnectionResult k;
    private int l;
    private int o;
    private int r;
    private final com.google.android.gms.common.internal.h s;
    private final Map<com.google.android.gms.common.api.a<?>, Integer> t;
    private final com.google.android.gms.common.api.f<? extends qe, qg> u;
    private int m = 0;
    private boolean n = false;
    private final Bundle p = new Bundle();
    private final Set<com.google.android.gms.common.api.h> q = new HashSet();
    private ArrayList<Future<?>> v = new ArrayList<>();

    public lc(ma maVar, com.google.android.gms.common.internal.h hVar, Map<com.google.android.gms.common.api.a<?>, Integer> map, com.google.android.gms.common.b bVar, com.google.android.gms.common.api.f<? extends qe, qg> fVar, Lock lock, Context context) {
        this.f6125a = maVar;
        this.s = hVar;
        this.t = map;
        this.j = bVar;
        this.u = fVar;
        this.f6126b = lock;
        this.c = context;
    }

    private void a(boolean z) {
        if (this.d != null) {
            if (this.d.g() && z) {
                this.d.a();
            }
            this.d.b();
            this.g = null;
        }
    }

    private static String c(int i) {
        switch (i) {
            case 0:
                return "STEP_GETTING_SERVICE_BINDINGS";
            case 1:
                return "STEP_VALIDATING_ACCOUNT";
            case 2:
                return "STEP_AUTHENTICATING";
            case 3:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    private void k() {
        Iterator<Future<?>> it = this.v.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
        this.v.clear();
    }

    @Override // com.google.android.gms.internal.lz
    public final <A extends com.google.android.gms.common.api.g, R extends com.google.android.gms.common.api.x, T extends kr<R, A>> T a(T t) {
        this.f6125a.m.f6146b.add(t);
        return t;
    }

    @Override // com.google.android.gms.internal.lz
    public final void a(int i) {
        b(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.internal.lz
    public final void a(Bundle bundle) {
        if (b(3)) {
            if (bundle != null) {
                this.p.putAll(bundle);
            }
            if (d()) {
                j();
            }
        }
    }

    @Override // com.google.android.gms.internal.lz
    public final void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, int i) {
        if (b(3)) {
            b(connectionResult, aVar, i);
            if (d()) {
                j();
            }
        }
    }

    final boolean a(ConnectionResult connectionResult) {
        if (this.r != 2) {
            return this.r == 1 && !connectionResult.a();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.lz
    public final <A extends com.google.android.gms.common.api.g, T extends kr<? extends com.google.android.gms.common.api.x, A>> T b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.internal.lz
    public final void b() {
        Iterator<kr<?, ?>> it = this.f6125a.m.f6146b.iterator();
        while (it.hasNext()) {
            it.next().g();
            it.remove();
        }
        if (this.k == null && !this.f6125a.m.f6146b.isEmpty()) {
            this.n = true;
            return;
        }
        k();
        a(true);
        this.f6125a.a((ConnectionResult) null);
    }

    final void b(ConnectionResult connectionResult) {
        k();
        a(!connectionResult.a());
        this.f6125a.a(connectionResult);
        if (!this.n) {
            this.f6125a.n.a(connectionResult);
        }
        this.n = false;
    }

    final boolean b(int i) {
        if (this.m == i) {
            return true;
        }
        Log.i("GoogleApiClientConnecting", this.f6125a.m.j());
        Log.wtf("GoogleApiClientConnecting", "GoogleApiClient connecting is in step " + c(this.m) + " but received callback for step " + c(i), new Exception());
        b(new ConnectionResult(8, null));
        return false;
    }

    @Override // com.google.android.gms.internal.lz
    public final void c() {
        this.n = false;
    }

    final boolean d() {
        this.o--;
        if (this.o > 0) {
            return false;
        }
        if (this.o < 0) {
            Log.i("GoogleApiClientConnecting", this.f6125a.m.j());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            b(new ConnectionResult(8, null));
            return false;
        }
        if (this.k == null) {
            return true;
        }
        this.f6125a.l = this.l;
        b(this.k);
        return false;
    }

    final void f() {
        this.m = 2;
        this.f6125a.m.e = i();
        this.v.add(md.a().submit(new li(this, (byte) 0)));
    }

    final void g() {
        ArrayList arrayList = new ArrayList();
        this.m = 3;
        this.o = this.f6125a.f.size();
        for (com.google.android.gms.common.api.h<?> hVar : this.f6125a.f.keySet()) {
            if (!this.f6125a.g.containsKey(hVar)) {
                arrayList.add(this.f6125a.f.get(hVar));
            } else if (d()) {
                j();
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.v.add(md.a().submit(new lm(this, arrayList)));
    }

    final void h() {
        this.e = false;
        this.f6125a.m.e = Collections.emptySet();
        for (com.google.android.gms.common.api.h<?> hVar : this.q) {
            if (!this.f6125a.g.containsKey(hVar)) {
                this.f6125a.g.put(hVar, new ConnectionResult(17, null));
            }
        }
    }

    @Override // com.google.android.gms.internal.lz
    public final void a() {
        byte b2 = 0;
        this.f6125a.g.clear();
        this.n = false;
        this.e = false;
        this.k = null;
        this.m = 0;
        this.r = 2;
        this.f = false;
        this.h = false;
        HashMap hashMap = new HashMap();
        for (com.google.android.gms.common.api.a<?> aVar : this.t.keySet()) {
            com.google.android.gms.common.api.g gVar = this.f6125a.f.get(aVar.b());
            int intValue = this.t.get(aVar).intValue();
            aVar.a();
            if (gVar.h()) {
                this.e = true;
                if (intValue < this.r) {
                    this.r = intValue;
                }
                if (intValue != 0) {
                    this.q.add(aVar.b());
                }
            }
            hashMap.put(gVar, new lj(this, aVar, intValue));
        }
        if (this.e) {
            this.s.h = Integer.valueOf(System.identityHashCode(this.f6125a.m));
            ln lnVar = new ln(this, b2);
            this.d = this.u.a(this.c, this.f6125a.m.f6145a, this.s, this.s.g, lnVar, lnVar);
        }
        this.o = this.f6125a.f.size();
        this.v.add(md.a().submit(new lk(this, hashMap)));
    }

    final void e() {
        if (this.o != 0) {
            return;
        }
        if (!this.e) {
            g();
            return;
        }
        if (this.f) {
            ArrayList arrayList = new ArrayList();
            this.m = 1;
            this.o = this.f6125a.f.size();
            for (com.google.android.gms.common.api.h<?> hVar : this.f6125a.f.keySet()) {
                if (!this.f6125a.g.containsKey(hVar)) {
                    arrayList.add(this.f6125a.f.get(hVar));
                } else if (d()) {
                    f();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.v.add(md.a().submit(new lo(this, arrayList)));
        }
    }

    private void j() {
        ma maVar = this.f6125a;
        maVar.f6154a.lock();
        try {
            maVar.m.i();
            maVar.k = new la(maVar);
            maVar.k.a();
            maVar.f6155b.signalAll();
            maVar.f6154a.unlock();
            md.a().execute(new ld(this));
            if (this.d != null) {
                if (this.h) {
                    this.d.a(this.g, this.i);
                }
                a(false);
            }
            Iterator<com.google.android.gms.common.api.h<?>> it = this.f6125a.g.keySet().iterator();
            while (it.hasNext()) {
                this.f6125a.f.get(it.next()).b();
            }
            this.f6125a.n.a(this.p.isEmpty() ? null : this.p);
            if (this.n) {
                this.n = false;
                b();
            }
        } catch (Throwable th) {
            maVar.f6154a.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x001d, code lost:
    
        if (Integer.MAX_VALUE >= r5.l) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if ((r6.a() ? true : com.google.android.gms.common.b.a(null, r6.c, null) != null) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void b(com.google.android.gms.common.ConnectionResult r6, com.google.android.gms.common.api.a<?> r7, int r8) {
        /*
            r5 = this;
            r4 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r0 = 1
            r2 = 2
            if (r8 == r2) goto L25
            r7.a()
            if (r8 != r0) goto L17
            boolean r2 = r6.a()
            if (r2 == 0) goto L31
            r2 = r0
        L15:
            if (r2 == 0) goto L3d
        L17:
            com.google.android.gms.common.ConnectionResult r2 = r5.k
            if (r2 == 0) goto L1f
            int r2 = r5.l
            if (r3 >= r2) goto L3d
        L1f:
            if (r0 == 0) goto L25
            r5.k = r6
            r5.l = r3
        L25:
            com.google.android.gms.internal.ma r0 = r5.f6125a
            java.util.Map<com.google.android.gms.common.api.h<?>, com.google.android.gms.common.ConnectionResult> r0 = r0.g
            com.google.android.gms.common.api.h r1 = r7.b()
            r0.put(r1, r6)
            return
        L31:
            int r2 = r6.c
            android.content.Intent r2 = com.google.android.gms.common.b.a(r4, r2, r4)
            if (r2 == 0) goto L3b
            r2 = r0
            goto L15
        L3b:
            r2 = r1
            goto L15
        L3d:
            r0 = r1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.lc.b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, int):void");
    }

    final Set<Scope> i() {
        if (this.s == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.s.f5711b);
        Map<com.google.android.gms.common.api.a<?>, com.google.android.gms.common.internal.i> map = this.s.d;
        for (com.google.android.gms.common.api.a<?> aVar : map.keySet()) {
            if (!this.f6125a.g.containsKey(aVar.b())) {
                hashSet.addAll(map.get(aVar).f5712a);
            }
        }
        return hashSet;
    }
}
