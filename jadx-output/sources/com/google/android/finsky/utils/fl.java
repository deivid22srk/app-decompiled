package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class fl implements com.google.android.play.layout.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.a.i f4875a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f4876b;
    final /* synthetic */ gc c;
    final /* synthetic */ com.google.android.finsky.api.b d;
    final /* synthetic */ boolean e;
    final /* synthetic */ android.support.v4.app.aa f;
    final /* synthetic */ fk g;

    fl(fk fkVar, com.google.android.finsky.a.i iVar, int i, gc gcVar, com.google.android.finsky.api.b bVar, boolean z, android.support.v4.app.aa aaVar) {
        this.g = fkVar;
        this.f4875a = iVar;
        this.f4876b = i;
        this.c = gcVar;
        this.d = bVar;
        this.e = z;
        this.f = aaVar;
    }

    @Override // com.google.android.play.layout.f
    public final void a(int i) {
        this.f4875a.a(this.f4876b, (byte[]) null, this.g.c);
        this.c.a(this.g.d, this.d, !this.e, this.f, this.g.f4873a);
    }
}
