package com.google.android.finsky.api;

import com.google.android.finsky.protos.op;
import com.google.android.finsky.utils.jb;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ op f2001a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f2002b;

    o(n nVar, op opVar) {
        this.f2002b = nVar;
        this.f2001a = opVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar;
        eVar = this.f2002b.u;
        jb.a(eVar.b(), this.f2001a.g);
    }
}
