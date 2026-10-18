package com.google.android.finsky.wear;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class f implements com.google.android.gms.common.api.y<com.google.android.gms.wearable.n> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f5126a;

    f(e eVar) {
        this.f5126a = eVar;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.wearable.n nVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Handler handler;
        com.google.android.gms.wearable.n nVar2 = nVar;
        synchronized (d.class) {
            d.b(this.f5126a.f5125b, nVar2, this.f5126a.f5124a);
            nVar2.a();
            arrayList = d.v;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable != null) {
                    handler = d.w;
                    handler.post(runnable);
                }
            }
            arrayList2 = d.v;
            arrayList2.clear();
            d.k();
            d.l();
        }
    }
}
