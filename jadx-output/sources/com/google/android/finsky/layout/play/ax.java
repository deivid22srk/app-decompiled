package com.google.android.finsky.layout.play;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<as> f3421a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static final SparseArray<as> f3422b = new SparseArray<>();
    private static final as c;

    static {
        as asVar = new as(6, 3);
        asVar.h = 4;
        as a2 = asVar.a(as.j, 4, 0);
        a2.i = true;
        c = a2;
        SparseArray<as> sparseArray = f3421a;
        as asVar2 = new as(6, 3);
        asVar2.h = 0;
        as a3 = asVar2.a(as.j, 2, 0).a(as.j, 4, 0).a(as.j, 6, 0);
        a3.f = true;
        a3.e = true;
        a3.i = true;
        sparseArray.append(0, a3);
        SparseArray<as> sparseArray2 = f3421a;
        as asVar3 = new as(8, 3);
        asVar3.h = 4;
        as a4 = asVar3.a(as.j, 4, 0).a(as.j, 6, 0);
        a4.f = true;
        a4.e = true;
        a4.i = true;
        sparseArray2.append(1, a4);
        SparseArray<as> sparseArray3 = f3421a;
        as asVar4 = new as(6, 3);
        asVar4.h = 0;
        as a5 = asVar4.a(as.k, 2, 0).a(as.k, 4, 0).a(as.k, 6, 0);
        a5.f = true;
        a5.e = true;
        a5.i = true;
        sparseArray3.append(2, a5);
        SparseArray<as> sparseArray4 = f3421a;
        as asVar5 = new as(8, 3);
        asVar5.h = 4;
        as a6 = asVar5.a(as.k, 4, 0).a(as.k, 6, 0);
        a6.f = true;
        a6.e = true;
        a6.i = true;
        sparseArray4.append(3, a6);
        SparseArray<as> sparseArray5 = f3421a;
        as asVar6 = new as(8, 3);
        asVar6.h = 4;
        as a7 = asVar6.a(as.k, 4, 0).a(as.k, 6, 0);
        a7.f = true;
        a7.e = true;
        a7.i = true;
        sparseArray5.append(4, a7);
        SparseArray<as> sparseArray6 = f3421a;
        as asVar7 = new as(10, 3);
        asVar7.h = 4;
        as a8 = asVar7.a(as.k, 4, 0).a(as.k, 6, 0).a(as.k, 8, 0);
        a8.f = true;
        a8.e = true;
        a8.i = true;
        sparseArray6.append(5, a8);
        SparseArray<as> sparseArray7 = f3422b;
        as asVar8 = new as(6, 4);
        asVar8.h = 0;
        as a9 = asVar8.a(as.j, 2, 0).a(as.j, 4, 0).a(as.o, 6, 0);
        a9.f = true;
        a9.e = true;
        a9.i = true;
        sparseArray7.append(0, a9);
        SparseArray<as> sparseArray8 = f3422b;
        as asVar9 = new as(8, 4);
        asVar9.h = 4;
        as a10 = asVar9.a(as.o, 4, 0).a(as.o, 6, 0);
        a10.f = true;
        a10.e = true;
        a10.i = true;
        sparseArray8.append(1, a10);
        SparseArray<as> sparseArray9 = f3422b;
        as asVar10 = new as(6, 4);
        asVar10.h = 2;
        as a11 = asVar10.a(as.p, 2, 0).a(as.p, 4, 0);
        a11.f = true;
        a11.e = true;
        a11.i = true;
        sparseArray9.append(2, a11);
        SparseArray<as> sparseArray10 = f3422b;
        as asVar11 = new as(8, 4);
        asVar11.h = 4;
        as a12 = asVar11.a(as.p, 4, 0).a(as.p, 6, 0);
        a12.f = true;
        a12.e = true;
        a12.i = true;
        sparseArray10.append(3, a12);
        SparseArray<as> sparseArray11 = f3422b;
        as asVar12 = new as(8, 4);
        asVar12.h = 4;
        as a13 = asVar12.a(as.p, 4, 0).a(as.p, 6, 0);
        a13.f = true;
        a13.e = true;
        a13.i = true;
        sparseArray11.append(4, a13);
        SparseArray<as> sparseArray12 = f3422b;
        as asVar13 = new as(10, 4);
        asVar13.h = 4;
        as a14 = asVar13.a(as.p, 4, 0).a(as.p, 6, 0).a(as.p, 8, 0);
        a14.f = true;
        a14.e = true;
        a14.i = true;
        sparseArray12.append(5, a14);
    }

    public static as a(int i, int i2, boolean z, int i3) {
        if (i2 == 2 && i3 < 3) {
            return c;
        }
        return ((as.b(i) > 1.0f ? 1 : (as.b(i) == 1.0f ? 0 : -1)) == 0 ? f3421a : f3422b).get(av.a(i2, z));
    }
}
