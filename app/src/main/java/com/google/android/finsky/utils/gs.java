package com.google.android.finsky.utils;

import android.accounts.Account;
import android.os.SystemClock;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public final class gs {
    public static void a(Account account, Document document, int i, String str, gw gwVar, boolean z, boolean z2) {
        FinskyApp.a().c(account).a(300, document.f1963a.f3890a, i, null, 0, null, -1L);
        FinskyApp.a().b(account.name).a(document, i, new gt(account, SystemClock.elapsedRealtime(), document, i, str, z, gwVar, z2), new gv(account, document, i, z2, gwVar));
    }
}
