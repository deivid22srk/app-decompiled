package com.google.android.finsky.detailspage;

import com.google.android.finsky.api.model.Document;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class am implements com.google.android.finsky.api.model.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ al f2541a;

    am(al alVar) {
        this.f2541a = alVar;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        com.google.android.finsky.api.model.i iVar;
        com.google.android.finsky.api.model.i iVar2;
        String str;
        iVar = this.f2541a.f2540a;
        int p = iVar.p();
        if (p == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < p; i++) {
            iVar2 = this.f2541a.f2540a;
            Document c = iVar2.c(i);
            if (((aq) this.f2541a.f2559b).d == null) {
                String str2 = c.f1963a.f3890a;
                str = this.f2541a.z;
                if (str2.equals(str)) {
                    ((aq) this.f2541a.f2559b).d = c;
                    this.f2541a.d.a("EpisodeListModule.SeasonDocument", ((aq) this.f2541a.f2559b).d);
                }
            }
            arrayList.add(c);
        }
        ((aq) this.f2541a.f2559b).f2546b = arrayList;
        if (((aq) this.f2541a.f2559b).d == null) {
            ((aq) this.f2541a.f2559b).d = (Document) arrayList.get(0);
            this.f2541a.d.a("EpisodeListModule.SeasonDocument", ((aq) this.f2541a.f2559b).d);
        }
        if (((aq) this.f2541a.f2559b).c == null) {
            this.f2541a.e();
        }
    }
}
