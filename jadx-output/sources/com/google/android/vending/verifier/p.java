package com.google.android.vending.verifier;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.google.android.finsky.activities.gj;

/* loaded from: classes.dex */
public final class p extends gj implements View.OnClickListener {
    private PackageWarningDialogView aj;

    @Override // com.google.android.finsky.activities.gj, android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        Dialog c = super.c(bundle);
        if (c != null) {
            this.aj = (PackageWarningDialogView) v();
            this.aj.setOnContinueAnywayClickListener(this);
            c.setOnKeyListener(new q(this));
        }
        return c;
    }

    @Override // com.google.android.finsky.activities.gj, android.support.v4.app.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (this.aj.getAction() == 2) {
            x();
        } else {
            w();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x();
    }
}
