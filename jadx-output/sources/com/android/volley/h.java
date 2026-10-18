package com.android.volley;

/* loaded from: classes.dex */
final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f1239a;

    /* renamed from: b, reason: collision with root package name */
    private final l f1240b;
    private final r c;
    private final Runnable d;

    public h(f fVar, l lVar, r rVar, Runnable runnable) {
        this.f1239a = fVar;
        this.f1240b = lVar;
        this.c = rVar;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1240b.e()) {
            this.f1240b.b("canceled-at-delivery");
            return;
        }
        if (this.c.a()) {
            this.f1240b.a((l) this.c.f1255a);
        } else {
            this.f1240b.b(this.c.c);
        }
        if (this.c.d) {
            this.f1240b.a("intermediate-response");
        } else {
            this.f1240b.b("done");
        }
        if (this.d != null) {
            this.d.run();
        }
    }
}
