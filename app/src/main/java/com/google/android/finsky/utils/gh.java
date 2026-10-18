package com.google.android.finsky.utils;

import android.content.Context;
import com.google.android.finsky.api.model.Document;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class gh implements com.google.android.finsky.api.model.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.api.model.p f4902a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gj f4903b;
    final /* synthetic */ Context c;
    final /* synthetic */ gc d;

    public gh(gc gcVar, com.google.android.finsky.api.model.p pVar, gj gjVar, Context context) {
        this.d = gcVar;
        this.f4902a = pVar;
        this.f4903b = gjVar;
        this.c = context;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        gc gcVar = this.d;
        Map<String, com.google.android.finsky.api.model.q> map = this.f4902a.f1983a;
        gj gjVar = this.f4903b;
        Context context = this.c;
        ArrayList a2 = cz.a(jm.d(bg.W.a()));
        Iterator it = a2.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!map.containsKey(str)) {
                bg.X.b(str).c();
                it.remove();
                z = true;
            }
        }
        if (z) {
            if (a2.size() == 0) {
                bg.W.c();
            } else {
                bg.W.a((com.google.android.finsky.cpkg.o<String>) jm.a(a2));
            }
        }
        long a3 = gcVar.e.a();
        for (com.google.android.finsky.api.model.q qVar : map.values()) {
            Document document = qVar.f1984a;
            if (!document.P() && document.Q() == 1) {
                String str2 = document.f1963a.f3890a;
                if (gcVar.d.a(str2) != null) {
                    gcVar.a(str2, qVar.f1985b, context);
                } else if (qVar.f1985b.size() == 0) {
                    FinskyLog.e("We got a document (%s) with no associated account names", str2);
                } else {
                    long longValue = bg.X.b(str2).a().longValue();
                    if (longValue == 0) {
                        if (gjVar != null) {
                            gjVar.a(document, qVar.f1985b.get(0));
                        }
                    } else if (longValue < a3 - gc.f4893a) {
                        gcVar.a(str2, qVar.f1985b, context);
                    }
                }
            }
        }
        if (this.f4903b != null) {
            this.f4903b.a(true);
        }
    }
}
