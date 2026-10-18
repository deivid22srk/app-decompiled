package com.google.android.finsky.c;

/* loaded from: classes.dex */
final class m extends n<Integer> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f2465a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(e eVar, e eVar2, String str, Integer num) {
        super(eVar2, str, num);
        this.f2465a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.finsky.c.n
    protected final o<Integer> a(String str) {
        return this.f2465a.a(str, (Integer) this.d);
    }
}
