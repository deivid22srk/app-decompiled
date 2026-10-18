package com.google.android.finsky.billing.iab;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ib;

/* loaded from: classes.dex */
public class FirstPartyInAppBillingService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private final a f2230a = new a(this, 0);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f2230a;
    }

    static /* synthetic */ n a(FirstPartyInAppBillingService firstPartyInAppBillingService, String str, String str2) {
        if (!com.google.android.finsky.c.d.cJ.b().booleanValue()) {
            FinskyLog.c("This API is disabled.", new Object[0]);
            return n.RESULT_ERROR;
        }
        if (TextUtils.isEmpty(str)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            return n.RESULT_DEVELOPER_ERROR;
        }
        if (!com.google.android.finsky.api.a.b(str, firstPartyInAppBillingService)) {
            FinskyLog.c("Unable to locate specified accountName: %s", FinskyLog.a(str));
            return n.RESULT_DEVELOPER_ERROR;
        }
        n a2 = m.a(str2, firstPartyInAppBillingService.getPackageManager(), Binder.getCallingUid());
        if (a2 == n.RESULT_OK) {
            if (!com.google.android.finsky.c.d.cK.b().booleanValue() && !ib.a(firstPartyInAppBillingService, str2)) {
                FinskyLog.c("The calling package is not authorized to use this API: %s", str2);
                return n.RESULT_DEVELOPER_ERROR;
            }
            return n.RESULT_OK;
        }
        return a2;
    }

    static /* synthetic */ b a(FirstPartyInAppBillingService firstPartyInAppBillingService, String str) {
        return new b(firstPartyInAppBillingService, FinskyApp.a().p, FinskyApp.a().q, FinskyApp.a().b(str));
    }

    static /* synthetic */ Bundle a(n nVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", nVar.l);
        return bundle;
    }
}
