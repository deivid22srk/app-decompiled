package com.google.android.finsky.billing;

import android.view.View;
import com.google.android.finsky.protos.io;

/* loaded from: classes.dex */
final class r implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ io f2420a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2421b;
    final /* synthetic */ o c;

    r(o oVar, io ioVar, String str) {
        this.c = oVar;
        this.f2420a = ioVar;
        this.f2421b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.d.a(802, this.f2420a.z, this.c);
        this.c.f(this.f2421b);
    }
}
