package com.google.android.finsky.billing;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.rx;
import com.google.android.finsky.protos.ry;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class ai {
    public final void a(String str, Runnable runnable) {
        if (!((System.currentTimeMillis() > (l.f2272b.a().longValue() + com.google.android.finsky.cpkg.d.aj.b().longValue()) ? 1 : (System.currentTimeMillis() == (l.f2272b.a().longValue() + com.google.android.finsky.cpkg.d.aj.b().longValue()) ? 0 : -1)) > 0)) {
            if (runnable != null) {
                runnable.run();
            }
            FinskyLog.a("Skip getting fresh list of billing countries.", new Object[0]);
        } else {
            com.google.android.vending.a.a.a c = FinskyApp.a().c(str);
            c.f7099a.a(com.google.android.vending.a.a.e.a("https://android.clients.google.com/vending/api/ApiRequest", rx.class, new rx(), ry.class, new com.google.android.vending.a.a.b(new aj(this, runnable)), c.f7100b, new ak(this, runnable)));
        }
    }
}
