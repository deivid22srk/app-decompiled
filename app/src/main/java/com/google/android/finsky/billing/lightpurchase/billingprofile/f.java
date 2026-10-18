package com.google.android.finsky.billing.lightpurchase.billingprofile;

import android.view.View;
import com.google.android.finsky.apkg.i;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.as;
import com.google.android.finsky.protos.io;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ io f2332a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cy f2333b;
    final /* synthetic */ a c;

    public f(a aVar, io ioVar, cy cyVar) {
        this.c = aVar;
        this.f2332a = ioVar;
        this.f2333b = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar;
        as asVar;
        iVar = this.c.ax;
        iVar.a(2626, this.f2332a.z, this.f2333b);
        a aVar = this.c;
        byte[] bArr = this.f2332a.v;
        asVar = this.c.f2322a;
        aVar.a(bArr, asVar.e);
    }
}
