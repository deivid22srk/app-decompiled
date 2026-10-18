package com.google.android.finsky.layout.play;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class bf {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<as> f3432a;

    static {
        SparseArray<as> sparseArray = new SparseArray<>();
        f3432a = sparseArray;
        as asVar = new as(6, 3);
        asVar.e = true;
        sparseArray.append(0, asVar.a(as.u, 0, 0).a(as.u, 2, 0).a(as.u, 4, 0));
        SparseArray<as> sparseArray2 = f3432a;
        as asVar2 = new as(8, 3);
        asVar2.e = true;
        sparseArray2.append(1, asVar2.a(as.u, 0, 0).a(as.u, 2, 0).a(as.u, 4, 0).a(as.u, 6, 0));
        SparseArray<as> sparseArray3 = f3432a;
        as asVar3 = new as(8, 3);
        asVar3.e = true;
        sparseArray3.append(2, asVar3.a(as.u, 0, 0).a(as.u, 2, 0).a(as.u, 4, 0).a(as.u, 6, 0));
        SparseArray<as> sparseArray4 = f3432a;
        as asVar4 = new as(8, 3);
        asVar4.e = true;
        sparseArray4.append(3, asVar4.a(as.u, 0, 0).a(as.u, 2, 0).a(as.u, 4, 0).a(as.u, 6, 0));
        SparseArray<as> sparseArray5 = f3432a;
        as asVar5 = new as(8, 3);
        asVar5.e = true;
        sparseArray5.append(4, asVar5.a(as.u, 0, 0).a(as.u, 2, 0).a(as.u, 4, 0).a(as.u, 6, 0));
        SparseArray<as> sparseArray6 = f3432a;
        as asVar6 = new as(10, 3);
        asVar6.e = true;
        sparseArray6.append(5, asVar6.a(as.u, 0, 0).a(as.u, 2, 0).a(as.u, 4, 0).a(as.u, 6, 0).a(as.u, 8, 0));
    }

    public static as a(int i, boolean z) {
        return f3432a.get(av.a(i, z));
    }
}
