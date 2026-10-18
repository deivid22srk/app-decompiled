package com.google.android.finsky.g;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f2833a;

    n(h hVar) {
        this.f2833a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        list = this.f2833a.i;
        synchronized (list) {
            list2 = this.f2833a.i;
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((o) it.next()).M_();
            }
        }
    }
}
