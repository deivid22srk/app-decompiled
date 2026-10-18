package com.google.android.finsky.autoupdate;

import java.util.Comparator;

/* loaded from: classes.dex */
final class b implements Comparator<a> {
    b() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        if (aVar3.i != aVar4.i) {
            return aVar3.i - aVar4.i;
        }
        return aVar3.j - aVar4.j;
    }
}
