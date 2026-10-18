package com.google.android.finsky.billing.carrierbilling.b;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.android.vending.R;

/* loaded from: classes.dex */
public final class o extends com.google.android.finsky.e.l implements DialogInterface.OnClickListener {
    public p ai;

    public static o a(String str) {
        o oVar = new o();
        oVar.b(false);
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        oVar.f(bundle);
        return oVar;
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(f());
        progressDialog.setTitle(g().getString(R.string.verify_pin_title));
        progressDialog.setMessage(g().getString(R.string.associating_device_message));
        progressDialog.setProgressStyle(0);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setButton(-1, g().getString(R.string.device_association_back_button), this);
        return progressDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.ai != null) {
            this.ai.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.l
    public final int u() {
        return 842;
    }
}
