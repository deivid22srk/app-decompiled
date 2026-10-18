package com.google.android.finsky.g;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f2831a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f2832b;

    m(h hVar, a aVar) {
        this.f2832b = hVar;
        this.f2831a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        list = this.f2832b.i;
        synchronized (list) {
            list2 = this.f2832b.i;
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((o) it.next()).L_();
            }
        }
    }
}
