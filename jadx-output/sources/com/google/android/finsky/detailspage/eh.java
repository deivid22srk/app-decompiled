package com.google.android.finsky.detailspage;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.fy;
import com.google.android.finsky.protos.ga;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Map;

/* loaded from: classes.dex */
final class eh implements com.android.volley.t<ga> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f2641a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eg f2642b;

    eh(eg egVar, Map map) {
        this.f2642b = egVar;
        this.f2641a = map;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(ga gaVar) {
        boolean z;
        ga gaVar2 = gaVar;
        z = this.f2642b.u;
        if (z) {
            FinskyLog.a("Destroyed, ignoring response.", new Object[0]);
            return;
        }
        ((ej) this.f2642b.f2559b).d.clear();
        ((ej) this.f2642b.f2559b).e.clear();
        for (fy fyVar : gaVar2.f3856a) {
            if (fyVar.f3852a == null) {
                FinskyLog.d("Received response entry without doc.", new Object[0]);
            } else {
                String str = fyVar.f3852a.c;
                com.google.android.finsky.g.aq aqVar = (com.google.android.finsky.g.aq) this.f2641a.get(str);
                if (aqVar == null) {
                    FinskyLog.d("Subscription entry not available for: %s", str);
                } else {
                    ((ej) this.f2642b.f2559b).d.add(new Document(fyVar.f3852a));
                    ((ej) this.f2642b.f2559b).e.add(aqVar);
                }
            }
        }
        ((ej) this.f2642b.f2559b).c = true;
        this.f2642b.e();
    }
}
