package com.google.android.finsky.c;

/* loaded from: classes.dex */
final class l extends n<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f2464a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(e eVar, e eVar2, String str, Boolean bool) {
        super(eVar2, str, bool);
        this.f2464a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.finsky.c.n
    protected final o<Boolean> a(String str) {
        return this.f2464a.a(str, (Boolean) this.d);
    }
}
