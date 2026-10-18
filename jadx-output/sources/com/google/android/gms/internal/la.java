package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class la implements lz {

    /* renamed from: a, reason: collision with root package name */
    private final ma f6123a;

    public la(ma maVar) {
        this.f6123a = maVar;
    }

    @Override // com.google.android.gms.internal.lz
    public final <A extends com.google.android.gms.common.api.g, R extends com.google.android.gms.common.api.x, T extends kr<R, A>> T a(T t) {
        return (T) b(t);
    }

    @Override // com.google.android.gms.internal.lz
    public final void a() {
    }

    @Override // com.google.android.gms.internal.lz
    public final void a(int i) {
        this.f6123a.a((ConnectionResult) null);
        this.f6123a.n.a(i);
    }

    @Override // com.google.android.gms.internal.lz
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.lz
    public final void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, int i) {
    }

    @Override // com.google.android.gms.internal.lz
    public final void b() {
        this.f6123a.a((ConnectionResult) null);
    }

    @Override // com.google.android.gms.internal.lz
    public final void c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.lz
    public final <A extends com.google.android.gms.common.api.g, T extends kr<? extends com.google.android.gms.common.api.x, A>> T b(T t) {
        try {
            this.f6123a.m.a((ly) t);
            com.google.android.gms.common.api.g a2 = this.f6123a.m.a((com.google.android.gms.common.api.h<com.google.android.gms.common.api.g>) t.c());
            if (a2.g() || !this.f6123a.g.containsKey(t.c())) {
                t.b(a2);
            } else {
                t.b(new Status(17));
            }
        } catch (DeadObjectException e) {
            this.f6123a.a(new lb(this, this));
        }
        return t;
    }
}
