package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class bv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f714a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bt f715b;

    bv(bt btVar, ArrayList arrayList) {
        this.f715b = btVar;
        this.f714a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f714a.iterator();
        while (it.hasNext()) {
            cc ccVar = (cc) it.next();
            bt btVar = this.f715b;
            eq eqVar = ccVar.f729a;
            View view = eqVar == null ? null : eqVar.f795a;
            eq eqVar2 = ccVar.f730b;
            View view2 = eqVar2 != null ? eqVar2.f795a : null;
            if (view != null) {
                android.support.v4.view.dy a2 = android.support.v4.view.by.t(view).a(btVar.l);
                btVar.g.add(ccVar.f729a);
                a2.b(ccVar.e - ccVar.c);
                a2.c(ccVar.f - ccVar.d);
                a2.a(0.0f).a(new ca(btVar, ccVar, a2)).b();
            }
            if (view2 != null) {
                android.support.v4.view.dy t = android.support.v4.view.by.t(view2);
                btVar.g.add(ccVar.f730b);
                t.b(0.0f).c(0.0f).a(btVar.l).a(1.0f).a(new cb(btVar, ccVar, t, view2)).b();
            }
        }
        this.f714a.clear();
        this.f715b.c.remove(this.f714a);
    }
}
