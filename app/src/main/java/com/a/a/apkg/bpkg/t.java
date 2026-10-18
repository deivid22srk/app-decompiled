package com.a.a.apkg.bpkg;

/* loaded from: classes.dex */
final class t extends okio2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f976a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(s sVar, okio2.y yVar) {
        super(yVar);
        this.f976a = sVar;
    }

    @Override // okio2.l, okio2.y
    public final long a(okio2.f fVar, long j) {
        if (this.f976a.f974a == 0) {
            return -1L;
        }
        long a2 = super.a(fVar, Math.min(j, this.f976a.f974a));
        if (a2 == -1) {
            return -1L;
        }
        this.f976a.f974a = (int) (r0.f974a - a2);
        return a2;
    }
}
