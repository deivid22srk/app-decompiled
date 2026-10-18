package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class bu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f712a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bt f713b;

    bu(bt btVar, ArrayList arrayList) {
        this.f713b = btVar;
        this.f712a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f712a.iterator();
        while (it.hasNext()) {
            cd cdVar = (cd) it.next();
            bt btVar = this.f713b;
            eq eqVar = cdVar.f731a;
            int i = cdVar.f732b;
            int i2 = cdVar.c;
            int i3 = cdVar.d;
            int i4 = cdVar.e;
            View view = eqVar.f795a;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                android.support.v4.view.by.t(view).b(0.0f);
            }
            if (i6 != 0) {
                android.support.v4.view.by.t(view).c(0.0f);
            }
            android.support.v4.view.dy t = android.support.v4.view.by.t(view);
            btVar.e.add(eqVar);
            t.a(btVar.k).a(new bz(btVar, eqVar, i5, i6, t)).b();
        }
        this.f712a.clear();
        this.f713b.f711b.remove(this.f712a);
    }
}
