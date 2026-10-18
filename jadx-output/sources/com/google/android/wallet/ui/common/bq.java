package com.google.android.wallet.ui.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class bq extends c {
    public static bq a(String str, int i) {
        Bundle c = c(i);
        c.putString("url", str);
        bq bqVar = new bq();
        bqVar.f(c);
        return bqVar;
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        WebViewLayout webViewLayout = (WebViewLayout) v().inflate(com.google.android.wallet.e.h.view_web_view_layout, (ViewGroup) null, false);
        webViewLayout.a(this.r.getString("url"), (String) null);
        return new a(u()).a(webViewLayout).a(com.google.android.wallet.e.j.wallet_uic_close, (DialogInterface.OnClickListener) null).a();
    }
}
