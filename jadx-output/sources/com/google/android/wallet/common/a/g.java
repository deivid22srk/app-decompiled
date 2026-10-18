package com.google.android.wallet.common.a;

import android.util.SparseArray;
import java.text.Collator;
import java.util.Comparator;

/* loaded from: classes.dex */
final class g implements Comparator<Integer> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collator f7254a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ SparseArray f7255b;

    g(Collator collator, SparseArray sparseArray) {
        this.f7254a = collator;
        this.f7255b = sparseArray;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Integer num, Integer num2) {
        return this.f7254a.compare((String) this.f7255b.get(num.intValue()), (String) this.f7255b.get(num2.intValue()));
    }
}
