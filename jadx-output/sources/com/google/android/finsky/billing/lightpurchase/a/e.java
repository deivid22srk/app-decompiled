package com.google.android.finsky.billing.lightpurchase.a;

import com.google.android.finsky.protos.db;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f2290a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f2291b;

    e(a aVar, List list) {
        this.f2291b = aVar;
        this.f2290a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f2290a.iterator();
        while (it.hasNext()) {
            a.a(this.f2291b, (db) it.next());
        }
    }
}
