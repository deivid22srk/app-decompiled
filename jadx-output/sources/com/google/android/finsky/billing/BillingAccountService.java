package com.google.android.finsky.billing;

import android.accounts.Account;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.promptforfop.SetupWizardPromptForFopActivity;
import com.google.android.finsky.protos.dm;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cg;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class BillingAccountService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle a(Account account) {
        int b2;
        Bundle bundle = new Bundle();
        com.google.android.finsky.api.b b3 = FinskyApp.a().b(account.name);
        com.android.volley.a.ae a2 = com.android.volley.a.ae.a();
        b3.d(a2, a2);
        try {
            dm dmVar = (dm) a2.get();
            if (!dmVar.d) {
                FinskyLog.e("No available promo offer status returned.", new Object[0]);
                b2 = -1;
            } else {
                switch (dmVar.c) {
                    case 2:
                        FinskyLog.e("Unexpected NO_FOP_HAS_OFFER", new Object[0]);
                    case 3:
                        bundle.putParcelable("available_offer_redemption_intent", SetupWizardPromptForFopActivity.a(account));
                        b2 = 1;
                        break;
                    default:
                        b2 = 3;
                        break;
                }
            }
        } catch (InterruptedException e) {
            FinskyLog.d("Interrupted while requesting /checkPromoOffers: %s", e.getMessage());
            b2 = -4;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            FinskyLog.d("Error while requesting /checkPromoOffers: %s", cause);
            b2 = b(cause);
        }
        if (b2 == 1) {
            b2 = a(b3, b2);
        }
        bundle.putInt("result_code", b2);
        FinskyLog.a("CheckPromoOffers result: %d", Integer.valueOf(b2));
        return bundle;
    }

    private int a(com.google.android.finsky.api.b bVar, int i) {
        int[] iArr = {i};
        Semaphore semaphore = new Semaphore(0);
        cg.a(bVar, false, new c(this, semaphore, iArr));
        try {
            if (!semaphore.tryAcquire(45L, TimeUnit.SECONDS)) {
                iArr[0] = -4;
            }
        } catch (InterruptedException e) {
            iArr[0] = -4;
        }
        return iArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(Throwable th) {
        if (th instanceof ServerError) {
            return -1;
        }
        if (th instanceof NetworkError) {
            return -2;
        }
        if (th instanceof AuthFailureError) {
            return -3;
        }
        if (th instanceof TimeoutError) {
            return -4;
        }
        return 0;
    }

    static /* synthetic */ void a(int i, int[] iArr, Semaphore semaphore) {
        iArr[0] = i;
        semaphore.release();
    }
}
