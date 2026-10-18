package com.google.android.finsky.billing.lightpurchase;

import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.mc;
import com.google.android.finsky.protos.md;
import com.google.android.finsky.protos.me;
import com.google.android.finsky.protos.mg;
import com.google.android.finsky.protos.ml;
import com.google.android.finsky.protos.mo;
import com.google.android.finsky.protos.mp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cr;
import com.google.android.finsky.utils.jb;

/* loaded from: classes.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ me f2383a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ mp f2384b;
    final /* synthetic */ mo c;
    final /* synthetic */ e d;

    f(e eVar, me meVar, mp mpVar, mo moVar) {
        this.d = eVar;
        this.f2383a = meVar;
        this.f2384b = mpVar;
        this.c = moVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PurchaseParams purchaseParams;
        com.google.android.finsky.api.b bVar;
        com.google.android.finsky.protos.k kVar;
        com.google.android.finsky.protos.k kVar2;
        com.google.android.finsky.protos.k kVar3;
        com.google.android.finsky.protos.k kVar4;
        com.google.android.finsky.protos.k kVar5;
        boolean z;
        mc mcVar;
        PurchaseParams purchaseParams2;
        PurchaseParams purchaseParams3;
        boolean z2 = false;
        purchaseParams = this.d.c;
        if (purchaseParams.f2281a.c == 1) {
            if (this.f2383a.d == null) {
                purchaseParams2 = this.d.c;
                FinskyLog.c("missing delivery data for %s", purchaseParams2.f2282b);
            } else {
                if (!TextUtils.isEmpty(this.f2383a.g)) {
                    com.google.android.finsky.receivers.f fVar = FinskyApp.a().k;
                    purchaseParams3 = this.d.c;
                    fVar.b(purchaseParams3.f2282b, this.f2383a.g);
                }
                this.d.u();
            }
        }
        switch (this.f2384b.f4140a) {
            case 0:
                this.d.al = this.f2383a.k;
                if (FinskyApp.a().e().a(12603704L)) {
                    kVar = this.d.al;
                    if (kVar != null) {
                        kVar3 = this.d.al;
                        if (kVar3.f4021a != null) {
                            kVar4 = this.d.al;
                            if (kVar4.f4021a.f4066a != null) {
                                kVar5 = this.d.al;
                                if (kVar5.f4021a.f4066a.f3938a != null) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    if (z2) {
                        kVar2 = this.d.al;
                        int i = kVar2.f4021a.f4066a.f3938a.g;
                        if ((i == 1 || i == 6) && !cr.a(FinskyApp.a().getPackageManager(), i)) {
                            this.d.a(11, 0);
                            break;
                        }
                    }
                }
                if (FinskyApp.a().e().a(12603718L)) {
                    bVar = this.d.f2381a;
                    jb.a(bVar.c(), 5);
                }
                this.d.a(2, 7);
                break;
            case 1:
                this.d.a(3, 4);
                break;
            case 2:
                this.d.an = this.f2383a.f4120b;
                z = this.d.e;
                if (z && this.c != null && this.c.c != null) {
                    this.d.e = false;
                    this.d.g = this.c.c;
                    mcVar = this.d.g;
                    mcVar.x = null;
                }
                this.d.a(7, 0);
                break;
            case 3:
                this.d.aq = new CheckoutPurchaseError(this.f2384b.e, this.f2384b.c);
                this.d.a(3, 5);
                break;
            case 4:
                md mdVar = this.f2383a.j;
                if (mdVar.f4117a == 1) {
                    mg mgVar = mdVar.c;
                    this.d.aq = new CheckoutPurchaseError(this.f2384b.e, mgVar.c, mgVar.f4123a, null);
                    this.d.a(10, 0);
                    break;
                } else if (mdVar.f4117a == 2) {
                    ml mlVar = mdVar.d;
                    this.d.aq = new CheckoutPurchaseError(this.f2384b.e, mlVar.f4133b, null, mlVar.f4132a);
                    this.d.a(3, 5);
                    break;
                } else {
                    FinskyLog.e("Unknown recoverable error type: %d", Integer.valueOf(mdVar.f4117a));
                    this.d.aq = new CheckoutPurchaseError();
                    this.d.a(3, 5);
                    break;
                }
            default:
                FinskyLog.e("Unknown purchase status: %d", Integer.valueOf(this.f2384b.f4140a));
                this.d.aq = new CheckoutPurchaseError();
                this.d.a(3, 5);
                break;
        }
    }
}
