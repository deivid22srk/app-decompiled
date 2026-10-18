package com.google.android.finsky.billing;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.vending.R;

/* loaded from: classes.dex */
public final class ab extends android.support.v4.app.r {
    public static ab u() {
        return new ab();
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        android.support.v4.app.t f = f();
        com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(f, (byte) 0);
        aVar.a(LayoutInflater.from(f).inflate(R.layout.download_network_settings_dialog, (ViewGroup) null)).a(R.string.network_dialog_settings_ok_button, new ad(this)).b(R.string.settings, new ac(this));
        return aVar.a();
    }

    @Override // android.support.v4.app.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        v().V_();
        super.onCancel(dialogInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public aq v() {
        return this.s != null ? (aq) this.s : (aq) f();
    }
}
