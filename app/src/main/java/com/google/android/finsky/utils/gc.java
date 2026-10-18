package com.google.android.finsky.utils;

import android.accounts.Account;
import android.content.Context;
import com.google.android.finsky.api.model.Document;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class gc {

    /* renamed from: a, reason: collision with root package name */
    static final long f4893a = com.google.android.finsky.cpkg.d.ep.b().longValue();

    /* renamed from: b, reason: collision with root package name */
    public List<gk> f4894b = new ArrayList();
    public final com.google.android.finsky.gpkg.h c;
    final com.google.android.finsky.bpkg.x d;
    final ie e;
    private final com.google.android.finsky.api.k f;
    private final com.google.android.finsky.gpkg.ah g;

    public gc(com.google.android.finsky.api.k kVar, com.google.android.finsky.gpkg.h hVar, com.google.android.finsky.gpkg.ah ahVar, com.google.android.finsky.bpkg.x xVar, ie ieVar) {
        this.f = kVar;
        this.c = hVar;
        this.g = ahVar;
        this.d = xVar;
        this.e = ieVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        for (int size = this.f4894b.size() - 1; size >= 0; size--) {
            this.f4894b.get(size).a(str);
        }
    }

    public final boolean a(String str, Account account) {
        return this.c.a(account).b(new com.google.android.finsky.gpkg.r(account.name, "u-pl", 3, str, 1, 1));
    }

    private void a(String str, String str2, com.google.android.finsky.api.b bVar, boolean z, Context context) {
        Account b2 = bVar.b();
        boolean a2 = a(str, b2);
        if (z != a2) {
            gd gdVar = new gd(this, b2, str, a2);
            gf gfVar = new gf(this, a2, str2, context, str);
            if (a2) {
                bVar.b(cz.a(str), "u-pl", gdVar, gfVar);
            } else {
                bVar.a(cz.a(str), "u-pl", gdVar, gfVar);
            }
            b(str);
        }
    }

    final void a(String str, List<String> list, Context context) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            com.google.android.finsky.api.b a2 = this.f.a(it.next());
            if (a2 != null) {
                a(str, (String) null, a2, false, context);
            }
        }
    }

    public final void a(String str) {
        bg.X.b(str).a((com.google.android.finsky.cpkg.o<Long>) Long.valueOf(this.e.a()));
        ArrayList a2 = cz.a(jm.d(bg.W.a()));
        if (!a2.contains(str)) {
            a2.add(str);
            bg.W.a((com.google.android.finsky.cpkg.o<String>) jm.a(a2));
        }
    }

    public final void a(Document document, com.google.android.finsky.api.b bVar, boolean z, android.support.v4.app.aa aaVar, Context context) {
        a(document.f1963a.f3890a, document.f1963a.i, bVar, z, context);
        if (z && aaVar != null) {
            com.google.android.finsky.activities.ex.a(document, aaVar);
        }
    }
}
