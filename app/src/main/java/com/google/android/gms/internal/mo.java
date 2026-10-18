package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;

/* loaded from: classes.dex */
public final class mo<R extends com.google.android.gms.common.api.x> extends com.google.android.gms.common.api.ac<R> implements com.google.android.gms.common.api.y<R> {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.gms.common.api.ab<? super R, ? extends com.google.android.gms.common.api.x> f6170a;

    /* renamed from: b, reason: collision with root package name */
    private mo<? extends com.google.android.gms.common.api.x> f6171b;
    private com.google.android.gms.common.api.z<? super R> c;
    private com.google.android.gms.common.api.u<R> d;
    private final Object e;

    private void a(Status status) {
        synchronized (this.e) {
            if (this.f6170a != null) {
                com.google.android.gms.common.internal.av.a(status, "onFailure must not return null");
                this.f6171b.a(status);
            }
        }
    }

    private static void b(com.google.android.gms.common.api.x xVar) {
        if (xVar instanceof com.google.android.gms.common.api.w) {
            try {
                ((com.google.android.gms.common.api.w) xVar).a();
            } catch (RuntimeException e) {
                Log.w("TransformedResultImpl", "Unable to release " + xVar, e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.y
    public final void a(R r) {
        synchronized (this.e) {
            if (!r.b().a()) {
                a(r.b());
                b(r);
            } else if (this.f6170a != null) {
                com.google.android.gms.common.api.u<R> uVar = (com.google.android.gms.common.api.u<R>) (com.google.android.gms.common.api.u) this.f6170a.a();
                if (uVar == null) {
                    a(new Status(13, "Transform returned null"));
                } else {
                    mo<? extends com.google.android.gms.common.api.x> moVar = this.f6171b;
                    synchronized (moVar.e) {
                        moVar.d = uVar;
                        if (moVar.d != null && (moVar.f6170a != null || moVar.c != null)) {
                            moVar.d.a(moVar);
                        }
                    }
                }
                b(r);
            } else if (this.c != null) {
            }
        }
    }
}
