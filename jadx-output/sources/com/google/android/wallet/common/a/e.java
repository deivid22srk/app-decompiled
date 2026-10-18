package com.google.android.wallet.common.a;

import java.util.Comparator;

/* loaded from: classes.dex */
final class e implements Comparator<d> {
    e() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(d dVar, d dVar2) {
        int compare;
        d dVar3 = dVar;
        d dVar4 = dVar2;
        int compare2 = String.CASE_INSENSITIVE_ORDER.compare(dVar3.d, dVar4.d);
        if (compare2 == 0) {
            if (dVar3.f != null && dVar4.f != null && (compare = String.CASE_INSENSITIVE_ORDER.compare(dVar3.f.toString(), dVar4.f.toString())) != 0) {
                return compare;
            }
            return 0;
        }
        return compare2;
    }
}
