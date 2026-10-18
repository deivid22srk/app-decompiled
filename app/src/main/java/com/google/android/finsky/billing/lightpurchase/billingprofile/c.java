package com.google.android.finsky.billing.lightpurchase.billingprofile;

import android.view.View;
import com.google.android.finsky.apkg.i;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.at;

/* loaded from: classes.dex */
final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ at f2326a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cy f2327b;
    final /* synthetic */ a c;

    c(a aVar, at atVar, cy cyVar) {
        this.c = aVar;
        this.f2326a = atVar;
        this.f2327b = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar;
        iVar = this.c.ax;
        iVar.a(812, this.f2326a.f, this.f2327b);
        a.b(this.c);
    }
}
