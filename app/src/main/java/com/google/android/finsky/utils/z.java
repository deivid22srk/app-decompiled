package com.google.android.finsky.utils;

import android.os.Bundle;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public final class z extends com.google.android.finsky.activities.gj {
    private static boolean aj;

    static /* synthetic */ boolean z() {
        aj = false;
        return false;
    }

    public static void a(android.support.v4.app.aa aaVar, Document document, com.google.android.finsky.gpkg.aq aqVar) {
        int i;
        String a2;
        if (aaVar.a("CancelSubscriptionDialog.cancel_subscripiton_dialog") == null) {
            if (!aj) {
                if (System.currentTimeMillis() < aqVar.d) {
                    i = R.string.confirm_trial_subscription_cancel;
                    a2 = aj.a(aqVar.d);
                } else {
                    i = R.string.confirm_renewing_subscription_cancel;
                    a2 = aj.a(aqVar.n);
                }
                com.google.android.finsky.activities.gn gnVar = new com.google.android.finsky.activities.gn();
                gnVar.c(R.string.cancel_subscription_title).a(FinskyApp.a().getString(i, new Object[]{a2})).d(R.string.cancel_subscription_final).e(R.string.no).a(304, document.f1963a.R, 243, 244, null);
                z zVar = new z();
                gnVar.a(zVar);
                Bundle bundle = zVar.r;
                bundle.putString("authAccount", aqVar.g);
                bundle.putParcelable("CancelSubscriptionDialog.doc", document);
                zVar.f(bundle);
                zVar.a(aaVar, "CancelSubscriptionDialog.cancel_subscripiton_dialog");
                return;
            }
            new com.google.android.finsky.activities.gn().a(R.string.cancel_wait_message).d(R.string.ok).a(326, null, 2913, 2913, null).b().a(aaVar, "CancelSubscriptionDialog.cancel_wait");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.gj
    public final void y() {
        super.y();
        Bundle bundle = this.r;
        String string = bundle.getString("authAccount");
        Document document = (Document) bundle.getParcelable("CancelSubscriptionDialog.doc");
        com.google.android.finsky.apkg.i f = FinskyApp.a().f(string);
        f.b(new com.google.android.finsky.apkg.b(850).a(document.f1963a.f3890a).b(1).f1473a);
        com.google.android.finsky.api.b b2 = FinskyApp.a().b(string);
        aj = true;
        b2.f(document.f1963a.f3890a, new com.google.android.finsky.gpkg.au(FinskyApp.a().q, b2.b(), new aa(this, f, document)), new ab(this, f, document));
    }
}
