package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
final class ln implements com.google.android.gms.common.api.p, com.google.android.gms.common.api.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ lc f6141a;

    private ln(lc lcVar) {
        this.f6141a = lcVar;
    }

    /* synthetic */ ln(lc lcVar, byte b2) {
        this(lcVar);
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(int i) {
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Bundle bundle) {
        this.f6141a.d.a(new lg(this.f6141a));
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(ConnectionResult connectionResult) {
        this.f6141a.f6126b.lock();
        try {
            if (this.f6141a.a(connectionResult)) {
                this.f6141a.h();
                this.f6141a.g();
            } else {
                this.f6141a.b(connectionResult);
            }
        } finally {
            this.f6141a.f6126b.unlock();
        }
    }
}
