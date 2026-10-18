package com.google.android.finsky.b;

import com.google.android.finsky.protos.rk;
import java.util.List;

/* loaded from: classes.dex */
final class f implements com.android.volley.t<rk> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.c.o f2111a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2112b;
    final /* synthetic */ com.google.android.finsky.c.o c;
    final /* synthetic */ int d;
    final /* synthetic */ int[] e;
    final /* synthetic */ int[] f;
    final /* synthetic */ List g;
    final /* synthetic */ c h;

    f(c cVar, com.google.android.finsky.c.o oVar, int i, com.google.android.finsky.c.o oVar2, int i2, int[] iArr, int[] iArr2, List list) {
        this.h = cVar;
        this.f2111a = oVar;
        this.f2112b = i;
        this.c = oVar2;
        this.d = i2;
        this.e = iArr;
        this.f = iArr2;
        this.g = list;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(rk rkVar) {
        this.f2111a.a((com.google.android.finsky.c.o) Integer.valueOf(this.f2112b));
        this.c.a((com.google.android.finsky.c.o) Integer.valueOf(this.d));
        int[] iArr = this.e;
        iArr[0] = iArr[0] + 1;
        int[] iArr2 = this.f;
        iArr2[0] = iArr2[0] + 1;
        this.h.a(this.g.size(), this.e[0], this.f[0]);
    }
}
