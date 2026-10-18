package com.google.android.finsky.activities;

import android.accounts.Account;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;

/* loaded from: classes.dex */
public final class au {
    public static cc a(DfeToc dfeToc, int i, Account account) {
        switch (i) {
            case 1:
                return new bu(dfeToc, account);
            case 2:
                return new bz(dfeToc, account);
            case 3:
                return new bi(dfeToc, account, FinskyApp.a().i, FinskyApp.a().k, FinskyApp.a().s, FinskyApp.a().p);
            case 4:
                return new bw(dfeToc, account);
            case 5:
            default:
                return new cc(dfeToc, account);
            case 6:
                return new bv(dfeToc, account);
        }
    }
}
