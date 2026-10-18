package com.google.android.finsky.bpkg;

import com.google.android.finsky.protos.rk;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements com.android.volley.t<rk> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.finsky.cpkg.o f2111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2112b;
    public final /* synthetic */ com.google.android.finsky.cpkg.o c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ int[] f;
    public final /* synthetic */ List g;
    public final /* synthetic */ c h;

    f(c cVar, com.google.android.finsky.cpkg.o oVar, int i, com.google.android.finsky.cpkg.o oVar2, int i2, int[] iArr, int[] iArr2, List list) {
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
        this.f2111a.a((com.google.android.finsky.cpkg.o) Integer.valueOf(this.f2112b));
        this.c.a((com.google.android.finsky.cpkg.o) Integer.valueOf(this.d));
        int[] iArr = this.e;
        iArr[0] = iArr[0] + 1;
        int[] iArr2 = this.f;
        iArr2[0] = iArr2[0] + 1;
        this.h.a(this.g.size(), this.e[0], this.f[0]);
    }
}
