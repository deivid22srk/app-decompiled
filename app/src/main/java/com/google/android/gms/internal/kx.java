package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
final class kx implements mg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kw f6121a;

    kx(kw kwVar) {
        this.f6121a = kwVar;
    }

    @Override // com.google.android.gms.internal.mg
    public final void a(Bundle bundle) {
        this.f6121a.f.lock();
        try {
            kw kwVar = this.f6121a;
            if (kwVar.c == null) {
                kwVar.c = bundle;
            } else if (bundle != null) {
                kwVar.c.putAll(bundle);
            }
            this.f6121a.d = ConnectionResult.f5556a;
            kw.a(this.f6121a);
        } finally {
            this.f6121a.f.unlock();
        }
    }

    @Override // com.google.android.gms.internal.mg
    public final void a(ConnectionResult connectionResult) {
        this.f6121a.f.lock();
        try {
            this.f6121a.d = connectionResult;
            kw.a(this.f6121a);
        } finally {
            this.f6121a.f.unlock();
        }
    }

    @Override // com.google.android.gms.internal.mg
    public final void a(int i) {
        this.f6121a.f.lock();
        try {
            kw.a(this.f6121a, this.f6121a.f6120b, i);
        } finally {
            this.f6121a.f.unlock();
        }
    }
}
