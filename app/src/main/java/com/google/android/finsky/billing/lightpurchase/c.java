package com.google.android.finsky.billing.lightpurchase;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;

/* loaded from: classes.dex */
final class c implements AccountManagerCallback<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f2336a;

    c(b bVar) {
        this.f2336a = bVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture<Bundle> accountManagerFuture) {
        try {
            if (accountManagerFuture.getResult().getBoolean("booleanResult")) {
                this.f2336a.u();
            } else {
                this.f2336a.b(R.string.generic_purchase_prepare_error, 0);
            }
        } catch (AuthenticatorException e) {
            FinskyLog.c("AuthenticatorException: %s", e);
            this.f2336a.b(R.string.generic_purchase_prepare_error, 0);
        } catch (OperationCanceledException e2) {
            FinskyLog.c("OperationCanceledException: %s", e2);
            this.f2336a.b(R.string.generic_purchase_prepare_error, 0);
        } catch (IOException e3) {
            FinskyLog.c("IOException: %s", e3);
            this.f2336a.b(R.string.generic_purchase_prepare_error, 0);
        }
    }
}
