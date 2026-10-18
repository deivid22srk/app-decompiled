package com.google.gson.b.a;

import java.lang.reflect.Field;

/* loaded from: classes2.dex */
final class s extends u {

    /* renamed from: a, reason: collision with root package name */
    final com.google.gson.aj<?> f7803a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.gson.k f7804b;
    final /* synthetic */ com.google.gson.c.a c;
    final /* synthetic */ Field d;
    final /* synthetic */ boolean e;
    final /* synthetic */ r f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(r rVar, String str, boolean z, boolean z2, com.google.gson.k kVar, com.google.gson.c.a aVar, Field field, boolean z3) {
        super(str, z, z2);
        this.f = rVar;
        this.f7804b = kVar;
        this.c = aVar;
        this.d = field;
        this.e = z3;
        this.f7803a = this.f7804b.a(this.c);
    }

    @Override // com.google.gson.b.a.u
    final void a(com.google.gson.stream.f fVar, Object obj) {
        new z(this.f7804b, this.f7803a, this.c.f7847b).a(fVar, this.d.get(obj));
    }

    @Override // com.google.gson.b.a.u
    final void a(com.google.gson.stream.a aVar, Object obj) {
        Object a2 = this.f7803a.a(aVar);
        if (a2 != null || !this.e) {
            this.d.set(obj, a2);
        }
    }
}
