package com.google.android.wallet.instrumentmanager.ui.b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class i extends com.google.android.wallet.ui.common.c {
    public static i b(int i) {
        i iVar = new i();
        iVar.f(c(i));
        return iVar;
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        return new com.google.android.wallet.ui.common.a(u()).a(v().inflate(com.google.android.wallet.instrumentmanager.f.view_cvc_information, (ViewGroup) null, false)).a(com.google.android.wallet.instrumentmanager.g.wallet_uic_close, (DialogInterface.OnClickListener) null).a();
    }
}
