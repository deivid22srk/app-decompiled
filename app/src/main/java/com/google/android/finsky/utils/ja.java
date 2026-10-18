package com.google.android.finsky.utils;

import android.util.SparseArray;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class ja implements com.google.android.finsky.layout.play.ay {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f5018a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f5019b;
    final /* synthetic */ com.google.android.finsky.cpkg.o c;
    final /* synthetic */ int d;

    ja(int i, long j, com.google.android.finsky.cpkg.o oVar, int i2) {
        this.f5018a = i;
        this.f5019b = j;
        this.c = oVar;
        this.d = i2;
    }

    @Override // com.google.android.finsky.layout.play.ay
    public final void a() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        sparseArray = ix.f5013a;
        Long l = (Long) sparseArray.get(this.f5018a);
        long currentTimeMillis = System.currentTimeMillis();
        if (l == null || currentTimeMillis - l.longValue() > this.f5019b) {
            sparseArray2 = ix.f5013a;
            sparseArray2.put(this.f5018a, Long.valueOf(currentTimeMillis));
            int intValue = ((Integer) this.c.a()).intValue() + 1;
            this.c.a((com.google.android.finsky.cpkg.o) Integer.valueOf(intValue));
            if (intValue >= this.d) {
                ix.a(FinskyApp.a().j(), this.f5018a, 3, null);
            }
        }
    }
}
