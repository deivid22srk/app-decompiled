package com.google.android.finsky.utils.hats;

import com.google.android.finsky.cpkg.o;
import com.google.android.finsky.protos.pj;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.jm;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4946a;

    /* renamed from: b, reason: collision with root package name */
    List<pj> f4947b = null;
    public String c;
    android.support.v4.h.f<Long> d;

    public k(String str) {
        this.c = str;
        long[] e = jm.e(bg.U.b(this.c).a());
        Arrays.sort(e);
        this.d = new android.support.v4.h.f<>(e.length);
        for (long j : e) {
            this.d.b(j, null);
        }
    }

    final void a() {
        long[] jArr = new long[this.d.a()];
        for (int i = 0; i < this.d.a(); i++) {
            jArr[i] = this.d.a(i);
        }
        bg.U.b(this.c).a((o<String>) jm.a(jArr));
    }
}
