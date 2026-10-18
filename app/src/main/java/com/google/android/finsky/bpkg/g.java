package com.google.android.finsky.bpkg;

import com.android.volley.VolleyError;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f2113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f2114b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ c d;

    g(c cVar, int[] iArr, List list, int[] iArr2) {
        this.d = cVar;
        this.f2113a = iArr;
        this.f2114b = list;
        this.c = iArr2;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        int[] iArr = this.f2113a;
        iArr[0] = iArr[0] + 1;
        this.d.a(this.f2114b.size(), this.f2113a[0], this.c[0]);
    }
}
