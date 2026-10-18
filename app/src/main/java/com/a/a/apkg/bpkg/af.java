package com.a.a.apkg.bpkg;

import java.io.IOException;

/* loaded from: classes.dex */
final class af extends com.a.a.apkg.c {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ac f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f933b = true;
    public final /* synthetic */ v e = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(ac acVar, String str, Object[] objArr, int i, int i2) {
        super(str, objArr);
        this.f = acVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.a.a.apkg.c
    public final void a() {
        try {
            ac.a(this.f, this.f933b, this.c, this.d, this.e);
        } catch (IOException e) {
        }
    }
}
