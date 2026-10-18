package com.a.a.apkg.bpkg;

import java.io.IOException;

/* loaded from: classes.dex */
final class am extends com.a.a.apkg.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ao f941b;
    public final /* synthetic */ al c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(al alVar, String str, Object[] objArr, ao aoVar) {
        super(str, objArr);
        this.c = alVar;
        this.f941b = aoVar;
    }

    @Override // com.a.a.apkg.c
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
