package com.a.a.a.b;

import java.io.IOException;

/* loaded from: classes.dex */
final class ad extends com.a.a.a.c {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f931b;
    final /* synthetic */ a c;
    final /* synthetic */ ac d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ac acVar, String str, Object[] objArr, int i, a aVar) {
        super(str, objArr);
        this.d = acVar;
        this.f931b = i;
        this.c = aVar;
    }

    @Override // com.a.a.a.c
    public final void a() {
        try {
            this.d.b(this.f931b, this.c);
        } catch (IOException e) {
        }
    }
}
