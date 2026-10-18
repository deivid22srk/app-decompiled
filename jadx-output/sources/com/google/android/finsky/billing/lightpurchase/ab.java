package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.os.Bundle;
import com.android.vending.R;
import com.google.android.finsky.activities.AccessRestrictedActivity;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.hj;

/* loaded from: classes.dex */
final class ab implements hj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PurchaseActivity f2306a;

    ab(PurchaseActivity purchaseActivity) {
        this.f2306a = purchaseActivity;
    }

    @Override // com.google.android.finsky.utils.hj
    public final void a(boolean z) {
        PurchaseFragment k;
        com.google.android.finsky.a.i iVar;
        byte[] bArr;
        Bundle bundle;
        if (!z) {
            k = this.f2306a.k();
            if (k == null) {
                iVar = this.f2306a.o;
                iVar.a(0L, (cy) this.f2306a);
                Account account = this.f2306a.k;
                PurchaseParams purchaseParams = this.f2306a.l;
                bArr = this.f2306a.p;
                bundle = this.f2306a.q;
                this.f2306a.d().a().a(R.id.content_frame, PurchaseFragment.a(account, purchaseParams, bArr, bundle)).b();
                return;
            }
            return;
        }
        AccessRestrictedActivity.b(this.f2306a);
        this.f2306a.g();
        this.f2306a.finish();
    }
}
