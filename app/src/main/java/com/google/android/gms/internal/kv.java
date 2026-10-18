package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class kv implements com.google.android.gms.common.api.p, com.google.android.gms.common.api.q {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.common.api.a<?> f6117a;

    /* renamed from: b, reason: collision with root package name */
    ma f6118b;
    private final int c;

    public kv(com.google.android.gms.common.api.a<?> aVar, int i) {
        this.f6117a = aVar;
        this.c = i;
    }

    private void a() {
        com.google.android.gms.common.internal.av.a(this.f6118b, "Callbacks must be attached to a GoogleApiClient instance before connecting the client.");
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(int i) {
        a();
        this.f6118b.a(i);
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Bundle bundle) {
        a();
        ma maVar = this.f6118b;
        maVar.f6154a.lock();
        try {
            maVar.k.a(bundle);
        } finally {
            maVar.f6154a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(ConnectionResult connectionResult) {
        a();
        ma maVar = this.f6118b;
        com.google.android.gms.common.api.a<?> aVar = this.f6117a;
        int i = this.c;
        maVar.f6154a.lock();
        try {
            maVar.k.a(connectionResult, aVar, i);
        } finally {
            maVar.f6154a.unlock();
        }
    }
}
