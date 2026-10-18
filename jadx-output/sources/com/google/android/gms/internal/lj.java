package com.google.android.gms.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class lj implements com.google.android.gms.common.api.t {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<lc> f6135a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a<?> f6136b;
    private final int c;

    public lj(lc lcVar, com.google.android.gms.common.api.a<?> aVar, int i) {
        this.f6135a = new WeakReference<>(lcVar);
        this.f6136b = aVar;
        this.c = i;
    }

    @Override // com.google.android.gms.common.api.t
    public final void a(ConnectionResult connectionResult) {
        lc lcVar = this.f6135a.get();
        if (lcVar == null) {
            return;
        }
        com.google.android.gms.common.internal.av.a(Looper.myLooper() == lcVar.f6125a.m.f6145a, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lcVar.f6126b.lock();
        try {
            if (lcVar.b(0)) {
                if (!connectionResult.b()) {
                    lcVar.b(connectionResult, this.f6136b, this.c);
                }
                if (lcVar.d()) {
                    lcVar.e();
                }
            }
        } finally {
            lcVar.f6126b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.t
    public final void b(ConnectionResult connectionResult) {
        lc lcVar = this.f6135a.get();
        if (lcVar == null) {
            return;
        }
        com.google.android.gms.common.internal.av.a(Looper.myLooper() == lcVar.f6125a.m.f6145a, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        lcVar.f6126b.lock();
        try {
            if (lcVar.b(1)) {
                if (!connectionResult.b()) {
                    lcVar.b(connectionResult, this.f6136b, this.c);
                }
                if (lcVar.d()) {
                    lcVar.f();
                }
            }
        } finally {
            lcVar.f6126b.unlock();
        }
    }
}
