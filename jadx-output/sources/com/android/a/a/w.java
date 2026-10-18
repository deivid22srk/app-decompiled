package com.android.a.a;

import android.util.Log;

/* loaded from: classes.dex */
final class w implements ao<am> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f1133a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f1134b;
    final /* synthetic */ y c;
    final /* synthetic */ u d;

    w(u uVar, aq aqVar, ab abVar, y yVar) {
        this.d = uVar;
        this.f1133a = aqVar;
        this.f1134b = abVar;
        this.c = yVar;
    }

    @Override // com.android.a.a.ao
    public final /* synthetic */ void a(am amVar) {
        am amVar2 = amVar;
        y.a(this.c, amVar2);
        this.d.c.a(this.f1133a.toString(), amVar2.toString());
    }

    @Override // com.android.a.a.ao
    public final void a() {
        Log.w("CacheData", "Request for key " + this.f1133a + " failed");
        this.d.d.remove(this.f1133a.toString());
        u.a(this.d, this.f1133a.toString());
        u.a(this.f1134b);
    }
}
