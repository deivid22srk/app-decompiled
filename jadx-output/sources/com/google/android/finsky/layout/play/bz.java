package com.google.android.finsky.layout.play;

import android.util.SparseArray;
import com.android.vending.R;

/* loaded from: classes.dex */
public final class bz {
    private static final SparseArray<by> e = new SparseArray<>();
    private static final SparseArray<by> f = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    public static final at f3460a = new at(R.layout.play_card_single, 4, 2, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final at f3461b = new at(R.layout.play_card_single, 6, 2, 1.0f);
    public static final at c = new at(R.layout.play_card_single, 4, 3, 1.441f);
    public static final at d = new at(R.layout.play_card_single, 6, 3, 1.441f);

    static {
        SparseArray<by> sparseArray = e;
        by byVar = new by(4, 2);
        byVar.w = 0;
        sparseArray.append(0, byVar.a(f3460a, 0, 0));
        SparseArray<by> sparseArray2 = e;
        by byVar2 = new by(6, 2);
        byVar2.w = 2;
        sparseArray2.append(1, byVar2.a(f3460a, 0, 0));
        SparseArray<by> sparseArray3 = e;
        by byVar3 = new by(8, 2);
        byVar3.w = 2;
        sparseArray3.append(3, byVar3.a(f3461b, 0, 0));
        SparseArray<by> sparseArray4 = e;
        by byVar4 = new by(10, 2);
        byVar4.w = 4;
        sparseArray4.append(5, byVar4.a(f3461b, 0, 0));
        SparseArray<by> sparseArray5 = f;
        by byVar5 = new by(4, 3);
        byVar5.w = 0;
        sparseArray5.append(0, byVar5.a(c, 0, 0));
        SparseArray<by> sparseArray6 = f;
        by byVar6 = new by(6, 3);
        byVar6.w = 2;
        sparseArray6.append(1, byVar6.a(c, 0, 0));
        SparseArray<by> sparseArray7 = f;
        by byVar7 = new by(8, 3);
        byVar7.w = 2;
        sparseArray7.append(3, byVar7.a(d, 0, 0));
        SparseArray<by> sparseArray8 = f;
        by byVar8 = new by(10, 3);
        byVar8.w = 4;
        sparseArray8.append(5, byVar8.a(d, 0, 0));
    }

    public static by a(int i, int i2) {
        return ((as.b(i) > 1.0f ? 1 : (as.b(i) == 1.0f ? 0 : -1)) == 0 ? e : f).get(av.a(i2, false));
    }
}
