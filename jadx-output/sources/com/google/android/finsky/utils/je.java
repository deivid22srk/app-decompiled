package com.google.android.finsky.utils;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class je implements com.google.android.finsky.d.e {
    je() {
    }

    @Override // com.google.android.finsky.d.e
    public final void a() {
    }

    @Override // com.google.android.finsky.d.e
    public final void a(android.support.v4.h.f<Object> fVar, android.support.v4.h.f<Object> fVar2) {
        long[] jArr;
        String j = FinskyApp.a().j();
        jArr = jb.f5021b;
        for (long j2 : jArr) {
            if (fVar.c(j2) >= 0 || fVar2.c(j2) >= 0) {
                new Handler(Looper.getMainLooper()).post(new jf(this, j));
                return;
            }
        }
    }
}
