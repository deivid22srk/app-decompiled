package com.google.android.finsky.billing.carrierbilling.bpkg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.layout.ButtonBar;
import com.google.android.finsky.layout.r;

/* loaded from: classes.dex */
public final class h extends com.google.android.finsky.epkg.l implements r {
    public i ai;
    public ButtonBar ak;
    public j al;
    public String am;

    public static h a(String str, String str2, String str3) {
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("carrier_tos_url", str2);
        bundle.putString("carrier_name", str3);
        hVar.f(bundle);
        return hVar;
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        View inflate = View.inflate(f(), R.layout.carrier_tos, null);
        Bundle bundle2 = this.r;
        String string = bundle2.getString("carrier_tos_url");
        String f_ = f_(R.string.tos_locale_replacement);
        if (!TextUtils.isEmpty(f_)) {
            string = string.replace("%locale%", f_);
        }
        this.am = u.a(string);
        this.ak = (ButtonBar) inflate.findViewById(R.id.button_bar);
        this.ak.setClickListener(this);
        this.ak.setPositiveButtonTitle(R.string.accept);
        this.ak.setPositiveButtonEnabled(false);
        if (FinskyApp.a().d(bundle2.getString("authAccount")).a(12603132L)) {
            this.ak.setNegativeButtonVisible(false);
        } else {
            this.ak.setNegativeButtonTitle(R.string.decline);
        }
        WebView webView = (WebView) inflate.findViewById(R.id.carrier_tos_text);
        this.al = new j(this, inflate.findViewById(R.id.progress), inflate.findViewById(R.id.carrier_tos_and_address_main));
        webView.setWebViewClient(this.al);
        webView.loadUrl(this.am);
        webView.getSettings().setSupportZoom(false);
        return new com.google.android.wallet.ui.common.a(f()).a(a(R.string.carrier_tos_and_address_title, bundle2.getString("carrier_name"))).a(inflate).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.l
    public final int u() {
        return 823;
    }

    @Override // android.support.v4.app.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.ai.a(2);
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        b(824);
        this.ai.a(0);
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        b(825);
        this.ai.a(2);
    }
}
