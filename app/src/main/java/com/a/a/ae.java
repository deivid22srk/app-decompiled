package com.a.a;

/* loaded from: classes.dex */
final class ae extends ad {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f1011b;

    ae(x xVar, byte[] bArr) {
        this.f1010a = xVar;
        this.f1011b = bArr;
    }

    @Override // com.a.a.ad
    public final x a() {
        return this.f1010a;
    }

    @Override // com.a.a.ad
    public final long b() {
        return this.f1011b.length;
    }

    @Override // com.a.a.ad
    public final void a(okio2.h hVar) {
        hVar.b(this.f1011b);
    }
}
