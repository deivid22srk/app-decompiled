package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.x;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class kr<R extends com.google.android.gms.common.api.x, A extends com.google.android.gms.common.api.g> extends kt<R> implements ks<R>, ly<A> {

    /* renamed from: a, reason: collision with root package name */
    private AtomicReference<lx> f6114a;
    final com.google.android.gms.common.api.h<A> e;

    public kr(com.google.android.gms.common.api.h<A> hVar, com.google.android.gms.common.api.m mVar) {
        super(((com.google.android.gms.common.api.m) com.google.android.gms.common.internal.av.a(mVar, "GoogleApiClient must not be null")).a());
        this.f6114a = new AtomicReference<>();
        this.e = (com.google.android.gms.common.api.h) com.google.android.gms.common.internal.av.a(hVar);
    }

    private void a(RemoteException remoteException) {
        b(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    public abstract void a(A a2);

    @Override // com.google.android.gms.internal.ly
    public final void a(lx lxVar) {
        this.f6114a.set(lxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ks

    @Override // com.google.android.gms.internal.ly
    public final void b(Status status) {
        com.google.android.gms.common.internal.av.b(!status.a(), "Failed result must not be success");
        a((kr<R, A>) a(status));
    }

    @Override // com.google.android.gms.internal.ly
    public final void b(A a2) {
        try {
            a((kr<R, A>) a2);
        } catch (DeadObjectException e) {
            a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            a(e2);
        }
    }

    @Override // com.google.android.gms.internal.ly
    public final com.google.android.gms.common.api.h<A> c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ly
    public final void d() {
        a((com.google.android.gms.common.api.y) null);
    }

    @Override // com.google.android.gms.internal.kt
    protected final void e() {
        lx andSet = this.f6114a.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
    }
}
