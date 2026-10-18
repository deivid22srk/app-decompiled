package com.google.android.finsky.billing.lightpurchase.billingprofile;

import android.view.View;
import com.google.android.finsky.a.i;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.at;

/* loaded from: classes.dex */
final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ at f2328a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cy f2329b;
    final /* synthetic */ a c;

    d(a aVar, at atVar, cy cyVar) {
        this.c = aVar;
        this.f2328a = atVar;
        this.f2329b = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar;
        iVar = this.c.ax;
        iVar.a(813, this.f2328a.f, this.f2329b);
        a.a(this.c, this.f2328a.m);
    }
}
