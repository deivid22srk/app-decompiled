package com.google.android.finsky.activities.myapps;

import java.text.Collator;
import java.util.Comparator;

/* loaded from: classes.dex */
final class v implements Comparator<w> {
    v() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(w wVar, w wVar2) {
        Collator collator;
        Collator collator2;
        w wVar3 = wVar;
        w wVar4 = wVar2;
        String str = wVar3.f1844b.f1963a.i;
        String str2 = wVar4.f1844b.f1963a.i;
        collator = u.i;
        int compare = collator.compare(str, str2);
        if (compare != 0) {
            return compare;
        }
        String str3 = wVar3.f1843a.f1963a.i;
        String str4 = wVar4.f1843a.f1963a.i;
        collator2 = u.i;
        int compare2 = collator2.compare(str3, str4);
        if (compare2 != 0) {
            return compare2;
        }
        return wVar3.f1844b.E().w.compareTo(wVar4.f1844b.E().w);
    }
}
