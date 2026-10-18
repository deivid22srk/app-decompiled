package com.google.android.finsky.detailspage;

import com.google.android.finsky.protos.oa;
import com.google.android.finsky.protos.ob;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class ct implements com.android.volley.t<ob> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cs f2593a;

    ct(cs csVar) {
        this.f2593a = csVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(ob obVar) {
        ob obVar2 = obVar;
        if (this.f2593a.f2559b == 0) {
            return;
        }
        ((cw) this.f2593a.f2559b).f2597b = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < obVar2.f4199a.length) {
                oa oaVar = obVar2.f4199a[i2];
                ((cw) this.f2593a.f2559b).f2597b.add(new da(oaVar.f4197a, oaVar.c, (int) oaVar.e, oaVar.g, oaVar.i, oaVar.k));
                i = i2 + 1;
            } else {
                this.f2593a.d.a((bd) this.f2593a, true);
                return;
            }
        }
    }
}
