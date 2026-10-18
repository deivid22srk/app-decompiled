package com.google.android.finsky.activities;

import android.os.Bundle;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.PreregistrationDialogView;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class ex extends gj {
    public static void a(Document document, android.support.v4.app.aa aaVar) {
        if (aaVar.a("preregistration_dialog") == null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("PreregistrationDialogView.document", document);
            ex exVar = new ex();
            gn gnVar = new gn();
            gnVar.b(R.layout.preregistration_dialog).a(bundle).d(R.string.preregistration_dialog_positive_button).e(R.string.share).c().a(321, null, -1, 202, null);
            gnVar.a(exVar);
            exVar.a(aaVar, "preregistration_dialog");
        }
    }

    @Override // com.google.android.finsky.activities.gj
    protected final void u() {
        super.u();
        PreregistrationDialogView preregistrationDialogView = (PreregistrationDialogView) v();
        if (preregistrationDialogView == null) {
            FinskyLog.e("PreregistrationDialog unable to retrieve its view", new Object[0]);
            return;
        }
        Document document = preregistrationDialogView.getDocument();
        if (document == null) {
            FinskyLog.e("PreregistrationDialog unable to retrieve its document from its view", new Object[0]);
        } else {
            com.google.android.finsky.utils.cr.a(f(), document);
        }
    }
}
