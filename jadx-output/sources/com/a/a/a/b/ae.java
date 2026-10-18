package com.a.a.a.b;

import java.io.IOException;

/* loaded from: classes.dex */
final class ae extends com.a.a.a.c {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f932b;
    final /* synthetic */ long c;
    final /* synthetic */ ac d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(ac acVar, String str, Object[] objArr, int i, long j) {
        super(str, objArr);
        this.d = acVar;
        this.f932b = i;
        this.c = j;
    }

    @Override // com.a.a.a.c
    public final void a() {
        try {
            this.d.i.a(this.f932b, this.c);
        } catch (IOException e) {
        }
    }
}
