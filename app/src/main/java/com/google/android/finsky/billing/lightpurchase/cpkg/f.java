package com.google.android.finsky.billing.lightpurchase.cpkg;

import android.view.View;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;

/* loaded from: classes.dex */
public final class f implements com.google.android.play.utils.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f2352a;

    f(b bVar) {
        this.f2352a = bVar;
    }

    @Override // com.google.android.play.utils.k
    public final void a(View view, String str) {
        this.f2352a.a(754, false);
        this.f2352a.f2346a = com.google.android.finsky.cpkg.p.b(this.f2352a.e.name);
        ((PurchaseFragment) b.c(this.f2352a)).x();
    }
}
