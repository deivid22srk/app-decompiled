package com.google.android.finsky.gpkg;

import com.android.volley.VolleyError;
import com.google.android.finsky.protos.is;
import com.google.android.finsky.protos.iv;
import com.google.android.finsky.protos.jb;
import java.util.List;

/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f2845a;

    y(x xVar) {
        this.f2845a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ag agVar;
        List list;
        List list2;
        boolean z;
        ag agVar2;
        com.google.android.finsky.api.b bVar;
        ag agVar3;
        ag agVar4;
        agVar = this.f2845a.j;
        if (agVar == null) {
            synchronized (this) {
                list = this.f2845a.i;
                if (list.size() != 0) {
                    x xVar = this.f2845a;
                    list2 = this.f2845a.i;
                    xVar.j = (ag) list2.remove(0);
                    z = this.f2845a.k;
                    if (z) {
                        x xVar2 = this.f2845a;
                        agVar4 = this.f2845a.j;
                        xVar2.a(2, (jb) null, (VolleyError) null, agVar4.c);
                    }
                    is isVar = new is();
                    agVar2 = this.f2845a.j;
                    int length = agVar2.f2793a.length;
                    isVar.f3969a = new iv[length];
                    for (int i = 0; i < length; i++) {
                        iv[] ivVarArr = isVar.f3969a;
                        x xVar3 = this.f2845a;
                        agVar3 = this.f2845a.j;
                        ivVarArr[i] = x.a(xVar3, agVar3.f2793a[i]);
                    }
                    isVar.f3970b = 2;
                    ac acVar = new ac(this.f2845a);
                    bVar = this.f2845a.e;
                    bVar.a(isVar, acVar, acVar);
                }
            }
        }
    }
}
