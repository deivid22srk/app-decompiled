package com.google.android.finsky.utils;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.sv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class jr {

    /* renamed from: a, reason: collision with root package name */
    private static com.google.android.finsky.g.r f5039a;

    public static boolean a(com.google.android.finsky.g.a aVar) {
        Iterator<com.google.android.finsky.g.r> it = aVar.j(com.google.android.finsky.g.a.f).iterator();
        while (it.hasNext()) {
            if (it.next().k == 29) {
                return true;
            }
        }
        return false;
    }

    public static Collection<String> b(com.google.android.finsky.g.a aVar) {
        ArrayList arrayList = null;
        for (com.google.android.finsky.g.r rVar : aVar.j(com.google.android.finsky.g.a.f)) {
            if (rVar.k == 29) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(rVar.j);
            }
        }
        return arrayList == null ? Collections.emptySet() : arrayList;
    }

    public static synchronized boolean a(String str, com.google.android.finsky.g.p pVar) {
        boolean b2;
        synchronized (jr.class) {
            if (f5039a == null) {
                f5039a = new com.google.android.finsky.g.r(com.google.android.finsky.g.r.f, com.google.android.finsky.g.a.f, 10, str, 29, 1);
            } else {
                f5039a.j = str;
            }
            b2 = pVar.b(f5039a);
        }
        return b2;
    }

    public static boolean a(Document document, com.google.android.finsky.g.a aVar) {
        boolean z;
        if (document.v()) {
            for (sv svVar : document.w()) {
                if (a(svVar.f4406a.c, aVar)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return z && !cy.a(document, aVar);
    }
}
