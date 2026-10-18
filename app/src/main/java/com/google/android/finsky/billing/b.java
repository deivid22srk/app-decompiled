package com.google.android.finsky.billing;

import android.accounts.Account;
import android.os.Bundle;
import com.android.volley.AuthFailureError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class b extends com.deivid22srk.store.apkg.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BillingAccountService f2171a;

    b(BillingAccountService billingAccountService) {
        this.f2171a = billingAccountService;
    }

    @Override // com.deivid22srk.store.apkg.a
    public final int a(String str) {
        jm.b();
        int[] iArr = new int[1];
        Semaphore semaphore = new Semaphore(0);
        Account a2 = com.google.android.finsky.api.a.a(str, this.f2171a);
        if (a2 == null) {
            FinskyLog.d("Received invalid account name: " + str, new Object[0]);
            return -5;
        }
        try {
            r3.b(new d(r4, r3, iArr, semaphore), new e(this.f2171a, FinskyApp.a().b(a2.name), iArr, semaphore));
            if (!semaphore.tryAcquire(45L, TimeUnit.SECONDS)) {
                iArr[0] = -4;
            }
            return iArr[0];
        } catch (InterruptedException e) {
            FinskyLog.c("Timed out while waiting for response.", new Object[0]);
            return -4;
        }
    }

    @Override // com.deivid22srk.store.apkg.a
    public final Bundle b(String str) {
        Bundle a2;
        Bundle a3;
        jm.b();
        Account a4 = com.google.android.finsky.api.a.a(str, this.f2171a);
        if (a4 != null) {
            try {
                a3 = this.f2171a.a(a4);
                return a3;
            } catch (AuthFailureError e) {
                try {
                    a2 = this.f2171a.a(a4);
                    return a2;
                } catch (AuthFailureError e2) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("result_code", -3);
                    return bundle;
                }
            }
        }
        FinskyLog.d("Received invalid account name: %s", FinskyLog.a(str));
        Bundle bundle2 = new Bundle();
        bundle2.putInt("result_code", -5);
        return bundle2;
    }
}
