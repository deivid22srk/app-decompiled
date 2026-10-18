package com.google.android.finsky.utils;

import android.accounts.Account;
import com.google.android.finsky.FinskyApp;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
final class ae implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f4728a;

    ae(ac acVar) {
        this.f4728a = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.utils.b.c cVar;
        String str;
        cVar = this.f4728a.c;
        Collection<Map<String, String>> values = cVar.a().values();
        if (!values.isEmpty()) {
            FinskyApp a2 = FinskyApp.a();
            str = this.f4728a.h;
            Account account = null;
            if (str != null) {
                account = com.google.android.finsky.api.a.a(str, a2);
            }
            a2.a(account).a(new af(this, values), new ag(this), false);
        }
    }
}
