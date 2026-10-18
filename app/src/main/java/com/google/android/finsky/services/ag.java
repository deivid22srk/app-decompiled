package com.google.android.finsky.services;

import android.accounts.Account;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.cg;
import com.google.android.finsky.utils.jm;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class ag extends v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MarketCatalogService f4572a;

    ag(MarketCatalogService marketCatalogService) {
        this.f4572a = marketCatalogService;
    }

    @Override // com.google.android.finsky.services.u
    public final boolean a(String str, int i) {
        jm.b();
        Semaphore semaphore = new Semaphore(0);
        boolean[] zArr = new boolean[1];
        Account a2 = com.google.android.finsky.api.a.a(str, this.f4572a);
        if (a2 == null) {
            return false;
        }
        cg.a(FinskyApp.a().b(a2.name), false, new ah(this, i, zArr, semaphore));
        semaphore.acquireUninterruptibly();
        this.f4572a.stopSelf();
        return zArr[0];
    }
}
