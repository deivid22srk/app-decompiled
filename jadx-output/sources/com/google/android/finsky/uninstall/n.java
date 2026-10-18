package com.google.android.finsky.uninstall;

import java.util.Comparator;

/* loaded from: classes.dex */
final class n implements Comparator<i> {
    private n() {
    }

    /* synthetic */ n(byte b2) {
        this();
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(i iVar, i iVar2) {
        i iVar3 = iVar;
        i iVar4 = iVar2;
        if (iVar3.c == iVar4.c) {
            return iVar3.f4700b.compareTo(iVar4.f4700b);
        }
        return iVar3.c < iVar4.c ? 1 : -1;
    }
}
