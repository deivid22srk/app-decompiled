package com.google.android.gms.internal;

/* loaded from: classes.dex */
final class ir implements com.google.android.gms.ads.internal.overlay.j {

    /* renamed from: a, reason: collision with root package name */
    private im f6066a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.ads.internal.overlay.j f6067b;

    public ir(im imVar, com.google.android.gms.ads.internal.overlay.j jVar) {
        this.f6066a = imVar;
        this.f6067b = jVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.j
    public final void a() {
        this.f6067b.a();
        this.f6066a.a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.j
    public final void b() {
        this.f6067b.b();
        this.f6066a.b();
    }
}
