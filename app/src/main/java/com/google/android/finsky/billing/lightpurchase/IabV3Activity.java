package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class IabV3Activity extends PurchaseActivity {
    public static Intent a(Account account, PurchaseParams purchaseParams) {
        Intent a2 = PurchaseActivity.a(account, purchaseParams, (byte[]) null, (Bundle) null);
        a2.setClass(FinskyApp.a(), IabV3Activity.class);
        return a2;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.PurchaseActivity
    protected final void g() {
        setResult(0, new Intent().putExtra("RESPONSE_CODE", com.google.android.finsky.billing.iab.n.RESULT_USER_CANCELED.ordinal()));
    }

    @Override // com.google.android.finsky.billing.lightpurchase.PurchaseActivity
    protected final void a(PurchaseFragment purchaseFragment) {
        com.google.android.finsky.billing.iab.n nVar;
        Bundle bundle;
        boolean z = purchaseFragment.f;
        PurchaseFragment.PurchaseError purchaseError = purchaseFragment.e;
        if (z) {
            nVar = com.google.android.finsky.billing.iab.n.RESULT_OK;
        } else if (purchaseError == null) {
            nVar = com.google.android.finsky.billing.iab.n.RESULT_USER_CANCELED;
        } else if (purchaseError.f2279a == 3) {
            switch (purchaseError.f2280b) {
                case 0:
                    nVar = com.google.android.finsky.billing.iab.n.RESULT_ERROR;
                    break;
                case 1:
                    FinskyLog.c("Unexpected INSTALL_OK response.", new Object[0]);
                    nVar = com.google.android.finsky.billing.iab.n.RESULT_OK;
                    break;
                case 3:
                    nVar = com.google.android.finsky.billing.iab.n.RESULT_ITEM_ALREADY_OWNED;
                    break;
                case 4:
                    nVar = com.google.android.finsky.billing.iab.n.RESULT_ITEM_UNAVAILABLE;
                    break;
                case 12:
                    nVar = com.google.android.finsky.billing.iab.n.RESULT_DEVELOPER_ERROR;
                    break;
                default:
                    FinskyLog.e("Unexpected PurchasePermissionResponse: %d", Integer.valueOf(purchaseError.f2280b));
                    nVar = com.google.android.finsky.billing.iab.n.RESULT_ERROR;
                    break;
            }
        } else if (purchaseError.f2279a == 1) {
            nVar = com.google.android.finsky.billing.iab.n.RESULT_ITEM_ALREADY_OWNED;
        } else {
            if (purchaseError.f2279a == 2) {
                nVar = com.google.android.finsky.billing.iab.n.RESULT_SERVICE_UNAVAILABLE;
            }
            nVar = com.google.android.finsky.billing.iab.n.RESULT_ERROR;
        }
        Context applicationContext = getApplicationContext();
        PurchaseParams purchaseParams = this.l;
        if (purchaseFragment.g != null) {
            bundle = purchaseFragment.g;
        } else {
            bundle = purchaseFragment.f2277a.ak;
        }
        setResult(nVar == com.google.android.finsky.billing.iab.n.RESULT_OK ? -1 : 0, com.google.android.finsky.billing.iab.m.a(applicationContext, purchaseParams, bundle, nVar));
    }
}
