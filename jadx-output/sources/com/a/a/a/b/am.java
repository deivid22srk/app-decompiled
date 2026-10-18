package com.a.a.a.b;

import java.io.IOException;

/* loaded from: classes.dex */
final class am extends com.a.a.a.c {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ao f941b;
    final /* synthetic */ al c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(al alVar, String str, Object[] objArr, ao aoVar) {
        super(str, objArr);
        this.c = alVar;
        this.f941b = aoVar;
    }

    @Override // com.a.a.a.c
    public final void a() {
        q qVar;
        try {
            qVar = this.c.c.m;
            qVar.a(this.f941b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
