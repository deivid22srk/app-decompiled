package com.google.android.finsky.activities.b;

import com.google.android.finsky.protos.jz;
import java.util.Map;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public Map<Integer, y> f1601a = new android.support.v4.h.a();

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.finsky.api.b f1602b;

    public x(jz jzVar, com.google.android.finsky.api.b bVar) {
        this.f1602b = bVar;
        if (jzVar.f4020b != null) {
            a(1, new com.google.android.finsky.api.model.i(this.f1602b, jzVar.f4020b.e, true), jzVar.f4020b.f4213a);
        }
        if (jzVar.c != null) {
            a(2, new com.google.android.finsky.api.model.i(this.f1602b, jzVar.c.e, true), jzVar.c.f4213a);
        }
        if (jzVar.f4019a == null) {
            return;
        }
        a(0, new com.google.android.finsky.api.model.i(this.f1602b, jzVar.f4019a.e, true), jzVar.f4019a.f4213a);
    }

    private void a(int i, com.google.android.finsky.api.model.i iVar, String str) {
        y yVar = new y(this, (byte) 0);
        yVar.f1604b = str;
        yVar.f1603a = iVar;
        this.f1601a.put(Integer.valueOf(i), yVar);
    }

    public final boolean a(int i) {
        return this.f1601a.containsKey(Integer.valueOf(i));
    }

    public final com.google.android.finsky.api.model.i b(int i) {
        return this.f1601a.get(Integer.valueOf(i)).f1603a;
    }

    public final String c(int i) {
        return this.f1601a.get(Integer.valueOf(i)).f1604b;
    }
}
