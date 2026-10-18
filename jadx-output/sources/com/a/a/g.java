package com.a.a;

/* loaded from: classes.dex */
final class g implements w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f1027a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1028b;
    private final ab c;

    g(f fVar, int i, ab abVar) {
        this.f1027a = fVar;
        this.f1028b = i;
        this.c = abVar;
    }

    @Override // com.a.a.w
    public final ab a() {
        return this.c;
    }

    @Override // com.a.a.w
    public final af a(ab abVar) {
        if (this.f1028b >= this.f1027a.f1025a.h.size()) {
            return this.f1027a.a(abVar);
        }
        return this.f1027a.f1025a.h.get(this.f1028b).a(new g(this.f1027a, this.f1028b + 1, abVar));
    }
}
