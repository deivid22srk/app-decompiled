package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class ma implements mf {

    /* renamed from: a, reason: collision with root package name */
    final Lock f6154a;

    /* renamed from: b, reason: collision with root package name */
    final Condition f6155b;
    final Context c;
    final com.google.android.gms.common.b d;
    final mc e;
    final Map<com.google.android.gms.common.api.h<?>, com.google.android.gms.common.api.g> f;
    final com.google.android.gms.common.internal.h h;
    final Map<com.google.android.gms.common.api.a<?>, Integer> i;
    final com.google.android.gms.common.api.f<? extends qe, qg> j;
    volatile lz k;
    int l;
    final lr m;
    final mg n;
    final Map<com.google.android.gms.common.api.h<?>, ConnectionResult> g = new HashMap();
    private ConnectionResult o = null;

    @Override // com.google.android.gms.internal.mf
    public final ConnectionResult a(long j, TimeUnit timeUnit) {
        a();
        long nanos = timeUnit.toNanos(j);
        while (e()) {
            if (nanos <= 0) {
                return new ConnectionResult(14, null);
            }
            try {
                nanos = this.f6155b.awaitNanos(nanos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        return d() ? ConnectionResult.f5556a : this.o != null ? this.o : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.internal.mf
    public final <A extends com.google.android.gms.common.api.g, R extends com.google.android.gms.common.api.x, T extends kr<R, A>> T a(T t) {
        return (T) this.k.a((lz) t);
    }

    @Override // com.google.android.gms.internal.mf
    public final void a() {
        this.k.c();
    }

    public final void a(int i) {
        this.f6154a.lock();
        try {
            this.k.a(i);
        } finally {
            this.f6154a.unlock();
        }
    }

    final void a(ConnectionResult connectionResult) {
        this.f6154a.lock();
        try {
            this.o = connectionResult;
            this.k = new lq(this);
            this.k.a();
            this.f6155b.signalAll();
        } finally {
            this.f6154a.unlock();
        }
    }

    final void a(mb mbVar) {
        this.e.sendMessage(this.e.obtainMessage(1, mbVar));
    }

    @Override // com.google.android.gms.internal.mf
    public final ConnectionResult b() {
        a();
        while (e()) {
            try {
                this.f6155b.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return d() ? ConnectionResult.f5556a : this.o != null ? this.o : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.internal.mf
    public final <A extends com.google.android.gms.common.api.g, T extends kr<? extends com.google.android.gms.common.api.x, A>> T b(T t) {
        return (T) this.k.b(t);
    }

    @Override // com.google.android.gms.internal.mf
    public final void c() {
        this.g.clear();
        this.k.b();
    }

    @Override // com.google.android.gms.internal.mf
    public final boolean d() {
        return this.k instanceof la;
    }

    @Override // com.google.android.gms.internal.mf
    public final boolean e() {
        return this.k instanceof lc;
    }

    public ma(Context context, lr lrVar, Lock lock, Looper looper, com.google.android.gms.common.b bVar, Map<com.google.android.gms.common.api.h<?>, com.google.android.gms.common.api.g> map, com.google.android.gms.common.internal.h hVar, Map<com.google.android.gms.common.api.a<?>, Integer> map2, com.google.android.gms.common.api.f<? extends qe, qg> fVar, ArrayList<kv> arrayList, mg mgVar) {
        this.c = context;
        this.f6154a = lock;
        this.d = bVar;
        this.f = map;
        this.h = hVar;
        this.i = map2;
        this.j = fVar;
        this.m = lrVar;
        this.n = mgVar;
        Iterator<kv> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f6118b = this;
        }
        this.e = new mc(this, looper);
        this.f6155b = lock.newCondition();
        this.k = new lq(this);
    }

    @Override // com.google.android.gms.internal.mf
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "  ";
        for (com.google.android.gms.common.api.a<?> aVar : this.i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) aVar.c).println(":");
            this.f.get(aVar.b()).a(str2, printWriter);
        }
    }
}
