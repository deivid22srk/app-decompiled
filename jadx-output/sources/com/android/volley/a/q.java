package com.android.volley.a;

import java.util.Iterator;

/* loaded from: classes.dex */
final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f1221a;

    q(n nVar) {
        this.f1221a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (r rVar : this.f1221a.d.values()) {
            Iterator<t> it = rVar.c.iterator();
            while (it.hasNext()) {
                t next = it.next();
                if (next.f1225b != null) {
                    if (rVar.f1223b != null) {
                        next.f1225b.a(rVar.f1223b);
                    } else {
                        next.f1224a = rVar.f1222a;
                        next.f1225b.a(next, false);
                    }
                }
            }
        }
        this.f1221a.d.clear();
        this.f1221a.e = null;
    }
}
