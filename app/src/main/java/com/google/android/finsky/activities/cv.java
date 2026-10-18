package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ru;
import com.google.android.finsky.protos.rv;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

/* loaded from: classes.dex */
public final class cv extends da {
    private final int c;
    private String d;

    static boolean a(List<Account> list) {
        return FinskyApp.a().e().a(12607338L) || com.google.android.finsky.utils.ar.a(list);
    }

    cv(int i, int i2, int i3) {
        super(i2, i3);
        this.c = i;
    }

    cv(int i, String str) {
        this(5, i, -1);
        this.d = str;
    }

    @Override // com.google.android.finsky.activities.da
    public final void a(Context context, Document document, String str) {
        com.google.android.vending.a.a.a b2;
        if (a(FinskyApp.a().y.a())) {
            FinskyApp.a().b((String) null).a(document.f1963a.f3890a, this.c, str, new cw(this, context), new cx(this));
            return;
        }
        if (str != null) {
            this.d = str;
        }
        FinskyApp a2 = FinskyApp.a();
        Account account = a2.h;
        if (account == null) {
            FinskyLog.c("Fall back to primary account.", new Object[0]);
            account = com.google.android.finsky.api.a.b(a2);
        }
        if (account == null) {
            FinskyLog.c("No account configured on this device.", new Object[0]);
            b2 = null;
        } else {
            b2 = a2.b(account);
        }
        com.google.android.finsky.protos.ag E = document.E();
        String a3 = com.google.android.finsky.hpkg.a.a(E.w, E.e);
        int i = this.c;
        String str2 = this.d;
        cy cyVar = new cy(this, context);
        cz czVar = new cz(this);
        ru ruVar = new ru();
        ruVar.f4359a = a3;
        ruVar.f4360b = true;
        ruVar.c = i;
        ruVar.d = true;
        if (!TextUtils.isEmpty(str2)) {
            ruVar.e = str2;
            ruVar.f = true;
        }
        b2.f7099a.a(com.google.android.vending.a.a.e.a("https://android.clients.google.com/vending/api/ApiRequest", ru.class, ruVar, rv.class, cyVar, b2.f7100b, czVar));
    }

    static /* synthetic */ void a(VolleyError volleyError) {
        com.google.android.finsky.apkg.b bVar = new com.google.android.finsky.apkg.b(533);
        if (volleyError != null) {
            bVar.a(volleyError);
        }
        FinskyApp.a().h().b(bVar.f1473a);
    }
}
