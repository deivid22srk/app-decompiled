package com.android.a.a;

/* loaded from: classes.dex */
final class m implements ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f1118a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f1119b;

    m(l lVar, e eVar) {
        this.f1119b = lVar;
        this.f1118a = eVar;
    }

    @Override // com.android.a.a.ab
    public final void a() {
        this.f1119b.j.post(new s(this.f1119b, this.f1118a));
    }
}
