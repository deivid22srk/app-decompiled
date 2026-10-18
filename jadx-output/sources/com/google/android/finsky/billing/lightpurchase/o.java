package com.google.android.finsky.billing.lightpurchase;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.wallet.ui.common.WebViewLayout;

/* loaded from: classes.dex */
public final class o extends android.support.v4.app.r {
    public WebViewLayout ai;

    public static o u() {
        Bundle bundle = new Bundle();
        bundle.putInt("FinskyWebViewDialogFragment.theme", R.style.Theme.DeviceDefault);
        o oVar = new o();
        oVar.f(bundle);
        return oVar;
    }

    @Override // android.support.v4.app.r, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        a(1, this.r.getInt("FinskyWebViewDialogFragment.theme"));
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(com.deivid22srk.store.R.layout.finsky_web_view_layout, (ViewGroup) null, false);
        this.ai = (WebViewLayout) inflate.findViewById(com.deivid22srk.store.R.id.web_view_layout);
        this.ai.getWebView().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        return inflate;
    }
}
