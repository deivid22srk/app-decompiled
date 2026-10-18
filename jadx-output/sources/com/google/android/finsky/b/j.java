package com.google.android.finsky.b;

import com.android.volley.VolleyError;
import java.util.List;

/* loaded from: classes.dex */
final class j implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int[] f2119a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f2120b;
    final /* synthetic */ int[] c;
    final /* synthetic */ c d;

    j(c cVar, int[] iArr, List list, int[] iArr2) {
        this.d = cVar;
        this.f2119a = iArr;
        this.f2120b = list;
        this.c = iArr2;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        int[] iArr = this.f2119a;
        iArr[0] = iArr[0] + 1;
        this.d.a(this.f2120b.size(), this.f2119a[0], this.c[0]);
    }
}
