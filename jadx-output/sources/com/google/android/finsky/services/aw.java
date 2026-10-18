package com.google.android.finsky.services;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.RateReviewActivity;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gb;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.lj;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cg;
import com.google.android.finsky.utils.ib;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class aw extends com.deivid22srk.store.d.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ReviewsService f4600a;

    aw(ReviewsService reviewsService) {
        this.f4600a = reviewsService;
    }

    @Override // com.deivid22srk.store.d.a
    public final Bundle a(String str, String str2) {
        Account account;
        AtomicInteger atomicInteger;
        FinskyApp a2 = FinskyApp.a();
        Account[] a3 = com.google.android.finsky.api.a.a(a2);
        int length = a3.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                account = null;
                break;
            }
            account = a3[i];
            if (account.name.equals(str)) {
                break;
            }
            i++;
        }
        if (account == null) {
            FinskyLog.a("No account found for %s", FinskyLog.a(str));
            return null;
        }
        com.google.android.finsky.a.i f = a2.f(str);
        String a4 = ib.a(this.f4600a, str2, null, f, 514);
        if (a4 == null) {
            return null;
        }
        FinskyLog.a("Received rate&review request for %s from %s", str2, a4);
        Bundle bundle = new Bundle();
        com.google.android.finsky.api.b b2 = a2.b(str);
        com.google.android.play.dfe.api.d a5 = a2.a((Account) null);
        com.android.volley.a.ae a6 = com.android.volley.a.ae.a();
        a5.a(a6, a6, true);
        try {
            lj ljVar = (lj) a6.get();
            if (a2.g == null) {
                FinskyLog.a("Toc was empty on Rate&Review, requesting it.", new Object[0]);
                com.android.volley.a.ae a7 = com.android.volley.a.ae.a();
                cg.a(b2, false, new ax(this, a7));
                try {
                    a2.a(new DfeToc((pw) a7.get()));
                } catch (InterruptedException e) {
                    FinskyLog.c("Interrupted while trying to retrieve ToC", new Object[0]);
                    return bundle;
                } catch (ExecutionException e2) {
                    ReviewsService.a(str2, f, a4, e2, "Unable to retrieve ToC: %s", "get-toc-error");
                    return bundle;
                }
            }
            gx gxVar = ljVar.f4082a;
            boolean booleanValue = com.google.android.finsky.utils.bg.ad.b(str).a().booleanValue();
            if (a2.g.f1961a.D && (!booleanValue || gxVar == null)) {
                return bundle;
            }
            Document document = gxVar != null ? new Document(gxVar) : null;
            com.android.volley.a.ae a8 = com.android.volley.a.ae.a();
            b2.a(com.google.android.finsky.api.s.a(str2), true, true, (Collection<String>) null, (com.android.volley.t<gb>) a8, (com.android.volley.s) a8);
            try {
                gb gbVar = (gb) a8.get();
                gx gxVar2 = gbVar.f3858b;
                if (gxVar2 == null) {
                    FinskyLog.a("No doc in details response for %s", str2);
                    return bundle;
                }
                ny a9 = a2.a(str).a(str2, gbVar.c);
                Intent a10 = RateReviewActivity.a(str, new Document(gxVar2), document, a9, a9 != null ? a9.d : 0, true, document == null, this.f4600a.getBaseContext());
                String str3 = gxVar2.f3890a;
                atomicInteger = ReviewsService.f4556a;
                a10.setData(Uri.fromParts("reviewsservice", str3, Integer.toString(atomicInteger.getAndIncrement())));
                bundle.putParcelable("rate_and_review_intent", PendingIntent.getActivity(this.f4600a, 0, a10, 1073741824));
                bundle.putInt("rate_and_review_request_code", 43);
                bundle.putString("doc_id", gxVar2.f3890a);
                bundle.putString("doc_title", gxVar2.i);
                if (a9 != null) {
                    bundle.putInt("rating", a9.d);
                    bundle.putString("review_title", a9.g);
                    bundle.putString("review_comment", a9.i);
                }
                if (document != null) {
                    bundle.putString("author_title", document.f1963a.i);
                    bundle.putString("author_profile_image_url", document.b(4).get(0).f);
                }
                ib.a(f, 514, str2, null, a4, null);
                return bundle;
            } catch (InterruptedException e3) {
                FinskyLog.c("Interrupted while trying to retrieve item details", new Object[0]);
                return bundle;
            } catch (ExecutionException e4) {
                ReviewsService.a(str2, f, a4, e4, "Unable to retrieve item details: %s", "fetch-doc-error");
                return bundle;
            }
        } catch (InterruptedException e5) {
            FinskyLog.a("Interrupted while trying to retrieve plus profile", new Object[0]);
            return bundle;
        } catch (ExecutionException e6) {
            ReviewsService.a(str2, f, a4, e6, "Unable to retrieve plus profile: %s", "fetch-plus-error");
            return bundle;
        }
    }
}
