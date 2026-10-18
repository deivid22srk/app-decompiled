package com.google.android.finsky.g;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f2816a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f2817b;

    b(a aVar, List list) {
        this.f2817b = aVar;
        this.f2816a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f2816a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a();
        }
    }
}
