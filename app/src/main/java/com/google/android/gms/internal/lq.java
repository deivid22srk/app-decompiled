package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class lq implements lz {

    /* renamed from: a, reason: collision with root package name */
    private final ma f6144a;

    public lq(ma maVar) {
        this.f6144a = maVar;
    }

    @Override // com.google.android.gms.internal.lz
    public final <A extends com.google.android.gms.common.api.g, R extends com.google.android.gms.common.api.x, T extends kr<R, A>> T a(T t) {
        this.f6144a.m.f6146b.add(t);
        return t;
    }

    @Override // com.google.android.gms.internal.lz
    public final void a(int i) {
    }

    @Override // com.google.android.gms.internal.lz
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.lz
    public final void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, int i) {
    }

    @Override // com.google.android.gms.internal.lz
    public final <A extends com.google.android.gms.common.api.g, T extends kr<? extends com.google.android.gms.common.api.x, A>> T b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.internal.lz
    public final void b() {
        this.f6144a.m.h();
    }

    @Override // com.google.android.gms.internal.lz
    public final void a() {
        Iterator<com.google.android.gms.common.api.g> it = this.f6144a.f.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f6144a.m.e = Collections.emptySet();
    }

    @Override // com.google.android.gms.internal.lz
    public final void c() {
        ma maVar = this.f6144a;
        maVar.f6154a.lock();
        try {
            maVar.k = new lc(maVar, maVar.h, maVar.i, maVar.d, maVar.j, maVar.f6154a, maVar.c);
            maVar.k.a();
            maVar.f6155b.signalAll();
        } finally {
            maVar.f6154a.unlock();
        }
    }
}
