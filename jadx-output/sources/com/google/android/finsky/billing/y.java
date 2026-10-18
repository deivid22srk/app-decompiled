package com.google.android.finsky.billing;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.android.vending.R;

/* loaded from: classes.dex */
public final class y extends android.support.v4.app.r {
    public static y a(Fragment fragment, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("installationSize", j);
        y yVar = new y();
        if (fragment != null) {
            if (fragment instanceof aq) {
                yVar.a(fragment, -1);
            } else {
                throw new IllegalArgumentException("targetFragment must implement PreAppDownloadWarnings.Listener");
            }
        }
        yVar.f(bundle);
        return yVar;
    }

    @Override // android.support.v4.app.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        u().U_();
        super.onCancel(dialogInterface);
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        long j = this.r.getLong("installationSize");
        android.support.v4.app.t f = f();
        com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(f, (byte) 0);
        aVar.a(R.string.use_mobile_network_title);
        View inflate = LayoutInflater.from(f).inflate(R.layout.download_network_warning_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.installation_size);
        RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.download_now);
        radioButton.setChecked(true);
        if (j > 0) {
            textView.setText(f.getString(R.string.use_mobile_network_app_size, com.google.android.finsky.utils.as.a(j, g())));
            textView.setVisibility(0);
        }
        aVar.a(inflate).a(R.string.network_dialog_always_button, new aa(this, radioButton)).b(R.string.network_dialog_just_once_button, new z(this, radioButton));
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public aq u() {
        return this.s != null ? (aq) this.s : (aq) f();
    }
}
