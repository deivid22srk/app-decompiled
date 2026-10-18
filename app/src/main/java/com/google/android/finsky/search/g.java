package com.google.android.finsky.search;

import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.apkg.ao;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    final ao f4527a = com.google.android.finsky.apkg.i.f();

    public final void a(String str, int i, int i2, byte[] bArr, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        ao f = com.google.android.finsky.apkg.i.f();
        a(str, i, i2, bArr, currentTimeMillis, f);
        this.f4527a.b();
        a(f, this.f4527a);
        FinskyApp.a().h().b(new com.google.android.finsky.apkg.b(510).a(f).f1473a);
    }

    public static void a(int i, VolleyError volleyError) {
        FinskyApp.a().h().b(new com.google.android.finsky.apkg.b(i).a(1).a(volleyError).f1473a);
    }

    public static void a(ao aoVar, ao aoVar2) {
        a(aoVar.f1465a, aoVar.g, aoVar.i, aoVar.k, aoVar.e, aoVar2);
    }

    private static void a(String str, int i, int i2, byte[] bArr, long j, ao aoVar) {
        aoVar.f1465a = str;
        aoVar.f1466b = true;
        aoVar.e = j;
        aoVar.f = true;
        aoVar.g = i;
        aoVar.h = true;
        aoVar.i = i2;
        aoVar.j = true;
        if (bArr != null && bArr.length > 0) {
            aoVar.k = bArr;
            aoVar.l = true;
        }
    }
}
