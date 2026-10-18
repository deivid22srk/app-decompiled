package com.a.a.a.b;

/* loaded from: classes.dex */
final class t extends a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f976a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(s sVar, a.y yVar) {
        super(yVar);
        this.f976a = sVar;
    }

    @Override // a.l, a.y
    public final long a(a.f fVar, long j) {
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
