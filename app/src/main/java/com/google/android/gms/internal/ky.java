package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
final class ky implements mg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kw f6122a;

    ky(kw kwVar) {
        this.f6122a = kwVar;
    }

    @Override // com.google.android.gms.internal.mg
    public final void a(Bundle bundle) {
        this.f6122a.f.lock();
        try {
            this.f6122a.e = ConnectionResult.f5556a;
            kw.a(this.f6122a);
        } finally {
            this.f6122a.f.unlock();
        }
    }

    @Override // com.google.android.gms.internal.mg
    public final void a(ConnectionResult connectionResult) {
        this.f6122a.f.lock();
        try {
            this.f6122a.e = connectionResult;
            kw.a(this.f6122a);
        } finally {
            this.f6122a.f.unlock();
        }
    }

    @Override // com.google.android.gms.internal.mg
    public final void a(int i) {
        this.f6122a.f.lock();
        try {
            kw.a(this.f6122a, this.f6122a.f6119a, i);
        } finally {
            this.f6122a.f.unlock();
        }
    }
}
