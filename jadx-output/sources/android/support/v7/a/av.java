package android.support.v7.a;

import android.support.v4.view.by;
import android.support.v4.view.eo;
import android.support.v4.view.ep;
import android.view.View;

/* loaded from: classes.dex */
final class av extends ep {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ au f485a;

    av(au auVar) {
        this.f485a = auVar;
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void b(View view) {
        by.c((View) this.f485a.f484a.r, 1.0f);
        this.f485a.f484a.u.a((eo) null);
        this.f485a.f484a.u = null;
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void a(View view) {
        this.f485a.f484a.r.setVisibility(0);
    }
}
