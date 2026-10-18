package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.auth.AuthState;
import com.google.android.finsky.protos.ct;
import com.google.android.finsky.utils.ic;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public final class b extends com.google.android.finsky.epkg.u implements com.google.android.finsky.auth.d {

    /* renamed from: a, reason: collision with root package name */
    public String f2313a;

    /* renamed from: b, reason: collision with root package name */
    private AuthState f2314b;
    private int c;
    private final int d = com.google.android.finsky.cpkg.d.cR.b().intValue();
    private String e;

    public static b a(String str, AuthState authState) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putParcelable("AuthChallengeSidecar.authState", authState);
        b bVar = new b();
        bVar.f(bundle);
        return bVar;
    }

    public final void a(String str, String str2, ct ctVar) {
        boolean z = true;
        com.google.android.finsky.auth.a aVar = new com.google.android.finsky.auth.a(com.google.android.finsky.api.a.a(str, FinskyApp.a()), ctVar != null);
        if (TextUtils.isEmpty(str2)) {
            if (this.f2314b.a() == 2) {
                b(R.string.blank_account_pin_purchase_flow, 3);
                return;
            } else {
                b(R.string.blank_account_password_purchase_flow, 2);
                return;
            }
        }
        boolean z2 = this.f2314b.a() == 2;
        if (!z2) {
            if (aVar.f2016b == null || !com.google.android.finsky.auth.a.a(aVar.d, aVar.f2015a.name)) {
                z = false;
            } else {
                FinskyApp a2 = FinskyApp.a();
                if (!ic.b(a2)) {
                    com.google.android.finsky.dpkg.d d = a2.d(aVar.f2015a.name);
                    if (aVar.d) {
                        if (d.a(12604372L)) {
                            z = false;
                        }
                    } else {
                        z = d.a(12603111L);
                    }
                }
            }
            if (!z) {
                String str3 = ctVar == null ? aVar.f2015a.name : ctVar.c;
                com.google.android.finsky.billing.apkg.h hVar = aVar.c;
                hVar.f2149b.a(new com.google.android.finsky.billing.apkg.k(hVar, com.google.android.finsky.billing.apkg.h.f2148a, str3, str2, new com.google.android.finsky.billing.apkg.i(hVar, this), new com.google.android.finsky.billing.apkg.j(hVar, this)));
                return;
            }
        }
        jm.a(new com.google.android.finsky.auth.b(aVar, str2, z2, ctVar == null ? null : ctVar.f3697a, this), new Void[0]);
    }

    public final void a(String str, String str2) {
        Account a2 = com.google.android.finsky.api.a.a(str, FinskyApp.a());
        AccountManager accountManager = AccountManager.get(FinskyApp.a());
        Bundle bundle = new Bundle();
        bundle.putString("password", str2);
        accountManager.confirmCredentials(a2, bundle, f(), new c(this), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        this.f2313a = f_(i);
        if (i2 != 1) {
            this.c++;
            if (this.c >= this.d) {
                i2 = 4;
            }
        }
        a(3, i2);
    }

    final void u() {
        this.f2313a = "";
        com.google.android.finsky.auth.a.c(this.e);
        a(2, 0);
    }

    @Override // com.google.android.finsky.auth.d
    public final void a() {
        u();
    }

    @Override // com.google.android.finsky.auth.d
    public final void b_(int i) {
        switch (i) {
            case 1003:
                b(R.string.invalid_account_pin_purchase_flow, 3);
                break;
            case 1100:
                b(R.string.invalid_account_password_purchase_flow, 2);
                break;
            case 1200:
            case 1202:
                u();
                break;
            case 1201:
                b(R.string.generic_purchase_prepare_error, 1);
                break;
            default:
                b(R.string.generic_purchase_prepare_error, 0);
                break;
        }
    }

    @Override // com.google.android.finsky.epkg.u, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        this.f2314b = (AuthState) this.r.getParcelable("AuthChallengeSidecar.authState");
        this.e = this.r.getString("authAccount");
        this.c = 0;
        super.a(bundle);
    }
}
