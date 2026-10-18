package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.activities.ff;
import com.google.android.finsky.protos.ny;

/* loaded from: classes.dex */
final class at implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ny f1901a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1902b;
    final /* synthetic */ av c;
    final /* synthetic */ aq d;

    at(aq aqVar, ny nyVar, int i, av avVar) {
        this.d = aqVar;
        this.f1901a = nyVar;
        this.f1902b = i;
        this.c = avVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aq aqVar = this.d;
        ny nyVar = this.f1901a;
        int i = this.f1902b;
        av avVar = this.c;
        aqVar.f.b(aqVar.c.f1963a.f3890a, nyVar.f4191a, ff.SPAM);
        aqVar.g.add(i, avVar);
        aqVar.d(i);
    }
}
