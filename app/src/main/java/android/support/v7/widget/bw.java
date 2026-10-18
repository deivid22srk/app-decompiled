package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class bw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f716a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bt f717b;

    bw(bt btVar, ArrayList arrayList) {
        this.f717b = btVar;
        this.f716a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f716a.iterator();
        while (it.hasNext()) {
            eq eqVar = (eq) it.next();
            bt btVar = this.f717b;
            android.support.v4.view.dy t = android.support.v4.view.by.t(eqVar.f795a);
            btVar.d.add(eqVar);
            t.a(1.0f).a(btVar.i).a(new by(btVar, eqVar, t)).b();
        }
        this.f716a.clear();
        this.f717b.f710a.remove(this.f716a);
    }
}
