package com.google.android.finsky.billing.iab;

import android.accounts.Account;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public class InAppBillingService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private final l f2231a = new l(this, 0);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f2231a;
    }

    static /* synthetic */ String b(InAppBillingService inAppBillingService, String str) {
        Account a2 = m.a(str, inAppBillingService);
        if (a2 == null) {
            return null;
        }
        return a2.name;
    }

    static /* synthetic */ b c(InAppBillingService inAppBillingService, String str) {
        return new b(inAppBillingService, FinskyApp.a().p, FinskyApp.a().q, FinskyApp.a().b(str));
    }

    static /* synthetic */ Bundle a(n nVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", nVar.l);
        return bundle;
    }
}
