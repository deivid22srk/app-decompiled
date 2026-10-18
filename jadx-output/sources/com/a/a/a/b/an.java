package com.a.a.a.b;

import java.io.IOException;

/* loaded from: classes.dex */
final class an extends com.a.a.a.c {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f942b;
    final /* synthetic */ al c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(al alVar, String str, Object[] objArr, y yVar) {
        super(str, objArr);
        this.c = alVar;
        this.f942b = yVar;
    }

    @Override // com.a.a.a.c
    public final void a() {
        try {
            this.c.c.i.a(this.f942b);
        } catch (IOException e) {
        }
    }
}
