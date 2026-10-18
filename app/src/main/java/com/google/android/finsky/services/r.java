package com.google.android.finsky.services;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gb;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ib;
import java.util.Collection;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
final class r extends com.deivid22srk.store.cpkg.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DetailsService f4632a;

    r(DetailsService detailsService) {
        this.f4632a = detailsService;
    }

    @Override // com.deivid22srk.store.cpkg.a
    public final Bundle a(String str) {
        FinskyApp a2 = FinskyApp.a();
        Account i = a2.i();
        if (i == null) {
            return null;
        }
        com.google.android.finsky.apkg.i c = a2.c(i);
        if (!com.google.android.finsky.cpkg.d.aD.b().booleanValue()) {
            FinskyLog.a("API access is blocked for all apps", new Object[0]);
            ib.a(c, 512, str, "all-access-blocked", null, null);
            return null;
        }
        String a3 = ib.a(this.f4632a, str, com.google.android.finsky.cpkg.d.aC, c, 512);
        if (a3 == null) {
            return null;
        }
        FinskyLog.a("Received app details request for %s from %s", str, a3);
        String a4 = com.google.android.finsky.api.s.a(str);
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        com.android.volley.apkg.ae a5 = com.android.volley.apkg.ae.a();
        b2.a(a4, true, true, (Collection<String>) null, (com.android.volley.t<gb>) a5, (com.android.volley.s) a5);
        try {
            gx gxVar = ((gb) a5.get()).f3858b;
            if (gxVar == null) {
                FinskyLog.a("No doc in details response for %s", str);
                ib.a(c, 512, str, "empty-details-response", a3, null);
                return null;
            }
            DfeToc dfeToc = a2.g;
            com.google.android.finsky.receivers.f fVar = a2.k;
            com.google.android.finsky.bpkg.a aVar = a2.s;
            aVar.f2060a.c();
            com.google.android.finsky.gpkg.h hVar = a2.p;
            hVar.c();
            return DetailsService.a(this.f4632a, new Document(gxVar), i, dfeToc, fVar, aVar, hVar, a3, c);
        } catch (InterruptedException e) {
            FinskyLog.a("Interrupted while trying to retrieve app details", new Object[0]);
            ib.a(c, 512, str, "fetch-interrupted", a3, null);
            return null;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            String simpleName = cause == null ? null : cause.getClass().getSimpleName();
            FinskyLog.a("Unable to retrieve app details: %s", simpleName);
            ib.a(c, 512, str, "fetch-error", a3, simpleName);
            return null;
        }
    }
}
