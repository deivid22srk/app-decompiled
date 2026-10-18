package com.google.android.finsky.utils;

/* loaded from: classes.dex */
public final class dl implements com.google.android.finsky.d.e {
    @Override // com.google.android.finsky.d.e
    public final void a() {
    }

    @Override // com.google.android.finsky.d.e
    public final void a(android.support.v4.h.f<Object> fVar, android.support.v4.h.f<Object> fVar2) {
        long[] jArr;
        long[] jArr2;
        jArr = dj.c;
        for (long j : jArr) {
            if (fVar2.c(j) >= 0) {
                com.google.android.play.image.u.a((com.google.android.play.utils.c.c) null);
                return;
            }
        }
        jArr2 = dj.c;
        for (long j2 : jArr2) {
            if (fVar.c(j2) >= 0) {
                com.google.android.play.image.u.a(dj.a(j2));
                return;
            }
        }
    }
}
