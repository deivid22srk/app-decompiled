package com.google.android.finsky.billing.lightpurchase.billingprofile;

import android.view.View;
import com.google.android.finsky.apkg.i;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.at;

/* loaded from: classes.dex */
final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ at f2324a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cy f2325b;
    final /* synthetic */ a c;

    b(a aVar, at atVar, cy cyVar) {
        this.c = aVar;
        this.f2324a = atVar;
        this.f2325b = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar;
        iVar = this.c.ax;
        iVar.a(811, this.f2324a.f, this.f2325b);
        a.a(this.c, this.f2324a.l);
    }
}
