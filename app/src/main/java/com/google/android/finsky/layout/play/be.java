package com.google.android.finsky.layout.play;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<as> f3430a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static final SparseArray<as> f3431b = new SparseArray<>();

    static {
        SparseArray<as> sparseArray = f3430a;
        as asVar = new as(6, 3);
        asVar.f = true;
        asVar.e = true;
        sparseArray.append(1, asVar.a(as.j, 0, 0).a(as.j, 2, 0).a(as.j, 4, 0));
        SparseArray<as> sparseArray2 = f3430a;
        as asVar2 = new as(8, 3);
        asVar2.f = true;
        asVar2.e = true;
        sparseArray2.append(3, asVar2.a(as.j, 0, 0).a(as.j, 2, 0).a(as.j, 4, 0).a(as.j, 6, 0));
        SparseArray<as> sparseArray3 = f3431b;
        as asVar3 = new as(6, 4);
        asVar3.f = true;
        asVar3.e = true;
        sparseArray3.append(1, asVar3.a(as.o, 0, 0).a(as.o, 2, 0).a(as.o, 4, 0));
        SparseArray<as> sparseArray4 = f3431b;
        as asVar4 = new as(8, 4);
        asVar4.f = true;
        asVar4.e = true;
        sparseArray4.append(3, asVar4.a(as.o, 0, 0).a(as.o, 2, 0).a(as.o, 4, 0).a(as.o, 6, 0));
    }

    public static as a(int i, int i2) {
        return ((as.b(i) > 1.0f ? 1 : (as.b(i) == 1.0f ? 0 : -1)) == 0 ? f3430a : f3431b).get(av.a(i2, false));
    }
}
