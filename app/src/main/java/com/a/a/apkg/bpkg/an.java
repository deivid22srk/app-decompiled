package com.a.a.apkg.bpkg;

import java.io.IOException;

/* loaded from: classes.dex */
final class an extends com.a.a.apkg.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f942b;
    public final /* synthetic */ al c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(al alVar, String str, Object[] objArr, y yVar) {
        super(str, objArr);
        this.c = alVar;
        this.f942b = yVar;
    }

    @Override // com.a.a.apkg.c
    public final void a() {
        try {
            this.c.c.i.a(this.f942b);
        } catch (IOException e) {
        }
    }
}
