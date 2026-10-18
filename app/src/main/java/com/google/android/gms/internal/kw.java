package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class kw implements mf {

    /* renamed from: a, reason: collision with root package name */
    final ma f6119a;

    /* renamed from: b, reason: collision with root package name */
    final ma f6120b;
    Bundle c;
    final Lock f;
    private final Context g;
    private final lr h;
    private final Looper i;
    private final com.google.android.gms.common.api.g l;
    private final Map<com.google.android.gms.common.api.h<?>, ma> j = new android.support.v4.h.a();
    private final Set<Object> k = Collections.newSetFromMap(new WeakHashMap());
    ConnectionResult d = null;
    ConnectionResult e = null;
    private final AtomicInteger m = new AtomicInteger(0);
    private int n = 0;

    public kw(Context context, lr lrVar, Lock lock, Looper looper, com.google.android.gms.common.b bVar, Map<com.google.android.gms.common.api.h<?>, com.google.android.gms.common.api.g> map, com.google.android.gms.common.internal.h hVar, Map<com.google.android.gms.common.api.a<?>, Integer> map2, com.google.android.gms.common.api.f<? extends qe, qg> fVar, ArrayList<kv> arrayList) {
        this.g = context;
        this.h = lrVar;
        this.f = lock;
        this.i = looper;
        android.support.v4.h.a aVar = new android.support.v4.h.a();
        android.support.v4.h.a aVar2 = new android.support.v4.h.a();
        for (com.google.android.gms.common.api.h<?> hVar2 : map.keySet()) {
            com.google.android.gms.common.api.g gVar = map.get(hVar2);
            if (gVar.h()) {
                aVar.put(hVar2, gVar);
            } else {
                aVar2.put(hVar2, gVar);
            }
        }
        this.l = null;
        if (aVar.isEmpty()) {
            throw new IllegalStateException("CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        }
        android.support.v4.h.a aVar3 = new android.support.v4.h.a();
        android.support.v4.h.a aVar4 = new android.support.v4.h.a();
        for (com.google.android.gms.common.api.a<?> aVar5 : map2.keySet()) {
            com.google.android.gms.common.api.h<?> b2 = aVar5.b();
            if (aVar.containsKey(b2)) {
                aVar3.put(aVar5, map2.get(aVar5));
            } else {
                if (!aVar2.containsKey(b2)) {
                    throw new IllegalStateException("Each API in the apiTypeMap must have a corresponding client in the clients map.");
                }
                aVar4.put(aVar5, map2.get(aVar5));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<kv> it = arrayList.iterator();
        while (it.hasNext()) {
            kv next = it.next();
            if (aVar3.containsKey(next.f6117a)) {
                arrayList2.add(next);
            } else {
                if (!aVar4.containsKey(next.f6117a)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
                }
                arrayList3.add(next);
            }
        }
        this.f6119a = new ma(context, this.h, lock, looper, bVar, aVar2, null, aVar4, null, arrayList3, new kx(this));
        this.f6120b = new ma(context, this.h, lock, looper, bVar, aVar, hVar, aVar3, fVar, arrayList2, new ky(this));
        Iterator it2 = aVar2.keySet().iterator();
        while (it2.hasNext()) {
            this.j.put((com.google.android.gms.common.api.h) it2.next(), this.f6119a);
        }
        Iterator it3 = aVar.keySet().iterator();
        while (it3.hasNext()) {
            this.j.put((com.google.android.gms.common.api.h) it3.next(), this.f6120b);
        }
    }

    private void a(ConnectionResult connectionResult) {
        switch (this.n) {
            case 2:
                this.h.a(connectionResult);
            case 1:
                f();
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CALLBACK_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        this.n = 0;
    }

    private static boolean b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.b();
    }

    private void f() {
        Iterator<Object> it = this.k.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.k.clear();
    }

    @Override // com.google.android.gms.internal.mf
    public final ConnectionResult a(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mf
    public final <A extends com.google.android.gms.common.api.g, R extends com.google.android.gms.common.api.x, T extends kr<R, A>> T a(T t) {
        if (!c(t)) {
            return (T) this.f6119a.a((ma) t);
        }
        if (!g()) {
            return (T) this.f6120b.a((ma) t);
        }
        t.b(new Status(4, null, h()));
        return t;
    }

    @Override // com.google.android.gms.internal.mf
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f6120b.a(str + "  ", fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("unauthClient").println(":");
        this.f6119a.a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.internal.mf
    public final ConnectionResult b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mf
    public final <A extends com.google.android.gms.common.api.g, T extends kr<? extends com.google.android.gms.common.api.x, A>> T b(T t) {
        if (!c(t)) {
            return (T) this.f6119a.b(t);
        }
        if (!g()) {
            return (T) this.f6120b.b(t);
        }
        t.b(new Status(4, null, h()));
        return t;
    }

    @Override // com.google.android.gms.internal.mf
    public final void c() {
        this.e = null;
        this.d = null;
        this.n = 0;
        this.f6119a.c();
        this.f6120b.c();
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r2.n == 2) goto L10;
     */
    @Override // com.google.android.gms.internal.mf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f
            r0.lock()
            com.google.android.gms.internal.ma r0 = r2.f6119a     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L1a
            com.google.android.gms.internal.ma r0 = r2.f6120b     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L21
            int r0 = r2.n     // Catch: java.lang.Throwable -> L23
            r1 = 2
            if (r0 != r1) goto L21
        L1a:
            r0 = 1
        L1b:
            java.util.concurrent.locks.Lock r1 = r2.f
            r1.unlock()
            return r0
        L21:
            r0 = 0
            goto L1b
        L23:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.f
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.kw.e():boolean");
    }

    @Override // com.google.android.gms.internal.mf
    public final void a() {
        this.n = 2;
        this.e = null;
        this.d = null;
        this.f6119a.a();
        this.f6120b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r2.n == 1) goto L11;
     */
    @Override // com.google.android.gms.internal.mf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r2 = this;
            r0 = 1
            java.util.concurrent.locks.Lock r1 = r2.f
            r1.lock()
            com.google.android.gms.internal.ma r1 = r2.f6119a     // Catch: java.lang.Throwable -> L28
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L26
            com.google.android.gms.internal.ma r1 = r2.f6120b     // Catch: java.lang.Throwable -> L28
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L20
            boolean r1 = r2.g()     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L20
            int r1 = r2.n     // Catch: java.lang.Throwable -> L28
            if (r1 != r0) goto L26
        L20:
            java.util.concurrent.locks.Lock r1 = r2.f
            r1.unlock()
            return r0
        L26:
            r0 = 0
            goto L20
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.f
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.kw.d():boolean");
    }

    private boolean g() {
        return this.e != null && this.e.c == 4;
    }

    private boolean c(kr<? extends com.google.android.gms.common.api.x, ? extends com.google.android.gms.common.api.g> krVar) {
        com.google.android.gms.common.api.h<? extends com.google.android.gms.common.api.g> hVar = krVar.e;
        com.google.android.gms.common.internal.av.b(this.j.containsKey(hVar), "GoogleApiClient is not configured to use the API required for this call.");
        return this.j.get(hVar).equals(this.f6120b);
    }

    private PendingIntent h() {
        if (this.l == null) {
            return null;
        }
        return PendingIntent.getActivity(this.g, System.identityHashCode(this.h), this.l.i(), 134217728);
    }

    static /* synthetic */ void a(kw kwVar) {
        if (!b(kwVar.d)) {
            if (kwVar.d != null && b(kwVar.e)) {
                kwVar.f6120b.c();
                kwVar.a(kwVar.d);
                return;
            } else {
                if (kwVar.d == null || kwVar.e == null) {
                    return;
                }
                ConnectionResult connectionResult = kwVar.d;
                if (kwVar.f6120b.l < kwVar.f6119a.l) {
                    connectionResult = kwVar.e;
                }
                kwVar.a(connectionResult);
                return;
            }
        }
        if (!b(kwVar.e) && !kwVar.g()) {
            if (kwVar.e != null) {
                if (kwVar.n == 1) {
                    kwVar.f();
                    return;
                } else {
                    kwVar.a(kwVar.e);
                    kwVar.f6119a.c();
                    return;
                }
            }
            return;
        }
        switch (kwVar.n) {
            case 2:
                kwVar.h.a(kwVar.c);
            case 1:
                kwVar.f();
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CALLBACK_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        kwVar.n = 0;
    }

    static /* synthetic */ void a(kw kwVar, ma maVar, int i) {
        if (kwVar.m.getAndIncrement() % 2 == 1) {
            kwVar.h.a(i);
        }
        maVar.a(i);
        kwVar.e = null;
        kwVar.d = null;
    }
}
