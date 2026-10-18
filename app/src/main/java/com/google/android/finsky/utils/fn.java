package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class fn implements com.google.android.play.layout.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.apkg.i f4878a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f4879b;
    final /* synthetic */ boolean c;
    final /* synthetic */ com.google.android.finsky.api.b d;
    final /* synthetic */ fk e;

    fn(fk fkVar, com.google.android.finsky.apkg.i iVar, int i, boolean z, com.google.android.finsky.api.b bVar) {
        this.e = fkVar;
        this.f4878a = iVar;
        this.f4879b = i;
        this.c = z;
        this.d = bVar;
    }

    @Override // com.google.android.play.layout.f
    public final void a(int i) {
        this.f4878a.a(this.f4879b, (byte[]) null, this.e.c);
        if (!this.c) {
            a.a(this.e.f4873a, this.e.d, "24", this.e.f.getWidth(), this.e.f.getHeight());
        }
        js.a(this.e.f, this.e.d, this.d);
    }
}
