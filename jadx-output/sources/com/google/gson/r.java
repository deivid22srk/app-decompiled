package com.google.gson;

import java.util.List;

/* loaded from: classes2.dex */
final class r extends com.google.gson.b.q {
    r() {
    }

    @Override // com.google.gson.b.q
    public final <T> aj<T> a(k kVar, ak akVar, com.google.gson.c.a<T> aVar) {
        List<ak> list;
        list = kVar.e;
        boolean z = false;
        for (ak akVar2 : list) {
            if (!z) {
                if (akVar2 == akVar) {
                    z = true;
                }
            } else {
                aj<T> a2 = akVar2.a(kVar, aVar);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }
}
