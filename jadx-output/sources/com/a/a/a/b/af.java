package com.a.a.a.b;

import java.io.IOException;

/* loaded from: classes.dex */
final class af extends com.a.a.a.c {
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ ac f;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f933b = true;
    final /* synthetic */ v e = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(ac acVar, String str, Object[] objArr, int i, int i2) {
        super(str, objArr);
        this.f = acVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.a.a.a.c
    public final void a() {
        try {
            ac.a(this.f, this.f933b, this.c, this.d, this.e);
        } catch (IOException e) {
        }
    }
}
