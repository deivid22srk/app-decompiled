package com.google.android.finsky.b;

import com.google.android.finsky.protos.fa;
import java.util.List;

/* loaded from: classes.dex */
final class i implements com.android.volley.t<fa> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.c.o f2117a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2118b;
    final /* synthetic */ com.google.android.finsky.c.o c;
    final /* synthetic */ int d;
    final /* synthetic */ int[] e;
    final /* synthetic */ int[] f;
    final /* synthetic */ List g;
    final /* synthetic */ c h;

    i(c cVar, com.google.android.finsky.c.o oVar, int i, com.google.android.finsky.c.o oVar2, int i2, int[] iArr, int[] iArr2, List list) {
        this.h = cVar;
        this.f2117a = oVar;
        this.f2118b = i;
        this.c = oVar2;
        this.d = i2;
        this.e = iArr;
        this.f = iArr2;
        this.g = list;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(fa faVar) {
        this.f2117a.a((com.google.android.finsky.c.o) Integer.valueOf(this.f2118b));
        this.c.a((com.google.android.finsky.c.o) Integer.valueOf(this.d));
        int[] iArr = this.e;
        iArr[0] = iArr[0] + 1;
        int[] iArr2 = this.f;
        iArr2[0] = iArr2[0] + 1;
        this.h.a(this.g.size(), this.e[0], this.f[0]);
    }
}
