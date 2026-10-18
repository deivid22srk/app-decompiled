package com.google.android.finsky.billing.a;

import android.support.v4.app.aa;
import android.support.v4.app.ad;
import com.google.android.finsky.activities.ch;
import com.google.android.finsky.protos.cj;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f2144a;

    c(b bVar) {
        this.f2144a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cj cjVar;
        ad adVar = this.f2144a.B;
        cjVar = this.f2144a.i;
        ch.a((aa) adVar, (String) null, cjVar.l, false);
    }
}
