package com.google.gson.stream;

import com.google.gson.ab;
import com.google.gson.b.a.i;
import com.google.gson.b.r;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class b extends r {
    b() {
    }

    @Override // com.google.gson.b.r
    public final void a(a aVar) {
        e eVar;
        String str;
        int q;
        int r;
        if (aVar instanceof i) {
            i iVar = (i) aVar;
            iVar.a(e.NAME);
            Map.Entry entry = (Map.Entry) ((Iterator) iVar.g()).next();
            iVar.f7791a.add(entry.getValue());
            iVar.f7791a.add(new ab((String) entry.getKey()));
            return;
        }
        aVar.f();
        eVar = aVar.l;
        if (eVar != e.NAME) {
            StringBuilder append = new StringBuilder("Expected a name but was ").append(aVar.f()).append("  at line ");
            q = aVar.q();
            StringBuilder append2 = append.append(q).append(" column ");
            r = aVar.r();
            throw new IllegalStateException(append2.append(r).toString());
        }
        str = aVar.m;
        aVar.n = str;
        a.e(aVar);
        aVar.l = e.STRING;
    }
}
