package com.google.android.gms.car;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class ex extends ck {

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f5517a = false;

    /* renamed from: b, reason: collision with root package name */
    final WeakReference<eu> f5518b;

    public ex(eu euVar) {
        this.f5518b = new WeakReference<>(euVar);
    }

    @Override // com.google.android.gms.car.cj
    public final void a(int i) {
        List list;
        List list2;
        List list3;
        eu euVar = this.f5518b.get();
        if (euVar == null) {
            Log.i("CAR.CLIENT", "Null carClient in ICarConnectionListenerImpl.onConnected");
            return;
        }
        list = euVar.r;
        ArrayList arrayList = new ArrayList(list.size());
        synchronized (this) {
            if (!this.f5517a) {
                list3 = euVar.r;
                arrayList.addAll(list3);
                this.f5517a = true;
            }
            if (!arrayList.isEmpty()) {
                a(euVar, arrayList, i);
            }
        }
        if (arrayList.isEmpty() && ah.a("CAR.CLIENT", 4)) {
            StringBuilder sb = new StringBuilder("Not notifying car connection [listeners=");
            list2 = euVar.r;
            Log.i("CAR.CLIENT", sb.append(list2).append(", mConnectionNotified=").append(this.f5517a).append("]").toString());
        }
    }

    @Override // com.google.android.gms.car.cj
    public final void a() {
        List list;
        List list2;
        eu euVar = this.f5518b.get();
        if (euVar == null) {
            Log.i("CAR.CLIENT", "Null carClient in ICarConnectionListenerImpl.onDisconnected");
            return;
        }
        list = euVar.r;
        ArrayList arrayList = new ArrayList(list.size());
        synchronized (this) {
            if (this.f5517a) {
                list2 = euVar.r;
                arrayList.addAll(list2);
                this.f5517a = false;
            }
            if (!arrayList.isEmpty()) {
                ei.a(euVar.f5717b, new ez(this, arrayList, euVar));
            }
        }
        euVar.q();
    }

    final void a(eu euVar, List<f> list, int i) {
        ei.a(euVar.f5717b, new ey(this, list, euVar, i));
    }
}
