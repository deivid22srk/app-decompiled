package com.google.android.gms.internal;

/* loaded from: classes.dex */
final class eq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eo f5964a;

    /* renamed from: b, reason: collision with root package name */
    private final jn f5965b;
    private final ju c;
    private final Runnable d;

    public eq(eo eoVar, jn jnVar, ju juVar, Runnable runnable) {
        this.f5964a = eoVar;
        this.f5965b = jnVar;
        this.c = juVar;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5965b.j) {
            this.f5965b.b("canceled-at-delivery");
            return;
        }
        if (this.c.c == null) {
            this.f5965b.a((jn) this.c.f6099a);
        } else {
            jn jnVar = this.f5965b;
            zzr zzrVar = this.c.c;
            if (jnVar.f != null) {
                jnVar.f.a(zzrVar);
            }
        }
        if (this.c.d) {
            this.f5965b.a("intermediate-response");
        } else {
            this.f5965b.b("done");
        }
        if (this.d != null) {
            this.d.run();
        }
    }
}
