package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class eo implements kz {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f5961a;

    public eo(Handler handler) {
        this.f5961a = new ep(this, handler);
    }

    @Override // com.google.android.gms.internal.kz
    public final void a(jn<?> jnVar, ju<?> juVar) {
        a(jnVar, juVar, null);
    }

    @Override // com.google.android.gms.internal.kz
    public final void a(jn<?> jnVar, ju<?> juVar, Runnable runnable) {
        jnVar.k = true;
        jnVar.a("post-response");
        this.f5961a.execute(new eq(this, jnVar, juVar, runnable));
    }

    @Override // com.google.android.gms.internal.kz
    public final void a(jn<?> jnVar, zzr zzrVar) {
        jnVar.a("post-error");
        this.f5961a.execute(new eq(this, jnVar, new ju(zzrVar), null));
    }
}
