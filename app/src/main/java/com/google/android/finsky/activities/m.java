package com.google.android.finsky.activities;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;

/* loaded from: classes.dex */
final class m implements AccountManagerCallback<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f1799a;

    m(d dVar) {
        this.f1799a = dVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture<Bundle> accountManagerFuture) {
        FinskyApp.a().h().a(new com.google.android.finsky.apkg.b(528).f1473a);
        try {
            this.f1799a.startActivityForResult((Intent) accountManagerFuture.getResult().getParcelable("intent"), 21);
            d.c(this.f1799a);
        } catch (AuthenticatorException e) {
            FinskyLog.c("AuthenticatorException while adding account: %s. Finishing.", e);
            this.f1799a.finish();
        } catch (OperationCanceledException e2) {
            FinskyLog.c("Account add canceled. Finishing.", new Object[0]);
            this.f1799a.finish();
        } catch (IOException e3) {
            FinskyLog.c("IOException while adding account: %s. Finishing.", e3);
            this.f1799a.finish();
        }
    }
}
