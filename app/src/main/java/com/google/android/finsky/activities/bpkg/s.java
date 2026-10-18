package com.google.android.finsky.activities.bpkg;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.gpkg.aq;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1595a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, aq> f1596b = new android.support.v4.h.a();
    public final com.google.android.finsky.gpkg.a c;

    public s(com.google.android.finsky.gpkg.a aVar) {
        this.c = aVar;
        for (com.google.android.finsky.gpkg.u uVar : aVar.c()) {
            this.f1596b.put(uVar.j, uVar);
        }
        for (aq aqVar : aVar.d()) {
            this.f1596b.put(aqVar.j, aqVar);
        }
        List<aq> e = aVar.e();
        for (aq aqVar2 : e) {
            this.f1596b.put(aqVar2.j, aqVar2);
        }
        this.f1595a = e.size() > 0;
    }

    public final aq a(Document document) {
        if (!this.f1596b.containsKey(document.f1963a.c)) {
            return null;
        }
        return (aq) this.c.a(this.f1596b.get(document.f1963a.c));
    }
}
