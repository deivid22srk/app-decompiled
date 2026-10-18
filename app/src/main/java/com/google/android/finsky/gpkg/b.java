package com.google.android.finsky.gpkg;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f2816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f2817b;

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
