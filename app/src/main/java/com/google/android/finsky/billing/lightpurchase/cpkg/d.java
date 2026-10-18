package com.google.android.finsky.billing.lightpurchase.cpkg;

import android.view.View;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public final class d implements com.google.android.play.utils.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f2349b;

    d(b bVar, String str) {
        this.f2349b = bVar;
        this.f2348a = str;
    }

    @Override // com.google.android.play.utils.k
    public final void a(View view, String str) {
        this.f2349b.a(756, false);
        com.google.android.finsky.billing.lightpurchase.o u = com.google.android.finsky.billing.lightpurchase.o.u();
        u.a(this.f2349b.f().d(), (String) null);
        jm.a(new e(this, u), new Void[0]);
    }
}
