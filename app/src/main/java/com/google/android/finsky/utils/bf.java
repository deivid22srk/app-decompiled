package com.google.android.finsky.utils;

/* loaded from: classes.dex */
public final class bf implements com.google.android.finsky.dpkg.e {
    @Override // com.google.android.finsky.dpkg.e
    public final void a() {
    }

    @Override // com.google.android.finsky.dpkg.e
    public final void a(android.support.v4.h.f<Object> fVar, android.support.v4.h.f<Object> fVar2) {
        long[] jArr;
        long[] jArr2;
        jArr = bd.d;
        int length = jArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (fVar2.c(jArr[i]) >= 0) {
                bd.e();
                break;
            }
            i++;
        }
        jArr2 = bd.d;
        for (long j : jArr2) {
            if (fVar.c(j) >= 0) {
                bd.a(j);
                return;
            }
        }
    }
}
