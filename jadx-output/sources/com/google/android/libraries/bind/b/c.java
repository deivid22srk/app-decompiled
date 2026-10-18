package com.google.android.libraries.bind.b;

import android.support.v4.view.bn;

/* loaded from: classes.dex */
public final class c {
    private static int c(bn bnVar, int i) {
        return i < 0 ? i : (bnVar.a() - 1) - i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(bn bnVar, int i) {
        if ((bnVar instanceof a) && ((a) bnVar).e()) {
            return c(bnVar, i);
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(bn bnVar, int i) {
        if ((bnVar instanceof a) && ((a) bnVar).e()) {
            return c(bnVar, i);
        }
        return i;
    }
}
