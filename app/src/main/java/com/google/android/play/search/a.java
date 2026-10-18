package com.google.android.play.search;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final c[] f7021a;

    /* renamed from: b, reason: collision with root package name */
    final c[] f7022b;
    final int[][] c;
    final int[][] d;

    public a(c[] cVarArr, c[] cVarArr2) {
        int length = cVarArr.length;
        int length2 = cVarArr2.length;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length + 1, length2 + 1);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length + 1, length2 + 1);
        iArr[0][0] = 3;
        iArr2[0][0] = 0;
        for (int i = 1; i <= length; i++) {
            iArr[i][0] = 0;
            iArr2[i][0] = i;
        }
        for (int i2 = 1; i2 <= length2; i2++) {
            iArr[0][i2] = 1;
            iArr2[0][i2] = i2;
        }
        this.c = iArr;
        this.d = iArr2;
        this.f7021a = cVarArr;
        this.f7022b = cVarArr2;
    }
}
