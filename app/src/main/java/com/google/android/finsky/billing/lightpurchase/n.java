package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
public final class n extends r {
    @Override // com.google.android.finsky.billing.h, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        i(bundle);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.r
    protected final com.google.android.finsky.billing.f x() {
        Bundle bundle = this.r;
        Account account = (Account) bundle.getParcelable("CompleteDcb3Flow.account");
        Bundle bundle2 = new Bundle();
        bundle2.putString("authAccount", account.name);
        io ioVar = (io) ParcelableProto.a(bundle, "CompleteDcb3Flow.instrument");
        String string = bundle2.getString("authAccount");
        bundle2.putParcelable("dcb_instrument", ParcelableProto.a(ioVar));
        Account a2 = com.google.android.finsky.api.a.a(string, FinskyApp.a());
        if (a2 == null) {
            FinskyLog.d("Invalid account passed in parameters.", new Object[0]);
            return null;
        }
        return new com.google.android.finsky.billing.carrierbilling.apkg.a(this, FinskyApp.a().b(a2.name), this, FinskyApp.a().h(), bundle2);
    }
}
