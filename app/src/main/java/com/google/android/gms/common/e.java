package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class e extends android.support.v4.app.r {
    private Dialog ai = null;
    private DialogInterface.OnCancelListener aj = null;

    public static e a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        e eVar = new e();
        Dialog dialog2 = (Dialog) com.google.android.gms.common.internal.av.a(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        eVar.ai = dialog2;
        if (onCancelListener != null) {
            eVar.aj = onCancelListener;
        }
        return eVar;
    }

    @Override // android.support.v4.app.r
    public final void a(android.support.v4.app.aa aaVar, String str) {
        super.a(aaVar, str);
    }

    @Override // android.support.v4.app.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.aj != null) {
            this.aj.onCancel(dialogInterface);
        }
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        if (this.ai == null) {
            this.d = false;
        }
        return this.ai;
    }
}
