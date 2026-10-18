package com.google.android.finsky.api.model;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p extends r {

    /* renamed from: a, reason: collision with root package name */
    public Map<String, q> f1983a;

    public final void a(com.google.android.finsky.gpkg.h hVar) {
        for (com.google.android.finsky.gpkg.a aVar : hVar.e()) {
            com.google.android.finsky.gpkg.g j = aVar.j("u-pl");
            if (j.g() != 0) {
                String str = aVar.i.name;
                ArrayList arrayList = new ArrayList();
                Iterator it = j.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.google.android.finsky.gpkg.r) it.next()).j);
                }
                a(FinskyApp.a().b(str), arrayList, null, false);
            }
        }
        if (this.f1987b.size() == 0) {
            m_();
        }
    }

    @Override // com.google.android.finsky.api.model.r
    protected final void b() {
        if (this.f1983a != null) {
            FinskyLog.e("Unexpected repeat collation", new Object[0]);
        }
        this.f1983a = new HashMap();
        for (f fVar : this.f1987b) {
            List<Document> b2 = fVar.b();
            if (b2 != null) {
                String c = fVar.f1974a.c();
                for (Document document : b2) {
                    String str = document.f1963a.f3890a;
                    q qVar = this.f1983a.get(str);
                    if (qVar == null) {
                        this.f1983a.put(str, new q(document, c));
                    } else {
                        qVar.f1985b.add(c);
                    }
                }
            }
        }
    }
}
