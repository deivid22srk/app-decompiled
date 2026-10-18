package com.google.android.wallet.ui.a;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.wallet.a.d;
import com.google.android.wallet.common.util.i;
import com.google.android.wallet.e.g;
import com.google.android.wallet.e.h;
import com.google.android.wallet.e.j;
import com.google.android.wallet.ui.common.FifeNetworkImageView;

/* loaded from: classes.dex */
public final class b extends a implements DialogInterface.OnClickListener {
    TextView ai;
    FifeNetworkImageView aj;
    private View ak;
    private View al;
    private boolean am;

    public static b a(int i, boolean z) {
        b bVar = new b();
        Bundle c = c(i);
        c.putBoolean("nfcEnabled", z);
        bVar.f(c);
        return bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            return;
        }
        a(new Intent(Build.VERSION.SDK_INT >= 16 ? "android.settings.NFC_SETTINGS" : "android.settings.WIRELESS_SETTINGS"));
    }

    public final void w() {
        this.am = true;
        this.al.setVisibility(4);
        this.ak.setVisibility(0);
    }

    @Override // android.support.v4.app.r
    @TargetApi(10)
    public final Dialog c(Bundle bundle) {
        View inflate = v().inflate(h.view_nfc_instruction, (ViewGroup) null);
        this.am = false;
        this.ai = (TextView) inflate.findViewById(g.nfc_popup_message);
        this.aj = (FifeNetworkImageView) inflate.findViewById(g.nfc_instruction_image);
        this.al = inflate.findViewById(g.nfc_instruction_layout);
        this.ak = inflate.findViewById(g.nfc_instruction_spinner);
        com.google.android.wallet.ui.common.a a2 = new com.google.android.wallet.ui.common.a(u()).a(inflate);
        if (this.r.getBoolean("nfcEnabled")) {
            a2.a(j.wallet_uic_nfc_popup_title).b(j.wallet_uic_close, (DialogInterface.OnClickListener) null);
            this.ai.setText(j.wallet_uic_nfc_popup_enabled_information);
            String b2 = com.google.android.wallet.a.a.k.b();
            if (!TextUtils.isEmpty(b2)) {
                this.aj.a(b2, i.b(u().getApplicationContext()), d.f7228a.b().booleanValue());
                this.aj.setFadeIn(true);
                this.aj.setVisibility(0);
            }
        } else {
            a2.a(j.wallet_uic_nfc_enable_title).a(j.wallet_uic_nfc_enable_button, this);
            this.ai.setText(j.wallet_uic_nfc_popup_disabled_information);
            this.aj.setVisibility(8);
        }
        return a2.a();
    }
}
