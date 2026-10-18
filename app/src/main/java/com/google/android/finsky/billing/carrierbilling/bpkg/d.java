package com.google.android.finsky.billing.carrierbilling.bpkg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.r;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class d extends r implements DialogInterface.OnClickListener {
    public e ai;

    public static d a(String str, boolean z) {
        d dVar = new d();
        dVar.b(false);
        Bundle bundle = new Bundle();
        bundle.putString("error_message", str);
        bundle.putBoolean("fatal_error", z);
        dVar.f(bundle);
        return dVar;
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(f());
        aVar.a(FinskyApp.a().getString(R.string.error));
        aVar.b(this.r.getString("error_message"));
        aVar.a(android.R.string.ok, this).a(false);
        return aVar.a();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.ai != null) {
            this.ai.a(this.r.getBoolean("fatal_error"));
        }
    }
}
