package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class lr extends com.google.android.gms.common.api.m implements mg {

    /* renamed from: a, reason: collision with root package name */
    final Looper f6145a;
    lw c;
    final Map<com.google.android.gms.common.api.h<?>, com.google.android.gms.common.api.g> d;
    final com.google.android.gms.common.internal.h f;
    final Map<com.google.android.gms.common.api.a<?>, Integer> g;
    final com.google.android.gms.common.api.f<? extends qe, qg> h;
    private final Lock j;
    private final com.google.android.gms.common.internal.v k;
    private final int m;
    private final Context n;
    private volatile boolean o;
    private final lu r;
    private final com.google.android.gms.common.b s;
    public com.google.android.gms.common.api.aa u;
    private final ArrayList<kv> v;
    private Integer w;
    private mf l = null;

    /* renamed from: b, reason: collision with root package name */
    final Queue<kr<?, ?>> f6146b = new LinkedList();
    private long p = 120000;
    private long q = 5000;
    Set<Scope> e = new HashSet();
    private final Set<mh<?>> t = Collections.newSetFromMap(new WeakHashMap());
    final Set<ly<?>> i = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75f, 2));
    private final lx x = new ls(this);
    private final com.google.android.gms.common.internal.w y = new lt(this);

    public lr(Context context, Lock lock, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.b bVar, com.google.android.gms.common.api.f<? extends qe, qg> fVar, Map<com.google.android.gms.common.api.a<?>, Integer> map, List<com.google.android.gms.common.api.p> list, List<com.google.android.gms.common.api.q> list2, Map<com.google.android.gms.common.api.h<?>, com.google.android.gms.common.api.g> map2, int i, int i2, ArrayList<kv> arrayList) {
        this.w = null;
        this.n = context;
        this.j = lock;
        this.k = new com.google.android.gms.common.internal.v(looper, this.y);
        this.f6145a = looper;
        this.r = new lu(this, looper);
        this.s = bVar;
        this.m = i;
        if (this.m >= 0) {
            this.w = Integer.valueOf(i2);
        }
        this.g = map;
        this.d = map2;
        this.v = arrayList;
        Iterator<com.google.android.gms.common.api.p> it = list.iterator();
        while (it.hasNext()) {
            this.k.a(it.next());
        }
        Iterator<com.google.android.gms.common.api.q> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.k.a(it2.next());
        }
        this.f = hVar;
        this.h = fVar;
    }

    public static int a(Iterable<com.google.android.gms.common.api.g> iterable) {
        boolean z;
        boolean z2 = false;
        Iterator<com.google.android.gms.common.api.g> it = iterable.iterator();
        while (true) {
            z = z2;
            if (!it.hasNext()) {
                break;
            }
            z2 = it.next().h() ? true : z;
        }
        return z ? 1 : 3;
    }

    private void b(int i) {
        boolean z;
        if (this.w == null) {
            this.w = Integer.valueOf(i);
        } else if (this.w.intValue() != i) {
            throw new IllegalStateException("Cannot use sign-in mode: " + c(i) + ". Mode was already set to " + c(this.w.intValue()));
        }
        if (this.l != null) {
            return;
        }
        boolean z2 = false;
        Iterator<com.google.android.gms.common.api.g> it = this.d.values().iterator();
        while (true) {
            z = z2;
            if (!it.hasNext()) {
                break;
            } else {
                z2 = it.next().h() ? true : z;
            }
        }
        switch (this.w.intValue()) {
            case 1:
                if (!z) {
                    throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                }
                break;
            case 2:
                if (z) {
                    this.l = new kw(this.n, this, this.j, this.f6145a, this.s, this.d, this.f, this.g, this.h, this.v);
                    return;
                }
                break;
        }
        this.l = new ma(this.n, this, this.j, this.f6145a, this.s, this.d, this.f, this.g, this.h, this.v, this);
    }

    private static String c(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final Looper a() {
        return this.f6145a;
    }

    @Override // com.google.android.gms.common.api.m
    public final <C extends com.google.android.gms.common.api.g> C a(com.google.android.gms.common.api.h<C> hVar) {
        C c = (C) this.d.get(hVar);
        com.google.android.gms.common.internal.av.a(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.m
    public final void a(com.google.android.gms.common.api.p pVar) {
        this.k.a(pVar);
    }

    @Override // com.google.android.gms.common.api.m
    public final void a(com.google.android.gms.common.api.q qVar) {
        this.k.a(qVar);
    }

    final <A extends com.google.android.gms.common.api.g> void a(ly<A> lyVar) {
        this.i.add(lyVar);
        lyVar.a(this.x);
    }

    @Override // com.google.android.gms.common.api.m
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.n);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.o);
        printWriter.append(" mWorkQueue.size()=").print(this.f6146b.size());
        printWriter.append(" mUnconsumedRunners.size()=").println(this.i.size());
        if (this.l != null) {
            this.l.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final boolean e() {
        return this.l != null && this.l.d();
    }

    @Override // com.google.android.gms.common.api.m
    public final boolean f() {
        return this.l != null && this.l.e();
    }

    final void h() {
        for (kr<?, ?> krVar : this.f6146b) {
            krVar.a((lx) null);
            krVar.g();
        }
        this.f6146b.clear();
    }

    final String j() {
        StringWriter stringWriter = new StringWriter();
        a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.common.api.m
    public final <A extends com.google.android.gms.common.api.g, R extends com.google.android.gms.common.api.x, T extends kr<R, A>> T a(T t) {
        com.google.android.gms.common.internal.av.b(t.e != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        com.google.android.gms.common.internal.av.b(this.d.containsKey(t.e), "GoogleApiClient is not configured to use the API required for this call.");
        this.j.lock();
        try {
            if (this.l == null) {
                this.f6146b.add(t);
            } else {
                t = (T) this.l.a(t);
            }
            return t;
        } finally {
            this.j.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final <A extends com.google.android.gms.common.api.g, T extends kr<? extends com.google.android.gms.common.api.x, A>> T b(T t) {
        com.google.android.gms.common.internal.av.b(t.e != null, "This task can not be executed (it's probably a Batch or malformed)");
        this.j.lock();
        try {
            if (this.l == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.o) {
                this.f6146b.add(t);
                while (!this.f6146b.isEmpty()) {
                    kr<?, ?> remove = this.f6146b.remove();
                    a((ly) remove);
                    remove.b(Status.c);
                }
            } else {
                t = (T) this.l.b(t);
            }
            return t;
        } finally {
            this.j.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final void b() {
        this.j.lock();
        try {
            if (this.m >= 0) {
                com.google.android.gms.common.internal.av.a(this.w != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.w == null) {
                this.w = Integer.valueOf(a(this.d.values()));
            } else if (this.w.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            int intValue = this.w.intValue();
            this.j.lock();
            com.google.android.gms.common.internal.av.b(intValue == 3 || intValue == 1 || intValue == 2, "Illegal sign-in mode: " + intValue);
            b(intValue);
            k();
            this.j.unlock();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.j.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final ConnectionResult c() {
        com.google.android.gms.common.internal.av.a(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.j.lock();
        try {
            if (this.m >= 0) {
                com.google.android.gms.common.internal.av.a(this.w != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.w == null) {
                this.w = Integer.valueOf(a(this.d.values()));
            } else if (this.w.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            b(this.w.intValue());
            this.k.e = true;
            return this.l.b();
        } finally {
            this.j.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final ConnectionResult a(long j, TimeUnit timeUnit) {
        com.google.android.gms.common.internal.av.a(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        com.google.android.gms.common.internal.av.a(timeUnit, "TimeUnit must not be null");
        this.j.lock();
        try {
            if (this.w == null) {
                this.w = Integer.valueOf(a(this.d.values()));
            } else if (this.w.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            b(this.w.intValue());
            this.k.e = true;
            return this.l.a(j, timeUnit);
        } finally {
            this.j.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final void d() {
        this.j.lock();
        try {
            for (ly<?> lyVar : this.i) {
                lyVar.a(null);
                if (lyVar.b() == null) {
                    lyVar.g();
                } else {
                    lyVar.d();
                    IBinder j = a(lyVar.c()).j();
                    com.google.android.gms.common.api.aa aaVar = this.u;
                    if (lyVar.f()) {
                        lyVar.a(new lv(lyVar, aaVar, j, (byte) 0));
                    } else if (j == null || !j.isBinderAlive()) {
                        lyVar.a(null);
                        lyVar.g();
                        lyVar.b().intValue();
                        aaVar.a();
                    } else {
                        lv lvVar = new lv(lyVar, aaVar, j, (byte) 0);
                        lyVar.a(lvVar);
                        try {
                            j.linkToDeath(lvVar, 0);
                        } catch (RemoteException e) {
                            lyVar.g();
                            lyVar.b().intValue();
                            aaVar.a();
                        }
                    }
                }
            }
            this.i.clear();
            Iterator<mh<?>> it = this.t.iterator();
            while (it.hasNext()) {
                it.next().f6160a = null;
            }
            this.t.clear();
            if (this.l == null) {
                h();
                return;
            }
            i();
            this.l.c();
            this.k.a();
        } finally {
            this.j.unlock();
        }
    }

    private void k() {
        this.k.e = true;
        this.l.a();
    }

    final boolean i() {
        if (!this.o) {
            return false;
        }
        this.o = false;
        this.r.removeMessages(2);
        this.r.removeMessages(1);
        if (this.c != null) {
            this.c.b();
            this.c = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.m
    public final void b(com.google.android.gms.common.api.p pVar) {
        com.google.android.gms.common.internal.v vVar = this.k;
        com.google.android.gms.common.internal.av.a(pVar);
        synchronized (vVar.i) {
            if (!vVar.f5729b.remove(pVar)) {
                Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + pVar + " not found");
            } else if (vVar.g) {
                vVar.c.add(pVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final void b(com.google.android.gms.common.api.q qVar) {
        com.google.android.gms.common.internal.v vVar = this.k;
        com.google.android.gms.common.internal.av.a(qVar);
        synchronized (vVar.i) {
            if (!vVar.d.remove(qVar)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + qVar + " not found");
            }
        }
    }

    @Override // com.google.android.gms.internal.mg
    public final void a(Bundle bundle) {
        while (!this.f6146b.isEmpty()) {
            b((lr) this.f6146b.remove());
        }
        com.google.android.gms.common.internal.v vVar = this.k;
        com.google.android.gms.common.internal.av.a(Looper.myLooper() == vVar.h.getLooper(), "onConnectionSuccess must only be called on the Handler thread");
        synchronized (vVar.i) {
            com.google.android.gms.common.internal.av.a(!vVar.g);
            vVar.h.removeMessages(1);
            vVar.g = true;
            com.google.android.gms.common.internal.av.a(vVar.c.size() == 0);
            ArrayList arrayList = new ArrayList(vVar.f5729b);
            int i = vVar.f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.p pVar = (com.google.android.gms.common.api.p) it.next();
                if (!vVar.e || !vVar.f5728a.g() || vVar.f.get() != i) {
                    break;
                } else if (!vVar.c.contains(pVar)) {
                    pVar.a(bundle);
                }
            }
            vVar.c.clear();
            vVar.g = false;
        }
    }

    @Override // com.google.android.gms.internal.mg
    public final void a(ConnectionResult connectionResult) {
        if (!com.google.android.gms.common.b.a(this.n, connectionResult.c)) {
            i();
        }
        if (this.o) {
            return;
        }
        com.google.android.gms.common.internal.v vVar = this.k;
        com.google.android.gms.common.internal.av.a(Looper.myLooper() == vVar.h.getLooper(), "onConnectionFailure must only be called on the Handler thread");
        vVar.h.removeMessages(1);
        synchronized (vVar.i) {
            ArrayList arrayList = new ArrayList(vVar.d);
            int i = vVar.f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.q qVar = (com.google.android.gms.common.api.q) it.next();
                if (!vVar.e || vVar.f.get() != i) {
                    break;
                } else if (vVar.d.contains(qVar)) {
                    qVar.a(connectionResult);
                }
            }
        }
        this.k.a();
    }

    @Override // com.google.android.gms.internal.mg
    public final void a(int i) {
        if (i == 1 && !this.o) {
            this.o = true;
            if (this.c == null) {
                this.c = (lw) me.b(this.n.getApplicationContext(), new lw(this));
            }
            this.r.sendMessageDelayed(this.r.obtainMessage(1), this.p);
            this.r.sendMessageDelayed(this.r.obtainMessage(2), this.q);
        }
        Iterator<ly<?>> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().c(new Status(8, "The connection to Google Play services was lost"));
        }
        com.google.android.gms.common.internal.v vVar = this.k;
        com.google.android.gms.common.internal.av.a(Looper.myLooper() == vVar.h.getLooper(), "onUnintentionalDisconnection must only be called on the Handler thread");
        vVar.h.removeMessages(1);
        synchronized (vVar.i) {
            vVar.g = true;
            ArrayList arrayList = new ArrayList(vVar.f5729b);
            int i2 = vVar.f.get();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.google.android.gms.common.api.p pVar = (com.google.android.gms.common.api.p) it2.next();
                if (!vVar.e || vVar.f.get() != i2) {
                    break;
                } else if (vVar.f5729b.contains(pVar)) {
                    pVar.a(i);
                }
            }
            vVar.c.clear();
            vVar.g = false;
        }
        this.k.a();
        if (i == 2) {
            k();
        }
    }

    static /* synthetic */ void b(lr lrVar) {
        lrVar.j.lock();
        try {
            if (lrVar.o) {
                lrVar.k();
            }
        } finally {
            lrVar.j.unlock();
        }
    }

    static /* synthetic */ void c(lr lrVar) {
        lrVar.j.lock();
        try {
            if (lrVar.i()) {
                lrVar.k();
            }
        } finally {
            lrVar.j.unlock();
        }
    }
}
