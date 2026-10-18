package com.google.android.finsky.billing;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class ae extends android.support.v4.app.r {
    public static ae a(Fragment fragment, Bundle bundle) {
        ae aeVar = new ae();
        if (fragment != null) {
            if (fragment instanceof aq) {
                aeVar.a(fragment, -1);
            } else {
                throw new IllegalArgumentException("targetFragment must implement PreAppDownloadWarnings.Listener");
            }
        }
        aeVar.f(bundle);
        return aeVar;
    }

    public static Bundle a(boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("setWifiOnly", true);
        bundle.putBoolean("showWifiOnly", z);
        bundle.putBoolean("onMobileNetwork", z2);
        return bundle;
    }

    @Override // android.support.v4.app.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        u().U_();
        super.onCancel(dialogInterface);
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        int i;
        Bundle bundle2 = this.r;
        boolean z = bundle2.getBoolean("showWifiOnly");
        boolean z2 = bundle2.getBoolean("setWifiOnly");
        boolean z3 = bundle2.getBoolean("onMobileNetwork");
        android.support.v4.app.t f = f();
        com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(f, (byte) 0);
        aVar.a(R.string.use_wifi_title);
        View inflate = LayoutInflater.from(f).inflate(R.layout.download_size_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.wifi_message);
        if (z) {
            i = R.string.use_wifi_warning;
        } else {
            i = z3 ? R.string.use_wifi_limit_on_mobile : R.string.use_wifi_limit_on_wifi;
        }
        textView.setText(i);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.wifi_checkbox);
        if (z) {
            checkBox.setVisibility(0);
            if (bundle == null) {
                checkBox.setChecked(z2);
            }
        }
        aVar.a(inflate);
        aVar.a(R.string.use_wifi_proceed_button, new af(this, z, checkBox, z2));
        aVar.b(R.string.cancel, new ag(this));
        if (FinskyApp.a().l.a()) {
            if (f.getPackageManager().queryIntentActivities(new Intent("android.settings.WIFI_SETTINGS"), 65536).size() > 0) {
                ah ahVar = new ah(this);
                if (aVar.f7468b != null) {
                    aVar.f7468b.setNeutralButton(R.string.setup_wifi_button, ahVar);
                } else {
                    android.support.v7.a.ad adVar = aVar.f7467a;
                    adVar.f473a.m = adVar.f473a.f543a.getText(R.string.setup_wifi_button);
                    adVar.f473a.n = ahVar;
                }
            }
        }
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public aq u() {
        return this.s != null ? (aq) this.s : (aq) f();
    }
}
